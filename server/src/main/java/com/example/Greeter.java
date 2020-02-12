package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

<<<<<<< HEAD
  //TODO: Add javadoc comment
  public final String greet(String someone) {
=======
  /**
  *   @param someone the name of a person
  *  @return greeting string 
  */
  public final String greet(final String someone) {
>>>>>>> e67c90c76abf451fbf51f7877ccec5dd6157e981
    return String.format("Hello, %s!", someone);
  }
}
