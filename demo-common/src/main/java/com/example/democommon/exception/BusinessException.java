package com.example.democommon.exception;

/**
 *
 *  @Description TO DO
 *  @author yang
 *  @create 2020-04-20-16:46
 **/
public class BusinessException extends RuntimeException {

	private String message;

	private Throwable throwable;

	private String serviceName;

	public BusinessException() {

	}

	public BusinessException(String message,String serviceName) {
		super(message);
		this.message=message;
		this.serviceName=serviceName;
	}

	public BusinessException(Throwable throwable,String serviceName) {
		super(throwable);
		this.throwable=throwable;
		this.serviceName=serviceName;
	}

	@Override
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

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
}
