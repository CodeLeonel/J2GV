package jni;

import java.io.IOException;

import utils.NativeUtils;

public class Framework {

	static {
		try {
			NativeUtils.loadLibraryFromJar("/libJ2GVcpp.dll");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static native void renderGraph(String dotCommands, String engine, String formatFile, String fileName);
	
}
