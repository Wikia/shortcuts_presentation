package com.fandom.shortcuts.Basics;

import java.util.List;

/**
 * Hint: use f2 to find problems in your code
 * Try Rename Class using shift + f6
 */
public class BasiscExamples {
  /**
   * alt+enter to add imports
   */
  public void autoCompletionExample() {
    /* ctrl + space */
    List<String> list = ;

    /* ctrl + shift + space */
    List<Integer> intList =

    /* tip : use ctrl+shift+enter to end line and go to next line*/
  }

  public void creatingVariablesAndSwitch() {
    /* alt + enter -> introduce local variable */
    returnSomeVehicle();
    /* type switch then press tab and use your variable */
    /* alt + enter on switch to create missing branches */
  }

  /* alt + enter to correct return or variable type*/
  public int correction() {
    int s = returnSomeVehicle();
    return s;
  }

  /* alt + enter to create local variable */
  /* alt + enter to change concatenation by String.format() */
  public void replaceString() {

    String concat = "magic " + number.toString() + " something";
  }

  /* alt + enter to create new class */
  /* add parameter to constructor and alt + enter to create constructor */
  public void createNewClassWhereYouNeedIt() {
    IWantMyShinyClassHere myClass =
  }

  /* alt + enter to create new method */
  public void createNewMethodWhereYouNeedIt() {
    IJustWantToCreateThisMethod(42);
  }

  private Vehicle returnSomeVehicle() {
    return Vehicle.Car;
  }

  private enum Vehicle {
    Car,
    Train,
    Plain,
  }
}
