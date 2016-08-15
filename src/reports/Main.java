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
		lblTitle.setFont(new Font("Calibri", Font.PLAIN, 20));
		
		JLabel lblPatient = new JLabel("Patient");
		lblPatient.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Calibri Light", Font.PLAIN, 11));
	
		
		txtId = new JTextField();
		txtId.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		txtId.setToolTipText("Enter ID");
		txtId.setColumns(10);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		txtName.setToolTipText("Enter patient name");
		txtName.setColumns(10);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		
		JLabel lblSex = new JLabel("Sex:");
		lblSex.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		
		cbAge = new JComboBox();
		cbAge.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		cbAge.setModel(new DefaultComboBoxModel(new String[] {"--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"}));
		
		cbSex = new JComboBox();
		cbSex.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		cbSex.setModel(new DefaultComboBoxModel(new String[] {"--Select--", "Male", "Female"}));
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		
		JLabel lblConsultant = new JLabel("Consultant:");
		lblConsultant.setFont(new Font("Calibri Light", Font.PLAIN, 11));
				
		txtConsultant = new JTextField();
		txtConsultant.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		txtConsultant.setToolTipText("Enter consultant name");
		txtConsultant.setColumns(10);
		
		dtChooser = new JDateChooser();
		
		JButton btnDetails = new JButton("Enter Details");
		btnDetails.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		btnDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				populate();
			if(	ValidateData()){				
				GetData();
				
				TestDetails();
									
			}
			}
		});
		
		cbSelectTest = new JComboBox();
		cbSelectTest.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		cbSelectTest.setModel(new DefaultComboBoxModel(new String[] {"--Select--", "S.Calcium", "CBC", "TFTS", "ESR", "FBS", "HBA1C", "Typhidot"}));
		
		JLabel lblNewLabel = new JLabel("Select Test:");
		lblNewLabel.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		
		JLabel lblNewLabel_1 = new JLabel("Test Details");
		lblNewLabel_1.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		JSeparator separator = new JSeparator();
		
		JSeparator separator_1 = new JSeparator();
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(180)
							.addComponent(lblPatient))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(171)
							.addComponent(lblNewLabel_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblName)
										.addComponent(lblId, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblConsultant))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(txtConsultant, Alignment.LEADING)
											.addComponent(txtName, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
										.addComponent(txtId, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
										.addComponent(cbSelectTest, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)))
								.addComponent(lblNewLabel))
							.addGap(44)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblAge)
										.addComponent(lblDate)
										.addComponent(lblSex))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(dtChooser, GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
										.addComponent(cbAge, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(cbSex, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnDetails)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnCancel))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator, GroupLayout.PREFERRED_SIZE, 476, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(173)
							.addComponent(lblTitle))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 476, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblTitle)
					.addGap(9)
					.addComponent(separator, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
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
					.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 4, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1)
					.addGap(19)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(cbSelectTest, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnDetails)
						.addComponent(btnCancel))
					.addGap(40))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	void populate(){
		txtId.setText("23");
		txtName.setText("Name1");
		txtConsultant.setText("Consultant 1");
		cbAge.setSelectedIndex(20);
		cbSex.setSelectedIndex(1);
		@SuppressWarnings("deprecation")
		Date newDate  = new Date(10, 12, 30);
        dtChooser.setDate(newDate);
        //cbSelectTest.setSelectedIndex(3);
	}
	
	boolean GetData(){
		
		Patient.SetPatientID(Integer.parseInt(txtId.getText()));
		Patient.SetPatientName(txtName.getText());
		Patient.SetConsultantName(txtConsultant.getText());
		Patient.SetPatientAge(Integer.parseInt(cbAge.getSelectedItem().toString()));
		Patient.SetPatientGender(cbSex.getSelectedItem().toString());
		Patient.SetCheckupDate(dtChooser.getDate());
			
		return true;
	}
	
	boolean ValidateData(){
				
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
		}		//date = formatter.format(dtChooser.getDate());
		
		return true;
	}

	void TestDetails(){
		
		if(cbSelectTest.getSelectedItem().toString() == "S.Calcium"){
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						dCalcium frame = new dCalcium();
						frame.setModal(true);
						frame.setVisible(true);						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});						
		}
		else if(cbSelectTest.getSelectedItem().toString() == "CBC"){
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						dCBC frame = new dCBC();
						frame.setModal(true);
						frame.setVisible(true); 
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});						
		}
		else if(cbSelectTest.getSelectedItem().toString() == "TFTS"){
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						dTFTS frame = new dTFTS();
						frame.setModal(true);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});						
		}
		else if(cbSelectTest.getSelectedItem().toString() == "ESR"){
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						dESR frame = new dESR();
						frame.setModal(true);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});						
		}
		else if(cbSelectTest.getSelectedItem().toString() == "FBS"){
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						dFBS frame = new dFBS();
						frame.setModal(true);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});						
		}
		else if(cbSelectTest.getSelectedItem().toString() == "HBA1C"){
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						dHBA1C frame = new dHBA1C();
						frame.setModal(true);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});						
		}
		else if(cbSelectTest.getSelectedItem().toString() == "Typhidot"){
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						dTyphidot frame = new dTyphidot();
						frame.setModal(true);
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});						
		}		
	}
}



