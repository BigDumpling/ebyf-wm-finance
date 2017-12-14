package com.ebyf.wm.finance.dal.model;

import javax.persistence.*;

@Table(name = "t_fi_unique_id")
public class TFiUniqueId {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 名称
     */
    @Column(name = "uid_name")
    private String uidName;

    @Column(name = "uid_length")
    private Integer uidLength;

    @Column(name = "next_uid")
    private Long nextUid;

    /**
     * 版本号
     */
    private Long fversion;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取名称
     *
     * @return uid_name - 名称
     */
    public String getUidName() {
        return uidName;
    }

    /**
     * 设置名称
     *
     * @param uidName 名称
     */
    public void setUidName(String uidName) {
        this.uidName = uidName;
    }

    /**
     * @return uid_length
     */
    public Integer getUidLength() {
        return uidLength;
    }

    /**
     * @param uidLength
     */
    public void setUidLength(Integer uidLength) {
        this.uidLength = uidLength;
    }

    /**
     * @return next_uid
     */
    public Long getNextUid() {
        return nextUid;
    }

    /**
     * @param nextUid
     */
    public void setNextUid(Long nextUid) {
        this.nextUid = nextUid;
    }

    /**
     * 获取版本号
     *
     * @return fversion - 版本号
     */
    public Long getFversion() {
        return fversion;
    }

    /**
     * 设置版本号
     *
     * @param fversion 版本号
     */
    public void setFversion(Long fversion) {
        this.fversion = fversion;
    }
}