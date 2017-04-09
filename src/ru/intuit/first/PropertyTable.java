package ru.intuit.first;

import java.util.Arrays;
import java.util.Enumeration;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class PropertyTable extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void createGUI() {
        JFrame frame = new JFrame("System Properties");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columnNames = {
                  "Name",
                  "Value"
        };
        String [] properties_key = new String [System.getProperties().size()]; 
        String[][] data = new String [System.getProperties().size()][2];
        Enumeration<?> spenum = System.getProperties().propertyNames();
        for (int i = 0; i < properties_key.length; i++) {
			properties_key[i] = spenum.nextElement().toString();
		}
        Arrays.sort(properties_key);
        for (int i = 0; i < data.length; i++) {
			data[i][0] = properties_key[i];
			data[i][1] = System.getProperty(properties_key[i]);
		}
 
        JTable table = new JTable(data, columnNames);
         
        JScrollPane scrollPane = new JScrollPane(table);
         
        frame.getContentPane().add(scrollPane);
        //frame.setPreferredSize(new Dimension(450, 200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
   }
    
	public static void main(String[] args) {
		// TODO Автоматически созданная заглушка метода
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                 JFrame.setDefaultLookAndFeelDecorated(true);
                 createGUI();
            }
       });

	}
	
}
