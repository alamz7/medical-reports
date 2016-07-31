package reports;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.util.*;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtName;
	private JTextField txtConsultant;
	
	JComboBox cbAge;
	JComboBox cbSex;
	JDateChooser dtChooser;
	JFrame frame = new JFrame();
	JComboBox cbSelectTest;
	
	static String patientID;
	static String patientName;
	static String consultantName;
	static String patientAge;
	static String patientSex;
	static Date date;
	static String testType;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setTitle("Laboratory Reports");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 386);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblTitle = new JLabel("Khan Labs");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JSeparator separator = new JSeparator();
		
		JLabel lblPatient = new JLabel("Patient");
		lblPatient.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblName = new JLabel("Name:");
		
		JLabel lblId = new JLabel("ID:");
	
		
		txtId = new JTextField();
		txtId.setToolTipText("Enter ID");
		txtId.setColumns(10);
		
		txtName = new JTextField();
		txtName.setToolTipText("Enter patient name");
		txtName.setColumns(10);
		
		JLabel lblAge = new JLabel("Age:");
		
		JLabel lblSex = new JLabel("Sex:");
		
		cbAge = new JComboBox();
		cbAge.setModel(new DefaultComboBoxModel(new String[] {"--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"}));
		
		cbSex = new JComboBox();
		cbSex.setModel(new DefaultComboBoxModel(new String[] {"--Select--", "Male", "Female"}));
		
		JLabel lblDate = new JLabel("Date:");
		
		JLabel lblConsultant = new JLabel("Consultant:");
				
		txtConsultant = new JTextField();
		txtConsultant.setToolTipText("Enter consultant name");
		txtConsultant.setColumns(10);
		
		dtChooser = new JDateChooser();
		
		JButton btnDetails = new JButton("Enter Details");
		btnDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			if(	ValidateData()){				
				GetData();
				frmDetail frame = new frmDetail();
				frame.setVisible(true);				
			}
			}
		});
		
		JSeparator separator_1 = new JSeparator();
		
		cbSelectTest = new JComboBox();
		cbSelectTest.setModel(new DefaultComboBoxModel(new String[] {"--Select--", "S.Calcium", "CBC", "TFTS", "ESR", "FBS", "HBA1C", "Typhidot "}));
		
		JLabel lblNewLabel = new JLabel("Select Test:");
		
		JLabel lblNewLabel_1 = new JLabel("Test Details");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(166)
							.addComponent(lblTitle))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblName)
								.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblConsultant))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 348, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(txtConsultant, Alignment.LEADING)
											.addComponent(txtName, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
										.addComponent(txtId, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))
									.addGap(45)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblAge)
										.addComponent(lblDate)
										.addComponent(lblSex))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(dtChooser, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(cbSex, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(cbAge, Alignment.LEADING, 0, 82, Short.MAX_VALUE))))
								.addComponent(separator, GroupLayout.PREFERRED_SIZE, 326, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(cbSelectTest, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
									.addGap(31)
									.addComponent(btnDetails))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(180)
							.addComponent(lblPatient))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(171)
							.addComponent(lblNewLabel_1)))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblTitle)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblPatient)
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblId)
								.addComponent(txtId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblName)
								.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtConsultant, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblConsultant)))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblAge)
								.addComponent(cbAge, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(31)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
											.addComponent(lblSex, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
											.addComponent(cbSex, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(11)
										.addComponent(dtChooser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addComponent(lblDate)))))
					.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 12, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1)
					.addGap(19)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(cbSelectTest, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDetails))
					.addGap(40))
		);
		contentPane.setLayout(gl_contentPane);
	}

	boolean GetData(){
		patientID = txtId.getText();
		patientName = txtName.getText();
		consultantName = txtConsultant.getText();
		patientAge = cbAge.getSelectedItem().toString() ;
		patientSex = cbSex.getSelectedItem().toString();
		
		//SimpleDateFormat formatter;
		//formatter = new SimpleDateFormat("dd/MM/yyyy");
		//txtId.setText(formatter.format(dtChooser.getDate()));
		//date = formatter.format(dtChooser.getDate());

		date = dtChooser.getDate();
		
		
		return true;
	}
	boolean ValidateData(){
		
		
		
			//JOptionPane.showMessageDialog(frame, cbAge.getSelectedIndex());
						
		
		
		
		
		
		if(txtId.getText().isEmpty()){
				JOptionPane.showMessageDialog(frame, "Please, enter ID.");
				return false;
		}
		else if(txtName.getText().isEmpty()){
			JOptionPane.showMessageDialog(frame, "Please, enter patient Name.");
				return false;			
		}
		else if(txtConsultant.getText().isEmpty()){
			JOptionPane.showMessageDialog(frame, "Please, enter consultant Name.");
				return false;			
		}
		else if(cbAge.getSelectedIndex() == 0){
			JOptionPane.showMessageDialog(frame, "Please, select age.");
				return false;			
		}
		else if(cbSex.getSelectedIndex() == 0){
			JOptionPane.showMessageDialog(frame, "Please, select gender.");
				return false;			
		}
		else if(dtChooser.getDate() == null){
			JOptionPane.showMessageDialog(frame, "Please, select date.");
				return false;			
		}
		else if(cbSelectTest.getSelectedIndex() == 0){
			JOptionPane.showMessageDialog(frame, "Please, select a test type.");
				return false;	
		}
						
		//SimpleDateFormat formatter;
		//formatter = new SimpleDateFormat("dd/MM/yyyy");
		//txtId.setText(formatter.format(dtChooser.getDate()));
		//date = formatter.format(dtChooser.getDate());
		
		return true;
	}
}



