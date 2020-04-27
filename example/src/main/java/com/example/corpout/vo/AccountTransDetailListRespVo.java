package com.example.corpout.vo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@ApiModel("查询账户当日历史交易明细[4013]-list")
public class AccountTransDetailListRespVo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value="主机记账日期",example = "1111")
    @XStreamAlias("AcctDate")
    private String acctDate;
    @ApiModelProperty(value="交易时间",example = "1111")
    @XStreamAlias("TxTime")
    private String txTime;
    @ApiModelProperty(value="主机流水号",example = "1111")
    @XStreamAlias("HostTrace")
    private String hostTrace;
    @ApiModelProperty(value="业务流水号",example = "1111")
    @XStreamAlias("BussSeqNo")
    private String bussSeqNo;
    @ApiModelProperty(value="明细序号",example = "1111")
    @XStreamAlias("DetailSerialNo")
    private String detailSerialNo;
    @ApiModelProperty(value="付款方网点号",example = "1111")
    @XStreamAlias("OutNode")
    private String outNode;
    @ApiModelProperty(value="付款方联行号",example = "1111")
    @XStreamAlias("OutBankNo")
    private String outBankNo;
    @ApiModelProperty(value="付款行名称",example = "1111")
    @XStreamAlias("OutBankName")
    private String outBankName;
    @ApiModelProperty(value="付款方账号",example = "1111")
    @XStreamAlias("OutAcctNo")
    private String outAcctNo;
    @ApiModelProperty(value="结算币种",example = "RMB")
    @XStreamAlias("CcyCode")
    private String ccyCode;
    @ApiModelProperty(value="交易金额",example = "0.00")
    @XStreamAlias("TranAmount")
    private String tranAmount;
    @ApiModelProperty(value="收款方网点号",example = "1111")
    @XStreamAlias("InNode")
    private String inNode;
    @ApiModelProperty(value="收款方联行号",example = "1111")
    @XStreamAlias("InBankNo")
    private String inBankNo;
    @ApiModelProperty(value="收款方行名",example = "1111")
    @XStreamAlias("InBankName")
    private String inBankName;
    @ApiModelProperty(value="收款方账号",example = "1111")
    @XStreamAlias("InAcctNo")
    private String inAcctNo;
    @ApiModelProperty(value="收款方户名",example = "1111")
    @XStreamAlias("InAcctName")
    private String inAcctName;
    @ApiModelProperty(value="借贷标志",example = "1111")
    @XStreamAlias("DcFlag")
    private String dcFlag;
    @ApiModelProperty(value="摘要，未翻译的摘要，如TRS",example = "1111")
    @XStreamAlias("AbstractStr")
    private String abstractStr;
    @ApiModelProperty(value="凭证号",example = "1111")
    @XStreamAlias("VoucherNo")
    private String voucherNo;
    @ApiModelProperty(value="手续费",example = "1111")
    @XStreamAlias("TranFee")
    private String tranFee;
    @ApiModelProperty(value="邮电费",example = "1111")
    @XStreamAlias("PostFee")
    private String postFee;
    @ApiModelProperty(value="账户余额",example = "1111")
    @XStreamAlias("AcctBalance")
    private String acctBalance;
    @ApiModelProperty(value="用途，附言",example = "1111")
    @XStreamAlias("Purpose")
    private String purpose;
    @ApiModelProperty(value="中文摘要，AbstractStr的中文翻译",example = "1111")
    @XStreamAlias("AbstractStr_Desc")
    private String abstractStr_Desc;
    @ApiModelProperty(value="代理人户名",example = "1111")
    @XStreamAlias("ProxyPayName")
    private String proxyPayName;
    @ApiModelProperty(value="代理人账号",example = "1111")
    @XStreamAlias("ProxyPayAcc")
    private String proxyPayAcc;
    @ApiModelProperty(value="代理人银行名称",example = "1111")
    @XStreamAlias("ProxyPayBankName")
    private String proxyPayBankName;
    @ApiModelProperty(value="主机日期",example = "1111")
    @XStreamAlias("HostDate")
    private String hostDate;
}
