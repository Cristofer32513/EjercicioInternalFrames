import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

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
				ImageIcon addRed=new ImageIcon(add.getImage().getScaledInstance(40, 40, Image.SCALE_REPLICATE));
				btnAdd.setIcon(addRed);
				btnAdd.setHorizontalTextPosition( SwingConstants.CENTER );
				btnAdd.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnAdd);
			
			JButton btnEdit=new JButton("Edit");
				ImageIcon edit=new ImageIcon("./Imagenes/Edit.png");
				ImageIcon editRed=new ImageIcon(edit.getImage().getScaledInstance(40, 40, Image.SCALE_REPLICATE));
				btnEdit.setIcon(editRed);
				btnEdit.setHorizontalTextPosition( SwingConstants.CENTER );
				btnEdit.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnEdit);
			
			JButton btnBack=new JButton("Back");
				ImageIcon back=new ImageIcon("./Imagenes/Back.png");
				ImageIcon backRed=new ImageIcon(back.getImage().getScaledInstance(40, 40, Image.SCALE_REPLICATE));
				btnBack.setIcon(backRed);
				btnBack.setHorizontalTextPosition( SwingConstants.CENTER );
				btnBack.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnBack);
			
			JButton btnNext=new JButton("Next");
				ImageIcon next=new ImageIcon("./Imagenes/Next.png");
				ImageIcon nextRed=new ImageIcon(next.getImage().getScaledInstance(40, 40, Image.SCALE_REPLICATE));
				btnNext.setIcon(nextRed);
				btnNext.setHorizontalTextPosition( SwingConstants.CENTER );
				btnNext.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnNext);
			
			JButton btnList=new JButton("List");
				ImageIcon list=new ImageIcon("./Imagenes/List.png");
				ImageIcon listRed=new ImageIcon(list.getImage().getScaledInstance(40, 40, Image.SCALE_REPLICATE));
				btnList.setIcon(listRed);
				btnList.setHorizontalTextPosition( SwingConstants.CENTER );
				btnList.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnList);
			
			JButton btnSave=new JButton("Save");
				ImageIcon save=new ImageIcon("./Imagenes/Save.png");
				ImageIcon saveRed=new ImageIcon(save.getImage().getScaledInstance(40, 40, Image.SCALE_REPLICATE));
				btnSave.setIcon(saveRed);
				btnSave.setHorizontalTextPosition( SwingConstants.CENTER );
				btnSave.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnSave);
		
			JButton btnPrint=new JButton("Print");
				ImageIcon print=new ImageIcon("./Imagenes/Print.png");
				ImageIcon printRed=new ImageIcon(print.getImage().getScaledInstance(40, 40, Image.SCALE_REPLICATE));
				btnPrint.setIcon(printRed);
				btnPrint.setHorizontalTextPosition( SwingConstants.CENTER );
				btnPrint.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnPrint);
			
			JButton btnIest=new JButton("Iest");
				ImageIcon iest=new ImageIcon("./Imagenes/Iest.png");
				ImageIcon iestRed=new ImageIcon(iest.getImage().getScaledInstance(40, 40, Image.SCALE_REPLICATE));
				btnIest.setIcon(iestRed);
				btnIest.setHorizontalTextPosition( SwingConstants.CENTER );
				btnIest.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnIest);
			
			JButton btnCancel=new JButton("Cancel");
				ImageIcon cancel=new ImageIcon("./Imagenes/Cancel.png");
				ImageIcon cancelRed=new ImageIcon(cancel.getImage().getScaledInstance(40, 40, Image.SCALE_REPLICATE));
				btnCancel.setIcon(cancelRed);
				btnCancel.setHorizontalTextPosition( SwingConstants.CENTER );
				btnCancel.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnCancel);
			
			JButton btnSettings=new JButton("Settings");
				ImageIcon settings=new ImageIcon("./Imagenes/Settings.png");
				ImageIcon settingsRed=new ImageIcon(settings.getImage().getScaledInstance(40, 40, Image.SCALE_REPLICATE));
				btnSettings.setIcon(settingsRed);
				btnSettings.setHorizontalTextPosition( SwingConstants.CENTER );
				btnSettings.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnSettings);
		
			JButton btnDelete=new JButton("Delete");
				ImageIcon delete=new ImageIcon("./Imagenes/Delete.png");
				ImageIcon deleteRed=new ImageIcon(delete.getImage().getScaledInstance(40, 40, Image.SCALE_REPLICATE));
				btnDelete.setIcon(deleteRed);
				btnDelete.setHorizontalTextPosition( SwingConstants.CENTER );
				btnDelete.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnDelete);
			
			JButton btnSlip=new JButton("Slip");
				ImageIcon slip=new ImageIcon("./Imagenes/Slip.png");
				ImageIcon slipRed=new ImageIcon(slip.getImage().getScaledInstance(40, 40, Image.SCALE_REPLICATE));
				btnSlip.setIcon(slipRed);
				btnSlip.setHorizontalTextPosition( SwingConstants.CENTER );
				btnSlip.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnSlip);
			
			JButton btnExit=new JButton("Exit");
				ImageIcon exit=new ImageIcon("./Imagenes/Exit.png");
				ImageIcon exitRed=new ImageIcon(exit.getImage().getScaledInstance(40, 40, Image.SCALE_REPLICATE));
				btnExit.setIcon(exitRed);
				btnExit.setHorizontalTextPosition( SwingConstants.CENTER );
				btnExit.setVerticalTextPosition( SwingConstants.BOTTOM );
			toolBar.add(btnExit);
		
			
		add(toolBar, BorderLayout.PAGE_START);
		
		
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