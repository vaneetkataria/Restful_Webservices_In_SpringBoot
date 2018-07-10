package com.kataria.springboot.rest.practice.helloworld;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kataria.springboot.rest.practice.helloworld.beans.HelloWorld;

@RestController
public class HelloWorldService {

	@GetMapping(path = "/Hello-world")
	public String helloWorld() {
		return "Hello World";
	}

	// Response will be contentType : application/json;charset=UTF-8 only.
	@GetMapping(path = "/Hello-world-Json", produces = MediaType.APPLICATION_JSON_VALUE)
	public String helloWorldJsonUtf8Value() {
		return "Hello World-Json-value";
	}

	// Response will be contentType : application/json;charset=UTF-8 only.
	@GetMapping(path = "/Hello-world-Json-UTF8", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String helloWorldJsonValue() {
		return "Hello-world-Json-UTF8";
	}

	// Content application/xml and application/json can both be demanded by sending
	// in Accept Header.
	@GetMapping(path = "/Hello-world-Bean")
	public HelloWorld helloWorldBean() {
		return new HelloWorld("Hello World-Bean");
	}

	// Content application/json will only be served . If application/xml demanded
	// 406 Not acceptable will be thrown by Spring.
	@GetMapping(path = "/Hello-world-Bean-Json", produces = MediaType.APPLICATION_JSON_VALUE)
	public HelloWorld helloWorldBeanJson() {
		return new HelloWorld("Hello World-Bean-Json");
	}

	// Content application/json will only be served . If application/xml demanded
	// 406 Not acceptable will be thrown by Spring.
	@GetMapping(path = "/Hello-world-Bean-Json-UTF8", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public HelloWorld helloWorldBeanJsonUTF8() {
		return new HelloWorld("Hello World-Bean-Json-UTF8");
	}

	// Content application/xml will only be served . If application/json demanded
	// 406 Not acceptable will be thrown by Spring.
	@GetMapping(path = "/Hello-world-Bean-xml", produces = MediaType.APPLICATION_XML_VALUE)
	public HelloWorld helloWorldBeanXml() {
		return new HelloWorld("Hello World-Bean-Xml");
	}

}