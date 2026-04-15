/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptopstore;

/**
 *
 * @author Wafa
 */
public class GamingLaptop implements LaptopFactory{

    @Override
    public CPU createCPU() {
      return new Intel_i9();
    }

    @Override
    public RAM createRAM() {
       return new DDR5_32GB();
    }

    @Override
    public Storage createStorage() {
         return new NVMe_1TB();
    }

    @Override
    public GPU createGPU() {
       return new RTX_4060();
    }

    @Override
    public Screen createScreen() {
      return new GamingScreen();
    }
    
}
