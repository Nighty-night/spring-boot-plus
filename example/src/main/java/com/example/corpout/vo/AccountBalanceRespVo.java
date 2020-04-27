package com.example.corpout.vo;

import com.example.corpout.util.XStreamTransformer;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.apache.shiro.authc.Account;

import java.io.InputStream;

@Data
@Accessors(chain = true)
@ApiModel("历史余额查询[4012]")
@XStreamAlias("Result")
@EqualsAndHashCode(callSuper = true)
public class AccountBalanceRespVo  extends BaseRespVo{
    private static final long serialVersionUID = 1L;
    @ApiModelProperty(value="账户",example = "15000090284257")
    @XStreamAlias("Account")
    private String account;
    @ApiModelProperty(value="币种",example = "RMB")
    @XStreamAlias("CcyCode")
    private String ccyCode;
    @ApiModelProperty(value="历史日期",example = "20180827")
    @XStreamAlias("RptDate")
    private String rptDate;
    @ApiModelProperty(value="钞汇标志",example = "C")
    @XStreamAlias("CcyType")
    private String ccyType;
    @ApiModelProperty(value="账单余额",example = "0.00")
    @XStreamAlias("HisBalance")
    private String hisBalance;
    @ApiModelProperty(value="账面余额",example = "0.00")
    @XStreamAlias("HisBookBalance")
    private String hisBookBalance;

    public static AccountBalanceRespVo fromXml(String xml) {
        xml = xml.replace("<?xml version=\\\"1.0\\\" encoding=\\\"GBK\\\" ?>", "");
        final AccountBalanceRespVo xmlMessage = XStreamTransformer.fromXml(AccountBalanceRespVo.class, xml);
        return xmlMessage;
    }

    public static AccountBalanceRespVo fromXml(InputStream is) {
        return XStreamTransformer.fromXml(AccountBalanceRespVo.class, is);
    }
}
