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
//implement. It's only method is to write a message.
public interface MessageOutput {
    
    //this method needs a message parameter so that the subclass can
    //properly utilize this method and not create its own properties which
    //could lead to future maintenance
    
    //is having this a string parameter instead of MessageReader a problem?
    public abstract void writeMessage(String message) throws Exception;
}
