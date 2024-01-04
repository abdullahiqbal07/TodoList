/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Ali Hassan
 */
public class Task extends JPanel {
  private JLabel index;
	private JButton done;
	private JTextField taskname;
	private Boolean checked;
	
	Task(){
		this.setPreferredSize(new Dimension(40,20));
		this.setBackground(Color.GRAY);
		this.setLayout(new BorderLayout());
		checked = false;
		index = new JLabel("");
		index.setPreferredSize(new Dimension(20,20));
		index.setHorizontalAlignment(JLabel.CENTER);
		this.add(index,BorderLayout.WEST);
		taskname = new JTextField("Write your Task here");
		taskname.setBorder(BorderFactory.createEmptyBorder());
    taskname.addFocusListener(new FocusListener() {
    
    @Override
    public void focusGained(FocusEvent e) {
      if(taskname.getText().equals("Write your Task here")) {
        taskname.setText("");                
      }
    }

    @Override
    public void focusLost(FocusEvent e) {
      if(taskname.getText().equals("")){
        taskname.setText("Write your Task here");                
      }
    }
                    
    });
		
		this.add(taskname,BorderLayout.CENTER);
		done = new JButton("Done");
		done.setPreferredSize(new Dimension(40,20));
		done.setBorder(BorderFactory.createEmptyBorder());
		this.add(done,BorderLayout.EAST);
	}
	
	public JButton getDone() {
		return done;
	}
	
	public void changeIndex(int num) {
		this.index.setText(num + ")");
		this.revalidate();
	}
	
	public void changeState() {
		this.setBackground(Color.ORANGE);
		taskname.setBackground(Color.ORANGE);
		checked = true;
	}

	public boolean getState() {
		return checked;
	}

  public String getText() {
    System.out.println(this.taskname.getText());
    return this.taskname.getText();
  }
    
}
