package com.example.syslog.service.impl;

import com.example.syslog.entity.SysLog;
import com.example.syslog.mapper.SysLogMapper;
import com.example.syslog.service.SysLogService;
import com.example.syslog.param.SysLogPageParam;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import io.geekidea.springbootplus.framework.common.service.impl.BaseServiceImpl;
import io.geekidea.springbootplus.framework.core.pagination.Paging;
import io.geekidea.springbootplus.framework.core.pagination.PageInfo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.transaction.annotation.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 系统日志 服务实现类
 *
 * @author wangkang
 * @since 2020-04-14
 */
@Slf4j
@Service
public class SysLogServiceImpl extends BaseServiceImpl<SysLogMapper, SysLog> implements SysLogService {

    @Autowired
    private SysLogMapper sysLogMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean saveSysLog(SysLog sysLog) throws Exception {
        return super.save(sysLog);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean updateSysLog(SysLog sysLog) throws Exception {
        return super.updateById(sysLog);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public boolean deleteSysLog(Long id) throws Exception {
        return super.removeById(id);
    }

    @Override
    public Paging<SysLog> getSysLogPageList(SysLogPageParam sysLogPageParam) throws Exception {
        Page<SysLog> page = new PageInfo<>(sysLogPageParam, OrderItem.desc(getLambdaColumn(SysLog::getCreateTime)));
        LambdaQueryWrapper<SysLog> wrapper = new LambdaQueryWrapper<>();
        IPage<SysLog> iPage = sysLogMapper.selectPage(page, wrapper);
        return new Paging<SysLog>(iPage);
    }

}
