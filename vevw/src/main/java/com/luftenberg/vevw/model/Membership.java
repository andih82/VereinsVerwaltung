package com.luftenberg.vevw.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.luftenberg.vevw.typ.MemberType;
import com.sun.istack.NotNull;

@Entity
@Table(name = "membership")
public class Membership extends BaseEntity<Long> {

	@NotNull
	@Column(name = "joindate")
	private LocalDate joindate;

	@NotNull
	@Column(name = "leavedate")
	private LocalDate leavedate;

	@NotNull
	@Column(name = "membertyp")
	@Enumerated
	private MemberType membertype;

	
}
