/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exception;

/**
 *
 * @author kylugo
 */
public class BoardException extends Exception {
     
    public BoardException() {
        
    }
    
    public BoardException(String message) {
        super(message);
    }
    
     public BoardException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
