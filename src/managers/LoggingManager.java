package managers;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggingManager {
	
	private DateFormat dateFormat;
	private Date dateToday;
	private FileWriter fileWrite;
	private BufferedWriter bufferWrite;
	private PrintWriter logFile;
	private String sourceName;
	private String currDate;
	private String userId;
	private String actionId;
	private String specificAction;
	private String divider;
	private String logDetails;
	
	
	public String getDateToday() {
		dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dateToday = new Date();
		String localDateAndTime = dateFormat.format(dateToday);
		return localDateAndTime;
	}
	
	public void appendToFile(String callSource) {
		sourceName = callSource + "-logs.txt";
		logDetails = getDetails();
		
		try {
			fileWrite = new FileWriter(sourceName, true);
			bufferWrite = new BufferedWriter(fileWrite);
			logFile = new PrintWriter(bufferWrite);
			
			logFile.println(logDetails);
			logFile.close();
		} catch (IOException e) {
			System.out.println("Error creating log file");
		}
	}

	public String getDetails() {
		currDate = "[" + getDateToday() + "]";
		
		//Get User ID
		userId = "1";
		
		//Get Action ID
		actionId = "2";
		
		//Specify Action
		specificAction = "Edited";
		divider = "::";
		
		logDetails = currDate + divider + userId + divider + actionId + divider + specificAction;
		
		return logDetails;
	}
}