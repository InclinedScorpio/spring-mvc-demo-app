package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {
	
	private String firstName;
	@NotNull(message="last name is required")
	@Size(min=1, message="last name must be min 1 character long")
	private String lastName;
	@Min(value=0, message="Min tickets can be 0")
	@Max(value=10, message="Max tickets can be 10")
	private Integer tickets;
	@NotNull(message="Postal Code is required")
	@Pattern(regexp="[A-Za-z0-9]{5}", message="Must be 5 digits, Characters")
	private String postalCode;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getTickets() {
		return tickets;
	}
	public void setTickets(Integer tickets) {
		this.tickets = tickets;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
}
