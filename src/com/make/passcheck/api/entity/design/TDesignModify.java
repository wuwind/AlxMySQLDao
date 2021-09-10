package com.make.passcheck.api.entity.design;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
@Data
@TableName("t_design_modify")
/**
 * 变更任务
 */
public class TDesignModify {
    @TableId(value = "id", type = IdType.AUTO)
    @JsonProperty(value = "id")
    private Integer id;//变更id
    @TableField(value = "t_design_task_id")
    @JsonProperty(value = "tDesignTaskId")
    private Integer tDesignTaskId;//设计任务书_任务书id
    @TableField(value = "make_number")
    @JsonProperty(value = "makeNumber")
    private String makeNumber;//美科图号
    @TableField(value = "is_share_other")
    @JsonProperty(value = "isShareOther")
    private Boolean isShareOther;//是否其他业务共用
    @TableField(value = "share_other_des")
    @JsonProperty(value = "shareOtherDes")
    private String shareOtherDes;//其他共用描述
    @TableField(value = "modify_des")
    @JsonProperty(value = "modifyDes")
    private String modifyDes;//变更原因说明
}
