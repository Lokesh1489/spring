package com.nt.service;

import com.nt.bo.CustomerBO;
import com.nt.dao.ICustomerDAO;
import com.nt.dto.CustomerDTO;

public final class CustomerMgmtServiceImpl implements ICustomerMgmtService {
	//HAS A property
	private ICustomerDAO dao;
	
	public CustomerMgmtServiceImpl (ICustomerDAO dao) {
		System.out.println("CustomermgmtServiceIMPL::1-parm constructor");
		this.dao=dao;
	}

	@Override
	public String registerCustomer(CustomerDTO dto) throws Exception{
	System.out.println("CustomerMgmtServiceImpl.registerCustomer()");
	double intramt = (dto.getPamt()*dto.getTime())/100.0;
	CustomerBO custBO = new CustomerBO();
	custBO.setCname(dto.getCname());
	custBO.setCadd(dto.getCadd());
	custBO.setPamt(dto.getPamt());
	custBO.setIntramt(intramt);
	int count = dao.insert(custBO);
	return count==0?"Registration failes ":"Registration succedded::Interest amount::"+intramt;
}}
