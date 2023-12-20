package com.zhaoyu.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhaoyu.reggie.entity.Employee;
import com.zhaoyu.reggie.mapper.Employeemapper;
import com.zhaoyu.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<Employeemapper, Employee> implements EmployeeService {
}
