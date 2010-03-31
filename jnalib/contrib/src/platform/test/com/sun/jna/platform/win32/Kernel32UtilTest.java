/* Copyright (c) 2007 Timothy Wall, All Rights Reserved
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.  
 */
package com.sun.jna.platform.win32;

import junit.framework.TestCase;

public class Kernel32UtilTest extends TestCase {
	
    public static void main(String[] args) throws Exception {
        junit.textui.TestRunner.run(Advapi32UtilTest.class);
        System.out.println("GetComputerName: " + Kernel32Util.getComputerName());
    }
	
	public void testGetComputerName() {
		assertTrue(Kernel32Util.getComputerName().length() > 0);
	}
	
	public void testFormatMessageFromLastErrorCode() {
	    assertEquals("The remote server has been paused or is in the process of being started.",
	    		Kernel32Util.formatMessageFromLastErrorCode(W32Errors.ERROR_SHARING_PAUSED));	
	}

	public void testFormatMessageFromHR() {
		assertEquals("The operation completed successfully.",
				Kernel32Util.formatMessageFromHR(W32Errors.S_OK));
	}
}
