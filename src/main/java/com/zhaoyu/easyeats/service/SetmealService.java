package com.zhaoyu.easyeats.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhaoyu.easyeats.dto.SetmealDto;
import com.zhaoyu.easyeats.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {


    public void saveWithDish(SetmealDto setmealDto);

    public void removeWithDish(List<Long> ids);

    public void updateSetmealStatus(List<Long> ids, Integer status);

    public SetmealDto getSetmealById(Long id);
}
