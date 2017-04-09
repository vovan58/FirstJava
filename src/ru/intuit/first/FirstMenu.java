package ru.intuit.first;

import java.awt.MenuBar;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FirstMenu extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//--------------------------------------------------------
    /**
     * ����������� ������
     */
	public FirstMenu(){
		super ("������ ����");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setJMenuBar(createMenuItems());
        // ������� ���� �� �����
        setSize(300, 200);
        setVisible(true);

	}
    //--------------------------------------------------------
    /**
     * ������� �������� ����������� ����
     */
    private JMenuBar createMenuItems()
    {
        // �������� ����������� ����
        JMenuBar menu = new JMenuBar();
        JMenu file = new JMenu("����");
        //JMenuItem exit = new JMenuItem("�����");
        // ����� ���� �� ������� � ������� �� ���������
        JMenuItem exit = new JMenuItem(new ExitAction());
        file.add(exit);
        menu.add(file);
        
        return menu;
    }
	   //--------------------------------------------------------
    /**
     * ��������� ����� ���������� ������ ���������� 
     */
    class ExitAction extends AbstractAction
    {
        private static final long serialVersionUID = 1L;
        ExitAction() {
            putValue(NAME, "�����");
        }
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO ������������� ��������� �������� ������
            System.exit(0);
			
		}
    }	
	
	public static void main(String[] args) {
		// TODO ������������� ��������� �������� ������
        // ����������� ��������� ��� ����
        JFrame.setDefaultLookAndFeelDecorated(true);
        new FirstMenu();
		
	
	}

}
