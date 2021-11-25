package com.company;

public enum TrafficLight {
  RED(50),
  GREEN(40),
  YELLOW(5);

  private int DurationTime;
  private TrafficLight(int DurationTime){
    this.DurationTime = DurationTime;
  }
  public int getDurationTime(){
    return DurationTime;
  }
}
