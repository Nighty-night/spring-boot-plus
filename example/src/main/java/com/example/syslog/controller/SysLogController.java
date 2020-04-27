package com.example.syslog.controller;

import com.example.syslog.entity.SysLog;
import com.example.syslog.service.SysLogService;
import lombok.extern.slf4j.Slf4j;
import com.example.syslog.param.SysLogPageParam;
import io.geekidea.springbootplus.framework.common.controller.BaseController;
import io.geekidea.springbootplus.framework.common.api.ApiResult;
import io.geekidea.springbootplus.framework.core.pagination.Paging;
import io.geekidea.springbootplus.framework.common.param.IdParam;
import io.geekidea.springbootplus.framework.log.annotation.Module;
import io.geekidea.springbootplus.framework.log.annotation.OperationLog;
import io.geekidea.springbootplus.framework.log.enums.OperationLogType;
import io.geekidea.springbootplus.framework.core.validator.groups.Add;
import io.geekidea.springbootplus.framework.core.validator.groups.Update;
import org.springframework.validation.annotation.Validated;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 系统日志 控制器
 *
 * @author wangkang
 * @since 2020-04-14
 */
@Slf4j
@RestController
@RequestMapping("/sysLog")
@Module("syslog")
@Api(value = "系统日志API", tags = {"系统日志"})
public class SysLogController extends BaseController {

    @Autowired
    private SysLogService sysLogService;

    /**
     * 添加系统日志
     */
    @PostMapping("/add")
    @OperationLog(name = "添加系统日志", type = OperationLogType.ADD)
    @ApiOperation(value = "添加系统日志", response = ApiResult.class)
    public ApiResult<Boolean> addSysLog(@Validated(Add.class) @RequestBody SysLog sysLog) throws Exception {
        boolean flag = sysLogService.saveSysLog(sysLog);
        return ApiResult.result(flag);
    }

    /**
     * 修改系统日志
     */
    @PostMapping("/update")
    @OperationLog(name = "修改系统日志", type = OperationLogType.UPDATE)
    @ApiOperation(value = "修改系统日志", response = ApiResult.class)
    public ApiResult<Boolean> updateSysLog(@Validated(Update.class) @RequestBody SysLog sysLog) throws Exception {
        boolean flag = sysLogService.updateSysLog(sysLog);
        return ApiResult.result(flag);
    }

    /**
     * 删除系统日志
     */
    @PostMapping("/delete/{id}")
    @OperationLog(name = "删除系统日志", type = OperationLogType.DELETE)
    @ApiOperation(value = "删除系统日志", response = ApiResult.class)
    public ApiResult<Boolean> deleteSysLog(@PathVariable("id") Long id) throws Exception {
        boolean flag = sysLogService.deleteSysLog(id);
        return ApiResult.result(flag);
    }

    /**
     * 获取系统日志详情
     */
    @GetMapping("/info/{id}")
    @OperationLog(name = "系统日志详情", type = OperationLogType.INFO)
    @ApiOperation(value = "系统日志详情", response = SysLog.class)
    public ApiResult<SysLog> getSysLog(@PathVariable("id") Long id) throws Exception {
        SysLog sysLog = sysLogService.getById(id);
        return ApiResult.ok(sysLog);
    }

    /**
     * 系统日志分页列表
     */
    @PostMapping("/getPageList")
    @OperationLog(name = "系统日志分页列表", type = OperationLogType.PAGE)
    @ApiOperation(value = "系统日志分页列表", response = SysLog.class)
    public ApiResult<Paging<SysLog>> getSysLogPageList(@Validated @RequestBody SysLogPageParam sysLogPageParam) throws Exception {
        Paging<SysLog> paging = sysLogService.getSysLogPageList(sysLogPageParam);
        return ApiResult.ok(paging);
    }

}

