package com.github.C4ptain.JavaHelpers;


public final class Converter {
	
	final private static char[] HexArray = "0123456789ABCDEF".toCharArray();
	
	public static String BytesToHex(byte[] bytes){
		char[] hexChars = new char[bytes.length * 2];
        for ( int j = 0; j < bytes.length; j++ ) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = HexArray[v >>> 4];
            hexChars[j * 2 + 1] = HexArray[v & 0x0F];
        }
        return new String(hexChars);
	}
	
	public static String BytesToHex(byte[] bytes, Boolean spaces) {
        char[] hexChars = new char[bytes.length * 3];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 3] = ' ';
            hexChars[j * 3 + 1] = HexArray[v >>> 4];
            hexChars[j * 3 + 2] = HexArray[v & 0x0F];
        }
        return new String(hexChars);
    }

}
