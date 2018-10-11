/*
 * BMPConstants.java
 *
 * Created on 10 May 2006, 08:17
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.deletethis.iconized.codec.bmp;

/**
 * Provides constants used with BMP format.
 * 
 * @author Ian McDonagh
 */
public class BMPConstants {

	private BMPConstants() {
	}

	/**
	 * Specifies no compression.
	 * 
	 * @see InfoHeader#iCompression InfoHeader
	 */
	public static final int BI_RGB = 0; // no compression

	/**
	 * Specifies 8-bit RLE compression.
	 * 
	 * @see InfoHeader#iCompression InfoHeader
	 */
	public static final int BI_RLE8 = 1; // 8bit RLE compression

	/**
	 * Specifies 4-bit RLE compression.
	 * 
	 * @see InfoHeader#iCompression InfoHeader
	 */
	public static final int BI_RLE4 = 2; // 4bit RLE compression

}
