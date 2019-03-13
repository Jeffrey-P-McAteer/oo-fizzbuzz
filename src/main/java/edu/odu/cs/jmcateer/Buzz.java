package edu.odu.cs.jmcateer;

public class Buzz implements FBI {
  
  public boolean applies(long num) {
    return num % 5 == 0;
  }
  
  public void run() {
    System.out.print("Buzz");
  }
  
  public FBI clone() {
    return new Buzz();
  }
  
}