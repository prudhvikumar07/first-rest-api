package com.in28minutes.springboot.firstrestapi.user;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
	public class UserDetails {
		
		@Id
		@GeneratedValue
		private Long id;
		
		private String name;
		private String role;
		
		public UserDetails() {
			
		}
		
		public UserDetails(String name, String role) {
			super();
			this.name = name;
			this.role = role;
		}

		public Long getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public String getRole() {
			return role;
		}

		@Override
		public String toString() {
			return "UserDetails [id=" + id + ", name=" + name + ", role=" + role + "]";
		}
	}


