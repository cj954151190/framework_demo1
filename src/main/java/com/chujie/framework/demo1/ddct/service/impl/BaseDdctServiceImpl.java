package com.chujie.framework.demo1.ddct.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.chujie.framework.demo1.ddct.entity.BaseDdct;
import com.chujie.framework.demo1.ddct.mapper.BaseDdctMapper;
import com.chujie.framework.demo1.ddct.service.IBaseDdctService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * <p>
 * 数据字典 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2020-01-23
 */
@Service()
public class BaseDdctServiceImpl extends ServiceImpl<BaseDdctMapper, BaseDdct> implements IBaseDdctService {
    @Autowired
    BaseDdctMapper baseDdctMapper;
    @Override
    public IPage<BaseDdct> selectPageEntity(Page<BaseDdct> page) {
        return baseDdctMapper.selectPageEntity(page);
    }
}
