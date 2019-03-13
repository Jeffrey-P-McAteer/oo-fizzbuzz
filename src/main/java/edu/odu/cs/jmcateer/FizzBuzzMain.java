
/**
 * This is an implementation of FizzBuzz after an IBM discussion
 * around the "least efficient fizzbuzz in java".
 * 
 * Talking about crazy ideas is one thing, implementing them is MUCH more fun.
 * 
 */

package edu.odu.cs.jmcateer;

// We only need Scanner and HashMap, but why not grab everything?
import java.util.*;

public class FizzBuzzMain {
    public static void main(String[] args) {
        
        // Record some fun information,
        // Cite https://stackoverflow.com/a/17376879 as source for this one-liner.
        long begin_consumed_mem_bytes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        
        // Greet user
        System.out.println("Welcome to least-efficient FizzBuzz!");
        System.out.println("'Fizz' will print when num % 3 == 0 ,");
        System.out.println("'Buzz' will print when num % 5 == 0 .");
        
        // Get user input
        Scanner user_in = new Scanner(System.in);
        System.out.print("Enter a number to go up to: ");
        Long max = user_in.nextLong();
        System.out.printf("FizzBuzzing up to %d%n", max);
        
        // Proceed with an efficient use of RAM
        HashMap<Long, FBI> a_very_short_camel_case_name = null;
        while (a_very_short_camel_case_name == null) {
          try {
            a_very_short_camel_case_name = new HashMap<Long, FBI>();
            for (long l = 0; l < max; l++) {
                a_very_short_camel_case_name.put(l, FizzBuzzFactory.getFBI(l));
            }
          }
          catch (OutOfMemoryError oom) {
            a_very_short_camel_case_name = null;
            max /= 2;
            System.out.println("Dear user, please purchase the Ultra-High Memory package to use this");
            System.out.printf("feature. The Lite version will continue with max = %d%n", max);
          }
        }
        
        for (Long key : a_very_short_camel_case_name.keySet()) {
          System.out.printf("%04d: ", key);
          
          // if (a_very_short_camel_case_name != null) {
          //   a_very_short_camel_case_name.get(key).run();
          // }
          
          // Vastly more efficient than an if null-check
          try {
            a_very_short_camel_case_name.get(key).run();
          }
          catch (NullPointerException e) {
            // Ignored
          }
          
          System.out.printf("%n");
        }
        
        // More fun information
        long end_consumed_mem_bytes = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        
        System.out.printf("Total used memory: %,d bytes%n", end_consumed_mem_bytes - begin_consumed_mem_bytes);
        
        
    }
}
