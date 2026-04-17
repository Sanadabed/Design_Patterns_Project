/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptopstore;

/**
 *
 * @author USER
 */
public class Intel_i5  implements CPU{
    public String getName(){
        return "Intel i5-1342oH";
    }
    public int getPrice(){
        return 250;
    }
    
    public String getSpecs(){
        return "8 cores";
    }
 public String getDetails() {
        return getName() + " - $" + getPrice();
    }
}
