package com.example.corpout.service;

import com.example.corpout.param.*;
import com.example.corpout.vo.*;

public interface CorpOutService {

    SubAccountBalanceRespVo getSubAccountBalance(SubAccountBalanceReqParam reqParam) throws Exception;

    SubAccountAudrRespVo audrSubAccount(SubAccountAudrReqParam reqParam) throws Exception;

    CorpAccountBalanceRespVo getCorpAccountBalance(CorpAccountBalanceReqParam reqParam) throws Exception;

    AccountTransDetailRespVo getAccountTransDetail(AccountTransDetailReqParam reqParam) throws Exception;

    AccountBalanceRespVo getAccountBalance(AccountBalanceReqParam reqParam) throws Exception;
}
