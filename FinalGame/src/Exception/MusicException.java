/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author Henry Diaz
 */
public final class MusicException extends Exception{
    
    public MusicException() {
        
    }
    
    public MusicException(String message) {
        super(message);
    }
    
     public MusicException(String message, Throwable cause) {
        super(message, cause);
    }
     
     public MusicException(Throwable cause) {
        super(cause);
    } 
 
    /*String message;
     
    public MusicException(String msg) {
        setMessage(msg);
    }
 
    @Override
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    } */ 
}