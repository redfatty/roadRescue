package com.hj.roadrescue.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hj.roadrescue.core.entity.CreateOrderInputModel;
import com.hj.roadrescue.core.entity.CreateOrderOutputModel;

/**
 * 救援核心控制层
 * @author huangjiong
 *
 */
@Controller
public class RescueApiController {
	/**
	 * 创建订单
	 * @param inputModel
	 * @return
	 */
	@RequestMapping("/createOrder")
	@ResponseBody
	public CreateOrderOutputModel createOrder(CreateOrderInputModel inputModel) {
		CreateOrderOutputModel outputModel = new CreateOrderOutputModel();
		outputModel.setCustomerName("小明");
		return outputModel;
	}
}
