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
@ApiModel("子账户维护和权限同步出参")
@XStreamAlias("Result")
@EqualsAndHashCode(callSuper = true)
public class SubAccountAudrRespVo extends BaseRespVo{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value="主账号",example = "11014490083801")
    @XStreamAlias("MainAccount")
    private String mainAccount;
    @ApiModelProperty(value = "子账号",example = "30100210000001")
    @XStreamAlias("SubAccountNo")
    private String subAccountNo;
    @ApiModelProperty(value = "子账户户名",example = "平安测试zxl")
    @XStreamAlias("SubAccountName")
    private String subAccountName;
    @ApiModelProperty(value = "子账号状态",example = "N")
    @XStreamAlias("Stt")
    private String stt;
    @ApiModelProperty(value = "最后维护日期",example = "20200202")
    @XStreamAlias("LastModifyDate")
    private String lastModifyDate;
    @ApiModelProperty(value = "内部计息标志",example = "Y")
    @XStreamAlias("InterestFlag")
    private String interestFlag;
    @ApiModelProperty(value = "内部计息周期",example = "D")
    @XStreamAlias("SettleInterestCycle")
    private String settleInterestCycle;
    @ApiModelProperty(value = "计息利率",example = "0")
    @XStreamAlias("Rate")
    private String rate;

    public static SubAccountAudrRespVo fromXml(String xml) {
        xml = xml.replace("<?xml version=\\\"1.0\\\" encoding=\\\"GBK\\\" ?>", "");
        final SubAccountAudrRespVo xmlMessage = XStreamTransformer.fromXml(SubAccountAudrRespVo.class, xml);
        return xmlMessage;
    }

    public static SubAccountAudrRespVo fromXml(InputStream is) {
        return XStreamTransformer.fromXml(SubAccountAudrRespVo.class, is);
    }
}
