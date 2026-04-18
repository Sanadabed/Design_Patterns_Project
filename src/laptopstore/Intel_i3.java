/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptopstore;

/**
 *
 * @author USER
 */
public class Intel_i3 implements CPU {

    public String getName() {
        return "Intel i3-1315U";
    }

    public int getPrice() {
        return 150;
    }

    public String getSpecs() {
        return "6 Cores";
    }

    public String getDetails() {
        return getName() + " - $" + getPrice() + " (" + getSpecs() + ")";
    }
}
