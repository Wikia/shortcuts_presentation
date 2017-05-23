package com.fandom.shortcuts.Refactoring;

import java.util.ArrayList;
import java.util.List;

/**
 * ctrl + alt + shift + T will open a refactor context menu
 *
 * ctrl + alt + (V | F | C | M | P)
 */
public class MagicFive {

  /**
   * use ctrl + w to select scope
   * see CamelHumps in settings
   * select only runExampleMethod (by ctrl + w) and then press ctrl + alt + V
   * move expression to variable
   * do it again for getResultAndRunAnotherExampleMethod and
   */
  public void moveToVariable() {
    ImNotSoGoodInNamingMethods(getResultAndRunAnotherExampleMethod(runExampleMethod(74)));
  }

  /**
   * again extract method results but this time to field using ctrl + alt + F
   */
  public void moveToField() {
    ImNotSoGoodInNamingMethods(getResultAndRunAnotherExampleMethod(runExampleMethod(74)));
  }


  /**
   * extract something to const using ctrl + alt + c and select all occurence by alt + a
   * if you want you can also extract this const to separate class using alt + m in selection box
   */

  public void moveToConst() {
    testThis("Something", 1);
    testThis("Something", 2);
    testThis("Something", 3);
  }

  /**
   * select section 1 (using ctrl + w) and extract it by ctrl + alt + m
   * do it again with section 2
   * also check alt + enter inside 'for' in section 2 to replace 'for' by collect
   */

  public int extractToMethod() {
    /* section 1 */
    List<String> list = new ArrayList<>();
    for (int k = 0; k < 100; k++) {
      list.add(String.valueOf(k));
    }

    /* section 2 */
    List<Integer> counts = new ArrayList<>();
    for (String s : list) {
      counts.add(s.length());
    }


    return counts.stream().mapToInt(Integer::intValue).sum();
  }

  /**
   * extract '8' value to parameter from runMyMagicMethod using ctrl + alt + p
   */
  public void hiddenHorseMan() {
    runMyMagicMethod(5);

    runMyMagicMethod(12);
  }

  private int runMyMagicMethod(int i) {
    return i + 8;
  }

  /**
   * Intellij give you a hint when it discover
   */
  private void testThis(String something, int i) {
    if (String.valueOf(i).equals(something)) {
      throw new AssertionError();
    }
    ;
  }

  private void ImNotSoGoodInNamingMethods(int i) {
    System.out.print(i);
  }

  private int getResultAndRunAnotherExampleMethod(int i) {
    return i | 1;
  }

  private int runExampleMethod(int i) {
    return i + 1;
  }
}
