package com.zhaoyu.easyeats.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhaoyu.easyeats.common.R;
import com.zhaoyu.easyeats.dto.SetmealDto;
import com.zhaoyu.easyeats.entity.Category;
import com.zhaoyu.easyeats.entity.Setmeal;
import com.zhaoyu.easyeats.service.CategoryService;
import com.zhaoyu.easyeats.service.SetmealDishService;
import com.zhaoyu.easyeats.service.SetmealService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 套餐管理
 */

@RestController
@RequestMapping("/setmeal")
@Slf4j
public class SetmealController {

    @Autowired
    private SetmealService setmealService;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private SetmealDishService setmealDishService;


    /**
     * create new setmeal(combo)
     * @param setmealDto
     * @return
     */
    @PostMapping
    public R<String> save(@RequestBody SetmealDto setmealDto){
        log.info("setmeal info :{}", setmealDto);

        setmealService.saveWithDish(setmealDto);
        return R.success("create new setmeal successful");
    }


    /**
     * 套餐分页查询
     * @param page
     * @param pageSize
     * @param name
     * @return
     */
    @GetMapping("/page")
    public R<Page> page(int page,int pageSize,String name){
        //分页构造器对象
        Page<Setmeal> pageInfo = new Page<>(page,pageSize);
        Page<SetmealDto> dtoPage = new Page<>();

        LambdaQueryWrapper<Setmeal> queryWrapper = new LambdaQueryWrapper<>();
        //添加查询条件，根据name进行like模糊查询
        queryWrapper.like(name != null,Setmeal::getName,name);
        //添加排序条件，根据更新时间降序排列
        queryWrapper.orderByDesc(Setmeal::getUpdateTime);

        setmealService.page(pageInfo,queryWrapper);

        //对象拷贝
        BeanUtils.copyProperties(pageInfo,dtoPage,"records");
        List<Setmeal> records = pageInfo.getRecords();

        List<SetmealDto> list = records.stream().map((item) -> {
            SetmealDto setmealDto = new SetmealDto();
            //对象拷贝
            BeanUtils.copyProperties(item,setmealDto);
            //分类id
            Long categoryId = item.getCategoryId();
            //根据分类id查询分类对象
            Category category = categoryService.getById(categoryId);
            if(category != null){
                //分类名称
                String categoryName = category.getName();
                setmealDto.setCategoryName(categoryName);
            }
            return setmealDto;
        }).collect(Collectors.toList());

        dtoPage.setRecords(list);
        return R.success(dtoPage);
    }


    /**
     * delete the setmeal if it is currently marked not available
     * @param ids
     * @return
     */
    @DeleteMapping
    public R<String> delete(@RequestParam List<Long> ids){
        log.info("ids {}", ids);
        setmealService.removeWithDish(ids);
        return R.success("setmeal date delete successfully");
    }

    /**
     * update setmeal status
     * @param status
     * @param ids
     * @return
     */
    @PostMapping("/status/{status}")
    public R<String> update(@PathVariable Integer status, @RequestParam List<Long> ids){
        try {
            setmealService.updateSetmealStatus(ids, status);
            return R.success("setmeal status update successfully");
        } catch (Exception e) {
            return R.error("Error updating setmeal status");
        }
    }

//
//    //update setmeal information
//    @GetMapping("/{id}")
//    public R<SetmealDto> getSetmeal(@PathVariable Long id){
//        try {
//            SetmealDto setmealDto = setmealService.getSetmealById(id);
//            return R.success(setmealDto);
//        } catch (Exception e) {
//            return R.error("Error retrieving setmeal information");
//        }
//    }

}
