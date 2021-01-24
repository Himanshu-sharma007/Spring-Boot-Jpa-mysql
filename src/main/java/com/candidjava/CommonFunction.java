package com.candidjava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonFunction {
	private static int regiNum = 0;

	public static String generateFileName( ) {
		StringBuilder sb = new StringBuilder("Document");
		sb.append(String.format("%02d", ++regiNum));
		sb.append(".pdf");
		
		return sb.toString();
	}
	
	public static String getdateApi()
	{
	    Date date = new Date();  
	    SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyy hh:mm");  
	    String strDate = formatter.format(date);  
	  //  System.out.println("Date Format with dd-M-yyyy hh:mm:ss : "+strDate);
		return strDate;  
	}
	
	
	
}
