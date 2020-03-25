package com.example.gateway.web.filter;

import java.util.HashMap;
import java.util.Random;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-03-25-12:30
 **/
public class JwtUtil {
	public static String generateToken(String user) {
		HashMap<String,Object> map=new HashMap<>();
		map.put("id",new Random().nextInt());
		map.put("user",user);
		return "";
	}
}
