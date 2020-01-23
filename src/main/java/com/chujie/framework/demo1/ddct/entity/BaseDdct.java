package com.chujie.framework.demo1.ddct.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 数据字典
 * </p>
 * 自定义模板
 * @author jobob
 * @since 2020-01-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class BaseDdct implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 字典键
     */
    @TableField("DCT_KEY")
    private String dctKey;

    /**
     * 字典类型
     */
    @TableField("DCT_TP_CD")
    private String dctTpCd;

    /**
     * 字典类型名称
     */
    @TableField("DCT_TP_NM")
    private String dctTpNm;

    /**
     * 字典值
     */
    @TableField("DCT_VAL")
    private String dctVal;

    /**
     * 字典值名称
     */
    @TableField("DCT_VAL_NM")
    private String dctValNm;

    /**
     * 字典组
     */
    @TableField("DCT_GRP")
    private String dctGrp;

    /**
     * 字典描述
     */
    @TableField("DCT_DSC")
    private String dctDsc;

    /**
     * 字典排序
     */
    @TableField("DCT_SEQ")
    private Integer dctSeq;

    /**
     * 状态：无效0\有效1
     */
    @TableField("ST_CD")
    private String stCd;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    /**
     * 创建人
     */
    @TableField("CREATE_USER")
    private String createUser;

    /**
     * 更新时间
     */
    @TableField("UPDATE_TIME")
    private LocalDateTime updateTime;

    /**
     * 更新人
     */
    @TableField("UPDATE_USER")
    private String updateUser;

    /**
     * 扩展编号
     */
    @TableField("EXPD_ID")
    private String expdId;

    /**
     * 删除标志
     */
    @TableField("DEL_IND")
    private String delInd;

    /**
     * 版本号
     */
    @TableField("VERSION")
    private Integer version;

    /**
     * 租户id
     */
    @TableField("TENANT_ID")
    private String tenantId;

    /**
     * 系统ID
     */
    @TableField("SYS_ID")
    private String sysId;


}
