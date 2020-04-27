package com.example.corpout.param;

import com.example.corpout.util.XStreamTransformer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@ApiModel("查询账户当日历史交易明细[4013]")
@XStreamAlias("Result")
@EqualsAndHashCode(callSuper = true)
public class AccountTransDetailReqParam extends BaseReqParam{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value="账号",example = "11005749455802")
    @XStreamAlias("AcctNo")
    private String acctNo;
    @ApiModelProperty(value="币种",example = "RMB")
    @XStreamAlias("CcyCode")
    private String ccyCode;
    @ApiModelProperty(value="开始日期",example = "20180101")
    @XStreamAlias("BeginDate")
    private String beginDate;
    @ApiModelProperty(value="结束日期",example = "20181025")
    @XStreamAlias("EndDate")
    private String endDate;
    @ApiModelProperty(value="查询页码",example = "1")
    @XStreamAlias("PageNo")
    private String pageNo;
    @ApiModelProperty(value="每页明细数量",example = "30")
    @XStreamAlias("PageSize")
    private String pageSize;
    @ApiModelProperty(value="预留字段",example = "预留字段")
    @XStreamAlias("Reserve")
    @JsonIgnore
    private String reserve;
    @ApiModelProperty(value="记录排序标志",example = "002")
    @XStreamAlias("OrderMode")
    private String orderMode;

    @SuppressWarnings("unchecked")
    public String toXml() {
        StringBuilder builder = new StringBuilder();
        String xml = XStreamTransformer.toXml((Class<AccountTransDetailReqParam>) this.getClass(), this);
        builder.append("<?xml version=\"1.0\" encoding=\"GBK\"?>\n");
        builder.append(xml);
        return builder.toString();
    }
}
