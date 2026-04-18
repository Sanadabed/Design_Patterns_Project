/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptopstore;

/**
 *
 * @author USER
 */
public class DDR4_16GB implements RAM{

    @Override
    public String getType() {
       return "DDR4";
    }

    @Override
    public int getSize() {
         return 16;
    }

    @Override
    public int getPrice() {
        return 70;
    }

    @Override
    public String getDetails() {
        return getSize() + "GB " + getType() + " - $" + getPrice();
    }
}
 

