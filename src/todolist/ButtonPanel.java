/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

/**
 *
 * @author Abdullah
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ButtonPanel extends JPanel {
	private JButton AddTask;
	private JButton Clear;
	private JButton Save;
        
	Border empty = BorderFactory.createEmptyBorder();
	
	ButtonPanel(){
		this.setPreferredSize(new Dimension(400,60));
		this.setBackground(Color.GREEN);
		
		AddTask = new JButton("ADD TASK");
		
		this.setFont(new Font("Sans-Serif",Font.BOLD,20));
		//AddTask.setBorder(empty);
		this.add(AddTask);
		
		this.add(Box.createHorizontalStrut(20));
		
		Clear = new JButton("Clear Finished Task");
		this.setFont(new Font("Sans-Serif",Font.BOLD,20));
		//Clear.setBorder(empty);
		this.add(Clear);
                
                this.add(Box.createHorizontalStrut(20));
		
		Save = new JButton("Save");
		this.setFont(new Font("Sans-Serif",Font.BOLD,20));
		//Clear.setBorder(empty);
		this.add(Save);
	}
	
	public JButton getAddTask() {
		return AddTask;
	}
	
	public JButton getClear() {
		return Clear;
	}
        
        public JButton getSave() {
		return Save;
	}
	
	
}
