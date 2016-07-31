package reports;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class frmDetail extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtName;
	private JTextField txtConsultant;
	private JTextField txtAge;
	private JTextField txtGender;
	private JTextField txtDate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmDetail frame = new frmDetail();
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
	public frmDetail() {
		setTitle("Test Details");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 400, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblPatientData = new JLabel("Patient Data");
		lblPatientData.setBounds(119, 16, 112, 25);
		lblPatientData.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(10, 92, 36, 14);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(10, 61, 20, 14);
		
		JLabel lblConsultant = new JLabel("Consultant:");
		lblConsultant.setBounds(10, 130, 61, 14);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(229, 61, 31, 14);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(229, 92, 47, 14);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setBounds(229, 130, 35, 14);
		
		JLabel label = new JLabel("");
		label.setBounds(66, 58, 0, 0);
		
		txtID = new JTextField();
		txtID.setBounds(85, 52, 86, 20);
		txtID.setEditable(false);
		txtID.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(85, 89, 118, 20);
		txtName.setEditable(false);
		txtName.setColumns(10);
		
		txtConsultant = new JTextField();
		txtConsultant.setBounds(85, 127, 119, 20);
		txtConsultant.setEditable(false);
		txtConsultant.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setBounds(278, 58, 86, 20);
		txtAge.setEditable(false);
		txtAge.setColumns(10);
		
		txtGender = new JTextField();
		txtGender.setBounds(280, 89, 86, 20);
		txtGender.setEditable(false);
		txtGender.setColumns(10);
		
		txtDate = new JTextField();
		txtDate.setBounds(282, 127, 86, 20);
		txtDate.setEditable(false);
		txtDate.setText("");
		txtDate.setColumns(10);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(23, 165, 335, 5);
		contentPane.add(separator);
		contentPane.add(lblPatientData);
		contentPane.add(lblConsultant);
		contentPane.add(txtConsultant);
		contentPane.add(lblId);
		contentPane.add(label);
		contentPane.add(lblName);
		contentPane.add(txtID);
		contentPane.add(txtName);
		contentPane.add(lblDate);
		contentPane.add(txtDate);
		contentPane.add(lblGender);
		contentPane.add(txtGender);
		contentPane.add(lblAge);
		contentPane.add(txtAge);
		
		JLabel lblTestDetails = new JLabel("Test Details");
		lblTestDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTestDetails.setBounds(119, 181, 116, 25);
		contentPane.add(lblTestDetails);
		
		JPanel panel = new JPanel();
		panel.setBounds(42, 245, 313, 237);
		contentPane.add(panel);
	}
}
