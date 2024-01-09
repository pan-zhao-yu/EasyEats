package com.zhaoyu.easyeats.dto;

import com.zhaoyu.easyeats.entity.SetmealDish;
import com.zhaoyu.easyeats.entity.Setmeal;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
