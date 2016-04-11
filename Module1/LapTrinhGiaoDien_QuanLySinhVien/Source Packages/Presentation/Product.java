package Presentation;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import model.Customer;

@SuppressWarnings("serial")
public class Product extends AbstractTableModel{

	public Product() {
		// TODO Auto-generated constructor stub
	}
	private ArrayList<Customer> list=new ArrayList<Customer>();
	private static final String names[]={"ID","NAME","GEN"};
			
	
	
	@Override
	public String getColumnName(int arg0) {
		return names[arg0];
	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return names.length;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getValueAt(int row, int column) {
		// TODO Auto-generated method stub
		Customer cus=list.get(row);
		switch (column) {
		case 0:
			
			return cus.getId();
		case 1:
			
			return cus.getName();
		case 2:
			return cus.isGen()?"Nam":"Nu";
			
		default:
			break;
		}
		return null;
	}

	public ArrayList<Customer> getList() {
		return list;
	}

	public void setList(ArrayList<Customer> list) {
		this.list = list;
	}
	public void Add(Customer c){
		this.list.add(c);
		fireTableDataChanged();
	}
	public void delete(int index){
		this.list.remove(index);
		fireTableDataChanged();
		
	}
	public void update(int index,Customer c){
		this.list.set(index, c);
		fireTableDataChanged();
		
		
	}
	public Customer get(int index){
		return this.list.get(index);
	}
	
}
