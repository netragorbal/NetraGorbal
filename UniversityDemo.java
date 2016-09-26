package com.university;

public class UniversityDemo {

	public static void main(String[] args) {
		int i;
		University KLE = new University();
		
		KLE.createSchool();
		KLE.calNoOfStud();
		for(i=0;i<KLE.noOfStud.length;i++)
		{
			if(KLE.noOfStud[i]!=0)
				System.out.println("No of students in "+KLE.S[i].getProgCode()+" are: "+KLE.noOfStud[i]);
		}
		}
	}


