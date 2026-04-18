/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laptopstore;
import java.util.Scanner;

public class Laptop_Store {

    public static void main(String[] args) {
        
       System.out.println("============================================================");
        System.out.println("   LAPTOP FACTORY - Abstract Factory Pattern               ");
        System.out.println("============================================================");
        System.out.println();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your budget in USD: $");
        double budget = scanner.nextDouble();
        scanner.close();
        
        LaptopFactory factory;
        String category = "";
        
        if (budget < 300) {
            factory = new BudgetLaptop();
            category = "BUDGET";
        } else if (budget < 600) {
            factory = new StudyLaptop();
            category = "STUDY";
        } else if (budget < 1200) {
            factory = new BusinessLaptop();
            category = "BUSINESS";
        } else {
            factory = new GamingLaptop();
            category = "GAMING";
        }
        
        System.out.println("\nAnalyzing your budget: $" + budget);
        System.out.println("Recommended Laptop: " + category + " Category");
        
        System.out.println("\nBuilding your " + category + " laptop...\n");
        
        CPU cpu = factory.createCPU();
        RAM ram = factory.createRAM();
        Storage storage = factory.createStorage();
        GPU gpu = factory.createGPU();
        Screen screen = factory.createScreen();
        
        Laptop laptop = new Laptop(cpu, ram, storage, gpu, screen, budget);
        laptop.displaySpecifications(); 
        
        // Calculate total price for classification
        double totalPrice = cpu.getPrice() + ram.getPrice() + storage.getPrice() + 
                           gpu.getPrice() + screen.getPrice();
        
        System.out.print("Classification: ");
        LaptopClassifier.classify((int) totalPrice);
        
        System.out.println("\nRecommendation complete!");

    }
}
