package com.learning.core.day2session1;
	
	class LowBalanceException extends Exception 
	{
	    public LowBalanceException(String message) 
	    {
	        super(message);
	    }
	}

	class NegativeAmountException extends Exception
	{
	    public NegativeAmountException(String message) 
	    {
	        super(message);
	    }
	}

	public class D02P06_1 {
	    
		private int accNo;
	    private String custName;
	    private String accType;
	    private float balance;

	    public D02P06_1(int accNo, String custName, String accType, float initialBalance) throws LowBalanceException, NegativeAmountException {
	        
	    	this.accNo = accNo;
	        this.custName = custName;
	        this.accType = accType;
	        
	        if (initialBalance < 0) 
	        {
	            throw new NegativeAmountException("NegativeAmount");
	        }
	        
	        if ((accType.equals("Saving") && initialBalance < 1000) || (accType.equals("Current") && initialBalance < 5000)) 
	        {
	            throw new LowBalanceException("Low Balance");
	        }
	        
	        this.balance = initialBalance;
	    }

	    public void deposit(float amt) throws NegativeAmountException {
	        
	    	if (amt < 0) 
	    	{
	            throw new NegativeAmountException("NegativeAmount");
	        }
	       
	    	balance += amt;
	    }

	    public float getBalance() throws LowBalanceException 
	    {
	        if ((accType.equals("Saving") && balance < 1000) || (accType.equals("Current") && balance < 5000)) 
	        {
	            throw new LowBalanceException("Low Balance");
	        }
	        return balance;
	    }

	    public static void main(String[] args)
	    {
	        try {
	            D02P06_1 account = new D02P06_1(123, "John", "Saving", 900);
	            System.out.println("Balance: " + account.getBalance());
	        } 
	        catch (LowBalanceException e)
	        {
	            System.out.println(e.getMessage());
	        }
	        catch (NegativeAmountException e) 
	        {
	            System.out.println(e.getMessage());
	        }
	    }
	}