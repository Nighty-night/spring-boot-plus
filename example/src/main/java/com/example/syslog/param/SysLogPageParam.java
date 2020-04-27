package com.example.syslog.param;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import io.geekidea.springbootplus.framework.core.pagination.BasePageOrderParam;

/**
 * <pre>
 * 系统日志 分页参数对象
 * </pre>
 *
 * @author wangkang
 * @date 2020-04-14
 */
@Data
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "系统日志分页参数")
public class SysLogPageParam extends BasePageOrderParam {
    private static final long serialVersionUID = 1L;
}
