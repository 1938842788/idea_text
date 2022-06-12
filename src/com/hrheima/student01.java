package com.hrheima;

public class student01 {
    public static void getAge(int score) throws Gender{
       if(score<0||score>100){
           throw new Gender("尼玛");
       }else
       {
           System.out.println("分数正常");
       }
    }

}
