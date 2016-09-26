package com.player;

public class CricketPlayer {

	CricketPlayer[] P = new CricketPlayer[5];
	int i;
	String name;
	int noOfInnings;
	int totalRuns;
	float batAvg;
	
	CricketPlayer(){}
	
	CricketPlayer(String name,int noOfInnings,int totalRuns,float batAvg)
	{
		this.name=name;
		this.noOfInnings=noOfInnings;
		this.totalRuns=totalRuns;
		this.batAvg=batAvg;
	}
	
	CricketPlayer[] createPlayer()
	{
		P[0] = new CricketPlayer("saat",6,100,15.5f);
		P[1] = new CricketPlayer("sabh",5,108,16.5f);
		P[2] = new CricketPlayer("tyrot",3,150,8.5f);
		P[3] = new CricketPlayer("sabft",7,200,4.5f);
		P[4] = new CricketPlayer("slkht",8,180,17.5f);
		
		return P;
	}
	
	void printPlayer()
	{
		for(i=0;i<P.length;i++)
		{
			System.out.println("name "+P[i].name);
			System.out.println("noOfInnings "+P[i].noOfInnings);
			System.out.println("total Runs "+P[i].totalRuns);
			System.out.println("Bat Average "+P[i].batAvg);
		}
	}
	
	static CricketPlayer[] sortPlayers(CricketPlayer[] P)
	{
		CricketPlayer temp = new CricketPlayer();
		temp=null;
		int i;
		int j=0;
		for(i=1;i<P.length;i++)
		{
			for(j=0;j<P.length-i;j++)
			{
				if(P[j].totalRuns > P[j+1].totalRuns)
				{
					temp=P[j];
					P[j]=P[j+1];
					P[j+1]=temp;
				}
			}
		}
		return P;
	}
	
	void printPlayer(CricketPlayer[] P)
	{
		for(i=0;i<P.length;i++)
		{

			System.out.println("name "+P[i].name);
			System.out.println("noOfInnings "+P[i].noOfInnings);
			System.out.println("total Runs "+P[i].totalRuns);
			System.out.println("Bat Average "+P[i].batAvg);
		}
	}
}
