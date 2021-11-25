package com.company;

public class Ex8_14Date {
  private int month;
  private int day;
  private int year;
  private String[] months = new String[]{ "January", "February", "March", "April", "May",
          "June", "July", "August", "September", "October", "November", "December" };

  //constructor1
  public Ex8_14Date( int Month, int Day, int Year )
  {
    month = chMonth( Month );
    year = Year;
    day = chDay( Day );
    System.out.printf(
            "Date3 object constructor for date %s\n", this );
  }

 // public Ex8_14Date( String month, int day, int year){
   // this(month, day, year);}

  public Ex8_14Date( int day, int year){
    this(0,day, year);
  }


  private int chMonth( int testMonth )
  {
    if ( testMonth > 0 && testMonth <= 12 ) // validate month
      return testMonth;
    else // month is invalid
    {
      System.out.printf(
              "Invalid month (%d) set to 1.", testMonth );
      return 1;
    }
  }

  private int chDay( int testDay )
  {
    int[] daysPerMonth =
            { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };


    if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
      return testDay;


    if ( month == 2 && testDay == 29 && ( year % 400 == 0 ||
            ( year % 4 == 0 && year % 100 != 0 ) ) )
      return testDay;

    System.out.printf( "Invalid day (%d) set to 1.", testDay );
    return 1;
  }

  public String getMonthString(int month){
    return months[month];
  }

  public String toString()
  {
    return String.format( "%d/%d/%d", month, day, year );
  }
}
