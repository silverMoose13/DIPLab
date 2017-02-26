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
public interface MessageReader {
    
    //so far this is the only common method that the lower classes will
    //share. Check on this as the program become more developed.
    public abstract String readMessage();
    
}
