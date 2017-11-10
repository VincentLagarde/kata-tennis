package fr.unilim.iut.katatennis;

import static org.junit.Assert.assertEquals;

import org.junit.Test;  

public class TestTennis {
	
	@Test
	public void test_LoveAll() {
	
		TennisGame1 tennisGame = new TennisGame1("jean", "michel"); 
		
		String result = tennisGame.getScore();
		
		assertEquals(result, "Love-All");
	}
	
	@Test
	public void test_Fifteen_love() {
	
		TennisGame1 tennisGame = new TennisGame1("jean", "michel"); 
		
		tennisGame.wonPoint("jean");
		String result = tennisGame.getScore();
		
		assertEquals(result, "Fifteen-Love");
	}
	

	@Test
	public void test_Fifteen_All() {
	
		TennisGame1 tennisGame = new TennisGame1("jean", "michel"); 
		
		tennisGame.wonPoint("jean");
		tennisGame.wonPoint("michel");
		String result = tennisGame.getScore();
		
		assertEquals(result, "Fifteen-All");
	}
	
	@Test
	public void test_Thirty_fifteen() {
	
		TennisGame1 tennisGame = new TennisGame1("jean", "michel"); 
		
		tennisGame.wonPoint("jean");
		tennisGame.wonPoint("jean");
		tennisGame.wonPoint("michel");
		String result = tennisGame.getScore();
		
		assertEquals(result, "Thirty-Fifteen");
	}
}
