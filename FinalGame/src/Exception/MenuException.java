/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Exception;

/**
 *
 * @author Piedad
 */
public class MenuException extends Exception{
    public MenuException() {
  try{
    
}  
  catch(Exception ex){
      System.err.println("Error: " + ex.getMessage());
  throw new SampleException(ex);
}
  finally{
    
}
}
}

    
    
