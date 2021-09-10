package com.make.passcheck.api.entity.design;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
@Data
@TableName("t_design_approval")
/**
 * 审批表
 */
public class TDesignApproval {
    @TableId(value = "id", type = IdType.AUTO)
    @JsonProperty(value = "id")
    private Integer id;//审批id
    @TableField(value = "t_design_task_id")
    @JsonProperty(value = "tDesignTaskId")
    private Integer tDesignTaskId;//设计任务书_任务书id
    @TableField(value = "t_design_user_user_id")
    @JsonProperty(value = "tDesignUserUserId")
    private Integer tDesignUserUserId;//工程人员_人员id
    @TableField(value = "check_pass")
    @JsonProperty(value = "checkPass")
    private Integer checkPass;//审批1通过2不通过
    @TableField(value = "check_date")
    @JsonProperty(value = "checkDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private java.sql.Date checkDate;//审批日期
    @TableField(value = "check_des")
    @JsonProperty(value = "checkDes")
    private String checkDes;//审批意见
    @TableField(value = "check_step")
    @JsonProperty(value = "checkStep")
    private Integer checkStep;//步骤
}
