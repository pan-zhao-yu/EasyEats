package com.zhaoyu.easyeats.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhaoyu.easyeats.entity.Employee;
import com.zhaoyu.easyeats.mapper.Employeemapper;
import com.zhaoyu.easyeats.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<Employeemapper, Employee> implements EmployeeService {
}
