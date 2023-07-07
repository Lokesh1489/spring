package com.nt.controller;

import com.nt.dto.PatientDTO;
import com.nt.service.IPatientMgmtService;
import com.nt.vo.PatientVO;

public class MainController {
// HAS A property
	private IPatientMgmtService service;

	public MainController(IPatientMgmtService service) {
		System.out.println("MainController: 1-param constructor");
	this.service=service;
	}

	public String processCustomer(PatientVO vo) throws Exception {
		PatientDTO custDTO = new PatientDTO();
		
		custDTO.setPname(vo.getPname());
		custDTO.setPadd(vo.getPadd());
		custDTO.setPerdaycharge(Double.parseDouble(vo.getPerdaycharge()));
		custDTO.setNoofdays(Double.parseDouble(vo.getNoofdays()));
		// use service
		String resultMsg = service.registerCustomer(custDTO);
		return resultMsg;

	}

}
