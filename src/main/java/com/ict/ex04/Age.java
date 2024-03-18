package com.ict.ex04;

import java.util.Calendar;

public class Age {
	// 주민번호를 받아서 나이를 계산하는 
	// gender가 1 또는 2 이면 1900년대 태어난 사람
	// gender가 3 또는 4 이면 2000년대 태어난 사람
	public int count(String jumin, String gender) {
		int result = 0;
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int user_year = 0;
		
		if (gender.equals("1") || gender.equals("2") ) {
			user_year = 1900 + Integer.parseInt(jumin.substring(0, 2));
		} else if (gender.equals("3") || gender.equals("4")) {
			user_year = 2000 + Integer.parseInt(jumin.substring(0, 2));
		}
		result = year - user_year;
		return result;
	}
}
