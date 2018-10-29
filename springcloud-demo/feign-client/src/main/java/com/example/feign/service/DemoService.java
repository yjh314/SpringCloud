package com.example.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "feign-server")
public interface DemoService {
	
	@GetMapping("/api/hello?name={name}")
	public String hello(@PathVariable("name") String name);
}
