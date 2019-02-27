package com.amphisoft.codeQuality;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserBO {
	public boolean validateEmail(String email) {
		User user = new User();
		String dummyObj;
		UserBO userBO = new UserBO();
        Scanner scan = new Scanner(System.in);
		Pattern pattern=Pattern.compile("^([A-Za-z]{1})([_.A-Za-z0-9])*@([A-Za-z])+(\\.)([A-Za-z]{2,6})$");
		Matcher matcher=pattern.matcher(email);
		if(matcher.matches())
			return true;
		return false;
	}
}
