package com.sanlly.auth.core;

import java.util.Map;
import java.util.UUID;

public class UuidTokenProvider extends DefaultTokenProvider{

	@Override
	public String createToken(Map<String, Object> data) {
		// TODO Auto-generated method stub
		return UUID.randomUUID().toString();
	}
}
