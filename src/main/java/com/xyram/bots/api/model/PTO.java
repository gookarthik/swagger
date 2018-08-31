package com.xyram.bots.api.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "pto")
public class PTO {
	@Id
	@Column(name = "pto_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ptoId;

	@Column(name = "start_date")
	private Date startDate;

	@Column(name = "end_date")
	private Date endDate;

	@Column(name = "hours")
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date hours;

	@Column(name = "type")
	private String type;

	@Column(name = "status")
	private String status;

	@ManyToOne
	@JsonBackReference
	@JoinColumn(name = "emp_id")
	private Employee employee;

	public Integer getPtoId() {
		return ptoId;
	}

	public void setPtoId(Integer ptoId) {
		this.ptoId = ptoId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getHours() {
		return hours;
	}

	public void setHours(Date hours) {
		this.hours = hours;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}