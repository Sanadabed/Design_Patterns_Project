/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptopstore;

/**
 *
 * @author USER
 */
public class DDR4_8GB implements RAM {
    public String getType(){
        return "DDR4";
    }
    public int getSize(){
        return 8;
    }
    
    public int getPrice(){
        return 40;
    }
    public String getDetails(){
     return getSize() + "GB " + getType() + " - $" + getPrice();
    }
}
