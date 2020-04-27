package com.example.corpout.vo;

import com.example.corpout.util.XStreamTransformer;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.InputStream;
import java.util.List;

@Data
@Accessors(chain = true)
@ApiModel("查询账户当日历史交易明细[4013]")
@XStreamAlias("Result")
@EqualsAndHashCode(callSuper = true)
public class AccountTransDetailRespVo extends BaseRespVo{
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value="账号",example = "11005749455802")
    @XStreamAlias("AcctNo")
    private String acctNo;
    @ApiModelProperty(value="货币类型",example = "RMB")
    @XStreamAlias("CcyCode")
    private String ccyCode;
    @ApiModelProperty(value="数据结束标志",example = "Y")
    @XStreamAlias("EndFlag")
    private String endFlag;
    @ApiModelProperty(value="预留字段",example = "预留字段")
    @XStreamAlias("Reserve")
    private String reserve;
    @ApiModelProperty(value="查询页码",example = "1")
    @XStreamAlias("PageNo")
    private String pageNo;
    @ApiModelProperty(value="记录笔数",example = "30")
    @XStreamAlias("PageRecCount")
    private String pageRecCount;
    @ApiModelProperty(value="循环体",example = "30")
    @XStreamImplicit(itemFieldName = "list")
    private List<AccountTransDetailListRespVo> accountTransDetailListRespVos;

    public static AccountTransDetailRespVo fromXml(String xml) {
        xml = xml.replace("<?xml version=\\\"1.0\\\" encoding=\\\"GBK\\\" ?>", "");
        final AccountTransDetailRespVo xmlMessage = XStreamTransformer.fromXml(AccountTransDetailRespVo.class, xml);
        return xmlMessage;
    }

    public static AccountTransDetailRespVo fromXml(InputStream is) {
        return XStreamTransformer.fromXml(AccountTransDetailRespVo.class, is);
    }
}
