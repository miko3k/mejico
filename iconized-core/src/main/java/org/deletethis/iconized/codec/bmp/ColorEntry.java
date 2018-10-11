/*
 * ColorEntry.java
 *
 * Created on 10 May 2006, 08:29
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.deletethis.iconized.codec.bmp;

import org.deletethis.iconized.Buffer;

/**
 * Represents an RGB colour entry used in the palette of an indexed image (colour depth &lt;= 8).
 * @author Ian McDonagh
 */
public class ColorEntry {
  
  /**
   * The red component, which should be in the range <tt>0..255</tt>.
   */
  final public int bRed;
  /**
   * The green component, which should be in the range <tt>0..255</tt>.
   */
  final public int bGreen;
  /**
   * The blue component, which should be in the range <tt>0..255</tt>.
   */
  final public int bBlue;
  /**
   * Unused.
   */
  final public int bReserved;
  
  /** 
   * Reads and creates a colour entry from the source input.
   * @param in the source input
   */
  public ColorEntry(Buffer in)  {
    bBlue = in.int8();
    bGreen = in.int8();
    bRed = in.int8();
    bReserved = in.int8();
  }
  
  /**
   * Creates a colour entry with the specified colour components.
   * @param r red component
   * @param g green component
   * @param b blue component
   * @param a unused
   */
  public ColorEntry(int r, int g, int b, int a) {
    bBlue = b;
    bGreen = g;
    bRed = r;
    bReserved = a;
  }

  
  
}
