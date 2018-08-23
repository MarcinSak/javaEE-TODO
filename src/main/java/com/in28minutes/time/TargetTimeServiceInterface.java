package com.in28minutes.time;

import java.util.Date;

public interface TargetTimeServiceInterface
{
	public String getProperlyFormatedData(Date date);
	public String getProperlyFormatedData(String date);
	public Boolean isItData(String dateOrTime);
}
