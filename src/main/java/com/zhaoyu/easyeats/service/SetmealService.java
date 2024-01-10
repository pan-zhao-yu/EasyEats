package com.zhaoyu.easyeats.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhaoyu.easyeats.dto.SetmealDto;
import com.zhaoyu.easyeats.entity.Setmeal;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

public interface SetmealService extends IService<Setmeal> {


    public void saveWithDish(SetmealDto setmealDto);

    public void removeWithDish(List<Long> ids);

    public void updateSetmealStatus(List<Long> ids, Integer status);

    public SetmealDto getSetmealById(Long id);

    public void updateSetmeal(SetmealDto setmealDto);

}
