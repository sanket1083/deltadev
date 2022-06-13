package com.cjc.model;

public class Random {
	
	int upperBound ;
	int lowerBound ;
	
	
	
	public int calculatecibilscore(int upperBound,int lowerBound )
	{

	int number = lowerBound + (int)(Math.random() * ((upperBound - lowerBound) + 1));
	System.out.println(number);
	
	return number;
}

}
