package com.company;
import java.util.Scanner;
public class Ex84 {

double length;
  double width;
  double P;
  double area;
   Ex84() {
      this.width = 1;
      this.length = 1;
      }
      public double getWidth() {
          return width;
      }

      public void setWidth(double width) {
          if (width > 0.0 && width <= 20.0) {
            this.width = width;
          }else {
            System.out.println("ERROR!!!");
          }

      }
      public double getLength() {
          return length;
      }
public void setLength(double length) {
      if(length > 0.0 && length <= 20.0) {
        this.length = length;
      }else {
        System.out.println("ERROR!!!");
      }
  }
  double P (double length, double width){
      return 2 * (length + width);
  }
  double area (double length, double width){
      return length * width;
  }

}
