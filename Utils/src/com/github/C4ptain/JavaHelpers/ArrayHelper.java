package com.github.C4ptain.JavaHelpers;

public class ArrayHelper {
	
	
	@SuppressWarnings("unused")
	private static byte[] ConcatArray(byte[] array1, byte[] array2){
        byte[] output = new byte[array1.length + array2.length];
        System.arraycopy(array1, 0, output, 0, array1.length);
        System.arraycopy(array2, 0, output, array1.length, array2.length);
        return output;
    }
	
	
}
