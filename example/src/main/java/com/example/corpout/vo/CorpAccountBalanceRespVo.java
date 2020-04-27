package com.example.corpout.vo;

import com.example.corpout.util.XStreamTransformer;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.InputStream;

@Data
@Accessors(chain = true)
@ApiModel("企业账户余额查询出参")
@XStreamAlias("Result")
@EqualsAndHashCode(callSuper = true)
public class CorpAccountBalanceRespVo extends BaseRespVo{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value="账号",example = "11002923034501")
    @XStreamAlias("Account")
    private String account;
    @ApiModelProperty(value="钞汇标志",example = "C")
    @XStreamAlias("CcyType")
    private String ccyType;
    @ApiModelProperty(value="货币类型",example = "RMB")
    @XStreamAlias("CcyCode")
    private String ccyCode;
    @ApiModelProperty(value="账户户名",example = "RMB")
    @XStreamAlias("AccountName")
    private String accountName;
    @ApiModelProperty(value="可用余额",example = "0.00")
    @XStreamAlias("Balance")
    private String balance;
    @ApiModelProperty(value="账面余额",example = "0.00")
    @XStreamAlias("TotalAmount")
    private String totalAmount;
    @ApiModelProperty(value="账户状态",example = "A| DGZH01")
    @XStreamAlias("AccountStatus")
    private String accountStatus;
    @ApiModelProperty(value="冻结金额",example = "0.00")
    @XStreamAlias("HoldBalance")
    private String holdBalance;
    @ApiModelProperty(value="止付金额",example = "0.00")
    @XStreamAlias("StopBalance")
    private String stopBalance;
    @ApiModelProperty(value="昨日余额",example = "0.00")
    @XStreamAlias("LastBalance")
    private String lastBalance;

    public static CorpAccountBalanceRespVo fromXml(String xml) {
        xml = xml.replace("<?xml version=\\\"1.0\\\" encoding=\\\"GBK\\\" ?>", "");
        final CorpAccountBalanceRespVo xmlMessage = XStreamTransformer.fromXml(CorpAccountBalanceRespVo.class, xml);
        return xmlMessage;
    }

    public static CorpAccountBalanceRespVo fromXml(InputStream is) {
        return XStreamTransformer.fromXml(CorpAccountBalanceRespVo.class, is);
    }
}
