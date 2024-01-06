package com.zhaoyu.easyeats.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhaoyu.easyeats.entity.DishFlavor;
import com.zhaoyu.easyeats.mapper.DishFlavorMapper;
import com.zhaoyu.easyeats.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
