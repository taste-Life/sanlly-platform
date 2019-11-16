package com.sanlly.auth.core;

import java.util.Map;

public interface ITokenProvider {
	String createToken(Map<String,Object> data);
	String getCurrentToken();
}