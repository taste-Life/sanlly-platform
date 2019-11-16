package com.sanlly.common.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator.Builder;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

/**
 * Json Web Token帮助类
 * @author 生旭鹏
 *
 */
public class JwtUtil {
	
	public static void main(String[] args){
		System.out.println(createToken("12","234",20,null));
		String testToken="eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOiIxMiIsIm5iZiI6MTU1NjE3NDQwMiwiZXhwIjoxNTU2MTc0NDIyLCJpYXQiOjE1NTYxNzQ0MDJ9.jHvlzS6jQXNMn3aaW6uERN5sne8DB3KKLMcZ-r5RSXA";
		Map<String,String> data=verifyToken(testToken,"234");
		System.out.println(data!=null);
	}

	/**
	 * 默认token秘钥
	 */
	private final static String DEFAULT_SECRET="shengxp123456";
	
	/**
	 * 默认有效时长30分钟
	 */
	private final static Integer DEFAULT_EXPIRETIME=1800;
	
	public static String createToken(Map<String,String> data){
		return createToken(null,null,null,data);
	}
	
	public static String createToken(Integer expireTime,Map<String,String> data){
		return createToken(null,null,expireTime,data);
	}
	
	public static String createToken(String secret,Integer expireTime,Map<String,String> data){
		return createToken(null,secret,expireTime,data);
	}
	
	/**
	 * 验证token
	 * @param tokenId token标识
	 * @param secret 秘钥
	 * @param expireTime 过期时间秒，默认1800
	 * @param data 存放的数据
	 * @return
	 */
	public static String createToken(String tokenId,String secret,Integer expireTime,Map<String,String> data){
		try {
			Algorithm  algorithm=Algorithm.HMAC256(secret==null?DEFAULT_SECRET:secret);
			Date nowDate=new Date();
			Calendar calendar=Calendar.getInstance();
			calendar.setTime(nowDate);
			System.out.println(nowDate);
			calendar.add(Calendar.SECOND, expireTime==null?DEFAULT_EXPIRETIME:expireTime);
			Builder builder=JWT.create()
					.withIssuedAt(nowDate)
					.withExpiresAt(calendar.getTime())
					.withNotBefore(nowDate);
			if(tokenId!=null){
				builder.withAudience(tokenId);
			}
			if(data!=null){
				for(Entry<String,String> entry:data.entrySet()){
					builder.withClaim(entry.getKey(), entry.getValue());
				}
			}
			String token=builder.sign(algorithm);
			
			return token;
			
		} catch (JWTCreationException e) {
		}
		return null;
	}
	
	public static Map<String, String> verifyToken(String token){
		return verifyToken(token,null);
	}
	
	public static Boolean verifyTokenStatus(String token){
		return verifyTokenStatus(token,null);
	}
	
	public static Boolean verifyTokenStatus(String token,String secret){
		DecodedJWT jwt=verify(token,secret);
		return jwt!=null;
	}
	
	public static Map<String, String> verifyToken(String token,String secret){
		try {
			DecodedJWT jwt=verify(token,secret);
			if(jwt==null){
				return null;
			}
			Map<String, Claim> claims = jwt.getClaims();
			if(claims==null){
				return null;
			}
			Map<String, String> map = new HashMap<String, String>();
			for(Entry<String, Claim> entry:claims.entrySet()){
				map.put(entry.getKey(), entry.getValue().asString());
			}
			return map;
		} catch (JWTVerificationException e) {
			return null;
		}
	}
	
	public static DecodedJWT verify(String token,String secret){
		try {
			Algorithm algorithm = Algorithm.HMAC256(secret==null?DEFAULT_SECRET:secret);
			JWTVerifier verifier=JWT.require(algorithm).build();
			DecodedJWT jwt=verifier.verify(token);
			return jwt;
		} catch (JWTVerificationException e) {
			return null;
		}
		
	}
	
	
	
	
}
