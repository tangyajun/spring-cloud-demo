package com.example.democommon.bean;

import java.io.Serializable;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-03-22-21:39
 **/
public class Response<T> implements Serializable {
	Integer code;
	String message;
	T data;

	public Response() {

	}

	public Response(Integer code,String message,T data) {
		this.code=code;
		this.message=message;
		this.data=data;
	}

	public static Response success() {
		return new Response();
	}

	public static <T> Response success(Integer code,String message,T data) {
		return new Response(code,message,data);
	}
}
