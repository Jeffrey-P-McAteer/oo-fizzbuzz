package edu.odu.cs.jmcateer;

public class Fizz implements FBI {
  
  public boolean applies(long num) {
    return num % 3 == 0;
  }
  
  public void run() {
    System.out.print("Fizz");
  }
  
  public FBI clone() {
    return new Fizz();
  }
  
}