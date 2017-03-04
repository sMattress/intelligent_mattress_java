package com.mattress.model;
// Generated 2016-12-3 21:56:29 by Hibernate Tools 5.2.0.Beta1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * UserManagerInfo generated by hbm2java
 */
@Entity
@Table(name = "user_manager_info", catalog = "intelligent_mattress")
public class UserManagerInfo implements java.io.Serializable {

	private Integer IId;
	private String vcName;
	private String vcPassword;
	private String vcSalt;
	private byte tiType;
	private byte tiAuthority;

	public UserManagerInfo() {
	}

	public UserManagerInfo(byte tiType, byte tiAuthority) {
		this.tiType = tiType;
		this.tiAuthority = tiAuthority;
	}

	public UserManagerInfo(String vcName, String vcPassword, String vcSalt, byte tiType, byte tiAuthority) {
		this.vcName = vcName;
		this.vcPassword = vcPassword;
		this.vcSalt = vcSalt;
		this.tiType = tiType;
		this.tiAuthority = tiAuthority;
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

	@Column(name = "vc_name", length = 50)
	public String getVcName() {
		return this.vcName;
	}

	public void setVcName(String vcName) {
		this.vcName = vcName;
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

	@Column(name = "ti_type", nullable = false)
	public byte getTiType() {
		return this.tiType;
	}

	public void setTiType(byte tiType) {
		this.tiType = tiType;
	}

	@Column(name = "ti_authority", nullable = false)
	public byte getTiAuthority() {
		return this.tiAuthority;
	}

	public void setTiAuthority(byte tiAuthority) {
		this.tiAuthority = tiAuthority;
	}

}