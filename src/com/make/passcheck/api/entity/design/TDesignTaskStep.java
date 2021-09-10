package com.make.passcheck.api.entity.design;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
@Data
@TableName("t_design_task_step")
/**
 * 任务书阶段属性
 */
public class TDesignTaskStep {
    @TableId(value = "id", type = IdType.AUTO)
    @JsonProperty(value = "id")
    private Integer id;//阶段id
    @TableField(value = "code")
    @JsonProperty(value = "code")
    private Integer code;//阶段代码
    @TableField(value = "des")
    @JsonProperty(value = "des")
    private String des;//阶段描述
}
