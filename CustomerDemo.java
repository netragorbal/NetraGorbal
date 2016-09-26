package com.customer;

public class CustomerDemo {
public static void main(String[] args) {
	
	int i;
	Customer[] c = new RegularCustomer[5];
	Customer[] p = new PrivilegedCustomer[5];
	
	c[0] = new RegularCustomer(1,"Saatu",9819032,1500,100);
	c[1] = new RegularCustomer(2,"Panchu",9819552,1505,150);
	c[2] = new RegularCustomer(3,"laatu",981903962,1545,300);
	c[3] = new RegularCustomer(6,"raatu",985619032,1700,100);
	c[4] = new RegularCustomer(4,"Aaatu",981999032,1800,170);
	
	
	for(i=0;i<c.length;i++)
	{
	System.out.println("Bill of"+c[i].customerName +"is "+c[i].ComputeBill());
	}
	
	p[0] = new PrivilegedCustomer(1,"HMKK",9720346,1800,"PRIME");
	p[1] = new PrivilegedCustomer(2,"HRTK",9792056,9000,"PRIME");
	p[2] = new PrivilegedCustomer(3,"HALOK",9630156,7500,"PRIME");
	p[3] = new PrivilegedCustomer(4,"HFFK",95656,1800,"PRIME");
	p[4] = new PrivilegedCustomer(5,"RFKK",96756,16000,"PRIME");

	
	for(i=0;i<p.length;i++)
	{
	System.out.println("Bill of"+p[i].customerName +"is "+p[i].ComputeBill());
	}
	
	
}
}
