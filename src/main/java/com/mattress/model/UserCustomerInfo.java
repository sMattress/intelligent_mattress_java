package com.mattress.model;
// Generated 2016-12-3 21:56:29 by Hibernate Tools 5.2.0.Beta1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UserCustomerInfo generated by hbm2java
 */
@Entity
@Table(name = "user_customer_info", catalog = "intelligent_mattress")
public class UserCustomerInfo{

	private Integer IId;
	private String CPhoneNumber = "";
	private String vcPassword = "";
	private String vcSalt = "";
	private Byte tiType = 0;
	private Date TRegisteTime = new Date();
	private Byte tiStatus = 0;
	private String vcName = "";
	private String vcImageUrl = "";
	private Byte tiGender = 0;
	private Date TBirthday = new Date();

	public UserCustomerInfo() {
	}

	public UserCustomerInfo(String CPhoneNumber, String vcPassword, String vcSalt, Byte tiType, Date TRegisteTime,
			Byte tiStatus, String vcName, String vcImageUrl, Byte tiGender, Date TBirthday) {
		this.CPhoneNumber = CPhoneNumber;
		this.vcPassword = vcPassword;
		this.vcSalt = vcSalt;
		this.tiType = tiType;
		this.TRegisteTime = TRegisteTime;
		this.tiStatus = tiStatus;
		this.vcName = vcName;
		this.vcImageUrl = vcImageUrl;
		this.tiGender = tiGender;
		this.TBirthday = TBirthday;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "i_id", unique = true, nullable = false)
	public Integer getIId() {
		return this.IId;
	}

	public void setIId(Integer IId) {
		this.IId = IId;
	}

	@Column(name = "c_phone_number", length = 11)
	public String getCPhoneNumber() {
		return this.CPhoneNumber;
	}

	public void setCPhoneNumber(String CPhoneNumber) {
		this.CPhoneNumber = CPhoneNumber;
	}

	@Column(name = "vc_password", length = 50)
	public String getVcPassword() {
		return this.vcPassword;
	}

	public void setVcPassword(String vcPassword) {
		this.vcPassword = vcPassword;
	}

	@Column(name = "vc_salt", length = 50)
	public String getVcSalt() {
		return this.vcSalt;
	}

	public void setVcSalt(String vcSalt) {
		this.vcSalt = vcSalt;
	}

	@Column(name = "ti_type")
	public Byte getTiType() {
		return this.tiType;
	}

	public void setTiType(Byte tiType) {
		this.tiType = tiType;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "t_registe_time", length = 19)
	public Date getTRegisteTime() {
		return this.TRegisteTime;
	}

	public void setTRegisteTime(Date TRegisteTime) {
		this.TRegisteTime = TRegisteTime;
	}

	@Column(name = "ti_status")
	public Byte getTiStatus() {
		return this.tiStatus;
	}

	public void setTiStatus(Byte tiStatus) {
		this.tiStatus = tiStatus;
	}

	@Column(name = "vc_name", length = 50)
	public String getVcName() {
		return this.vcName;
	}

	public void setVcName(String vcName) {
		this.vcName = vcName;
	}

	@Column(name = "vc_image_url", length = 200)
	public String getVcImageUrl() {
		return this.vcImageUrl;
	}

	public void setVcImageUrl(String vcImageUrl) {
		this.vcImageUrl = vcImageUrl;
	}

	@Column(name = "ti_gender")
	public Byte getTiGender() {
		return this.tiGender;
	}

	public void setTiGender(Byte tiGender) {
		this.tiGender = tiGender;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "t_birthday", length = 10)
	public Date getTBirthday() {
		return this.TBirthday;
	}

	public void setTBirthday(Date TBirthday) {
		this.TBirthday = TBirthday;
	}


}
