package com.player;

public class CricketPlayerDemo {

	public static void main(String[] args) {
		
		CricketPlayer[] P = new CricketPlayer[5];
		CricketPlayer C = new CricketPlayer();
		P=C.createPlayer();
		System.out.println("Before sorting display");
		
		C.printPlayer();
		
		System.out.println("After sorting display");
		
		C.printPlayer(P);
		
	}

}
