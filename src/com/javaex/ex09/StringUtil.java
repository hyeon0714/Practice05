package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] strArray){
       String sum="";
        //메소드 내용작성
       // 작성이라고 써잇는곳에 시선을 둘필요없다 생성자부터 건드려야하기 때문에
       for(int i=0; i<strArray.length; i++) {
    	   sum=sum+strArray[i];
       }
        return sum;
    }

}
