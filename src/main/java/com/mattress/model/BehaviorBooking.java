package com.mattress.model;
// Generated 2016-12-3 21:56:29 by Hibernate Tools 5.2.0.Beta1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BehaviorBooking generated by hbm2java
 */
@Entity
@Table(name = "behavior_booking", catalog = "intelligent_mattress")
public class BehaviorBooking implements java.io.Serializable {

	private Integer IId;
	private int fkCustomerId;
	private int fkDeviceId;
	private Byte tiOperation;
	private String vcTime;
	private String vcDuration;
	private String vcTemperature;

	public BehaviorBooking() {
	}

	public BehaviorBooking(int fkCustomerId, int fkDeviceId) {
		this.fkCustomerId = fkCustomerId;
		this.fkDeviceId = fkDeviceId;
	}

	public BehaviorBooking(int fkCustomerId, int fkDeviceId, Byte tiOperation, String vcTime, String vcDuration,
			String vcTemperature) {
		this.fkCustomerId = fkCustomerId;
		this.fkDeviceId = fkDeviceId;
		this.tiOperation = tiOperation;
		this.vcTime = vcTime;
		this.vcDuration = vcDuration;
		this.vcTemperature = vcTemperature;
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

	@Column(name = "fk_customer_id", nullable = false)
	public int getFkCustomerId() {
		return this.fkCustomerId;
	}

	public void setFkCustomerId(int fkCustomerId) {
		this.fkCustomerId = fkCustomerId;
	}

	@Column(name = "fk_device_id", nullable = false)
	public int getFkDeviceId() {
		return this.fkDeviceId;
	}

	public void setFkDeviceId(int fkDeviceId) {
		this.fkDeviceId = fkDeviceId;
	}

	@Column(name = "ti_operation")
	public Byte getTiOperation() {
		return this.tiOperation;
	}

	public void setTiOperation(Byte tiOperation) {
		this.tiOperation = tiOperation;
	}

	@Column(name = "vc_time", length = 50)
	public String getVcTime() {
		return this.vcTime;
	}

	public void setVcTime(String vcTime) {
		this.vcTime = vcTime;
	}

	@Column(name = "vc_duration", length = 50)
	public String getVcDuration() {
		return this.vcDuration;
	}

	public void setVcDuration(String vcDuration) {
		this.vcDuration = vcDuration;
	}

	@Column(name = "vc_temperature", length = 50)
	public String getVcTemperature() {
		return this.vcTemperature;
	}

	public void setVcTemperature(String vcTemperature) {
		this.vcTemperature = vcTemperature;
	}

}
