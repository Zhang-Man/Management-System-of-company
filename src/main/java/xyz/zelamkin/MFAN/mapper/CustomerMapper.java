package xyz.zelamkin.MFAN.mapper;

import java.util.List;

import xyz.zelamkin.MFAN.pojo.Customer;

public interface CustomerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
    
    List<Customer> selectAllCustomer();
    
    List<Customer> selectMyCustomer(Customer record);
    
    Customer SelectByName(Customer record);
}