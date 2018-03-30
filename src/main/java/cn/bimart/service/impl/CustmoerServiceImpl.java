package cn.bimart.service.impl;

import cn.bimart.dao.CustomerDao;
import cn.bimart.domain.Customer;
import cn.bimart.service.CustomerService;

public class CustmoerServiceImpl implements CustomerService{
	private CustomerDao customerDao;

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public Customer findOne(String custId) {
		// TODO Auto-generated method stub
		Customer customer = this.customerDao.findOne(custId);
		return customer;
	} 
}
