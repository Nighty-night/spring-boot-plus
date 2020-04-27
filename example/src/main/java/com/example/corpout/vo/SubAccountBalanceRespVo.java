package com.example.corpout.vo;
import java.io.InputStream;
import	java.math.BigDecimal;

import com.example.corpout.util.XStreamTransformer;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Map;

@Data
@Accessors(chain = true)
@ApiModel("子账户余额查询出参")
@XStreamAlias("Result")
@EqualsAndHashCode(callSuper = true)
public class SubAccountBalanceRespVo extends BaseRespVo {

    private static final long serialVersionUID = 1L;

    /**
     * 使用dom4j解析的存放所有xml属性和值的map.
     */
    private Map<String, Object> allFieldsMap;

    @ApiModelProperty(value="主账号",example = "11014490083801")
    @XStreamAlias("MainAccount")
    private String mainAccount;
    @ApiModelProperty(value = "子账号",example = "30100210000001")
    @XStreamAlias("SubAccountNo")
    private String subAccountNo;
    @ApiModelProperty(value="币种",example = "RMB")
    @XStreamAlias("CcyCode")
    private String ccyCode;
    @ApiModelProperty(value = "子账户户名",example = "平安测试zxl")
    @XStreamAlias("SubAccountName")
    private String subAccountName;
    @ApiModelProperty(value = "子账户余额",example = "0.00")
    @XStreamAlias("SubAccBalance")
    private BigDecimal subAccBalance;
    @ApiModelProperty(value = "子账户透支标志",example = "Y")
    @XStreamAlias("ODFlag")
    private String oDFlag;

    public static SubAccountBalanceRespVo fromXml(String xml) {
        xml = xml.replace("<?xml version=\\\"1.0\\\" encoding=\\\"GBK\\\" ?>", "");
        final SubAccountBalanceRespVo xmlMessage = XStreamTransformer.fromXml(SubAccountBalanceRespVo.class, xml);
        //修改微信变态的消息内容格式，方便解析
        //xmlMessage.setAllFieldsMap(XmlUtils.xml2Map(xml));
        return xmlMessage;
    }

    public static SubAccountBalanceRespVo fromXml(InputStream is) {
        return XStreamTransformer.fromXml(SubAccountBalanceRespVo.class, is);
    }
}
