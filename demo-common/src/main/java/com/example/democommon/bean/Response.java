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
	String serviceName;
	Throwable throwable;
	T data;

	public Response() {

	}

	public Response(Integer code,String message,T data) {
		this.code=code;
		this.message=message;
		this.data=data;
	}

	public Response(Integer code,Throwable throwable) {
		this.code=code;
		this.throwable=throwable;
	}

	public Response(Integer code,String serviceName,Throwable throwable) {
		this.code=code;
		this.serviceName=serviceName;
		this.throwable=throwable;
	}

	public static Response success() {
		return new Response();
	}

	public static <T> Response success(Integer code,String message,T data) {
		return new Response(code,message,data);
	}

	public static Response fail(Integer code,String message) {
		return new Response(code,message,null);
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Throwable getThrowable() {
		return throwable;
	}

	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
}
