package com.onex.crmx.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Entity
@Table(name = "Account", uniqueConstraints = {
		@UniqueConstraint(columnNames = "account_name", name = "account_name_unique") }, indexes = {
				@Index(columnList = "account_name", name = "account_an_index") })
@Data
public class Account{
	
	
	@Id
	@SequenceGenerator(name = "account_sequence", sequenceName = "account_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_sequence")
	@Column(name = "sys_account_id", updatable = false)
	private Long Id;

	@Column(name = "account_name", nullable = false)
	private String accountName;

	@Column(name = "account_type", nullable = false)
	private String accountType;

	@Column(name = "description", columnDefinition = "TEXT")
	private String description;

	@Column(name = "phoneno", nullable = false)
	private String phoneNo;
	private String website;
	private String address;
	private String email;

	@Column(name = "created", columnDefinition = "timestamp default current_timestamp", updatable = false, insertable = false)
	private Timestamp created;

	@Column(name = "updated", columnDefinition = "timestamp default current_timestamp", updatable = false, insertable = false)
	private Timestamp updated;
	
	/*@Transient
	private String age;*/

}
