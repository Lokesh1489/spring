package com.nt.service;

import com.nt.bo.PatientBO;
import com.nt.dao.IPatientDAO;
import com.nt.dto.PatientDTO;

public final class PatientMgmtServiceImpl implements IPatientMgmtService {
	//HAS A property
	private IPatientDAO dao;
	
	public PatientMgmtServiceImpl (IPatientDAO dao) {
		System.out.println("CustomermgmtServiceIMPL::1-parm constructor");
		this.dao=dao;
	}

	@Override
	public String registerCustomer(PatientDTO dto) throws Exception{
	System.out.println("CustomerMgmtServiceImpl.registerCustomer()");
	double intramt = (dto.getPamt()*dto.getTime())/100.0;
	PatientBO custBO = new PatientBO();
	custBO.setCname(dto.getCname());
	custBO.setCadd(dto.getCadd());
	custBO.setPamt(dto.getPamt());
	custBO.setIntramt(intramt);
	int count = dao.insert(custBO);
	return count==0?"Registration failes ":"Registration succedded::Interest amount::"+intramt;
}}
