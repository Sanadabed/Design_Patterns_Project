/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptopstore;

/**
 *
 * @author USER
 */
public class Intel_i9 implements CPU {
     public String getName(){
        return "Intel i9-13900HX";
    }
    public int getPrice(){
        return 600;
    }
    
    public String getSpecs(){
        return "24 cores";
    }
  public String getDetails() {
        return getName() + " - $" + getPrice() + " (" + getSpecs() + ")";
    }
}

