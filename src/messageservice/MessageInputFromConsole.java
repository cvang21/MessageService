/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

import java.util.Scanner;

/**
 *
 * @author Owner
 */
public class MessageInputFromConsole implements MessageInput {

    @Override
    public Object getMessage() {
    
            Scanner input = new Scanner(System.in);
            System.out.println("What's your message");
            
            return input.nextLine();
        }
}
