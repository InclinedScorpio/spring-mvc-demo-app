package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private String favouriteLang;
	
	private LinkedHashMap<String, String> countries_list;
	private LinkedHashMap<String, String> languagesList;
	
	public Student() {
		countries_list = new LinkedHashMap<>();
		countries_list.put("IND", "INDIA1");
		countries_list.put("PAK", "PAKISTAN1");
		countries_list.put("USA", "USA1");
		
		// Populating radio
		languagesList = new LinkedHashMap<>();
		languagesList.put("C language", "C");
		languagesList.put("C++ language", "C++");
		languagesList.put("Java", "JAVA");
	}

	public Student(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// Setters and Getters are needed in Data Binding
	// using Spring MVC Form Tags
	
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountries_list() {
		return countries_list;
	}

	public String getFavouriteLang() {
		return favouriteLang;
	}

	public void setFavouriteLang(String favouriteLang) {
		this.favouriteLang = favouriteLang;
	}

	public LinkedHashMap<String, String> getLanguagesList() {
		return languagesList;
	}

	
	
	
	
	
}
