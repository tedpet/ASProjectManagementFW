package com.as.Utilities;

import er.extensions.crypting.ERXCrypto;

public class ASUtilities {

	/**
	 * Creates the UTF-8 String encrypted with SHA-512
	 * 
	 * @param incoming
	 *            aString
	 * @return
	 */
	public static String SHABase64String(String aString) {
		String digestedString = "";
		try {
			digestedString = ERXCrypto.base64HashedString(ERXCrypto.sha512Encode(aString));
			// System.out.println("here: " + digestedString + "is length: " +
			// digestedString.length());
		} catch (Exception e) {
			System.out.println("exception e = " + e.toString());
		}
		return digestedString;
	}

}
