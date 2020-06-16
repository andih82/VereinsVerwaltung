package com.luftenberg.vevw.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity<T extends Serializable>  {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private T id;
	
}
