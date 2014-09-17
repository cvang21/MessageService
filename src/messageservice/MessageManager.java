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
        this.setInput(input);
        this.setOutput(output);
    }
    public void processMessage() {
       output.outputMessage(this.input);
    }
    
    public MessageInput getInput(){
        return input;
    }
    
    public MessageOutput getOutput(){
        return output;
    }
    public void setInput (MessageInput input){
        this.input = input;
    }
    
    public void setOutput (MessageOutput output){
        this.output = output;
    }
}
