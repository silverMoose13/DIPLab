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
//implement. It's only method is to input a message.
public interface MessageInput {
    
    public abstract String inputMessage() throws Exception;
    
}
