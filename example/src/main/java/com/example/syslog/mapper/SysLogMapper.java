package com.example.syslog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.syslog.entity.SysLog;
import com.example.syslog.param.SysLogPageParam;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;
import java.io.Serializable;

/**
 * 系统日志 Mapper 接口
 *
 * @author wangkang
 * @since 2020-04-14
 */
@Repository
public interface SysLogMapper extends BaseMapper<SysLog> {


}
