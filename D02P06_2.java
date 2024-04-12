package com.learning.core.day2session1;

public class D02P06_2 {
    public static void main(String[] args) {
        
    	try 
    	{
            CricketRating player1 = new CricketRating("John", 9.3f, 9.67f, 8.7f);
            player1.display();
        } catch (NotEligibleException e) {
            System.out.println("Output 1: " + e.getMessage());
        }

        try 
        {
            CricketRating player2 = new CricketRating("Henry", 15, 0);
            player2.display();
        } catch (NotEligibleException e) {
            System.out.println("Output 2: " + e.getMessage());
        }
    }
}

class CricketRating {
    
	private String playerName;
    private float critic1;
    private float critic2;
    private float critic3;
    private float avgRating;
    private String coins;

    public CricketRating(String playerName, float critic1, float critic2) 
    {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        calculateAverageRating(critic1, critic2);
        this.coins = calculateCoins();
    }

    public CricketRating(String playerName, float critic1, float critic2, float critic3) 
    {
        this.playerName = playerName;
        this.critic1 = critic1;
        this.critic2 = critic2;
        this.critic3 = critic3;
        calculateAverageRating(critic1, critic2, critic3);
        this.coins = calculateCoins();
    }

    public void calculateAverageRating(float critic1, float critic2)
    {
        avgRating = (critic1 + critic2) / 2;
    }

    public void calculateAverageRating(float critic1, float critic2, float critic3) 
    {
        avgRating = (critic1 + critic2 + critic3) / 3;
    }

    public String calculateCoins() 
    {
        if (avgRating >= 7)
        {
            return "Gold";
        } 
        else if (avgRating >= 5) 
        {
            return "Silver";
        } 
        else if (avgRating >= 2) 
        {
            return "Copper";
        } 
        else 
        {
            throw new NotEligibleException("Not eligible for any coin");
        }
    }

    public void display() {
        System.out.println(playerName + " " + avgRating + " " + coins);
    }
}

class NotEligibleException extends RuntimeException {
    public NotEligibleException(String message) {
        super(message);
    }
}