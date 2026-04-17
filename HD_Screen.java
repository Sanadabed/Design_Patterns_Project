/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptopstore;

/**
 *
 * @author USER
 */
public class HD_Screen implements Screen {

    public String getResolution() {
        return "1366x768 HD";
    }

    public double getSize() {
        return 15.6;
    }

    public int getRefreshRate() {
        return 60;
    }

    public int getPrice() {
        return 60;
    }

    public String getDetails() {
        return getSize() + "\" " + getResolution() + " (" + getRefreshRate() + "Hz) - $" + getPrice();
    }
}
