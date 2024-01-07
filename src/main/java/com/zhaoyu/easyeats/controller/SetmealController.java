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


}
