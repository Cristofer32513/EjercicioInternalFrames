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