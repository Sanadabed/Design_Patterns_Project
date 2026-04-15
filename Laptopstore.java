/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laptopstore;

/**
 *
 * @author ONE BY ONE
 */
public class Laptop {

    private CPU cpu;
    private RAM ram;
    private Storage storage;
    private GPU gpu;
    private Screen screen;

    private String category;   
    private double budget;    

    public Laptop(CPU cpu, RAM ram, Storage storage, GPU gpu, Screen screen, double budget) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.screen = screen;
        this.budget = budget;

        if (budget < 300) {
            this.category = "Budget Laptop";
        } else if (budget <= 600) {
            this.category = "Study Laptop";
        } else if (budget <= 1200) {
            this.category = "Business Laptop";
        } else {
            this.category = "Gaming Laptop";
        }
    }

    public CPU getCPU() {
        return cpu;
    }

    public RAM getRAM() {
        return ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public GPU getGPU() {
        return gpu;
    }

    public Screen getScreen() {
        return screen;
    }

    public String getCategory() {
        return category;
    }

    public double getBudget() {
        return budget;
    }

    public double calculateTotalPrice() {
        return cpu.getPrice()
                + ram.getPrice()
                + storage.getPrice()
                + gpu.getPrice()
                + screen.getPrice();
    }

    public boolean isWithinBudget() {
        return calculateTotalPrice() <= budget;
    }

    public void displaySpecifications() {
        System.out.println("=================================");
        System.out.println("        Laptop Specifications     ");
        System.out.println("=================================");

        System.out.println("Category: " + category);
        System.out.println("User Budget: $" + budget);

        System.out.println("---------------------------------");

        System.out.println("CPU: " + cpu.getDetails());
        System.out.println("RAM: " + ram.getDetails());
        System.out.println("Storage: " + storage.getDetails());
        System.out.println("GPU: " + gpu.getDetails());
        System.out.println("Screen: " + screen.getDetails());

        System.out.println("---------------------------------");

        double total = calculateTotalPrice();
        System.out.println("Total Price: $" + total);

        if (isWithinBudget()) {
            System.out.println("Status: Within Budget ✅");
        } else {
            System.out.println("Status: Exceeds Budget ❌");
        }

        System.out.println("=================================");
    }

    public void displaySummary() {
        System.out.println("Laptop Summary:");
        System.out.println("Category: " + category);
        System.out.println("CPU: " + cpu.getDetails());
        System.out.println("RAM: " + ram.getDetails());
        System.out.println("Total Price: $" + calculateTotalPrice());
    }
}