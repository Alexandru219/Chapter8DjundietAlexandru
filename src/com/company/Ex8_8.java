package com.company;

public class Ex8_8 {
  private int month;
  private int day;
  private int year;
  private static final int[] daysPerMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};
  public Ex8_8(int month, int day, int year)
  {
    if(month <= 0 || month >12)
      throw new IllegalArgumentException(
              "month (" + month + ") must be 1-12");
    if (day <= 0 || (day > daysPerMonth[month ]&& !(month == 2 && day == 29)))
    throw new IllegalArgumentException("day (" + day +
          ") out-of-range for the specified month and year");
    if (month == 2 && day == 29 && !(year % 400 == 0 ||
             (year % 4 == 0 && year % 100 != 0)))
     throw new IllegalArgumentException("day (" + day +
          ") out-of-range for the specified month and year");

     this.month = month;
     this.day = day;
     this.year = year;
    System.out.printf("Date object constructor for date %s%n", this);
  }

  public void setDay(int day) {
    this.day = day;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getDay() {
    return day;
  }

  public int getMonth() {
    return month;
  }

  public int getYear() {
    return year;
  }
  private int isDay(int d){
    if(d > 0 && d <= daysPerMonth[this.month])
      return d;
    if(this.month == 2 && d == 29 && (this.year % 400 == 0 || (this.year % 4 == 0 && this.year % 100 != 0)))
      return d;
    else
      return 0;
  }
  private int isMonth(int m){
    if(m > 0 && m <= 12)
      return m;
    else
      return 0;
  }
  private int isYear(int y){
    if(y > 0 && y <= 2021)
      return y;
    else
      return 0;
  }
  public void nextDay(){
    if(getDay() + 1 <= daysPerMonth[getMonth()])
      setDay(getDay() + 1);
    else{
      setDay(1);
      nextMonth();
    }
  }
  public void nextMonth(){
    if(getMonth() + 1 <= 12)
      setMonth(getMonth() + 1);
    else{
      setMonth(1);
      setYear(getYear() + 1);
    }
  }
  public String toString()
    {
     return String.format("%d/%d/%d", month, day, year);
    }
}
