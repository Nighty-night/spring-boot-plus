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
@ApiModel("企业账户余额查询请求参数")
@XStreamAlias("Result")
@EqualsAndHashCode(callSuper = true)
public class CorpAccountBalanceReqParam extends BaseReqParam{
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

    @SuppressWarnings("unchecked")
    public String toXml() {
        StringBuilder builder = new StringBuilder();
        String xml = XStreamTransformer.toXml((Class<CorpAccountBalanceReqParam>) this.getClass(), this);
        builder.append("<?xml version=\"1.0\" encoding=\"GBK\"?>\n");
        builder.append(xml);
        return builder.toString();
    }
}
