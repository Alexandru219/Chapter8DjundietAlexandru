package com.company;

public class Ex8_8Test {
  public static void main(String[] args){
    Ex8_8 test = new Ex8_8(9,21,2000);
    do{
      test.nextDay();
      System.out.println(test.toString());
    }
    while (test.getYear() !=2021);

  }
}
