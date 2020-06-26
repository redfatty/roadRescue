package com.hj.roadrescue.core.entity;

import java.io.Serializable;

/**
 * 创建订单出参
 * @author huangjiong
 *
 */
public class CreateOrderOutputModel implements Serializable {
	private static final long serialVersionUID = -8044308743501709515L;
	private String customerName;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
