package com.example.corpout.controller;

import com.example.corpout.param.*;
import com.example.corpout.service.CorpOutService;
import com.example.corpout.vo.*;
import io.geekidea.springbootplus.framework.common.api.ApiResult;
import io.geekidea.springbootplus.framework.log.annotation.Module;
import io.geekidea.springbootplus.framework.log.annotation.OperationLog;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/corpOut")
@Module("corpout")
@Api(value = "企业对接银行API", tags = {"平安银行服务"})
public class CorpOutController {

    @Autowired
    private CorpOutService corpOutService;

    @PostMapping(value = "/getSubAccountBalance")
    @OperationLog(name = "C008-子账户余额查询")
    @ApiOperation(value = "C008-子账户余额查询", response = SubAccountBalanceRespVo.class)
    public ApiResult<SubAccountBalanceRespVo> getSubAccountBalance(@Validated @RequestBody SubAccountBalanceReqParam reqParam) throws Exception {
        SubAccountBalanceRespVo rcvMsg = corpOutService.getSubAccountBalance(reqParam);
        return ApiResult.ok(rcvMsg);
    }

    @PostMapping(value = "/audrSubAccount")
    @OperationLog(name = "C002-子账户维护和权限")
    @ApiOperation(value = "C002-子账户维护和权限", response = SubAccountAudrRespVo.class)
    public ApiResult<SubAccountAudrRespVo> audrSubAccount(@Validated @RequestBody SubAccountAudrReqParam reqParam) throws Exception {
        SubAccountAudrRespVo rcvMsg = corpOutService.audrSubAccount(reqParam);
        return ApiResult.ok(rcvMsg);
    }

    @PostMapping(value = "/getCorpAccountBalance")
    @OperationLog(name = "4001-企业账户余额查询")
    @ApiOperation(value = "4001-企业账户余额查询", response = CorpAccountBalanceRespVo.class)
    public ApiResult<CorpAccountBalanceRespVo> getCorpAccountBalance(@Validated @RequestBody CorpAccountBalanceReqParam reqParam) throws Exception {
        CorpAccountBalanceRespVo rcvMsg = corpOutService.getCorpAccountBalance(reqParam);
        return ApiResult.ok(rcvMsg);
    }

    @PostMapping(value = "/getAccountTransDetail")
    @OperationLog(name = "4013-账户当日历史交易明细")
    @ApiOperation(value = "4013-账户当日历史交易明细", response = AccountTransDetailRespVo.class)
    public ApiResult<AccountTransDetailRespVo> getAccountTransDetail(@Validated @RequestBody AccountTransDetailReqParam reqParam) throws Exception {
        AccountTransDetailRespVo rcvMsg = corpOutService.getAccountTransDetail(reqParam);
        return ApiResult.ok(rcvMsg);
    }

    @PostMapping(value = "/getAccountBalance")
    @OperationLog(name = "4012-历史余额查询")
    @ApiOperation(value = "4012-历史余额查询", response = AccountBalanceRespVo.class)
    public ApiResult<AccountBalanceRespVo> getAccountBalance(@Validated @RequestBody AccountBalanceReqParam reqParam) throws Exception {
        AccountBalanceRespVo rcvMsg = corpOutService.getAccountBalance(reqParam);
        return ApiResult.ok(rcvMsg);
    }
}
