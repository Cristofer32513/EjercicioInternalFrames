import javax.swing.*;
import java.awt.*;

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
		
		
		
		JPanel panel1=new JPanel(null);
			
			panel1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
			panel1.setBounds(0, 70, 1344, 630);
			
			
			JPanel panel2=new JPanel(null);
				
				panel2.setBackground(new Color(240, 253, 255));
				panel2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
				panel2.setBounds(0, 0, 1340, 200);
				
								
				JLabel lblPatientID=new JLabel("Patient ID");
					lblPatientID.setBounds(10, 10, 80, 20);
					lblPatientID.setFont(new Font("Arial", 1, 12));
				panel2.add(lblPatientID);
				
				JTextField txtFPatientID=new JTextField();
					txtFPatientID.setBounds(90, 10, 80, 20);
					txtFPatientID.setFont(new Font("Arial", 1, 12));
				panel2.add(txtFPatientID);
				
				
				JLabel lblDato=new JLabel("Dato");
					lblDato.setBounds(230, 10, 50, 20);
					lblDato.setFont(new Font("Arial", 1, 12));
				panel2.add(lblDato);
				
				JTextField txtFDato=new JTextField("15/02/2019");
					txtFDato.setBounds(280, 10, 100, 20);
					txtFDato.setFont(new Font("Arial", 1, 12));
					txtFDato.setHorizontalAlignment(JTextField.RIGHT);
				panel2.add(txtFDato);
				
											
				JLabel lblName=new JLabel("Name");
					lblName.setBounds(10, 40, 80, 20);
					lblName.setFont(new Font("Arial", 1, 12));
				panel2.add(lblName);
				
				JComboBox comboName=new JComboBox();
					comboName.addItem("Mr.");
					comboName.addItem("Ms.");
					comboName.setBounds(90, 40, 55, 20);
					comboName.setFont(new Font("Arial", 1, 12));
				panel2.add(comboName);
				
				JTextField txtFName=new JTextField();
					txtFName.setBounds(155, 40, 200, 20);
					txtFName.setFont(new Font("Arial", 1, 12));
				panel2.add(txtFName);
				
				
				JLabel lblSex=new JLabel("Sex");
					lblSex.setBounds(10, 70, 80, 20);
					lblSex.setFont(new Font("Arial", 1, 12));
				panel2.add(lblSex);
				
				JComboBox comboSex=new JComboBox();
					comboSex.addItem("Male");
					comboName.addItem("Female");
					comboSex.setBounds(90, 70, 55, 20);
					comboSex.setFont(new Font("Arial", 1, 12));
				panel2.add(comboSex);
				
								
				JLabel lblAge=new JLabel("Age");
					lblAge.setBounds(155, 70, 30, 20);
					lblAge.setFont(new Font("Arial", 1, 12));
				panel2.add(lblAge);
				
				JTextField txtFAge=new JTextField("0");
					txtFAge.setBounds(180, 70, 30, 20);
					txtFAge.setFont(new Font("Arial", 1, 12));
					txtFAge.setHorizontalAlignment(JTextField.RIGHT);
				panel2.add(txtFAge);
			
				
				JLabel lblMons=new JLabel("Mons");
					lblMons.setBounds(220, 70, 40, 20);
					lblMons.setFont(new Font("Arial", 1, 12));
				panel2.add(lblMons);
				
				JTextField txtFMons=new JTextField("0");
					txtFMons.setBounds(253, 70, 30, 20);
					txtFMons.setFont(new Font("Arial", 1, 12));
					txtFMons.setHorizontalAlignment(JTextField.RIGHT);
				panel2.add(txtFMons);
				
				
				JLabel lblDays=new JLabel("Days");
					lblDays.setBounds(295, 70, 40, 20);
					lblDays.setFont(new Font("Arial", 1, 12));
				panel2.add(lblDays);
				
				JTextField txtFDays=new JTextField("0");
					txtFDays.setBounds(325, 70, 30, 20);
					txtFDays.setFont(new Font("Arial", 1, 12));
					txtFDays.setHorizontalAlignment(JTextField.RIGHT);
				panel2.add(txtFDays);
				
							
				JLabel lblReferedBy=new JLabel("Referred By:");
					lblReferedBy.setBounds(10, 100, 80, 20);
					lblReferedBy.setFont(new Font("Arial", 1, 12));
				panel2.add(lblReferedBy);
				
				JTextField txtFReferredBy=new JTextField();
					txtFReferredBy.setBounds(90, 100, 90, 20);
					txtFReferredBy.setFont(new Font("Arial", 1, 12));
				panel2.add(txtFReferredBy);
				
				JTextField txtFReferredBy2=new JTextField();
					txtFReferredBy2.setBounds(208, 100, 147, 20);
					txtFReferredBy2.setFont(new Font("Arial", 1, 12));
				panel2.add(txtFReferredBy2);
				
				
				JLabel lblTime=new JLabel("*Time (hh:mm)");
					lblTime.setBounds(390, 10, 100, 20);
					lblTime.setFont(new Font("Arial", 1, 12));
				panel2.add(lblTime);
				
				JTextField txtFHH=new JTextField();
					txtFHH.setBounds(480, 10, 30, 20);
					txtFHH.setFont(new Font("Arial", 1, 12));
				panel2.add(txtFHH);
				
				JLabel lblSeparador=new JLabel(":");
					lblSeparador.setBounds(520, 10, 20, 20);
					lblSeparador.setFont(new Font("Arial", 1, 12));
				panel2.add(lblSeparador);
				
				JTextField txtFMM=new JTextField();
					txtFMM.setBounds(532, 10, 30, 20);
					txtFMM.setFont(new Font("Arial", 1, 12));
				panel2.add(txtFMM);
			
							
				JLabel lblLabNo=new JLabel("Lab No");
					lblLabNo.setBounds(580, 10, 80, 20);
					lblLabNo.setFont(new Font("Arial", 1, 12));
				panel2.add(lblLabNo);
				
				JTextField txtFLabNo=new JTextField();
					txtFLabNo.setBounds(630, 10, 100, 20);
					txtFLabNo.setFont(new Font("Arial", 1, 12));
				panel2.add(txtFLabNo);
				
				
				JLabel lblSampleBy=new JLabel("Sample By");
					lblSampleBy.setBounds(370, 70, 80, 20);
					lblSampleBy.setFont(new Font("Arial", 1, 12));
				panel2.add(lblSampleBy);
				
				JTextField txtFSampleBy=new JTextField();
					txtFSampleBy.setBounds(450, 70, 100, 20);
					txtFSampleBy.setFont(new Font("Arial", 1, 12));
				panel2.add(txtFSampleBy);
			
			
				JLabel lblPanelCode=new JLabel("Panel Code");
					lblPanelCode.setBounds(370, 100, 80, 20);
					lblPanelCode.setFont(new Font("Arial", 1, 12));
				panel2.add(lblPanelCode);
		
				JTextField txtFPanalCode=new JTextField();
					txtFPanalCode.setBounds(450, 100, 100, 20);
					txtFPanalCode.setFont(new Font("Arial", 1, 12));
				panel2.add(txtFPanalCode);
			
			
				JLabel lblPanelID=new JLabel("Panel ID");
					lblPanelID.setBounds(370, 130, 80, 20);
					lblPanelID.setFont(new Font("Arial", 1, 12));
				panel2.add(lblPanelID);
				
				JTextField txtFPanalID=new JTextField();
					txtFPanalID.setBounds(450, 130, 100, 20);
					txtFPanalID.setFont(new Font("Arial", 1, 12));
				panel2.add(txtFPanalID);
			
			
				JLabel lblEmail=new JLabel("e-mail");
					lblEmail.setBounds(370, 160, 80, 20);
					lblEmail.setFont(new Font("Arial", 1, 12));
				panel2.add(lblEmail);
				
				JTextField txtFEmail=new JTextField();
					txtFEmail.setBounds(450, 160, 100, 20);
					txtFEmail.setFont(new Font("Arial", 1, 12));
				panel2.add(txtFEmail);
		
	
				
				
				
			panel1.add(panel2);
			
			
			
			JPanel panel3=new JPanel(null);
				panel3.setBackground(new Color(240, 253, 255));
				panel3.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
				panel3.setBounds(0, 200, 1340, 300);
			
			panel1.add(panel3);
			
			
			
			JPanel panel4=new JPanel(null);
				panel4.setBackground(new Color(240, 253, 255));
				panel4.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));
				panel4.setBounds(0, 500, 1340, 125);
			
			panel1.add(panel4);
			
		add(panel1, BorderLayout.NORTH);
			
	}
	
}


public class Prueba {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
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