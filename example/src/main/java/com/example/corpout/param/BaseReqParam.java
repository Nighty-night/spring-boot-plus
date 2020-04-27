package com.example.corpout.param;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.thoughtworks.xstream.annotations.XStreamOmitField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@ApiModel("common参数")
public class BaseReqParam implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "银企代码",example = "00103079800000078000")
    @XStreamOmitField
    private String yqdm;
    @ApiModelProperty(value = "交易码",example = "S001")
    @XStreamOmitField
    private String tranCode;
    @ApiModelProperty(value = "是否自动生成报文头", example = "true")
    @XStreamOmitField
    private boolean chkAutoHead;
    @ApiModelProperty(value = "自动加签名长度",example = "false")
    @XStreamOmitField
    private boolean chkAutoSubfixLenth;
    @ApiModelProperty(value = "自动加签名长度",example = "false")
    @XStreamOmitField
    private boolean chk0x00;
    @ApiModelProperty("请求报文")
    @JsonIgnore
    @XStreamOmitField
    private String txtSend;

}
