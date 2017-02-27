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
public interface MessageWriter {
    
    //so far this is the only common method that the lower classes will
    //share. Check on this as the program become more developed.
    
    //this method needs a message parameter so that the subclass can
    //properly utilize this method and not create its own properties which
    //could lead to future maintenance
    public abstract void writeMessage(String message) throws Exception;
}
