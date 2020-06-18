package com.luftenberg.vevw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "someentity")
public class SomeEntity extends BaseEntity<Long> {
	
	
	@Column(name = "somevalue")
	@NonNull
	private String someValue;
	
	

}
