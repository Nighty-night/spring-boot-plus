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
@ApiModel("历史余额查询[4012]")
@XStreamAlias("Result")
@EqualsAndHashCode(callSuper = true)
public class AccountBalanceReqParam extends BaseReqParam{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value="账户",example = "15000090284257")
    @XStreamAlias("Account")
    private String account;
    @ApiModelProperty(value="历史日期",example = "20180827")
    @XStreamAlias("RptDate")
    private String rptDate;
    @ApiModelProperty(value="保留域",example = "保留域")
    @XStreamAlias("Reserve")
    private String reserve;

    @SuppressWarnings("unchecked")
    public String toXml() {
        StringBuilder builder = new StringBuilder();
        String xml = XStreamTransformer.toXml((Class<AccountBalanceReqParam>) this.getClass(), this);
        builder.append("<?xml version=\"1.0\" encoding=\"GBK\"?>\n");
        builder.append(xml);
        return builder.toString();
    }
}
