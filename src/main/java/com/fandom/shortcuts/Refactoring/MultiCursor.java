package com.fandom.shortcuts.Refactoring;

/**
 * In this example I get task to create builder with 3 properties (firstValue, secondValue,
 * thirdValue) set them to local field and call addThisInteger from base class in every setter.
 *
 * Steps to practise:
 *
 * 1) copy firstValue, secondValue, thirdValue replace `,` by `\n` using ctrl + r, change to regex
 * mode using alt + g, and replace all occurrence by alt + a
 *
 * 2) alt + shift + insert to set Column selection mode (You will see `Column` text in right bottom
 * corner)
 *
 * 3) Multiply caret using shift + down arrow (just like selecting text) 4) press home to set carets
 * at beginning of every row 5) type private int and finish by ctrl + shift + enter 6) Select fields
 * name (by ctrl+w or shift+end) and copy it
 *
 * 4) Make some space using ctrl + enter
 *
 * 5) Paste fields, move to beginning of each line (home) type
 * public void
 *
 * 6) Move to end of line (end key)
 *
 * 7) type (int value) and finish it ctrl + shift +
 * enter
 *
 * 8) again paste fields and type = value;
 *
 * 9) type addThisInteger(value);
 *
 * 10) type return this; (method return void at this moment it's mistake by design)
 *
 * 11) select first void and press alt + j twice (or ctrl + alt + shift + j once)
 *
 * 12) type MultiCursor
 *
 * 13) done
 */
public class MultiCursor extends MultiCursorBase {

}
