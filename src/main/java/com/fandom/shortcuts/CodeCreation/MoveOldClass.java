package com.fandom.shortcuts.CodeCreation;

/**
 * Creating setters/getters/constructors using alt+insert and alt+enter
 * Cut and paste using ctrl+x and ctrl+shift+v
 */

public class MoveOldClass {

  //create setter/getter/constructor by alt+insert
  //create setter/getter/constructor by alt+enter
  private int i;
  private int j;

  private int someMethod() {
    i++;
    j++;
    return i + j;
  }

  /**
   * use ctrl+x for this method
   */
  private void someMethodToMove() {

  }

  private void IDontWantToMoveThisMethod() {

  }

  /**
   * use ctrl+x for this method then go to
   *
   * @see MoveNewClass
   */
  private void anotherMethodToMove() {

  }

}
