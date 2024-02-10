package jni;

public class Framework {

	static {
		System.loadLibrary("libJ2GVcpp");
	}
	
	public static native void renderGraph(String dotCommands, String engine, String formatFile, String fileName);
	
}
