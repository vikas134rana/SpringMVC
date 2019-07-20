package com.springmvc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private String city;
	private String favLanguage;
	private List<String> osList;

	private LinkedHashMap<String, String> countryMap;

	public Student() {
		countryMap = new LinkedHashMap<>();
		countryMap.put("IN", "India");
		countryMap.put("FR", "France");
		countryMap.put("AU", "Australia");
		countryMap.put("PK", "Pakistan");
		osList = new ArrayList<>();
	}

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

	public LinkedHashMap<String, String> getCountryMap() {
		return countryMap;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getFavLanguage() {
		return favLanguage;
	}

	public void setFavLanguage(String favLanguage) {
		this.favLanguage = favLanguage;
	}

	public List<String> getOsList() {
		return osList;
	}

	public void setOsList(List<String> osList) {
		this.osList = osList;
	}

}
