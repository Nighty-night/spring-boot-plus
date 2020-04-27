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
@ApiModel("子账户维护和权限请求参数")
@XStreamAlias("Result")
@EqualsAndHashCode(callSuper = true)
public class SubAccountAudrReqParam extends BaseReqParam {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value="主账号",example = "11014490083801")
    @XStreamAlias("MainAccount")
    private String mainAccount;
    @ApiModelProperty(value="币种",example = "RMB")
    @XStreamAlias("CcyCode")
    private String ccyCode;
    @ApiModelProperty(value = "子账户序号",example = "123456")
    @XStreamAlias("SubAccountSeq")
    private String subAccountSeq;
    @ApiModelProperty(value = "子账号",example = "30100210000001")
    @XStreamAlias("SubAccount")
    private String subAccount;
    @ApiModelProperty(value = "子账户户名",example = "平安测试zxl")
    @XStreamAlias("SubAccountName")
    private String subAccountName;
    @ApiModelProperty(value = "功能码：A-新增，U-修改，D-删除，R-恢复",example = "A")
    @XStreamAlias("OpFlag")
    private String opFlag;

    @SuppressWarnings("unchecked")
    public String toXml() {
        StringBuilder builder = new StringBuilder();
        String xml = XStreamTransformer.toXml((Class<SubAccountAudrReqParam>) this.getClass(), this);
        builder.append("<?xml version=\"1.0\" encoding=\"GBK\"?>\n");
        builder.append(xml);
        return builder.toString();
    }
}
