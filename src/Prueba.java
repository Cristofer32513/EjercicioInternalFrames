import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;

@SuppressWarnings("serial")
class VentanaPrincipal extends JFrame {
	
	
	public VentanaPrincipal() {
		//Configuracion de la ventana
		getContentPane().setLayout(new BorderLayout());
		setTitle("Lab Master - Test Booking");
		setSize(1350, 750);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		//Componentes
		JMenuBar menuBar=new JMenuBar();
			
			JMenu menuMasters=new JMenu("Masters");
			menuBar.add(menuMasters);
			
			
			JMenu menuBooking=new JMenu("Booking");
			menuBar.add(menuBooking);
			
			
			JMenu menuTestPerform=new JMenu("Test Perform");
			menuBar.add(menuTestPerform);
			
			
			JMenu menuPrinting=new JMenu("Printing");
			menuBar.add(menuPrinting);
			
			
			JMenu menuTransaction=new JMenu("Transaction");
			menuBar.add(menuTransaction);
			
			
			JMenu menuLastReports=new JMenu("Last Reports");
			menuBar.add(menuLastReports);
			
			
			JMenu menuSetting=new JMenu("Setting");
			menuBar.add(menuSetting);
			
			
			JMenu menuUtilities=new JMenu("Utilities");
			menuBar.add(menuUtilities);
			
			
			JMenu menuWindow=new JMenu("Window");
			menuBar.add(menuWindow);
			
			
			JMenu menuHelp=new JMenu("Help");
			menuBar.add(menuHelp);
			
		setJMenuBar(menuBar);
		
		
		
		JToolBar toolBar=new JToolBar();
		
			JButton btnAdd=new JButton("Add");
				ImageIcon add=new ImageIcon("./Imagenes/Add.png");
				ImageIcon addRed=new ImageIcon(add.getImage().getScaledInstance(42, 42, Image.SCALE_REPLICATE));
				btnAdd.setIcon(addRed);
				btnAdd.setHorizontalTextPosition( SwingConstants.CENTER );
				btnAdd.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnAdd);
			
			
			JButton btnEdit=new JButton("Edit");
				ImageIcon edit=new ImageIcon("./Imagenes/Edit.png");
				ImageIcon editRed=new ImageIcon(edit.getImage().getScaledInstance(42, 42, Image.SCALE_REPLICATE));
				btnEdit.setIcon(editRed);
				btnEdit.setHorizontalTextPosition( SwingConstants.CENTER );
				btnEdit.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnEdit);
			
			
			JButton btnBack=new JButton("Back");
				ImageIcon back=new ImageIcon("./Imagenes/Back.png");
				ImageIcon backRed=new ImageIcon(back.getImage().getScaledInstance(42, 42, Image.SCALE_REPLICATE));
				btnBack.setIcon(backRed);
				btnBack.setHorizontalTextPosition( SwingConstants.CENTER );
				btnBack.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnBack);
			
			
			JButton btnNext=new JButton("Next");
				ImageIcon next=new ImageIcon("./Imagenes/Next.png");
				ImageIcon nextRed=new ImageIcon(next.getImage().getScaledInstance(42, 42, Image.SCALE_REPLICATE));
				btnNext.setIcon(nextRed);
				btnNext.setHorizontalTextPosition( SwingConstants.CENTER );
				btnNext.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnNext);
			
			
			JButton btnList=new JButton("List");
				ImageIcon list=new ImageIcon("./Imagenes/List.png");
				ImageIcon listRed=new ImageIcon(list.getImage().getScaledInstance(42, 42, Image.SCALE_REPLICATE));
				btnList.setIcon(listRed);
				btnList.setHorizontalTextPosition( SwingConstants.CENTER );
				btnList.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnList);
			
			
			JButton btnSave=new JButton("Save");
				ImageIcon save=new ImageIcon("./Imagenes/Save.png");
				ImageIcon saveRed=new ImageIcon(save.getImage().getScaledInstance(42, 42, Image.SCALE_REPLICATE));
				btnSave.setIcon(saveRed);
				btnSave.setHorizontalTextPosition( SwingConstants.CENTER );
				btnSave.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnSave);
		
			
			JButton btnPrint=new JButton("Print");
				ImageIcon print=new ImageIcon("./Imagenes/Print.png");
				ImageIcon printRed=new ImageIcon(print.getImage().getScaledInstance(42, 42, Image.SCALE_REPLICATE));
				btnPrint.setIcon(printRed);
				btnPrint.setHorizontalTextPosition( SwingConstants.CENTER );
				btnPrint.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnPrint);
			
			
			JButton btnIest=new JButton("Iest");
				ImageIcon iest=new ImageIcon("./Imagenes/Iest.png");
				ImageIcon iestRed=new ImageIcon(iest.getImage().getScaledInstance(42, 42, Image.SCALE_REPLICATE));
				btnIest.setIcon(iestRed);
				btnIest.setHorizontalTextPosition( SwingConstants.CENTER );
				btnIest.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnIest);
			
			
			JButton btnCancel=new JButton("Cancel");
				ImageIcon cancel=new ImageIcon("./Imagenes/Cancel.png");
				ImageIcon cancelRed=new ImageIcon(cancel.getImage().getScaledInstance(42, 42, Image.SCALE_REPLICATE));
				btnCancel.setIcon(cancelRed);
				btnCancel.setHorizontalTextPosition( SwingConstants.CENTER );
				btnCancel.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnCancel);
			
			
			JButton btnSettings=new JButton("Settings");
				ImageIcon settings=new ImageIcon("./Imagenes/Settings.png");
				ImageIcon settingsRed=new ImageIcon(settings.getImage().getScaledInstance(42, 42, Image.SCALE_REPLICATE));
				btnSettings.setIcon(settingsRed);
				btnSettings.setHorizontalTextPosition( SwingConstants.CENTER );
				btnSettings.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnSettings);
		
			
			JButton btnDelete=new JButton("Delete");
				ImageIcon delete=new ImageIcon("./Imagenes/Delete.png");
				ImageIcon deleteRed=new ImageIcon(delete.getImage().getScaledInstance(42, 42, Image.SCALE_REPLICATE));
				btnDelete.setIcon(deleteRed);
				btnDelete.setHorizontalTextPosition( SwingConstants.CENTER );
				btnDelete.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnDelete);
			
			
			JButton btnSlip=new JButton("Slip");
				ImageIcon slip=new ImageIcon("./Imagenes/Slip.png");
				ImageIcon slipRed=new ImageIcon(slip.getImage().getScaledInstance(42, 42, Image.SCALE_REPLICATE));
				btnSlip.setIcon(slipRed);
				btnSlip.setHorizontalTextPosition( SwingConstants.CENTER );
				btnSlip.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnSlip);
			
			
			JButton btnExit=new JButton("Exit");
				ImageIcon exit=new ImageIcon("./Imagenes/Exit.png");
				ImageIcon exitRed=new ImageIcon(exit.getImage().getScaledInstance(42, 42, Image.SCALE_REPLICATE));
				btnExit.setIcon(exitRed);
				btnExit.setHorizontalTextPosition( SwingConstants.CENTER );
				btnExit.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnExit);
		
		add(toolBar, BorderLayout.PAGE_START);
		
		
		
		JDesktopPane desktopPane=new JDesktopPane();
		
			JInternalFrame internalFrame=new JInternalFrame("Datos");
			internalFrame.getContentPane().setLayout(null);
			internalFrame.setDefaultCloseOperation(HIDE_ON_CLOSE);
			internalFrame.setSize(1344, 631);
			internalFrame.setVisible(true);
			
						
			JPanel panel1=new JPanel(null);
			
				panel1.setBackground(new Color(237, 237, 237));
				panel1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
				panel1.setBounds(0, 0, 1340, 200);
				
								
				JLabel lblPatientID=new JLabel("Patient ID");
					lblPatientID.setBounds(10, 10, 80, 20);
					lblPatientID.setFont(new Font("Arial", 1, 12));
				panel1.add(lblPatientID);
				
				JTextField txtFPatientID=new JTextField();
					txtFPatientID.setBounds(90, 10, 80, 20);
					txtFPatientID.setFont(new Font("Arial", 1, 12));
				panel1.add(txtFPatientID);
				
				
				JLabel lblDato=new JLabel("Dato");
					lblDato.setBounds(230, 10, 50, 20);
					lblDato.setFont(new Font("Arial", 1, 12));
				panel1.add(lblDato);
				
				Calendar cal=Calendar.getInstance();
				Date now=cal.getTime();
				cal.add(Calendar.YEAR, -50);
				Date startDate = cal.getTime();
				cal.add(Calendar.YEAR, 100);
				Date endDate = cal.getTime();
				SpinnerModel modelDate = new SpinnerDateModel(now, startDate, endDate, Calendar.YEAR);
				JSpinner spinnerFechaNac = new JSpinner(modelDate);
				spinnerFechaNac.setBounds(280, 10, 100, 20);
				   				
				panel1.add(spinnerFechaNac);

											
				JLabel lblName=new JLabel("Name");
					lblName.setBounds(10, 40, 80, 20);
					lblName.setFont(new Font("Arial", 1, 12));
				panel1.add(lblName);
				
				JComboBox<String> comboName=new JComboBox<String>();
					comboName.addItem("Mr.");
					comboName.addItem("Ms.");
					comboName.setBounds(90, 40, 55, 20);
					comboName.setFont(new Font("Arial", 1, 12));
				panel1.add(comboName);
				
				JTextField txtFName=new JTextField();
					txtFName.setBounds(155, 40, 200, 20);
					txtFName.setFont(new Font("Arial", 1, 12));
				panel1.add(txtFName);
				
				
				JLabel lblSex=new JLabel("Sex");
					lblSex.setBounds(10, 70, 80, 20);
					lblSex.setFont(new Font("Arial", 1, 12));
				panel1.add(lblSex);
				
				JComboBox<String> comboSex=new JComboBox<String>();
					comboSex.addItem("Male");
					comboName.addItem("Female");
					comboSex.setBounds(90, 70, 55, 20);
					comboSex.setFont(new Font("Arial", 1, 12));
				panel1.add(comboSex);
				
								
				JLabel lblAge=new JLabel("Age");
					lblAge.setBounds(155, 70, 30, 20);
					lblAge.setFont(new Font("Arial", 1, 12));
				panel1.add(lblAge);
				
				JTextField txtFAge=new JTextField("0");
					txtFAge.setBounds(180, 70, 30, 20);
					txtFAge.setFont(new Font("Arial", 1, 12));
					txtFAge.setHorizontalAlignment(JTextField.RIGHT);
				panel1.add(txtFAge);
			
				
				JLabel lblMons=new JLabel("Mons");
					lblMons.setBounds(220, 70, 40, 20);
					lblMons.setFont(new Font("Arial", 1, 12));
				panel1.add(lblMons);
				
				JTextField txtFMons=new JTextField("0");
					txtFMons.setBounds(253, 70, 30, 20);
					txtFMons.setFont(new Font("Arial", 1, 12));
					txtFMons.setHorizontalAlignment(JTextField.RIGHT);
				panel1.add(txtFMons);
				
				
				JLabel lblDays=new JLabel("Days");
					lblDays.setBounds(295, 70, 40, 20);
					lblDays.setFont(new Font("Arial", 1, 12));
				panel1.add(lblDays);
				
				JTextField txtFDays=new JTextField("0");
					txtFDays.setBounds(325, 70, 30, 20);
					txtFDays.setFont(new Font("Arial", 1, 12));
					txtFDays.setHorizontalAlignment(JTextField.RIGHT);
				panel1.add(txtFDays);
				
							
				JLabel lblReferedBy=new JLabel("Referred By:");
					lblReferedBy.setBounds(10, 100, 80, 20);
					lblReferedBy.setFont(new Font("Arial", 1, 12));
				panel1.add(lblReferedBy);
				
				JTextField txtFReferredBy=new JTextField();
					txtFReferredBy.setBounds(90, 100, 90, 20);
					txtFReferredBy.setFont(new Font("Arial", 1, 12));
				panel1.add(txtFReferredBy);
				
				JButton btnReferredBy=new JButton();
					ImageIcon referredBy=new ImageIcon("./Imagenes/Calendario.png");
					ImageIcon referredByRed=new ImageIcon(referredBy.getImage().getScaledInstance(20, 20, Image.SCALE_REPLICATE));
					btnReferredBy.setIcon(referredByRed);
					btnReferredBy.setBounds(180, 100, 20, 20);
				panel1.add(btnReferredBy);
				
				JTextField txtFReferredBy2=new JTextField();
					txtFReferredBy2.setBounds(208, 100, 147, 20);
					txtFReferredBy2.setFont(new Font("Arial", 1, 12));
				panel1.add(txtFReferredBy2);
				
				
				JLabel lblTime=new JLabel("*Time (hh:mm)");
					lblTime.setBounds(390, 10, 100, 20);
					lblTime.setFont(new Font("Arial", 1, 12));
				panel1.add(lblTime);
				
				JTextField txtFHH=new JTextField();
					txtFHH.setBounds(480, 10, 30, 20);
					txtFHH.setFont(new Font("Arial", 1, 12));
				panel1.add(txtFHH);
				
				JLabel lblSeparador=new JLabel(":");
					lblSeparador.setBounds(520, 10, 20, 20);
					lblSeparador.setFont(new Font("Arial", 1, 12));
				panel1.add(lblSeparador);
				
				JTextField txtFMM=new JTextField();
					txtFMM.setBounds(532, 10, 30, 20);
					txtFMM.setFont(new Font("Arial", 1, 12));
				panel1.add(txtFMM);
			
							
				JLabel lblLabNo=new JLabel("Lab No");
					lblLabNo.setBounds(580, 10, 80, 20);
					lblLabNo.setFont(new Font("Arial", 1, 12));
				panel1.add(lblLabNo);
				
				JTextField txtFLabNo=new JTextField();
					txtFLabNo.setBounds(630, 10, 100, 20);
					txtFLabNo.setFont(new Font("Arial", 1, 12));
				panel1.add(txtFLabNo);
				
				
				JLabel lblSampleBy=new JLabel("Sample By");
					lblSampleBy.setBounds(370, 70, 80, 20);
					lblSampleBy.setFont(new Font("Arial", 1, 12));
				panel1.add(lblSampleBy);
				
				JTextField txtFSampleBy=new JTextField();
					txtFSampleBy.setBounds(450, 70, 100, 20);
					txtFSampleBy.setFont(new Font("Arial", 1, 12));
				panel1.add(txtFSampleBy);
				
				JButton btnSampleBy=new JButton();
					ImageIcon sampleBy=new ImageIcon("./Imagenes/Calendario.png");
					ImageIcon sampleByRed=new ImageIcon(sampleBy.getImage().getScaledInstance(20, 20, Image.SCALE_REPLICATE));
					btnSampleBy.setIcon(sampleByRed);
					btnSampleBy.setBounds(550, 70, 20, 20);
				panel1.add(btnSampleBy);
			
			
				JLabel lblPanelCode=new JLabel("Panel Code");
					lblPanelCode.setBounds(370, 100, 80, 20);
					lblPanelCode.setFont(new Font("Arial", 1, 12));
				panel1.add(lblPanelCode);
						
				JTextField txtFPanalCode=new JTextField();
					txtFPanalCode.setBounds(450, 100, 100, 20);
					txtFPanalCode.setFont(new Font("Arial", 1, 12));
				panel1.add(txtFPanalCode);
				
				JButton btnPanelCode=new JButton();
					ImageIcon panelCode=new ImageIcon("./Imagenes/Calendario.png");
					ImageIcon panelCodeRed=new ImageIcon(panelCode.getImage().getScaledInstance(20, 20, Image.SCALE_REPLICATE));
					btnPanelCode.setIcon(panelCodeRed);
					btnPanelCode.setBounds(550, 100, 20, 20);
				panel1.add(btnPanelCode);
			
				
				JLabel lblPanelID=new JLabel("Panel ID");
					lblPanelID.setBounds(370, 130, 80, 20);
					lblPanelID.setFont(new Font("Arial", 1, 12));
				panel1.add(lblPanelID);
				
				JTextField txtFPanalID=new JTextField();
					txtFPanalID.setBounds(450, 130, 100, 20);
					txtFPanalID.setFont(new Font("Arial", 1, 12));
				panel1.add(txtFPanalID);
			
			
				JLabel lblEmail=new JLabel("e-mail");
					lblEmail.setBounds(370, 160, 80, 20);
					lblEmail.setFont(new Font("Arial", 1, 12));
				panel1.add(lblEmail);
				
				JTextField txtFEmail=new JTextField();
					txtFEmail.setBounds(450, 160, 100, 20);
					txtFEmail.setFont(new Font("Arial", 1, 12));
				panel1.add(txtFEmail);
						
			internalFrame.add(panel1);
			
			
			
			JPanel panel2=new JPanel(null);
			
				panel2.setBackground(new Color(237, 237, 237));
				panel2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
				panel2.setBounds(0, 200, 800, 300);
				
									
					JTable tabla=new JTable(2,7);
					tabla.setBounds(0, 0, 800, 50);
					tabla.setValueAt("Test ID", 0, 0);
					tabla.setValueAt("Test Name", 0, 1);
					tabla.setValueAt("Rate", 0, 2);
					tabla.setValueAt("Disc %", 0, 3);
					tabla.setValueAt("Disconunt Amound", 0, 4);
					tabla.setValueAt("Tax(%)", 0, 5);
					tabla.setValueAt("Tax Amt", 0, 6);
				
				panel2.add(tabla);

			internalFrame.add(panel2);
			
			
	
			JPanel panel3=new JPanel(null);
			
				panel3.setBackground(new Color(186, 186, 186));
				panel3.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
				panel3.setBounds(800, 200, 527, 300);
				
				
				JLabel lblTotalIess=new JLabel("Total Iess");
					lblTotalIess.setBounds(30, 20, 80, 20);
					lblTotalIess.setFont(new Font("Arial", 1, 12));
				panel3.add(lblTotalIess);
				
				JTextField txtFTotalIess=new JTextField();
					txtFTotalIess.setBounds(150, 20, 100, 20);
					txtFTotalIess.setBackground(new Color(0, 0, 255));
					txtFTotalIess.setFont(new Font("Arial", 1, 12));
				panel3.add(txtFTotalIess);
				
				
				JLabel lblIessAmt=new JLabel("Iess Amt.");
					lblIessAmt.setBounds(30, 50, 80, 20);
					lblIessAmt.setFont(new Font("Arial", 1, 12));
				panel3.add(lblIessAmt);
				
				JTextField txtFIessAmt=new JTextField();
					txtFIessAmt.setBounds(150, 50, 100, 20);
					txtFIessAmt.setBackground(new Color(0, 0, 255));
					txtFIessAmt.setFont(new Font("Arial", 1, 12));
				panel3.add(txtFIessAmt);
				
				
				JLabel lblConcession=new JLabel("Concession");
					lblConcession.setBounds(30, 80, 80, 20);
					lblConcession.setFont(new Font("Arial", 1, 12));
				panel3.add(lblConcession);
				
				JTextField txtFConcession=new JTextField();
					txtFConcession.setBounds(150, 80, 100, 20);
					txtFConcession.setBackground(new Color(0, 0, 255));
					txtFConcession.setFont(new Font("Arial", 1, 12));
				panel3.add(txtFConcession);
				
				
				JLabel lblHomeColection=new JLabel("Home Colection");
					lblHomeColection.setBounds(30, 110, 100, 20);
					lblHomeColection.setFont(new Font("Arial", 1, 12));
				panel3.add(lblHomeColection);
				
				JTextField txtFHomeColection=new JTextField();
					txtFHomeColection.setBounds(150, 110, 100, 20);
					txtFHomeColection.setBackground(new Color(0, 0, 255));
					txtFHomeColection.setFont(new Font("Arial", 1, 12));
				panel3.add(txtFHomeColection);
				
				
				JLabel lblIaxAmt=new JLabel("Iax Amt");
					lblIaxAmt.setBounds(30, 140, 80, 20);
					lblIaxAmt.setFont(new Font("Arial", 1, 12));
				panel3.add(lblIaxAmt);
				
				JTextField txtFIaxAmt=new JTextField();
					txtFIaxAmt.setBounds(150, 140, 100, 20);
					txtFIaxAmt.setBackground(new Color(0, 0, 255));
					txtFIaxAmt.setFont(new Font("Arial", 1, 12));
				panel3.add(txtFIaxAmt);
				
				
				JLabel lblNetAmt=new JLabel("Net Amt");
					lblNetAmt.setBounds(30, 170, 80, 20);
					lblNetAmt.setFont(new Font("Arial", 1, 12));
				panel3.add(lblNetAmt);
				
				JTextField txtFNetAmt=new JTextField();
					txtFNetAmt.setBounds(150, 170, 100, 20);
					txtFNetAmt.setBackground(new Color(0, 0, 255));
					txtFNetAmt.setFont(new Font("Arial", 1, 12));
				panel3.add(txtFNetAmt);
				
				
				JLabel lblBalance=new JLabel("Balance");
					lblBalance.setBounds(30, 200, 80, 20);
					lblBalance.setFont(new Font("Arial", 1, 12));
				panel3.add(lblBalance);
				
				JTextField txtFBalance=new JTextField();
					txtFBalance.setBounds(150, 200, 100, 20);
					txtFBalance.setBackground(new Color(0, 0, 255));
					txtFBalance.setFont(new Font("Arial", 1, 12));
				panel3.add(txtFBalance);
				
			internalFrame.add(panel3);
			
			
						
			JPanel panel4=new JPanel(null);
			
				panel4.setBackground(new Color(237, 237, 237));
				panel4.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
				panel4.setBounds(0, 500, 1340, 125);
			
				
				JLabel lblHomeCollection=new JLabel("Home Collection");
					lblHomeCollection.setBounds(10, 10, 100, 20);
					lblHomeCollection.setFont(new Font("Arial", 1, 12));
				panel4.add(lblHomeCollection);
				
				JTextField txtFHomeCollection=new JTextField();
					txtFHomeCollection.setBounds(110, 10, 60, 20);
					txtFHomeCollection.setFont(new Font("Arial", 1, 12));
				panel4.add(txtFHomeCollection);
				
				
				JLabel lblPaid=new JLabel("Paid");
					lblPaid.setBounds(200, 10, 80, 20);
					lblPaid.setFont(new Font("Arial", 1, 12));
				panel4.add(lblPaid);
				
				JTextField txtFPaid=new JTextField();
					txtFPaid.setBounds(230, 10, 60, 20);
					txtFPaid.setFont(new Font("Arial", 1, 12));
				panel4.add(txtFPaid);
				
				
				JLabel lblPayType=new JLabel("Pay Type");
					lblPayType.setBounds(320, 10, 80, 20);
					lblPayType.setFont(new Font("Arial", 1, 12));
				panel4.add(lblPayType);
				
				JComboBox<String> comboReceiptNo=new JComboBox<String>();
					comboReceiptNo.addItem("CASH");
					comboReceiptNo.addItem("TARJETA");
					comboReceiptNo.addItem("VALE");
					comboReceiptNo.setBounds(380, 10, 80, 20);
					comboReceiptNo.setFont(new Font("Arial", 1, 12));
				panel4.add(comboReceiptNo);
				
				
				JLabel lblReceiptNo=new JLabel("Receipt No.");
					lblReceiptNo.setBounds(500, 10, 80, 20);
					lblReceiptNo.setFont(new Font("Arial", 1, 12));
				panel4.add(lblReceiptNo);
				
				JTextField txtFReceiptNo=new JTextField();
					txtFReceiptNo.setBounds(570, 10, 100, 20);
					txtFReceiptNo.setFont(new Font("Arial", 1, 12));
				panel4.add(txtFReceiptNo);
				
				
				JTextArea txtAEtiqueta=new JTextArea();
					txtAEtiqueta.setText("F1:Select Iest  F2:Save Entry  F3:Preform Iest  F4:New Booking  F5:Payment Type  F6:Delete Entry  F7:Conc.  F8:Add Rew\n"
							+ "F9: Test Selected  F11:Print Recip  F12:Patient Details  Ctrl+F7:Payment Mode  Ctrl+F2:Show Concession  * Time in 24 Hours\n"
							+ "Format(Click on Time Label for more Information)     Value in this field is coming from the Masters.");
					txtAEtiqueta.setBounds(5, 50, 1324, 60);
					txtAEtiqueta.setEditable(false);
					txtAEtiqueta.setForeground(Color.WHITE);
					txtAEtiqueta.setBackground(Color.BLUE);
					txtAEtiqueta.setFont(new Font("Arial", 1, 14));
				panel4.add(txtAEtiqueta);
							
			internalFrame.add(panel4);
			
			desktopPane.add(internalFrame);
			
		add(desktopPane, BorderLayout.CENTER);
		
	}
}



public class Prueba {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaPrincipal();
			}
		});
	}
}