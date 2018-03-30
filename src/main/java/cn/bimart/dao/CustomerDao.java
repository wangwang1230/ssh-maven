package cn.bimart.dao;

import cn.bimart.domain.Customer;

public interface CustomerDao {

	Customer findOne(String custId);
}
