package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.Address;
import com.pom.My_Store;
import com.pom.Shipping;
import com.pom.Signin;
import com.pom.Summary;
import com.pom.Tshirt_Sec;

public class Page_Object_Manager {
	public WebDriver driver;
	private My_Store s;
	private Tshirt_Sec ts;
	private Summary su;
	private Signin si;
	private Address add;
	private Shipping shp;
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
	}
	public My_Store getInstancestore() {
		if (s==null) {
			 s = new My_Store(driver);	
		}
		return s;
	}
	public Tshirt_Sec getInstancetshirt() {
		if (ts==null) {
			 ts= new Tshirt_Sec(driver);
		}
		return ts;
	}
	public Summary getInstanceSummary() {
		if (su==null) {
			su = new Summary(driver);	
		}
		return su;
	}
	public Signin getInstancesignin() {
		if (si==null) {
			si = new Signin(driver);	
		}
		return si;
	}
	public Address getInstanceaddress() {
		if (add==null) {
			add = new Address(driver);	
		}
		return add;
	}
	public Shipping getInstanceshipping() {
		if (shp==null) {
			shp = new Shipping(driver);	
		}
		return shp;

	}

	}



