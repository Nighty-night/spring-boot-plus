package com.example.corpout.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@ApiModel("状态")
public class BaseRespVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(name = "响应代码", example = "000000")
    private String rtnCode;
    @ApiModelProperty(name = "响应信息", example = "成功")
    private String rtnMsg;
    @JsonIgnore
    private String success;

    public void success() {
        this.rtnCode = "0000";
        this.rtnMsg = "请求成功";
    }

    public void fail() {
        this.rtnCode = "9999";
        this.rtnMsg = "请求失败";
    }

    public boolean isSuccess() {
        return null != this.rtnCode && "0000".equals(this.rtnCode);
    }

}
