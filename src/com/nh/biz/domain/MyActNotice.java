package com.nh.biz.domain;

import java.util.Date;

public class MyActNotice {
	 /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column MyActNotice.id
     *
     * @abatorgenerated Mon Mar 26 15:41:45 CST 2012
     */
    private Integer id;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column MyActNotice.deptId
     *
     * @abatorgenerated Mon Mar 26 15:41:45 CST 2012
     */
    private Integer deptid;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column MyActNotice.titleId
     *
     * @abatorgenerated Mon Mar 26 15:41:45 CST 2012
     */
    private Integer titleid;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column MyActNotice.titleName
     *
     * @abatorgenerated Mon Mar 26 15:41:45 CST 2012
     */
    private String titlename;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column MyActNotice.recentlyAct
     *
     * @abatorgenerated Mon Mar 26 15:41:45 CST 2012
     */
    private Date recentlyact;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column MyActNotice.nextAct
     *
     * @abatorgenerated Mon Mar 26 15:41:45 CST 2012
     */
    private Date nextact;
    private Integer actDay ;
    private String cycleType;
    public Integer getActDay() {
		return actDay;
	}

	public void setActDay(Integer actDay) {
		this.actDay = actDay;
	}

	public String getCycleType() {
		return cycleType;
	}

	public void setCycleType(String cycleType) {
		this.cycleType = cycleType;
	}

	/**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column MyActNotice.id
     *
     * @return the value of MyActNotice.id
     *
     * @abatorgenerated Mon Mar 26 15:41:45 CST 2012
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column MyActNotice.id
     *
     * @param id the value for MyActNotice.id
     *
     * @abatorgenerated Mon Mar 26 15:41:45 CST 2012
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column MyActNotice.deptId
     *
     * @return the value of MyActNotice.deptId
     *
     * @abatorgenerated Mon Mar 26 15:41:45 CST 2012
     */
    public Integer getDeptid() {
        return deptid;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column MyActNotice.deptId
     *
     * @param deptid the value for MyActNotice.deptId
     *
     * @abatorgenerated Mon Mar 26 15:41:45 CST 2012
     */
    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column MyActNotice.titleId
     *
     * @return the value of MyActNotice.titleId
     *
     * @abatorgenerated Mon Mar 26 15:41:45 CST 2012
     */
    public Integer getTitleid() {
        return titleid;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column MyActNotice.titleId
     *
     * @param titleid the value for MyActNotice.titleId
     *
     * @abatorgenerated Mon Mar 26 15:41:45 CST 2012
     */
    public void setTitleid(Integer titleid) {
        this.titleid = titleid;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column MyActNotice.titleName
     *
     * @return the value of MyActNotice.titleName
     *
     * @abatorgenerated Mon Mar 26 15:41:45 CST 2012
     */
    public String getTitlename() {
        return titlename;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column MyActNotice.titleName
     *
     * @param titlename the value for MyActNotice.titleName
     *
     * @abatorgenerated Mon Mar 26 15:41:45 CST 2012
     */
    public void setTitlename(String titlename) {
        this.titlename = titlename;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column MyActNotice.recentlyAct
     *
     * @return the value of MyActNotice.recentlyAct
     *
     * @abatorgenerated Mon Mar 26 15:41:45 CST 2012
     */
    public Date getRecentlyact() {
        return recentlyact;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column MyActNotice.recentlyAct
     *
     * @param recentlyact the value for MyActNotice.recentlyAct
     *
     * @abatorgenerated Mon Mar 26 15:41:45 CST 2012
     */
    public void setRecentlyact(Date recentlyact) {
        this.recentlyact = recentlyact;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column MyActNotice.nextAct
     *
     * @return the value of MyActNotice.nextAct
     *
     * @abatorgenerated Mon Mar 26 15:41:45 CST 2012
     */
    public Date getNextact() {
        return nextact;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column MyActNotice.nextAct
     *
     * @param nextact the value for MyActNotice.nextAct
     *
     * @abatorgenerated Mon Mar 26 15:41:45 CST 2012
     */
    public void setNextact(Date nextact) {
        this.nextact = nextact;
    }
}
