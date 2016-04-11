package Presentation;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import dao.CustomerDAO;
import model.Customer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class formCustomer extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField textID;
	private JLabel lblNewLabel_1;
	private JTextField textNAME;
	private JLabel lblNewLabel_2;

	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFemale;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton btnAdd;
	private JButton btnDelete;
	private JButton btnUpdate;

	@SuppressWarnings("unused")
	private final DefaultTableModel modelCustomer = new DefaultTableModel();
	modelCus model=new modelCus();
	
	ArrayList<Customer> listCustomer=new ArrayList<Customer>();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formCustomer frame = new formCustomer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public formCustomer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 401, 320);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("ID");
		lblNewLabel.setBounds(10, 11, 32, 30);
		contentPane.add(lblNewLabel);
		
		textID = new JTextField();
		textID.setBounds(57, 11, 189, 30);
		contentPane.add(textID);
		textID.setColumns(10);
		
		lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setBounds(10, 52, 46, 27);
		contentPane.add(lblNewLabel_1);
		
		textNAME = new JTextField();
		textNAME.setBounds(57, 49, 189, 30);
		contentPane.add(textNAME);
		textNAME.setColumns(10);
		
		lblNewLabel_2 = new JLabel("GEN");
		lblNewLabel_2.setBounds(10, 90, 46, 25);
		contentPane.add(lblNewLabel_2);
		
		rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(78, 86, 57, 34);
		contentPane.add(rdbtnMale);
		buttonGroup.add(rdbtnMale);
		
		
		rdbtnFemale = new JRadioButton("FeMale");
		rdbtnFemale.setBounds(157, 90, 89, 30);
		contentPane.add(rdbtnFemale);
		buttonGroup.add(rdbtnFemale);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 137, 351, 125);
		contentPane.add(scrollPane);
		
		table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int  index=table.getSelectedRow();
				if(index!=-1){
					Customer c=model.get(index);
					textID.setText(c.getId());
					textNAME.setText(c.getName());
					if(c.isGen())
						rdbtnMale.setSelected(true);
					else
						rdbtnFemale.setSelected(true);
				}
			}
		});
		scrollPane.setViewportView(table);		
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				////nhan thong tin
				//tao doi tuong
				Customer c=new Customer("003","An Thu", false);
				model.Add(c);
				
				
			}
		});
		btnAdd.setBounds(256, 9, 89, 35);
		contentPane.add(btnAdd);
		
		btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index=table.getSelectedRow();
				if(index!=-1){
					model.delete(index);
				}
				
				
			}
		});
		btnDelete.setBounds(256, 48, 89, 35);
		contentPane.add(btnDelete);
		
		btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index=table.getSelectedRow();
				Customer c=new Customer(textID.getText(),textNAME.getText(),rdbtnMale.isSelected()?true:false);
				if(index!=-1){
					model.update(index,c);
				}
			}
		});
		btnUpdate.setBounds(256, 91, 89, 35);
		contentPane.add(btnUpdate);
		
		loaddata();
	}

	private void loaddata() {
		CustomerDAO dao=new CustomerDAO();
		listCustomer=dao.findAll();
		model.setList(listCustomer);
		
	}
}
