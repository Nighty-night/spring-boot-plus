package com.example.corpout.param;

import com.example.corpout.util.XStreamTransformer;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


@Data
@Accessors(chain = true)
@ApiModel("子账户余额查询参数")
@XStreamAlias("Result")
@EqualsAndHashCode(callSuper = true)
public class SubAccountBalanceReqParam extends BaseReqParam{

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value="主账号",example = "11014490083801")
    @XStreamAlias("MainAccount")
    private String mainAccount;
    @ApiModelProperty(value = "子账号",example = "30100210000001")
    @XStreamAlias("ReqSubAccountNo")
    private String reqSubAccountNo;
    @ApiModelProperty(value="币种",example = "RMB")
    @XStreamAlias("CcyCode")
    private String ccyCode;

    @SuppressWarnings("unchecked")
    public String toXml() {
        StringBuilder builder = new StringBuilder();
        String xml = XStreamTransformer.toXml((Class<SubAccountBalanceReqParam>) this.getClass(), this);
        builder.append("<?xml version=\"1.0\" encoding=\"GBK\"?>\n");
        builder.append(xml);
        return builder.toString();
    }
}
