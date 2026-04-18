/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptopstore;

/**
 *
 * @author USER
 */
public class DDR5_32GB implements RAM{
    
 public String getType(){
        return "DDR5";
    }
    public int getSize(){
        return 32;
    }
    
    public int getPrice(){
        return 150;
    }
  public String getDetails() {
        return getSize() + "GB " + getType() + " - $" + getPrice();
    }
}
