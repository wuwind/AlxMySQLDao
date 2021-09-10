package com.make.passcheck.api.entity.design;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
@Data
@TableName("t_design_task_log")
/**
 * 任务书变更日志
 */
public class TDesignTaskLog {
    @TableId(value = "id", type = IdType.AUTO)
    @JsonProperty(value = "id")
    private Integer id;//id
    @TableField(value = "t_design_task_id")
    @JsonProperty(value = "tDesignTaskId")
    private Integer tDesignTaskId;//设计任务书_任务书id
    @TableField(value = "task_number")
    @JsonProperty(value = "taskNumber")
    private String taskNumber;//任务书号
    @TableField(value = "change_content")
    @JsonProperty(value = "changeContent")
    private String changeContent;//变更内容
    @TableField(value = "change_times")
    @JsonProperty(value = "changeTimes")
    private Integer changeTimes;//变更次数
    @TableField(value = "change_date")
    @JsonProperty(value = "changeDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private java.sql.Date changeDate;//变更时间
}
