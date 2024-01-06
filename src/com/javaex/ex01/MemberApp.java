package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {

		Member a=new Member();
		Member b=new Member();
		Member c=new Member();
		
		a.setId("jws");
		a.setName("정우성");
		a.setPoint(50000);
		
		b.setId("yjs");
		b.setName("유재석");
		b.setPoint(30000);
		
		c.setId("ihr");
		c.setName("이효리");
		c.setPoint(40000);
		
		a.showInfo();
		b.showInfo();
		c.showInfo();
	}

}
