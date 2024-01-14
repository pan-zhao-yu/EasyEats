package com.zhaoyu.easyeats.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhaoyu.easyeats.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
