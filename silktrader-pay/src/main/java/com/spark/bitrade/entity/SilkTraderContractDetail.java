package com.spark.bitrade.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.spark.bitrade.annotation.Excel;
import com.spark.bitrade.annotation.ExcelSheet;
import com.spark.bitrade.constant.ContractEnum;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 支付签约实体细节
 * @author shenzucai
 * @time 2018.07.01 15:42
 */
@Entity
@Data
@ExcelSheet
public class SilkTraderContractDetail {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    /**
     * 主要签约信息id
     */
    @Excel(name = "主要签约信息id")
    @Column(columnDefinition = "varchar(255) comment '主要签约信息id'")
    private String contractNo;

    /**
     * 法币类型
     */
    @Excel(name = "法币类型")
    @Column(columnDefinition = "varchar(50) comment '法币类型'")
    private String currency;

    /**
     * 商家签约币种
     */
    @Excel(name = "商家签约币种")
    @Column(columnDefinition = "varchar(50) comment '商家签约币种'")
    private String contractCoin;

    /**
     * 商家入账币种
     */
    @Excel(name = "商家入账币种")
    @Column(columnDefinition = "varchar(50) comment '商家入账币种'")
    private String busiCoin;

    /**
     * 手续费率
     */
    @Excel(name = "手续费率")
    @Column(columnDefinition = "decimal(8,4) comment '手续费率'")
    private BigDecimal busiCoinFeeRate;

    /**
     * 创建时间（yyyy-MM-dd HH:mm:ss）
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(columnDefinition = "datetime comment '创建时间'")
    private Date createTime;

    /**
     * 修改时间（yyyy-MM-dd HH:mm:ss）
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(columnDefinition = "datetime comment '修改时间'")
    private Date updateTime;

    /**
     * 备注
     */
    @Excel(name = "备注")
    @Column(columnDefinition = "varchar(255) comment '备注'")
    private String comment;

}
