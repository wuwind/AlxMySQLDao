package com.make.passcheck.api.entity.design;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
@Data
@TableName("t_design_task")
/**
 * 设计任务书
 */
public class TDesignTask {
    @TableId(value = "id", type = IdType.AUTO)
    @JsonProperty(value = "id")
    private Integer id;//任务书id
    @TableField(value = "t_design_modify_id")
    @JsonProperty(value = "tDesignModifyId")
    private Integer tDesignModifyId;//变更任务_变更id
    @TableField(value = "t_design_price_require_id")
    @JsonProperty(value = "tDesignPriceRequireId")
    private Integer tDesignPriceRequireId;//报价需求_id
    @TableField(value = "t_design_task_id")
    @JsonProperty(value = "tDesignTaskId")
    private Integer tDesignTaskId;//设计任务书_任务书id
    @TableField(value = "t_design_basic_id")
    @JsonProperty(value = "tDesignBasicId")
    private Integer tDesignBasicId;//标的物基本信息说明_id
    @TableField(value = "t_design_task_step_id")
    @JsonProperty(value = "tDesignTaskStepId")
    private Integer tDesignTaskStepId;//任务书阶段属性_阶段id
    @TableField(value = "t_design_lock_id")
    @JsonProperty(value = "tDesignLockId")
    private Integer tDesignLockId;//锁具_id
    @TableField(value = "t_design_dept_id")
    @JsonProperty(value = "tDesignDeptId")
    private Integer tDesignDeptId;//承接部门_id
    @TableField(value = "t_design_dev_require_id")
    @JsonProperty(value = "tDesignDevRequireId")
    private Integer tDesignDevRequireId;//开发需求_id
    @TableField(value = "t_design_customer_id")
    @JsonProperty(value = "tDesignCustomerId")
    private Integer tDesignCustomerId;//客户_id
    @TableField(value = "t_design_user_user_id")
    @JsonProperty(value = "tDesignUserUserId")
    private Integer tDesignUserUserId;//工程人员_人员id
    @TableField(value = "t_design_product_id")
    @JsonProperty(value = "tDesignProductId")
    private Integer tDesignProductId;//产品_id
    @TableField(value = "t_design_user_user_id2")
    @JsonProperty(value = "tDesignUserUserId2")
    private Integer tDesignUserUserId2;//工程人员_人员id2
    @TableField(value = "t_design_user_user_id3")
    @JsonProperty(value = "tDesignUserUserId3")
    private Integer tDesignUserUserId3;//工程人员_人员id3
    @TableField(value = "t_design_pattern_require_id")
    @JsonProperty(value = "tDesignPatternRequireId")
    private Integer tDesignPatternRequireId;//手版样需求_id
    @TableField(value = "task_number")
    @JsonProperty(value = "taskNumber")
    private String taskNumber;//任务书号
    @TableField(value = "product_name")
    @JsonProperty(value = "productName")
    private String productName;//产品名称
    @TableField(value = "is_new_customer")
    @JsonProperty(value = "isNewCustomer")
    private Boolean isNewCustomer;//是否新增客户
    @TableField(value = "sale_forecast")
    @JsonProperty(value = "saleForecast")
    private String saleForecast;//年销售预测
    @TableField(value = "customer_number")
    @JsonProperty(value = "customerNumber")
    private String customerNumber;//客户料号
    @TableField(value = "out_area")
    @JsonProperty(value = "outArea")
    private String outArea;//出货地区
    @TableField(value = "input_area")
    @JsonProperty(value = "inputArea")
    private String inputArea;//进仓地区
    @TableField(value = "use_scene_des")
    @JsonProperty(value = "useSceneDes")
    private String useSceneDes;//应用场景说明
    @TableField(value = "require_des")
    @JsonProperty(value = "requireDes")
    private String requireDes;//重要功能及性能需求
    @TableField(value = "is_new_require")
    @JsonProperty(value = "isNewRequire")
    private Boolean isNewRequire;//是否原产品新增需求
    @TableField(value = "new_require_des")
    @JsonProperty(value = "newRequireDes")
    private String newRequireDes;//新增技术需求说明
    @TableField(value = "is_only_drawing")
    @JsonProperty(value = "isOnlyDrawing")
    private Boolean isOnlyDrawing;//仅出图确认
    @TableField(value = "drawing_date")
    @JsonProperty(value = "drawingDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private java.sql.Date drawingDate;//出图确认时间
    @TableField(value = "create_date")
    @JsonProperty(value = "createDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private java.sql.Date createDate;//任务书创建时间
    @TableField(value = "task_state")
    @JsonProperty(value = "taskState")
    private Integer taskState;//任务书状态0草稿1提交2完结
    @TableField(value = "post_date")
    @JsonProperty(value = "postDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private java.sql.Date postDate;//下发时间
    @TableField(value = "check_step")
    @JsonProperty(value = "checkStep")
    private Integer checkStep;//审核步骤通过+1
    @TableField(value = "is_stop_unpass")
    @JsonProperty(value = "isStopUnpass")
    private Boolean isStopUnpass;//审核未通过终止
}
