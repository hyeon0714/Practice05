package com.javaex.ex08;

public class Account {

    private String accountNo;
    private static int balance;
    
    //생성자 작성
    public Account(String accountNo) {
    	
    }
    //필요한 메소드 작성
    
    public int deposit(int money) {
    	balance += money;
    	return balance;
    }
    
    public int withdraw(int money) {
    	balance -= money;
    	return balance;
    }
    
    public int showBalance() {
    	System.out.println(balance);
    	return balance;
    }
    

}
