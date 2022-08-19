package com.example.map;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
public class RequestVO {
    @ApiModelProperty(value = "模板id")
    private List<String> templateId;

    @ApiModelProperty(value = "用户id")
    private List<String> userId;

    @ApiModelProperty(value = "节点处理人，0：包含（默认），1：等于")
    private Boolean userIdCond;

    @ApiModelProperty(value = "节点名称")
    private String nodeName;

    @ApiModelProperty(value = "节点名称，0：包含（默认），1：等于")
    private Boolean nodeNameCond;

    @ApiModelProperty(value = "节点类型，默认：review、send、sign、vote")
    private List<String> nodeType;
}
