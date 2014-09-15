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
  	public String readln() {
            System.out.println("Please enter a message, then press return:");

            Scanner input = new Scanner(System.in);
            return input.nextLine();
        }
}
