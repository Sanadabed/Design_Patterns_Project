/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptopstore;

/**
 *
 * @author USER
 */
public class RTX_4060 implements GPU{
       public String getName(){
        return "NVIDIA RTX 4060";
    }
    public int getVRAM(){
        return 8;
    }
    public int getPrice(){
        return 500;
    }

 public String getDetails() {
        return getName() + " (" + getVRAM() + "GB VRAM) - $" + getPrice();
    }
}

