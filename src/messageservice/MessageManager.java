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
public class MessageManager {
    
    private MessageInput input;
    private MessageOutput output;
    
    public MessageManager(MessageInput input, MessageOutput output){
        this.SetInput(input);
        this.SetOutput(output);
    }
    public void processMessage() {
       MessageInput message = input.getMessage();
       output.outputMessage(message);
    }
    
    public MessageInput getInput(){
        return input;
    }
    
    public MessageOutput getOutput(){
        return output;
    }
    public void SetInput (MessageInput input){
        this.input = input;
    }
    
    public void SetOutput (MessageOutput output){
        this.output = output;
    }
}
