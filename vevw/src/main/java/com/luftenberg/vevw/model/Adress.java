package com.luftenberg.vevw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "adress")
@Getter
@Setter
public class Adress extends BaseEntity<Long>{
	
	@NotNull
	@Column(name = "street")
	private String street;

	@NotNull
	@Column(name = "postzip")
	private String postzip;

	@NotNull
	@Column(name = "city")
	private String city;

	@ManyToOne
	@JoinColumn(name = "personId")
	private Person person;
}
