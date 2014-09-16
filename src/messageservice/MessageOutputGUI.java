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
public class MessageOutputGUI implements MessageOutput{

    @Override
    public void outputMessage(MessageInput line) {
        JOptionPane.showMessageDialog(null, line);
        
    }

    
}
