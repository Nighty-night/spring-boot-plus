package com.example.syslog.entity;

import io.geekidea.springbootplus.framework.common.entity.BaseEntity;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import io.geekidea.springbootplus.framework.core.validator.groups.Update;

/**
 * 系统日志
 *
 * @author wangkang
 * @since 2020-04-14
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "SysLog对象")
public class SysLog extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @NotNull(message = "主键不能为空")
    @ApiModelProperty("主键")
    @TableId(value = "log_id", type = IdType.AUTO)
    private Long logId;

    @ApiModelProperty("类型")
    private Boolean type;

    @ApiModelProperty("内容")
    private String content;

    @ApiModelProperty("创建人ID")
    private Long createId;

    @ApiModelProperty("创建时间")
    private Date createTime;

}
