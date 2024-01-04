/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;


/**
 *
 * @author Ali Hassan
 */
public class List extends JPanel {
  List() {
    GridLayout out = new GridLayout(10,1);
    out.setVgap(5);
    this.setLayout(out);
    this.setBackground(Color.blue);	
  }
		
  public void updatenumbers() {
    Component[] listItems = this.getComponents();
                  
    for(int i = 0; i < listItems.length; i++) {
      if(listItems[i] instanceof Task) {
        ((Task)listItems[i]).changeIndex(i + 1);
      }
    }
  }

  public void removeCompletedTasks() {	
    for(Component c : getComponents()) {
      if(c instanceof Task) {
        if(((Task)c).getState()) {
          remove(c);
          updatenumbers();
        }
      }
    }
  }

  public String collect() {
    Component[] listItems = this.getComponents();
    StringBuilder taskFile = new StringBuilder();                  
    for(int i =0 ; i < listItems.length ;++i) {    
      Task task = (Task) listItems[i];
      task.changeIndex(i + 1);
      taskFile.append(i + 1).append(". ").append(task.getText()).append("\n");
    }
    return taskFile.toString();
  }  
}
