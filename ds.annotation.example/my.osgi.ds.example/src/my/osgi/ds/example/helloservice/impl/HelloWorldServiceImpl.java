package my.osgi.ds.example.helloservice.impl;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import my.osgi.ds.example.common.DebugOutputHelper;
import my.osgi.ds.example.helloservice.api.HelloWorldService;

@Component
public class HelloWorldServiceImpl implements HelloWorldService {

	public HelloWorldServiceImpl() {
		DebugOutputHelper.logConstructor(getClass());
	}

	@Activate
	public void start() {
		DebugOutputHelper.logStart(getClass());
	}

	@Override
	public void sayHello(String name) {
		System.out.println(("Hello " + name + "!"));
	}

	@Deactivate
	public void stop() {
		DebugOutputHelper.logStop(getClass());
	}

}
