/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptopstore;

/**
 *
 * @author USER
 */
public class IntegratedGPU implements GPU {

    public String getName() {
        return "Intel Iris Xe";
    }

    public int getVRAM() {
        return 0;
    }

    public int getPrice() {
        return 0;
    }

    public String getDetails() {
        return getName() + " (Integrated) - $" + getPrice();
    }
}
