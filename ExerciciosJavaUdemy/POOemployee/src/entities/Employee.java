package entities;

public class Employee {

   private String name;
   private double grosssalary;
   private double tax;

   public void setName(String name) {
       this.name = name;
   }

   public void setGrosssalary(double grosssalary) {
       this.grosssalary = grosssalary;

   }

   public void setTax(double tax) {
       this.tax = tax;

   }

   public String getName() {
       return name;

   }

   public double getGrosssalary() {
       return grosssalary;

   }

   public double getTax() {
       return tax;

   }

   public double netSalary() {
       return getGrosssalary() - getTax();

   }

   public void increaseSalary(double percentage) {
       grosssalary += getGrosssalary() * percentage / 100;

   }

   public String toString() {
       return getName() + ", " + "$ " + String.format("%.2f", netSalary());

   }

}
