package com.chujie.framework.demo1.ddct.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chujie.framework.demo1.ddct.entity.BaseDdct;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 数据字典 Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2020-01-23
 */
public interface BaseDdctMapper extends BaseMapper<BaseDdct> {
    IPage<BaseDdct> selectPageEntity(Page<BaseDdct> page);
}
