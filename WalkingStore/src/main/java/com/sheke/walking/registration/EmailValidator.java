package com.sheke.walking.registration;

import java.util.function.Predicate;

import org.springframework.stereotype.Service;

@Service
public class EmailValidator implements Predicate<String> {

	@Override
	public boolean test(String v) {
		// TODO Auto-generated method stub
		return true;
	}

}
