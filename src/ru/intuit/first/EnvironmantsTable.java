package ru.intuit.first;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class EnvironmantsTable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void createGUI() {
        JFrame frame = new JFrame("Environments...");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		Map <String,?> mapenv = System.getenv();

        String[] columnNames = {
                  "Name",
                  "Value"
        };
        String [] properties_key = new String [mapenv.size()]; 
        String[][] data = new String [mapenv.size()][2];
        
		int i = 0;
 		for (Map.Entry<String, ?> pair: mapenv.entrySet()) {
//			System.out.println(pair.getKey() +" = "+ pair.getValue().toString());
			properties_key[i++] = pair.getKey();
		}

        Arrays.sort(properties_key);
        for ( i = 0; i < data.length; i++) {
			data[i][0] = properties_key[i];
			data[i][1] = (String) mapenv.get(properties_key[i]);
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
