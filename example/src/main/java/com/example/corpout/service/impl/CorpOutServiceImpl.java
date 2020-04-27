package com.example.corpout.service.impl;

import com.example.corpout.param.*;
import com.example.corpout.service.CorpOutService;
import com.example.corpout.util.BusinessUtil;
import com.example.corpout.util.ChgUtil;
import com.example.corpout.util.YQUtil;
import com.example.corpout.vo.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

@Slf4j
@Service
public class CorpOutServiceImpl implements CorpOutService {
    /**
     * C008-子账户查询余额
     * @param reqParam
     * @return
     * @throws Exception
     */
    @Override
    public SubAccountBalanceRespVo getSubAccountBalance(SubAccountBalanceReqParam reqParam) throws Exception {
        BaseReqParam baseReqParam = new BaseReqParam();
        BeanUtils.copyProperties(reqParam,baseReqParam);
        baseReqParam.setTxtSend(reqParam.toXml());
        String respStr = YQUtil.sendService(baseReqParam);
        String respXml = ChgUtil.subStr2XmlAngel(respStr, 222);
        SubAccountBalanceRespVo respVo = new SubAccountBalanceRespVo();
        if(StringUtils.isNotBlank(respXml)){
            respVo = SubAccountBalanceRespVo.fromXml(respXml);
        }
        Map<String, String> headMap = BusinessUtil.head2Map(respStr);
        String respCode = headMap.get("respCode");
        String respMsg = headMap.get("respMsg");
        respVo.setRtnCode(respCode);
        respVo.setRtnMsg(respMsg);
        return respVo;
    }

    /**
     * C002-子账户维护和权限
     * @param reqParam
     * @return
     * @throws Exception
     */
    @Override
    public SubAccountAudrRespVo audrSubAccount(SubAccountAudrReqParam reqParam) throws Exception {
        BaseReqParam baseReqParam = new BaseReqParam();
        BeanUtils.copyProperties(reqParam,baseReqParam);
        baseReqParam.setTxtSend(reqParam.toXml());
        String respStr = YQUtil.sendService(baseReqParam);
        String respXml = ChgUtil.subStr2XmlAngel(respStr, 222);
        SubAccountAudrRespVo respVo = new SubAccountAudrRespVo();
        if(StringUtils.isNotBlank(respXml)){
            respVo = SubAccountAudrRespVo.fromXml(respXml);
        }
        Map<String, String> headMap = BusinessUtil.head2Map(respStr);
        String respCode = headMap.get("respCode");
        String respMsg = headMap.get("respMsg");
        respVo.setRtnCode(respCode);
        respVo.setRtnMsg(respMsg);
        return respVo;
    }

    /**
     *4001-企业账户余额查询
     * @param reqParam
     * @return
     * @throws Exception
     */
    @Override
    public CorpAccountBalanceRespVo getCorpAccountBalance(CorpAccountBalanceReqParam reqParam) throws Exception {
        BaseReqParam baseReqParam = new BaseReqParam();
        BeanUtils.copyProperties(reqParam,baseReqParam);
        baseReqParam.setTxtSend(reqParam.toXml());
        String respStr = YQUtil.sendService(baseReqParam);
        String respXml = ChgUtil.subStr2XmlAngel(respStr, 222);
        CorpAccountBalanceRespVo respVo = new CorpAccountBalanceRespVo();
        if(StringUtils.isNotBlank(respXml)){
            respVo = CorpAccountBalanceRespVo.fromXml(respXml);
        }
        Map<String, String> headMap = BusinessUtil.head2Map(respStr);
        String respCode = headMap.get("respCode");
        String respMsg = headMap.get("respMsg");
        respVo.setRtnCode(respCode);
        respVo.setRtnMsg(respMsg);
        return respVo;
    }

    /**
     * 4013-账户当日历史交易明细
     * @param reqParam
     * @return
     * @throws Exception
     */
    @Override
    public AccountTransDetailRespVo getAccountTransDetail(AccountTransDetailReqParam reqParam) throws Exception {
        BaseReqParam baseReqParam = new BaseReqParam();
        BeanUtils.copyProperties(reqParam,baseReqParam);
        baseReqParam.setTxtSend(reqParam.toXml());
        String respStr = YQUtil.sendService(baseReqParam);
        String respXml = ChgUtil.subStr2XmlAngel(respStr, 222);
        AccountTransDetailRespVo respVo = new AccountTransDetailRespVo();
        if(StringUtils.isNotBlank(respXml)){
            respVo = AccountTransDetailRespVo.fromXml(respXml);
        }
        Map<String, String> headMap = BusinessUtil.head2Map(respStr);
        String respCode = headMap.get("respCode");
        String respMsg = headMap.get("respMsg");
        respVo.setRtnCode(respCode);
        respVo.setRtnMsg(respMsg);
        return respVo;
    }

    /**
     * 4012-历史余额查询
     * @param reqParam
     * @return
     * @throws Exception
     */
    @Override
    public AccountBalanceRespVo getAccountBalance(AccountBalanceReqParam reqParam) throws Exception {
        BaseReqParam baseReqParam = new BaseReqParam();
        BeanUtils.copyProperties(reqParam,baseReqParam);
        baseReqParam.setTxtSend(reqParam.toXml());
        String respStr = YQUtil.sendService(baseReqParam);
        String respXml = ChgUtil.subStr2XmlAngel(respStr, 222);
        AccountBalanceRespVo respVo = new AccountBalanceRespVo();
        if(StringUtils.isNotBlank(respXml)){
            respVo = AccountBalanceRespVo.fromXml(respXml);
        }
        Map<String, String> headMap = BusinessUtil.head2Map(respStr);
        String respCode = headMap.get("respCode");
        String respMsg = headMap.get("respMsg");
        respVo.setRtnCode(respCode);
        respVo.setRtnMsg(respMsg);
        return respVo;
    }
}
