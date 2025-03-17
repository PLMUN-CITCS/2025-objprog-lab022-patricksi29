public class CarDemo {
    public static void main(String[] args) {
        // Step 3: Create an object of the Car class
        Car myCar = new Car(); // Instantiate the Car object

        // Step 4: Assign values to the attributes of the Car object
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;

        // Step 5: Call the displayInfo method to print car details
        myCar.displayInfo();  // Output: Car: 2020 Toyota Corolla
    }
}
