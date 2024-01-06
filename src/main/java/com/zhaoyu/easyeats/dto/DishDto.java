package com.zhaoyu.easyeats.dto;

import com.zhaoyu.easyeats.entity.Dish;
import com.zhaoyu.easyeats.entity.DishFlavor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
//Data Transfer Object
@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
