package com.tangyajun.springcloud.consumer.web.command;

import com.netflix.hystrix.*;

import java.net.URL;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2020-02-10-14:51
 **/
public class UserTimeoutCommand extends HystrixCommand {

	public UserTimeoutCommand() {
		// 分组名称用于统计
		super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("userGroup"))
				// 用于监控、熔断、度量发布、缓存的Key值
		.andCommandKey(HystrixCommandKey.Factory.asKey("userCommandKey"))
				// 线程池命名，默认是HystrixCommandGroupKey的名称。
		.andThreadPoolKey(HystrixThreadPoolKey.Factory.asKey("userThreadPoolKey"))
				// command 熔断相关参数配置
		.andCommandPropertiesDefaults(HystrixCommandProperties.Setter())
		.andThreadPoolPropertiesDefaults(HystrixThreadPoolProperties.Setter().withCoreSize(1)));
		// 设置线程池参数

	}

	@Override
	protected Object run() throws Exception {
		URL url=new URL("http://localhost:8081/uses/timeout");
		byte[] bytes=new byte[1024];
		url.openStream().read(bytes);
		return new String(bytes);
	}
}
