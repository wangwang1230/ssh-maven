package cn.bimart.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.bimart.dao.CustomerDao;
import cn.bimart.domain.Customer;

/**
 * @author wh
 * 最终dao要通过模板HibernateTemplate操作数据库，所以要继承hibernateDaoSupport
 */
public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao{

	@Override
	public Customer findOne(String custId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Customer.class, custId);
	}
	
}
