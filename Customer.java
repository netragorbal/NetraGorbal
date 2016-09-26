package com.customer;

abstract class Customer {

	int customerId;
	String customerName;
	int phoneNum;
	double billAmt;
	
	
	Customer(){}
	
	Customer(int customerId,String customerName,int phoneNum,double billAmt)
	{
		
		this.customerId=customerId;
		this.customerName=customerName;
		this.phoneNum=phoneNum;
		this.billAmt=billAmt;
	}
	
	abstract double ComputeBill();
	
}

	class RegularCustomer extends Customer
	{
		double discount;
		
		RegularCustomer(){}
		
		RegularCustomer(int customerId,String customerName,int phoneNum,double billAmt,double discount)
		{
			super(customerId,customerName,phoneNum,billAmt);
			this.discount=discount;
		}
		
		double ComputeBill()
		{
			return(billAmt=billAmt-(billAmt*0.05));
		}

		
	}
	
	class PrivilegedCustomer extends Customer
	{
		String memberCardType;
		
		PrivilegedCustomer(){}
		
		PrivilegedCustomer(int customerId,String customerName,int phoneNum,double billAmt,String memberCardType)
		{
			super(customerId,customerName,phoneNum,billAmt);
			this.memberCardType=memberCardType;
		}
		
		double ComputeBill()
		{
			System.out.println("Privileged Customer");
			return(billAmt=billAmt-(billAmt*0.10));
			
		}
			
	}
	
	

