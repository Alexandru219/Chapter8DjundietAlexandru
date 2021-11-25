package com.company;
import java.util.Scanner;
public class Ex86Test {
  public static void main(String[] args){
    Ex86 saveAcc1 = new Ex86();
    Ex86 saveAcc2 = new Ex86();
    saveAcc1.setSaveBalance(2000.00);
    saveAcc2.setSaveBalance(3000.00);
    Ex86.modIntRate(0.04);
    saveAcc1.calculateMonthlyInt();
    saveAcc2.calculateMonthlyInt();
    System.out.println("Annual Interest Rate to 4%: ");
    System.out.println("The first saver balance: "+saveAcc1.getSaveBalance());
    System.out.println("The second saver balance: "+saveAcc2.getSaveBalance());
    Ex86.modIntRate(0.05);
    saveAcc1.calculateMonthlyInt();
    saveAcc2.calculateMonthlyInt();
    System.out.println("\nAnnual Interest Rate to 5%: ");
    System.out.println("The first saver balance: "+saveAcc1.getSaveBalance());
    System.out.println("The second saver balance: "+saveAcc2.getSaveBalance());


  }
}
