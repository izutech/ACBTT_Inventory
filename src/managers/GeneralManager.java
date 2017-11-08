package managers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GeneralManager {

	private DateFormat dateFormat;
	private Date dateToday;
	
	public String getDateToday() {
		dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		dateToday = new Date();
		String localDateAndTime = dateFormat.format(dateToday);
		return localDateAndTime;
	}
}
