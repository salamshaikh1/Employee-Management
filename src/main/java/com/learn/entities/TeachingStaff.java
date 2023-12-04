package com.learn.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "teachstaff")
public class TeachingStaff extends Employee {
	
	private String subject;

	public void setSubject(String subject) {
		this.subject = subject;
	} 
	
}
