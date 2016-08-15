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
import java.awt.Color;

public class dCBC extends JDialog {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtName;
	private JTextField txtConsultant;
	private JTextField txtAge;
	private JTextField txtGender;
	private JTextField txtDate;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;

	
	public dCBC() {
		setTitle("Test Details");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 850);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblPatientData = new JLabel("Patient Data");
		lblPatientData.setBounds(119, 16, 112, 25);
		lblPatientData.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblName.setBounds(10, 99, 36, 14);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblId.setBounds(10, 61, 20, 14);
		
		JLabel lblConsultant = new JLabel("Consultant:");
		lblConsultant.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblConsultant.setBounds(10, 130, 61, 14);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblAge.setBounds(229, 61, 31, 14);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblGender.setBounds(229, 92, 47, 14);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Calibri Light", Font.PLAIN, 11));
		lblDate.setBounds(229, 130, 35, 14);
		
		JLabel label = new JLabel("");
		label.setBounds(66, 58, 0, 0);
		
		txtID = new JTextField();
		txtID.setFont(new Font("Calibri", Font.PLAIN, 11));
		txtID.setBounds(84, 58, 119, 20);
		txtID.setEditable(false);
		txtID.setColumns(10);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Calibri", Font.PLAIN, 11));
		txtName.setBounds(84, 96, 118, 20);
		txtName.setEditable(false);
		txtName.setColumns(10);
		
		txtConsultant = new JTextField();
		txtConsultant.setFont(new Font("Calibri", Font.PLAIN, 11));
		txtConsultant.setBounds(84, 127, 119, 20);
		txtConsultant.setEditable(false);
		txtConsultant.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("Calibri", Font.PLAIN, 11));
		txtAge.setBounds(278, 58, 86, 20);
		txtAge.setEditable(false);
		txtAge.setColumns(10);
		
		txtGender = new JTextField();
		txtGender.setFont(new Font("Calibri", Font.PLAIN, 11));
		txtGender.setBounds(280, 89, 86, 20);
		txtGender.setEditable(false);
		txtGender.setColumns(10);
		
		txtDate = new JTextField();
		txtDate.setBounds(282, 127, 86, 20);
		txtDate.setEditable(false);
		txtDate.setColumns(10);
		contentPane.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 165, 463, 0);
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
				
				textField.setEditable(false);
				textField_1.setEditable(false);
				textField_2.setEditable(false);
				textField_3.setEditable(false);
				textField_4.setEditable(false);
				textField_5.setEditable(false);
				textField_6.setEditable(false);
				textField_7.setEditable(false);
				textField_8.setEditable(false);
				textField_9.setEditable(false);
				textField_10.setEditable(false);
				textField_11.setEditable(false);
				textField_12.setEditable(false);
				textField_13.setEditable(false);
				textField_14.setEditable(false);
				textField_15.setEditable(false);
				textField_16.setEditable(false);
				textField_17.setEditable(false);				
				
				contentPane.setBounds(100, 100, 500, 700);
				
				printComponenet();		
				dispose();
				
			}
		});
		btnPrint.setBounds(280, 781, 89, 23);
		contentPane.add(btnPrint);
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnCancel.setBounds(384, 781, 89, 23);
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
			pnlCBC.setBounds(10, 208, 464, 550);
			contentPane.add(pnlCBC);
			
			JPanel pnlCalcium = new JPanel();
			contentPane.add(pnlCalcium);
			
			JLabel lblCalcium = new JLabel("calcium");
			pnlCalcium.add(lblCalcium);
			pnlCBC.setLayout(null);
			
			JLabel CBC = new JLabel("Test");
			CBC.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			CBC.setBounds(10, 11, 51, 14);
			pnlCBC.add(CBC);			
			
			JLabel lblNewLabel = new JLabel("Result");
			lblNewLabel.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblNewLabel.setBounds(122, 11, 46, 14);
			pnlCBC.add(lblNewLabel);
			
			JLabel lblNrange = new JLabel("N.Range");
			lblNrange.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblNrange.setBounds(264, 11, 85, 14);
			pnlCBC.add(lblNrange);
			
			JSeparator separator = new JSeparator();
			separator.setBounds(10, 36, 433, 2);
			pnlCBC.add(separator);
			
			JLabel lblNewLabel_1 = new JLabel("Hb");
			lblNewLabel_1.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblNewLabel_1.setBounds(10, 49, 46, 14);
			pnlCBC.add(lblNewLabel_1);
			
			JLabel lblWbc = new JLabel("WBC");
			lblWbc.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblWbc.setBounds(10, 74, 46, 14);
			pnlCBC.add(lblWbc);
			
			JLabel lblRbc = new JLabel("RBC");
			lblRbc.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblRbc.setBounds(10, 99, 46, 14);
			pnlCBC.add(lblRbc);
			
			JLabel lblPlatelets = new JLabel("Platelets");
			lblPlatelets.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblPlatelets.setBounds(10, 124, 74, 14);
			pnlCBC.add(lblPlatelets);
			
			JLabel lblHct = new JLabel("HCT");
			lblHct.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblHct.setBounds(10, 149, 46, 14);
			pnlCBC.add(lblHct);
			
			JLabel lblNewLabel_2 = new JLabel("MCV");
			lblNewLabel_2.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblNewLabel_2.setBounds(10, 174, 46, 14);
			pnlCBC.add(lblNewLabel_2);
			
			JLabel lblMch = new JLabel("MCH");
			lblMch.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblMch.setBounds(10, 199, 46, 14);
			pnlCBC.add(lblMch);
			
			JLabel lblMchc = new JLabel("MCHC");
			lblMchc.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblMchc.setBounds(10, 224, 46, 14);
			pnlCBC.add(lblMchc);
			
			JLabel lblRdw = new JLabel("RDW");
			lblRdw.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblRdw.setBounds(10, 249, 46, 14);
			pnlCBC.add(lblRdw);
			
			JLabel lblDifferntialCounts = new JLabel("Differntial Counts");
			lblDifferntialCounts.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblDifferntialCounts.setBounds(68, 277, 184, 14);
			pnlCBC.add(lblDifferntialCounts);
			
			JLabel lblNewLabel_3 = new JLabel("Neutrophils");
			lblNewLabel_3.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblNewLabel_3.setBounds(10, 324, 74, 14);
			pnlCBC.add(lblNewLabel_3);
			
			JLabel lblLymphocytes = new JLabel("Lymphocytes");
			lblLymphocytes.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblLymphocytes.setBounds(10, 349, 94, 14);
			pnlCBC.add(lblLymphocytes);
			
			JLabel lblMonocytes = new JLabel("Monocytes");
			lblMonocytes.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblMonocytes.setBounds(10, 375, 74, 14);
			pnlCBC.add(lblMonocytes);
			
			JLabel lblEosinophils = new JLabel("Eosinophils");
			lblEosinophils.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblEosinophils.setBounds(10, 400, 74, 14);
			pnlCBC.add(lblEosinophils);
			
			JLabel lblBands = new JLabel("Bands");
			lblBands.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblBands.setBounds(10, 425, 74, 14);
			pnlCBC.add(lblBands);
			
			JLabel lblMetamyelocytes = new JLabel("Metamyelocytes");
			lblMetamyelocytes.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblMetamyelocytes.setBounds(10, 450, 94, 14);
			pnlCBC.add(lblMetamyelocytes);
			
			JLabel lblMyelocytes = new JLabel("Myelocytes");
			lblMyelocytes.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblMyelocytes.setBounds(10, 475, 74, 14);
			pnlCBC.add(lblMyelocytes);
			
			JLabel lblPromyelocytes = new JLabel("Promyelocytes");
			lblPromyelocytes.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblPromyelocytes.setBounds(10, 500, 94, 14);
			pnlCBC.add(lblPromyelocytes);
			
			JLabel lblBlasts = new JLabel("Blasts");
			lblBlasts.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblBlasts.setBounds(10, 525, 46, 14);
			pnlCBC.add(lblBlasts);
			
			textField = new JTextField();
			textField.setFont(new Font("Calibri", Font.PLAIN, 11));
			textField.setBounds(122, 46, 86, 20);
			pnlCBC.add(textField);
			textField.setColumns(10);
			
			textField_1 = new JTextField();
			textField_1.setFont(new Font("Calibri", Font.PLAIN, 11));
			textField_1.setBounds(122, 71, 86, 20);
			pnlCBC.add(textField_1);
			textField_1.setColumns(10);
			
			textField_2 = new JTextField();
			textField_2.setFont(new Font("Calibri", Font.PLAIN, 11));
			textField_2.setBounds(122, 96, 86, 20);
			pnlCBC.add(textField_2);
			textField_2.setColumns(10);
			
			textField_3 = new JTextField();
			textField_3.setFont(new Font("Calibri", Font.PLAIN, 11));
			textField_3.setBounds(122, 121, 86, 20);
			pnlCBC.add(textField_3);
			textField_3.setColumns(10);
			
			textField_4 = new JTextField();
			textField_4.setFont(new Font("Calibri", Font.PLAIN, 11));
			textField_4.setBounds(122, 146, 86, 20);
			pnlCBC.add(textField_4);
			textField_4.setColumns(10);
			
			textField_5 = new JTextField();
			textField_5.setFont(new Font("Calibri", Font.PLAIN, 11));
			textField_5.setBounds(122, 171, 86, 20);
			pnlCBC.add(textField_5);
			textField_5.setColumns(10);
			
			textField_6 = new JTextField();
			textField_6.setFont(new Font("Calibri", Font.PLAIN, 11));
			textField_6.setBounds(122, 196, 86, 20);
			pnlCBC.add(textField_6);
			textField_6.setColumns(10);
			
			textField_7 = new JTextField();
			textField_7.setFont(new Font("Calibri", Font.PLAIN, 11));
			textField_7.setBounds(122, 221, 86, 20);
			pnlCBC.add(textField_7);
			textField_7.setColumns(10);
			
			textField_8 = new JTextField();
			textField_8.setFont(new Font("Calibri", Font.PLAIN, 11));
			textField_8.setBounds(122, 246, 86, 20);
			pnlCBC.add(textField_8);
			textField_8.setColumns(10);
			
			textField_9 = new JTextField();
			textField_9.setFont(new Font("Calibri", Font.PLAIN, 11));
			textField_9.setBounds(122, 321, 86, 20);
			pnlCBC.add(textField_9);
			textField_9.setColumns(10);
			
			textField_10 = new JTextField();
			textField_10.setFont(new Font("Calibri", Font.PLAIN, 11));
			textField_10.setBounds(122, 346, 86, 20);
			pnlCBC.add(textField_10);
			textField_10.setColumns(10);
			
			textField_11 = new JTextField();
			textField_11.setFont(new Font("Calibri", Font.PLAIN, 11));
			textField_11.setBounds(122, 372, 86, 20);
			pnlCBC.add(textField_11);
			textField_11.setColumns(10);
			
			textField_12 = new JTextField();
			textField_12.setFont(new Font("Calibri", Font.PLAIN, 11));
			textField_12.setBounds(122, 397, 86, 20);
			pnlCBC.add(textField_12);
			textField_12.setColumns(10);
			
			textField_13 = new JTextField();
			textField_13.setFont(new Font("Calibri", Font.PLAIN, 11));
			textField_13.setBounds(122, 422, 86, 20);
			pnlCBC.add(textField_13);
			textField_13.setColumns(10);
			
			textField_14 = new JTextField();
			textField_14.setFont(new Font("Calibri", Font.PLAIN, 11));
			textField_14.setBounds(122, 447, 86, 20);
			pnlCBC.add(textField_14);
			textField_14.setColumns(10);
			
			textField_15 = new JTextField();
			textField_15.setFont(new Font("Calibri", Font.PLAIN, 11));
			textField_15.setBounds(122, 472, 86, 20);
			pnlCBC.add(textField_15);
			textField_15.setColumns(10);
			
			textField_16 = new JTextField();
			textField_16.setFont(new Font("Calibri", Font.PLAIN, 11));
			textField_16.setBounds(122, 497, 86, 20);
			pnlCBC.add(textField_16);
			textField_16.setColumns(10);
			
			textField_17 = new JTextField();
			textField_17.setFont(new Font("Calibri", Font.PLAIN, 11));
			textField_17.setBounds(122, 522, 86, 20);
			pnlCBC.add(textField_17);
			textField_17.setColumns(10);
			
			JLabel lblF = new JLabel("F .10.5 \u2013 13.5  M .12.5 \u2013 16.0 g/dl");
			lblF.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblF.setBounds(264, 49, 179, 14);
			pnlCBC.add(lblF);
			
			JLabel lblNewLabel_4 = new JLabel("4.0 \u2013 10.0 \u00D7 10^9/L");
			lblNewLabel_4.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblNewLabel_4.setBounds(264, 74, 166, 14);
			pnlCBC.add(lblNewLabel_4);
			
			JLabel lblF_1 = new JLabel("F. 4.2 \u2013 5.4 , M  4.5 \u2013 6.3 \u00D7 10^12/L");
			lblF_1.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblF_1.setBounds(264, 99, 200, 14);
			pnlCBC.add(lblF_1);
			
			JLabel label = new JLabel("150 \u2013 450 \u00D7 10^9/l");
			label.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			label.setBounds(264, 124, 166, 14);
			pnlCBC.add(label);
			
			JLabel lblF_2 = new JLabel("F.36 \u2013 46 ,M 39 \u2013 52 L/L");
			lblF_2.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			lblF_2.setBounds(264, 149, 166, 14);
			pnlCBC.add(lblF_2);
			
			JLabel label_1 = new JLabel("76 \u2013 96 fl/cell");
			label_1.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			label_1.setBounds(264, 174, 109, 14);
			pnlCBC.add(label_1);
			
			JLabel label_2 = new JLabel("28 \u2013 32 pg/cell");
			label_2.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			label_2.setBounds(264, 199, 85, 14);
			pnlCBC.add(label_2);
			
			JLabel label_3 = new JLabel("30 \u2013 35 g/dl");
			label_3.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			label_3.setBounds(264, 224, 85, 14);
			pnlCBC.add(label_3);
			
			JLabel label_4 = new JLabel("%");
			label_4.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			label_4.setBounds(264, 249, 46, 14);
			pnlCBC.add(label_4);
			
			JLabel label_5 = new JLabel("40 \u2013 70 %");
			label_5.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			label_5.setBounds(264, 324, 85, 14);
			pnlCBC.add(label_5);
			
			JLabel label_6 = new JLabel("20 \u2013 45 %");
			label_6.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			label_6.setBounds(264, 349, 109, 14);
			pnlCBC.add(label_6);
			
			JLabel label_7 = new JLabel("2 \u2013 8 %");
			label_7.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			label_7.setBounds(264, 375, 74, 14);
			pnlCBC.add(label_7);
			
			JLabel label_8 = new JLabel("1 \u2013 6 %");
			label_8.setFont(new Font("Calibri Light", Font.PLAIN, 11));
			label_8.setBounds(264, 400, 85, 14);
			pnlCBC.add(label_8);
		}
	
		public void printComponenet(){			   		
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
			  }
			}
	}
