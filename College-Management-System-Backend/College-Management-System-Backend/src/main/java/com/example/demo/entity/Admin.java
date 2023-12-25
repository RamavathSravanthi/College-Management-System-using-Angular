package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="admin")
public class Admin {
	
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private long id;
		private String adminName;
		private String email;
		private String password;
		
		public Admin() {
			super();
		}

		public Admin(long id, String adminName, String email, String password) {
			super();
			this.id = id;
			this.adminName = adminName;
			this.email = email;
			this.password = password;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getAdminName() {
			return adminName;
		}

		public void setAdminName(String adminName) {
			this.adminName = adminName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "Admin [id=" + id + ", adminName=" + adminName + ", email=" + email + ", password=" + password + "]";
		}
		
		
		
		

}
