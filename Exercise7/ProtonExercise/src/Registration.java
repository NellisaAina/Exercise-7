import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField textField_IC;
	private JTextField textField_Name;
	private JTextField textField_Phone;
	private JTextField textField_Address;
	private JTextField textField_PostCode;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration frame = new Registration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registration() {
		setBackground(UIManager.getColor("Button.background"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.DARK_GRAY, 7));
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(10, 11, 446, 588);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\user\\eclipse-workspace\\Workspace\\ProtonExercise\\download.jpg"));
		lblNewLabel.setBounds(95, 11, 251, 218);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Car Booking Registration");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setToolTipText("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_1.setBounds(10, 226, 409, 73);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_Name = new JLabel("Name");
		lblNewLabel_Name.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_Name.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_Name.setBounds(36, 301, 90, 42);
		panel.add(lblNewLabel_Name);
		
		JLabel lblNewLabel_IC = new JLabel("IC Number");
		lblNewLabel_IC.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_IC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_IC.setBounds(36, 341, 90, 42);
		panel.add(lblNewLabel_IC);
		
		JLabel lblNewLabel_Phone = new JLabel("Phone Number");
		lblNewLabel_Phone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_Phone.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_Phone.setBounds(20, 380, 106, 42);
		panel.add(lblNewLabel_Phone);
		
		JLabel lblNewLabel_Address = new JLabel("Address");
		lblNewLabel_Address.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_Address.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_Address.setBounds(20, 419, 106, 42);
		panel.add(lblNewLabel_Address);
		
		JLabel lblNewLabel_Postcode = new JLabel("Postcode");
		lblNewLabel_Postcode.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_Postcode.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_Postcode.setBounds(20, 458, 106, 42);
		panel.add(lblNewLabel_Postcode);
		
		JLabel lblNewLabel_Model = new JLabel("Car Model");
		lblNewLabel_Model.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_Model.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_Model.setBounds(20, 498, 106, 42);
		panel.add(lblNewLabel_Model);
		
		textField_IC = new JTextField();
		textField_IC.setBounds(135, 350, 284, 28);
		panel.add(textField_IC);
		textField_IC.setColumns(10);
		
		textField_Name = new JTextField();
		textField_Name.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_Name.setBounds(135, 310, 284, 28);
		panel.add(textField_Name);
		textField_Name.setColumns(10);
		
		textField_Phone = new JTextField();
		textField_Phone.setColumns(10);
		textField_Phone.setBounds(135, 389, 284, 28);
		panel.add(textField_Phone);
		
		textField_Address = new JTextField();
		textField_Address.setColumns(10);
		textField_Address.setBounds(136, 428, 284, 28);
		panel.add(textField_Address);
		
		textField_PostCode = new JTextField();
		textField_PostCode.setColumns(10);
		textField_PostCode.setBounds(135, 467, 284, 28);
		panel.add(textField_PostCode);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"- Please Select - ", "Proton X50", "Proton X70", "Proton Saga", "Proton Persona"}));
		comboBox.setBounds(135, 506, 284, 30);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.DARK_GRAY, 7));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setForeground(Color.BLACK);
		panel_1.setBounds(10, 610, 1350, 87);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("ADD RECORD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[] {
						textField_Name.getText(),
						textField_IC.getText(),
						textField_Phone.getText(),
						textField_Address.getText(),
						textField_PostCode.getText(),
						comboBox.getSelectedItem(),
				});
				
				if(table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "Car Booking Confirmed", "Car Boooking Registration System",
								JOptionPane.OK_OPTION);
					}
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(173, 20, 221, 49);
		panel_1.add(btnNewButton);
		
		JButton btnEdit = new JButton("RESET");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_Name.setText("");
				textField_IC.setText("");
				textField_Phone.setText("");
				textField_Address.setText("");
				textField_PostCode.setText("");
				comboBox.setSelectedItem("- Please Select - ");
				
			}
		});
		btnEdit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEdit.setBounds(481, 20, 174, 49);
		panel_1.add(btnEdit);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if(table.getSelectedRow() == -1) {
					if(table.getRowCount() == 0) {
						JOptionPane.showMessageDialog(null, "No Data to delete", "Car Booking Registration System",
								JOptionPane.OK_OPTION);
					}else {
						JOptionPane.showMessageDialog(null, "Select which data to delete", "Car Booking Registration System",
								JOptionPane.OK_OPTION);
					}
				}else {
					model.removeRow(table.getSelectedRow());
				}
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDelete.setBounds(744, 20, 167, 49);
		panel_1.add(btnDelete);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit ?", "Car Booking Registration System",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBounds(1015, 20, 160, 49);
		panel_1.add(btnExit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(Color.DARK_GRAY, 7));
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(466, 11, 894, 588);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 45, 806, 505);
		panel_2.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "IC Number", "Phone Number", "Address", "Postcode", "Car Model"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(89);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		table.getColumnModel().getColumn(3).setPreferredWidth(206);
		table.getColumnModel().getColumn(5).setPreferredWidth(88);
		scrollPane.setViewportView(table);
	}
}
