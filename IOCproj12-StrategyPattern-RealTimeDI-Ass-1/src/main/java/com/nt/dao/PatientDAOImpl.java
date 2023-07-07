package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.PatientBO;

public class PatientDAOImpl implements IPatientDAO {
	// HAS-A Property
	private DataSource ds;
	private static String CUSTOMER_INSERT_QUERY = "insert into realtime_customer(cname,cadd,pamt,intramt) values (?,?,?,?)";

	// For constructor Injection
	public PatientDAOImpl(DataSource ds) {
		 System.out.println("CustomerDAOImpl:: 1- param constructor");
         this.ds = ds;
	}

	@Override
	public int insert(PatientBO custBO) throws Exception {
		System.out.println("CustomerDAOIMPL : insert()");
		int count = 0;
		try (Connection con = ds.getConnection(); PreparedStatement ps = con.prepareStatement(CUSTOMER_INSERT_QUERY);) {
			if (ps != null) {
			ps.setString(1, custBO.getCname());
			ps.setString(2, custBO.getCadd());
			ps.setDouble(3, custBO.getPamt());
			ps.setDouble(4, custBO.getIntramt());
			count = ps.executeUpdate();
	}

}
catch (Exception se) {
	se.printStackTrace();
	throw se;
}
	return count;
	}
}
		