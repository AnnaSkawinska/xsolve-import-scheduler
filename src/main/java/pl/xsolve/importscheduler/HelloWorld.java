package pl.xsolve.importscheduler;


import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

import org.xbib.tools.JDBCImporter;

public class HelloWorld {
	public static void main(String[] args) {
	  
	  String json = "{ "
	  		+ "\"type\" : \"jdbc\", "
	  			+ "\"jdbc\" : { " 
	  				+ "\"url\" : \"jdbc:postgresql://localhost:5432/test?loglevel=0\", " 
	  				+ "\"user\" : \"\", "
	  				+ " \"password\" : \"\", "  
	  				+ "\"sql\" : \"select *, id as _id from orders\" "
	  			+ "}" 
	  		+ "}";
      JDBCImporter.getInstance().reader("args", new ByteArrayInputStream(json.getBytes(StandardCharsets.UTF_8))).run(true);
	  
}}