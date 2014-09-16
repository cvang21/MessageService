/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

import javax.swing.JOptionPane;

/**
 *
 * @author Ching Vang
 */
public class MessageInputFromGUI implements MessageInput{

    @Override
    public String getMessage() {
       String input;
       input = JOptionPane.showInputDialog("Please enter a message, then press return: ");
       return input;
    }
}
        
