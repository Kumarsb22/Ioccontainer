package com.kumar.entities;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contact_dtls")
public class ContactInfoEntity {

//	@Id
//	@GeneratedValue(strategy = GenerationType.UUID)
//	private Integer conatactId;
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO) sequense in db
//	@Id
//	@GeneratedValue(strategy = GenerationType.TABLE) seperat sequence table
//	@Id
	
//	@GeneratedValue(strategy = GenerationType.SEQUENCE) sequense in db
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY) auto increment
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer conatactId;
	private String name;
	private String email;
	private String phoneNo;
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate createdAt;
	@UpdateTimestamp
	@Column(insertable = false)
	private LocalDate updatedAt;

	public ContactInfoEntity() {
		// TODO Auto-generated constructor stub
	}

	public ContactInfoEntity(Integer conatactId, String name, String email, String phoneNo, LocalDate createdAt,
			LocalDate updatedAt) {
		super();
		this.conatactId = conatactId;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Integer getConatactId() {
		return conatactId;
	}

	public void setConatactId(Integer conatactId) {
		this.conatactId = conatactId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDate getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDate updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "ContactInfoEntity [conatactId=" + conatactId + ", name=" + name + ", email=" + email + ", phoneNo="
				+ phoneNo + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}

}
