package edu.odu.cs.jmcateer;

public class FizzBuzz implements FBI {
  
  private Fizz fizz;
  private Buzz buzz;
  
  public FizzBuzz() {
    this.fizz = new Fizz();
    this.buzz = new Buzz();
  }
  
  public boolean applies(long num) {
    return this.fizz.applies(num) && this.buzz.applies(num);
  }
  
  public void run() {
    this.fizz.run();
    this.buzz.run();
  }
  
  public FBI clone() {
    return new FizzBuzz();
  }
  
}