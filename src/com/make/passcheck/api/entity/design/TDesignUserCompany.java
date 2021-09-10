package com.make.passcheck.api.entity.design;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
@Data
@TableName("t_design_user_company")
/**
 * 用户_公司
 */
public class TDesignUserCompany {
    @TableField(value = "t_design_company_id")
    @JsonProperty(value = "tDesignCompanyId")
    private Integer tDesignCompanyId;//公司_公司id
    @TableField(value = "t_design_user_user_id")
    @JsonProperty(value = "tDesignUserUserId")
    private Integer tDesignUserUserId;//工程人员_人员id
}
