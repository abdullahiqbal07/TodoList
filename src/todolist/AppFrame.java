/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Abdullah
 */
public class AppFrame extends JFrame {
    
   private final TitleBar title; 
   private final ButtonPanel btnpanel;
   private final List list;
   private final Task task;
   
   private JButton AddTask;
   private JButton Clear;
   private JButton Save;
    
    AppFrame(){
        this.setSize(400,700);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("                Do To DO List ");
        title = new TitleBar();
        btnpanel = new ButtonPanel();
        list = new List();
        task = new Task();
        
        
        this.add(title,BorderLayout.NORTH);
        this.add(btnpanel,BorderLayout.SOUTH);
        this.add(list,BorderLayout.CENTER);
        
        AddTask = btnpanel.getAddTask();
        Clear = btnpanel.getClear();
        Save = btnpanel.getSave();
        
        
        addListeners();
        
    }
    
    public void addListeners() {
    	AddTask.addMouseListener(new MouseAdapter()
    	{
    		@Override
    		public void mousePressed(MouseEvent e)
    		{
    			Task task = new Task();
    			list.add(task);
    			list.updatenumbers();
    			
    			task.getDone().addMouseListener(new MouseAdapter()
    			{
    				@Override
    				public void mousePressed(MouseEvent e)
    				{
    					task.changeState();
    					revalidate();
    				}
    				
				});
    			revalidate();
    		}
    		
    		
		});
    	
    	
    	Clear.addMouseListener(new MouseAdapter()
		{
    		@Override
    		public void mousePressed(MouseEvent e) {
    			list.removeCompletedTasks();
    			repaint();
    		}
    		
    		
    		
		}
    	);
        
        
        Save.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                saveTasksToFile();
            }
        });
        
    }
    
    private void saveTasksToFile() {
        
try {
      FileWriter myWriter = new FileWriter("D:\\Nust\\Semester 02\\practice\\ToDoList\\filename.txt");
      String hi = list.collect();
      myWriter.write(hi);
      myWriter.close();
      JOptionPane.showMessageDialog(null,("File Saved"));
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
 
            
    }
    
}
