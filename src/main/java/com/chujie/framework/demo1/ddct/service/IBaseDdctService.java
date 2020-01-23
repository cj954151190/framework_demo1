package com.chujie.framework.demo1.ddct.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chujie.framework.demo1.ddct.entity.BaseDdct;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 数据字典 服务类
 * </p>
 *
 * @author jobob
 * @since 2020-01-23
 */
public interface IBaseDdctService extends IService<BaseDdct> {
    IPage<BaseDdct> selectPageEntity(Page<BaseDdct> page);
}
