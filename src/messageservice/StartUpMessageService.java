/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

/**
 *
 * @author Ching Vang
 */
public class StartUpMessageService {

    public static void main(String[] args) {
        MessageInput input = new MessageInputFromConsole();
        MessageOutput output = new MessageOutputGUI();
        MessageManager manager = new MessageManager(input,output);
        manager.processMessage();
        
    }
    
}
