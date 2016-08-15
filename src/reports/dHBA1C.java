package reports;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class dHBA1C extends JDialog {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtName;
	private JTextField txtConsultant;
	private JTextField txtAge;
	private JTextField txtGender;
	private JTextField txtDate;
	private JTextField txt1;

	public dHBA1C() {	
	setTitle("Details");
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	setBounds(100, 100, 400, 600);
	contentPane = new JPanel();
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
	
	JLabel lblPatientData = new JLabel("Patient Data");
	lblPatientData.setBounds(119, 16, 112, 25);
	lblPatientData.setFont(new Font("Calibri Light", Font.PLAIN, 20));
	
	JLabel lblName = new JLabel("Name:");
	lblName.setFont(new Font("Calibri Light", Font.PLAIN, 11));
	lblName.setBounds(10, 96, 36, 14);
	
	JLabel lblId = new JLabel("ID:");
	lblId.setFont(new Font("Calibri Light", Font.PLAIN, 11));
	lblId.setBounds(10, 61, 20, 14);
	
	JLabel lblConsultant = new JLabel("Consultant:");
	lblConsultant.setFont(new Font("Calibri Light", Font.PLAIN, 11));
	lblConsultant.setBounds(10, 130, 61, 14);
	
	JLabel lblAge = new JLabel("Age:");
	lblAge.setFont(new Font("Calibri Light", Font.PLAIN, 11));
	lblAge.setBounds(220, 61, 31, 14);
	
	JLabel lblGender = new JLabel("Gender:");
	lblGender.setFont(new Font("Calibri Light", Font.PLAIN, 11));
	lblGender.setBounds(220, 96, 44, 14);
	
	JLabel lblDate = new JLabel("Date:");
	lblDate.setFont(new Font("Calibri Light", Font.PLAIN, 11));
	lblDate.setBounds(220, 130, 44, 14);
	
	JLabel label = new JLabel("");
	label.setBounds(66, 58, 0, 0);
	
	txtID = new JTextField();
	txtID.setFont(new Font("Calibri", Font.PLAIN, 11));
	txtID.setBounds(81, 58, 119, 20);
	txtID.setEditable(false);
	txtID.setColumns(10);
	
	txtName = new JTextField();
	txtName.setFont(new Font("Calibri", Font.PLAIN, 11));
	txtName.setBounds(81, 93, 118, 20);
	txtName.setEditable(false);
	txtName.setColumns(10);
	
	txtConsultant = new JTextField();
	txtConsultant.setFont(new Font("Calibri", Font.PLAIN, 11));
	txtConsultant.setBounds(81, 127, 119, 20);
	txtConsultant.setEditable(false);
	txtConsultant.setColumns(10);
	
	txtAge = new JTextField();
	txtAge.setFont(new Font("Calibri", Font.PLAIN, 11));
	txtAge.setBounds(274, 58, 86, 20);
	txtAge.setEditable(false);
	txtAge.setColumns(10);
	
	txtGender = new JTextField();
	txtGender.setFont(new Font("Calibri", Font.PLAIN, 11));
	txtGender.setBounds(274, 93, 86, 20);
	txtGender.setEditable(false);
	txtGender.setColumns(10);
	
	txtDate = new JTextField();
	txtDate.setFont(new Font("Calibri", Font.PLAIN, 11));
	txtDate.setBounds(274, 127, 86, 20);
	txtDate.setEditable(false);
	txtDate.setColumns(10);
	contentPane.setLayout(null);
	
	JSeparator separator = new JSeparator();
	separator.setBounds(10, 170, 350, 0);
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
	lblTestDetails.setFont(new Font("Calibri Light", Font.PLAIN, 20));
	lblTestDetails.setBounds(119, 181, 116, 25);
	contentPane.add(lblTestDetails);
	
	JButton btnPrint = new JButton("Print");
	JButton btnCancel = new JButton("Cancel");
	
	btnPrint.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			btnPrint.setVisible(false);
			btnCancel.setVisible(false);
			txt1.setEditable(false);
			printComponenet();		
			dispose();
		}
	});
	btnPrint.setBounds(191, 513, 89, 23);
	contentPane.add(btnPrint);
	
	btnCancel.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			dispose();
		}
	});
	btnCancel.setBounds(285, 513, 89, 23);
	contentPane.add(btnCancel);
	
			
	SetPatientData();
	SetPanels();
	}
	
	void SetPatientData(){
		
		txtID.setText(String.valueOf(Patient.GetPatientID()));						
		txtName.setText(Patient.GetPatientName());
		txtConsultant.setText(Patient.GetConsultantName());
		txtAge.setText(String.valueOf(Patient.GetPatientAge()));			
		txtGender.setText(Patient.GetPatientGender());			
		SimpleDateFormat formatter;
		formatter = new SimpleDateFormat("dd/MM/yyyy");
		txtDate.setText(formatter.format(Patient.GetCheckupDate()));
	}
	
	void SetPanels(){
		
		JPanel pnlCBC = new JPanel();
		pnlCBC.setBounds(10, 208, 364, 278);
		contentPane.add(pnlCBC);
		
		JPanel pnlCalcium = new JPanel();
		contentPane.add(pnlCalcium);
		
		JLabel lblCalcium = new JLabel("calcium");
		pnlCalcium.add(lblCalcium);
		pnlCBC.setLayout(null);
		
		JLabel CBC = new JLabel("HBA1C");
		CBC.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		CBC.setBounds(10, 65, 46, 14);
		pnlCBC.add(CBC);			
		
		txt1 = new JTextField();
		txt1.setFont(new Font("Calibri", Font.PLAIN, 11));
		txt1.setBounds(90, 62, 86, 20);
		pnlCBC.add(txt1);
		txt1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("< 7.0 %");
		lblNewLabel.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblNewLabel.setBounds(253, 65, 86, 14);
		pnlCBC.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Test");
		lblNewLabel_1.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(10, 18, 46, 14);
		pnlCBC.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Result");
		lblNewLabel_2.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(90, 18, 46, 14);
		pnlCBC.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("N.Range");
		lblNewLabel_3.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(253, 18, 75, 14);
		pnlCBC.add(lblNewLabel_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 43, 344, 11);
		pnlCBC.add(separator);
	}

	public void printComponenet(){
		
//		PrinterJob pjob = PrinterJob.getPrinterJob();
//		PageFormat preformat = pjob.defaultPage();
//		preformat.setOrientation(PageFormat.PORTRAIT);
//		PageFormat postformat = pjob.pageDialog(preformat);
//		//If user does not hit cancel then print.
//		if (preformat != postformat) {
//		    //Set print component
//		    pjob.setPrintable(new Printer(contentPane), postformat);
//		    if (pjob.printDialog()) {
//		        try {
//					pjob.print();
//				} catch (PrinterException e) {
//					e.printStackTrace();
//				}
//		    }
//		}
     		
		  PrinterJob pj = PrinterJob.getPrinterJob();
		  pj.setJobName(" Print Component ");

		  pj.setPrintable (new Printable() {    
		    public int print(Graphics pg, PageFormat pf, int pageNum){
		      if (pageNum > 0){
		      return Printable.NO_SUCH_PAGE;
		      }

		      Graphics2D g2 = (Graphics2D) pg;
		      g2.translate(pf.getImageableX(), pf.getImageableY());
		      contentPane.paint(g2);
		      return Printable.PAGE_EXISTS;
		    }
		  });
		  if (pj.printDialog() == false)
		  return;

		  try {
		        pj.print();
		  } catch (PrinterException ex) {
		        // handle exception
		  }
		}
}
