package com.nt.controller;

import com.nt.dto.CustomerDTO;
import com.nt.service.ICustomerMgmtService;
import com.nt.vo.CustomerVO;

public class MainController {
// HAS A property
	private ICustomerMgmtService service;

	public MainController(ICustomerMgmtService service) {
		System.out.println("MainController: 1-param constructor");
	this.service=service;
	}

	public String processCustomer(CustomerVO vo) throws Exception {
		CustomerDTO custDTO = new CustomerDTO();
		custDTO.setCname(vo.getCname());
		custDTO.setCadd(vo.getCadd());
		custDTO.setPamt(Double.parseDouble(vo.getPamt()));
		custDTO.setTime(Double.parseDouble(vo.getTime()));
		custDTO.setRate(Double.parseDouble(vo.getRate()));
		// use service
		String resultMsg = service.registerCustomer(custDTO);
		return resultMsg;

	}

}
