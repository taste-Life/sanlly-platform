package com.sanlly.warehouse.config;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(LocalDateTime.now());
		String format = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyMMddHH"));
		int i=0;
		List<String> strings=new ArrayList<String>();
		strings.add("0");
		System.out.println(strings.isEmpty());

	}

}
