package com.hj.roadrescue.core.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	@ResponseBody
	@RequestMapping("/test")
	public Object test() {
		Map<String, Object> map = new HashMap<>();
		map.put("title", "测试");
		map.put("time", new Date());
		return map;
	}
}
