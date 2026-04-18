/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptopstore;

/**
 *
 * @author USER
 */
public class LaptopClassifier {
   public static void classify(int totalPrice) {
       if (totalPrice > 1200) {
           System.out.println("This is a Gaming Laptop");
       }
       else if (totalPrice > 600) {
           System.out.println("This is a Business Laptop");
       }
       else if (totalPrice > 300) {
           System.out.println("This is a Study Laptop");
       }
       else {
           System.out.println("This is a Budget Laptop");
       }
   }
}
