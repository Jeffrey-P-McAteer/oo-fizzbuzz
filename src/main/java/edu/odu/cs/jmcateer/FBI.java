
package edu.odu.cs.jmcateer;

/**
 * "Fizz-Buzz Interface"
 * A level of abstraction above fizzes, buzzes, and everything that drives from them.
 */
public interface FBI extends Runnable {
  
  // Returns true of this object's action applies for the given iteration number
  public boolean applies(long num);
  
  // Was originally going to add a run() method,
  // then remembered DRY - java already has the Runnable interface.
  // public void run();
  
  // Was also going to extend Cloneable, but java doesn't have traits :(
  public FBI clone();
  
}