/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptopstore;

/**
 *
 * @author Wafa
 */
public class BudgetLaptop implements LaptopFactory{

    @Override
    public CPU createCPU() {
       return new Intel_i3();
    }

    @Override
    public RAM createRAM() {
      return new DDR4_8GB();
    }

    @Override
    public Storage createStorage() {
        return new SSD_256GB();
    }

    @Override
    public GPU createGPU() {
       return new IntegratedGPU();
    }

    @Override
    public Screen createScreen() {
        return new HD_Screen();
    }
}
