package com.cg.iba.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

	    @Id
	    @Column(name="customer_bank_ID")
	    private long customerId; 
	    private String customerName;
	    private String phoneNo;
	    private String emailId;
	    private int age;
	    private Gender gender;
	    
		public Customer(long customerId, String customerName, String phoneNo, String emailId, int age, Gender gender) {
			super();
			this.customerId = customerId;
			this.customerName = customerName;
			this.phoneNo = phoneNo;
			this.emailId = emailId;
			this.age = age;
			this.gender = gender;
		}

		public Customer(String customerName, String phoneNo, String emailId, int age, Gender gender) {
			super();
			this.customerName = customerName;
			this.phoneNo = phoneNo;
			this.emailId = emailId;
			this.age = age;
			this.gender = gender;
		}

		public long getCustomerId() {
			return customerId;
		}

		public void setCustomerId(long customerId) {
			this.customerId = customerId;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getPhoneNo() {
			return phoneNo;
		}

		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}

		public String getEmailId() {
			return emailId;
		}

		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public Gender getGender() {
			return gender;
		}

		public void setGender(Gender gender) {
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", phoneNo=" + phoneNo
					+ ", emailId=" + emailId + ", age=" + age + ", gender=" + gender + "]";
		} 	    
}
