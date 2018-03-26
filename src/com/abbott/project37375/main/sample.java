package com.abbott.project37375.main;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String timeZoneString;
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		Date date = c.getTime();
		TimeZone tz = TimeZone.getTimeZone("America/Los_Angeles");
		long hours = TimeUnit.MILLISECONDS.toHours(tz.getRawOffset());
		long minutes = TimeUnit.MILLISECONDS.toMinutes(tz.getRawOffset())
				- TimeUnit.HOURS.toMinutes(hours);
		minutes = Math.abs(minutes);
		if (tz.inDaylightTime(date)) {
			hours = hours + 1;
		}
		String hr = null;
		if (hours > 0) {
			hr = "0" + hours;
		} else if (hours <= -10) {
			hr = "" + hours;
		} else {
			String newhr = String.valueOf(hours);
			hr = newhr.replace("-", "-0");
		}

		if (hours > 0) {
			timeZoneString = String.format("GMT+%s:%02d", hr, minutes);
		} else {

			timeZoneString = String.format("GMT%s:%02d", hr, minutes);
		}

		System.out.println(timeZoneString);
	}

}
