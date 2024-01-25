package com.zhaoyu.easyeats.dto;

import com.zhaoyu.easyeats.entity.OrderDetail;
import lombok.Data;

import java.util.List;

@Data
public class OrderDto {
    private List<OrderDetail> orderDetails;
}
