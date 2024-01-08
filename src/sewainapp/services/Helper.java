/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sewainapp.services;

import javax.swing.JOptionPane;

/**
 *
 * @author nafidinara
 */
public class Helper {
    public void showMessageDialog(String title, String msg, int level){
        if(level == 0){
            JOptionPane.showMessageDialog(
                    null,
                    "[INFO]"+msg,
                    title,
                    JOptionPane.INFORMATION_MESSAGE
            );
        }else if(level == 1){
            JOptionPane.showMessageDialog(
                    null,
                    "[WARNING]"+msg,
                    title,
                    JOptionPane.WARNING_MESSAGE
            );
        }else if(level == 2){
            JOptionPane.showMessageDialog(
                    null,
                    "[ERROR]"+msg,
                    title,
                    JOptionPane.ERROR_MESSAGE
            );
        }else{
            JOptionPane.showMessageDialog(
                    null,
                    "[INFO]"+msg,
                    title,
                    JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
    
}
