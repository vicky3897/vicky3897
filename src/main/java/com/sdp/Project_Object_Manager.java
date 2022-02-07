package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pomclass.Address;
import com.pomclass.Cart;
import com.pomclass.CheckBox;
import com.pomclass.Confirm_Order;
import com.pomclass.Dress_Tab;
import com.pomclass.Home_Page;
import com.pomclass.Login_Page;
import com.pomclass.NextProcced;
import com.pomclass.Pay_Method;
import com.pomclass.Procced;
import com.pomclass.Shipping;
import com.pomclass.Women_Tab;

public class Project_Object_Manager {

	public WebDriver driver;
	//private  className ObjectName
	
private	Home_Page hp;

public Project_Object_Manager(WebDriver driver2) {
this.driver = driver2;

}
public Home_Page getInstanceHome() {
	
if (hp==null) {
	hp = new Home_Page(driver);
}
	return hp;
	
}
	
private Login_Page lp;
public Login_Page getInstanceLogin() {
	if (lp==null) {
		lp =new Login_Page(driver);
	}
	return lp;
}

private Women_Tab wt;
public Women_Tab getInstanceWomen() {
	if (wt==null) {
		wt = new Women_Tab(driver);
	}
	return wt;
}

private Dress_Tab dt;
public Dress_Tab getInstanceDress() {
	if (dt==null) {
		dt = new Dress_Tab(driver);
	}
	return dt;
}


private Cart c;
public Cart instanceCart() {
	if (c==null) {
		c = new Cart(driver);
	}
	return c;
}

private Procced p;
public Procced InstanceProcced() {
	if (p==null) {
		p= new Procced(driver);
	}
	return p;
}

private NextProcced np;
public NextProcced InstanceNextProcced() {
	if (np==null) {
		np = new NextProcced(driver);
	}
	return np;
}

private Address ad;
public  Address InstanceAddress() {
	if (ad== null) {
		ad = new Address(driver);
	}
	return ad;
}

private CheckBox cb;
public CheckBox InstanceCheckBox() {
	if (cb==null) {
		cb = new CheckBox(driver);
	}
	return cb;
}

private Shipping sh;
public Shipping InstanceShipping() {
	if (sh == null) {
		sh= new Shipping(driver);
		
	}
	return sh;
}

private Pay_Method pm;
public Pay_Method instancePay() {
	if (pm==null) {
		pm=new Pay_Method(driver);
	}
	return pm;
}

private Confirm_Order co;
public Confirm_Order InstanceConfirm() {
	if (co==null) {
		co= new  Confirm_Order(driver);
	}
	return co;
}

















}
