package com.fandom.shortcuts.CodeNavigation;

/**
 * ctrl +(shift)+ B
 * ctrl + alt + (left|right) arrow
 * ctrl + U
 * ctrl + E
 * ctrl + shift + E
 */
public class BurgerCook implements Cook {

  /* ctrl + U goes to base implementation */
  public void prepareMeal() {

    /* go to implementation using ctrl+b */
    makeBurger();
  }

  private void someLongMethodJustToObscureThisClass() {
    makeBurger();
  }

  private void anotherLongMethodJustToObscureThisClass() {
    //nothing to do here
  }


  /**
   * go back to previous caret place by ctrl+alt+<- (left arrow)
   * ctrl + b to show all references to this method
   */
  private void makeBurger() {

  }
}
