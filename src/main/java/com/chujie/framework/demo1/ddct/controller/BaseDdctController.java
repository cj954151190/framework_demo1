package com.chujie.framework.demo1.ddct.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chujie.framework.demo1.ddct.entity.BaseDdct;
import com.chujie.framework.demo1.ddct.service.IBaseDdctService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 数据字典 前端控制器
 * </p>
 *
 * @author jobob
 * @since 2020-01-23
 */
@RestController
@RequestMapping("/ddct/base-ddct")
public class BaseDdctController {
    @Autowired
    IBaseDdctService baseDdctServiceImpl;
    @RequestMapping("/get/{id}")
    public Map<String,Object> getList(@PathVariable String id) {
        QueryWrapper<BaseDdct> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id" , id);
        Map<String,Object> map = baseDdctServiceImpl.getMap(queryWrapper);
        return map;
    }

    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    public List<BaseDdct> getPageList() {
        Page<BaseDdct> page = new Page<>(1,5);
        IPage<BaseDdct> rePage = baseDdctServiceImpl.selectPageEntity(page);
        return rePage.getRecords();
    }
}