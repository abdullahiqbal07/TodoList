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
        
        
        
        
        
    }
    

    
}
