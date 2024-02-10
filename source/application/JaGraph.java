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
		

		String dotCommands = "digraph G {\r\n"
				+ "a -> b;\r\n"
				+ "c [shape=box];\r\n"
				+ "a -> c [weight=29,label=\"algum texto\"];\r\n"
				+ "subgraph anything {\r\n"
				+ "/* the following affects only x,y,z */\r\n"
				+ "node [shape=circle];\r\n"
				+ "a; x; y -> z; y -> z; /* multiple edges */\r\n"
				+ "}\r\n"
				+ "}";
		
		
		renderPDFile(dotCommands, "neato", "MaisUmTeste");
		
	}

}
