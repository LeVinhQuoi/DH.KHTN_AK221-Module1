package dao;

import java.util.ArrayList;

import model.Customer;

public class CustomerDAO {

	public CustomerDAO() {
		// TODO Auto-generated constructor stub
	}
	public ArrayList<Customer> findAll(){
		Customer c1=new Customer("001","Kha",true);
		Customer c2=new Customer("002","Oanh",false);
		ArrayList<Customer> list=new ArrayList<Customer>();
		list.add(c1);
		list.add(c2);
		return list;
	}
}
