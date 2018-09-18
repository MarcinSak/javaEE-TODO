package javaeeTodoApp.time;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TargetTimeService
{
	private TagretTime targetTime;

	public String getProperlyFormatedData(Date date) {
		Format formatedData = new SimpleDateFormat("dd-MM-yyyy");
		return formatedData.format(date);
	}
	
	public String getProperlyFormatedData(String date) {
		String[] temp = date.split("-");
		return temp[2]+"-"+temp[1]+"-"+temp[3];
	}
	
	public Boolean isItData(String dateOrTime) {
		if(dateOrTime.contains("-")) {
			// this is data
			return true;
		}
		// else, most likely ( or hopefully, format is not changing ups...) its a TIME
		return false;
	}
	

}
