package com.yincl.vo;

/**
 * @todo 火车票
 * @author qdyincl
 * @since 2013-01-17
 */
public class Ticket implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 班次序列号
	 */
	private String sn;
	/**
	 * 班次
	 */
	private String transCode;
	/**
	 * 始发站代码
	 */
	private String fromCode;
	/**
	 * 始发站名称
	 */
	private String fromName;
	/**
	 * 发车时间
	 */
	private String fromTime;
	/**
	 * 始发站编码
	 */
	private String toCode;
	/**
	 * 终点站名称
	 */
	private String toName;
	/**
	 * 到站时间
	 */
	private String toTime;
	/**
	 * 花费时间
	 */
	private String costTime;
	/**
	 * 商务座
	 */
	private String businessChair;
	/**
	 * 特等座
	 */
	private String specialChair;
	/**
	 * 一等座
	 */
	private String firstChair;
	/**
	 * 二等座
	 */
	private String secondChair;
	/**
	 * 高级软卧
	 */
	private String advancedSoftBed;
	/**
	 * 软卧
	 */
	private String softBed;
	/**
	 * 硬卧
	 */
	private String hardBed;
	/**
	 * 软座
	 */
	private String softChair;
	/**
	 * 硬座
	 */
	private String hardChair;
	/**
	 * 无座
	 */
	private String noChair;
	/**
	 * 其他
	 */
	private String otherChair;
	/**
	 * 验证SN
	 */
	private String verifySn;

	public String getSn() {
		return sn;
	}

	public void setSn(String sn) {
		this.sn = sn;
	}

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public String getFromCode() {
		return fromCode;
	}

	public void setFromCode(String fromCode) {
		this.fromCode = fromCode;
	}

	public String getFromName() {
		return fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public String getFromTime() {
		return fromTime;
	}

	public void setFromTime(String fromTime) {
		this.fromTime = fromTime;
	}

	public String getToCode() {
		return toCode;
	}

	public void setToCode(String toCode) {
		this.toCode = toCode;
	}

	public String getToName() {
		return toName;
	}

	public void setToName(String toName) {
		this.toName = toName;
	}

	public String getToTime() {
		return toTime;
	}

	public void setToTime(String toTime) {
		this.toTime = toTime;
	}

	public String getCostTime() {
		return costTime;
	}

	public void setCostTime(String costTime) {
		this.costTime = costTime;
	}

	public String getBusinessChair() {
		return businessChair;
	}

	public void setBusinessChair(String businessChair) {
		this.businessChair = businessChair;
	}

	public String getSpecialChair() {
		return specialChair;
	}

	public void setSpecialChair(String specialChair) {
		this.specialChair = specialChair;
	}

	public String getFirstChair() {
		return firstChair;
	}

	public void setFirstChair(String firstChair) {
		this.firstChair = firstChair;
	}

	public String getSecondChair() {
		return secondChair;
	}

	public void setSecondChair(String secondChair) {
		this.secondChair = secondChair;
	}

	public String getAdvancedSoftBed() {
		return advancedSoftBed;
	}

	public void setAdvancedSoftBed(String advancedSoftBed) {
		this.advancedSoftBed = advancedSoftBed;
	}

	public String getSoftBed() {
		return softBed;
	}

	public void setSoftBed(String softBed) {
		this.softBed = softBed;
	}

	public String getHardBed() {
		return hardBed;
	}

	public void setHardBed(String hardBed) {
		this.hardBed = hardBed;
	}

	public String getSoftChair() {
		return softChair;
	}

	public void setSoftChair(String softChair) {
		this.softChair = softChair;
	}

	public String getHardChair() {
		return hardChair;
	}

	public void setHardChair(String hardChair) {
		this.hardChair = hardChair;
	}

	public String getNoChair() {
		return noChair;
	}

	public void setNoChair(String noChair) {
		this.noChair = noChair;
	}

	public String getOtherChair() {
		return otherChair;
	}

	public void setOtherChair(String otherChair) {
		this.otherChair = otherChair;
	}

	public String getVerifySn() {
		return verifySn;
	}

	public void setVerifySn(String verifySn) {
		this.verifySn = verifySn;
	}
}
