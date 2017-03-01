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

//the responsibility of this class is to create a pure abstraction of generating
//a random number so that different functions such as selecting a message based on the
//RNG value can occur. The subclasses that implement this interface may want the method to vary
//depending on how many messages are in the bank, etc...

//the benefit of this being a seperate interface from the message reader and writer is that
//not every class has to implement this. Only ones that need to can.
public interface RandomNumberGeneratorService {
    
    /**
     *
     * @return
     */
    public int generateRandomNumber();
    
}
