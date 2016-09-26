package com.university;

public class University {

	final static String code1 ="E030";
	final static String code2 ="E241";
	int noOfStud[] = new int[5];
	School[] S = new School[5];
	static
	{
		System.out.println("KLE TECH...CODE1: "+code1+"CODE2: "+code2);
	}
	
	class School
	{
		private String ProgCode;
		private String SchoolCord;
		private int NoOfStud;
		private int NoOfStaff;
		public String getProgCode() {
			return ProgCode;
		}
		public String getSchoolCord() {
			return SchoolCord;
		}
		public int getNoOfStud() {
			return NoOfStud;
		}
		public int getNoOfStaff() {
			return NoOfStaff;
		}
		
		School(String ProgCode, String SchoolCord, int NoOfStud, int NoOfStaff){
			this.ProgCode=ProgCode;
			this.SchoolCord=SchoolCord;
			if(NoOfStud> 120)
				System.out.println("Excess Intake "+this.ProgCode);
			else
			{
				this.NoOfStud = NoOfStud;
				this.NoOfStaff=NoOfStaff;
			}
		}
		
		
	}
	
	void createSchool()
	{
		S[0] = new School("CS","NETRA",25,60);
		S[1] = new School("CER","NSDRA",22,20);
		S[2] = new School("COM","NSDGG",27,69);
		S[3] = new School("CVO","NAET",55,30);
		S[4] = new School("CSE","NFGG",86,75);
		
	}
	
	void calNoOfStud()
	{
		int i;
		for(i=0;i<noOfStud.length;i++)
		{
			noOfStud[i]=S[i].getNoOfStud();
		}
	}
}
