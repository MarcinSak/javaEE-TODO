package com.in28minutes.time;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TagretTime
{
	private String date; 
	private String time; 
	
	public TagretTime(String date, String time) {
		super();
		this.time = time;		
		if(date.equals(""))
			this.date = getProperlyFormatedData(new Date());
		else 
			this.date = getProperlyFormatedData(date);
	}

	public String getDate()
	{
		return date;
	}

	public void setDate(String date)
	{
		this.date = date;
	}

	public String getTime()
	{
		return time;
	}

	public void setTime(String time)
	{
		this.time = time;
	}

	
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TagretTime other = (TagretTime) obj;
		if (date == null)
		{
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (time == null)
		{
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "TagretTime [date=" + date + ", time=" + time + "]";
	}

	public static String getProperlyFormatedData(Date tempDate) {
		Format formatedData = new SimpleDateFormat("dd-MM-yyyy");
		return formatedData.format(tempDate);
	}
	
	public String getProperlyFormatedData(String tempDate) {
		String[] temp = tempDate.split("-");
		return (temp[2]+"-"+temp[1]+"-"+temp[0]);
	}
	

}
