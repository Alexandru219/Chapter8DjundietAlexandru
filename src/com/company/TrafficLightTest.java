package com.company;

public class TrafficLightTest {
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";

  public static void main(String[] args){
    //TrafficLight test = new TrafficLight();
    System.out.println("Duration of the TrafficLight: ");
    for (TrafficLight light : TrafficLight.values()) {
      System.out.printf("%-10s %d seconds\n", light, light.getDurationTime());    }
  }
}
