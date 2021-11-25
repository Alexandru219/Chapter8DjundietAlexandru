package com.company;

public class Ex8_12Test {
  public static void main(String[] args){
    Ex8_12 test = new Ex8_12(12,10,29,9,21,2000);
    do{
      test.nextDay();
      System.out.println(test.toString());
    }
    while (test.getYear() !=2021);

  }
}
