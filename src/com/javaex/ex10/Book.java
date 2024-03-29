package com.javaex.ex10;

public class Book {
    
	private int bookNo;
    private String title;
    private String author;
    private int stateCode;
    private String state;
    
    
    public Book(int bookNo, String title, String author) {
    	this.bookNo=bookNo;
    	this.title=title;
    	this.author=author;
    	this.stateCode=1;
    	this.state="재고있음";
    }


	public int getBookNo() {
		return bookNo;
	}


	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}
	

    
    public void rent(int stateCode) {
    	if(stateCode==0) {
    		state="대여중";
    	}
    	else {
    		state="재고있음";
    	}
    }
    
    public void print() {
    	System.out.println(bookNo+"책제목:"+title+", 작가:"+author+", 대여유무:"+state);
    }
  
}
