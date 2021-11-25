package com.company;

public class Ex86 {
  public static double annIntRate;
  private double saveBalance;
  public Ex86(){
    annIntRate = 0.0;
    saveBalance = 0.0;
  }
  public Ex86(double Rate, double sBalance){
 annIntRate = Rate;
 sBalance = saveBalance;
  }
  public double calculateMonthlyInt(){
    double Rate;
    Rate = saveBalance * annIntRate/12;
    saveBalance += Rate;
    return Rate;
  }
  public static void modIntRate(double newIntRate){
    annIntRate = newIntRate;
  }
  public void setSaveBalance(double newBalance){
    saveBalance = newBalance;
  }
  public double getSaveBalance(){
    return saveBalance;
  }
  public double getAnnIntRate(){
    return  annIntRate;
  }
}
