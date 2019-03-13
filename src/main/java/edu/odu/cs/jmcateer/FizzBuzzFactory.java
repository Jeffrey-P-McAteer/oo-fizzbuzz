package edu.odu.cs.jmcateer;

/**
 * We don't know which type of FBI implementation we will need,
 * so this class is responsible for constructing one given an iteration number.
 */
public class FizzBuzzFactory {
  
  // This goes from most specific to most general,
  // the factory picks the first one that has a true apply()
  public static FBI[] ALL_FBIS = new FBI[] {
    new FizzBuzz(), new Fizz(), new Buzz()
  };
  
  /**
   * Returns a Fizz Buzz implemention object which should act on a given number.
   */
  public static FBI getFBI(Long num) {
    for (FBI fbi : ALL_FBIS) {
      if (fbi.applies(num)) {
        return fbi.clone();
      }
    }
    return null;
  }
}