package my.osgi.ds.example.helloclient.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import my.osgi.ds.example.common.DebugOutputHelper;
import my.osgi.ds.example.helloservice.api.HelloWorldService;

@Component
public class HelloWorldClientImpl {

	private HelloWorldService helloWorldService;

	public HelloWorldClientImpl() {
		DebugOutputHelper.logConstructor(getClass());
	}

	@Activate
	public void start() {
		DebugOutputHelper.logStart(getClass());

		helloWorldService.sayHello("Mr. X");
	}

	@Reference(unbind = "unbind")
	public void bind(HelloWorldService helloWorldService) {
		DebugOutputHelper.logBind(getClass(), helloWorldService.getClass());

		this.helloWorldService = helloWorldService;
	}

	public void unbind(HelloWorldService helloWorldService) {
		DebugOutputHelper.logUnbind(getClass(), helloWorldService.getClass());

		this.helloWorldService = null;
	}

	@Deactivate
	public void stop() {
		DebugOutputHelper.logStop(getClass());
	}
}
