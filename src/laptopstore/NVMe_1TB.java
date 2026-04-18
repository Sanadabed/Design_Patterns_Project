/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptopstore;

/**
 *
 * @author USER
 */
public class NVMe_1TB implements Storage {

    public String getType() {
        return "NVMe SSD";
    }

    public int getCapacity() {
        return 1024;  
    }

    public int getPrice() {
        return 140;
    }

    public String getDetails() {
        return getCapacity() + "GB " + getType() + " - $" + getPrice();
    }
}
