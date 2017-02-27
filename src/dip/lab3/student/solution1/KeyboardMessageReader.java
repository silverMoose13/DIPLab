/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author Aaron
 */

//the responsibilty of this class is to provide the capability
//to intake input from the user using the keyboard
public class KeyboardMessageReader implements MessageReader {

    private Scanner keyboardUserInput;
    private ConsoleMessageWriter newMessage;

    public KeyboardMessageReader() {
        keyboardUserInput = new Scanner(System.in);
        newMessage = new ConsoleMessageWriter();
    }

    //this method will take in keyboard input from the user
    //make it fancy later. Just get it to work first.
    @Override
    public String readMessage() {
        //output to console is not the job here in this class
        newMessage.writeMessage("Please enter in a message: ");
        return keyboardUserInput.nextLine();
    }

}
