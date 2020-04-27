package com.example.syslog.service;

import com.example.syslog.entity.SysLog;
import com.example.syslog.param.SysLogPageParam;
import io.geekidea.springbootplus.framework.common.service.BaseService;
import io.geekidea.springbootplus.framework.core.pagination.Paging;

/**
 * 系统日志 服务类
 *
 * @author wangkang
 * @since 2020-04-14
 */
public interface SysLogService extends BaseService<SysLog> {

    /**
     * 保存
     *
     * @param sysLog
     * @return
     * @throws Exception
     */
    boolean saveSysLog(SysLog sysLog) throws Exception;

    /**
     * 修改
     *
     * @param sysLog
     * @return
     * @throws Exception
     */
    boolean updateSysLog(SysLog sysLog) throws Exception;

    /**
     * 删除
     *
     * @param id
     * @return
     * @throws Exception
     */
    boolean deleteSysLog(Long id) throws Exception;


    /**
     * 获取分页对象
     *
     * @param sysLogQueryParam
     * @return
     * @throws Exception
     */
    Paging<SysLog> getSysLogPageList(SysLogPageParam sysLogPageParam) throws Exception;

}
