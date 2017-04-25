/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

import javax.swing.JButton; 
import javax.swing.JFrame;
/**
 *
 * @author MONSTER
 */
public class LibrarySystem extends JFrame{
    
    public static void main(String[] args) {
        
       java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    
   
}
