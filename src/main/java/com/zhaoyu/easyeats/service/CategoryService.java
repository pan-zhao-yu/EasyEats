package com.zhaoyu.easyeats.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhaoyu.easyeats.entity.Category;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
