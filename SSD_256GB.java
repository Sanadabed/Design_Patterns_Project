/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptopstore;

/**
 *
 * @author USER
 */
public class SSD_256GB implements Storage{
    public String getType(){
        return "SSD";
    }
    public int getCapacity(){
        return 256;
    }
    public int getPrice(){
       return 30;
    }
 public String getDetails() {
        return getCapacity() + "GB " + getType() + " - $" + getPrice();
    }
}
