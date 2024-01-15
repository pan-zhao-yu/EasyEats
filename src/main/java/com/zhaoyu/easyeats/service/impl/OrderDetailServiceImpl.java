package com.zhaoyu.easyeats.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhaoyu.easyeats.entity.OrderDetail;
import com.zhaoyu.easyeats.mapper.OrderDetailMapper;
import com.zhaoyu.easyeats.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}