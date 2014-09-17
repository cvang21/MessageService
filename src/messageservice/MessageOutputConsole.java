/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

/**
 *
 * @author Owner
 */
public class MessageOutputConsole implements MessageOutput {
    @Override
    public void outputMessage(MessageInput theMessage) {
        System.out.println("Here is the text you entered, which I've copied below.");
        System.out.println( theMessage.getMessage());
    }
}
