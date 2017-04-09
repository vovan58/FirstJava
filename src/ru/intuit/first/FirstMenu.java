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
     * Конструктор класса
     */
	public FirstMenu(){
		super ("Первое меню");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setJMenuBar(createMenuItems());
        // выводим окно на экран
        setSize(300, 200);
        setVisible(true);

	}
    //--------------------------------------------------------
    /**
     * Функция создания выпадающего меню
     */
    private JMenuBar createMenuItems()
    {
        // Создание выпадающего меню
        JMenuBar menu = new JMenuBar();
        JMenu file = new JMenu("Файл");
        //JMenuItem exit = new JMenuItem("Выход");
        // Пункт меню из команды с выходом из программы
        JMenuItem exit = new JMenuItem(new ExitAction());
        file.add(exit);
        menu.add(file);
        
        return menu;
    }
	   //--------------------------------------------------------
    /**
     * Вложенный класс завершения работы приложения 
     */
    class ExitAction extends AbstractAction
    {
        private static final long serialVersionUID = 1L;
        ExitAction() {
            putValue(NAME, "Выход");
        }
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Автоматически созданная заглушка метода
            System.exit(0);
			
		}
    }	
	
	public static void main(String[] args) {
		// TODO Автоматически созданная заглушка метода
        // Подключение украшений для окон
        JFrame.setDefaultLookAndFeelDecorated(true);
        new FirstMenu();
		
	
	}

}
