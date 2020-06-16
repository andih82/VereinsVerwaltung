package com.luftenberg.vevw.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "person")
public class Person extends BaseEntity<Long> {

	@NotNull
	@Column(name = "firstname", length = 100)
	private String firstname;

	@NotNull
	@Column(name = "lastname", length = 100)
	private String lastname;
	
	@Column(name ="email", length = 100)
	private String email;

	@OneToMany(mappedBy = "person")
	private Set<Adress> adresses;
}
