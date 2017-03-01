/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Aaron
 */

//This is the pure abstraction that all of the reader subclasses classes will
//implement. It's only method is to read a message.
public interface MessageInput {
    
    //this is the only method that is necessary for how this program is built
    //for all of the reader subclasses a message will need to be read (common behavior
    //to all of them)
    public abstract String readMessage() throws Exception;
    
}
