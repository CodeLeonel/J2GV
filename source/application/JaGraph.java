package application;

import jni.Framework;

public class JaGraph {

	
	public static void renderPDFile(String dotCommands, String engine, String prefixFileName) {
		
		String fileFormat = "pdf";
		
		renderFile(dotCommands, engine, fileFormat, prefixFileName + "." + fileFormat);
		
	}
	
	
	
	public static void renderFile(String dotCommands, String engine, String fileFormat, String fileName) {
	
		Framework.renderGraph(dotCommands, engine, fileFormat, fileName);
		
	}
	
	
	public static void main(String[] args) {
		

	}

}
