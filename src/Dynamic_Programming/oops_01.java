//package Dynamic_Programming;
//
//// Code for the class and object, inheritance
//class Person {
//    public String name;
//    private int age;
//    protected String address;
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}
//
//class Student extends Person {
//    public int marks;
//    public String grade;
//
//    Student(String name, int age, String address, int marks, String grade) {
//        this.name = name;
//        this.setAge(age);
//        this.address = address;
//        this.marks = marks;
//        this.grade = grade;
//    }
//
//    public void display() {
//        System.out.println("Name is: " + name);
//        System.out.println("Age is: " + getAge());
//        System.out.println("Address is: " + address);
//        System.out.println("Marks are: " + marks);
//        System.out.println("Grade is: " + grade);
//    }
//}
//
//public class oops_01 {
//    public static void main(String[] args) {
//        Student student = new Student("sachin", 20, "123 Main St", 85, "A");
//        student.display();
//    }
//}
//
//


// code for the encapsulation for the bank account
//package Dynamic_Programming;
//public class oops_01 {
//    static class Account{
//        private  double balance;
//
//        public double getBalance(double balance){
//            boolean result = validate("sachin","sachin123");
//
//
//            if(result==true){
//                this.balance = this.balance  - balance;
//                System.out.println("withdrawing"+balance +"amount");
//            }
//            else {
//                System.out.println("invalid data....!");
//            }
//
//            return 0.0f;
//        }
//
//        public double setBalance(double balance){
//            boolean result = validate("sachin","sachin123");
//            if(result==true){
//                this.balance = this.balance + balance;
//                System.out.println("depositing the money");
//            }
//            else {
//                System.out.println("invalid data.....");
//            }
//            return 0.0f;
//        }
//    }
//
//    public static boolean validate(String username, String password){
//        // authentication logic
//        return username.equalsIgnoreCase("sachin") && password.equals("sachin123");
//    }
//    public static void main(String[] args){
//   Account acc = new Account();
//   acc.setBalance(10000.0);
//   double balance =  acc.getBalance(5000.0);
//        System.out.println("withdrawing "+balance+" amount");
//    }
//}
//
//
//
//
//
// code for the different types of class available in the oops  i.e. static,final,abstract,inner

//package Dynamic_Programming;
//import java.util.Scanner;
//public class oops_01 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=10;i++){
//            System.out.println(n + "x" + i+ "="+ n*i);
//        }
//        System.out.println();
//    }
//}


//package Dynamic_Programming;
//import java.util.*;
//public class oops_01 {
//        public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number");
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}


//package Dynamic_Programming;
//import java.util.*;
//public class oops_01 {
//        public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number");
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
//    }
//}


//package Dynamic_Programming;
//import java.util.*;
//public class oops_01 {
//    public static int fibonacci(int n) {
//        if (n == 0) return 0;
//        if (n == 1) return 1;
//        int ans = fibonacci(n - 1);
//        int smallans = ans + fibonacci(n - 2);
//        return smallans;
//    }
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=0;i<n;i++){
//            System.out.println(fibonacci(i));
//        }
//    }
//}


/// /     this is the code for the dufferent class used in java
//package Dynamic_Programming;
//import java.util.*;
//
//// final class
//final class fclass{
//    public void print(){
//        System.out.println("Hello...this is the final");
//    }
//}
//// abstract classs
//abstract class Aclass{
//    public abstract void Amethod();
//}
//
//// static class
//class Outer {
//    static class nestedclass {
//        public void display(){
//            System.out.println("hello...this is the static ");
//        }
//    }
//}
//
//// inner class
//class Inner {
//    class Innerclass {
//        public void display(){
//            System.out.println("this is the inner class");
//        }
//    }
//}
//public class oops_01 {
//    public static void main(String[] args){
//        //final class
//        fclass fe = new fclass();
//        fe.print();
//
//
//        Outer.nestedclass nested = new Outer.nestedclass();
//        nested.display();
//
//
//        Inner in = new Inner();
//        Inner.Innerclass inner = in.new Innerclass();
//        inner.display();
//    }
//}

//package Dynamic_Programming;
//import java.util.*;
//
//public class oops_01 {
//    class Rectangle {
//        int length;
//        int breadth;
//        void getData(int x, int y) {
//            length = x;
//            breadth = y;
//        }
//        int rectArea() {
//            return length * breadth;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter length: ");
//        int a = sc.nextInt();
//        System.out.print("Enter breadth: ");
//        int b = sc.nextInt();
//
//        oops_01 outer = new oops_01();
//        Rectangle rect = outer.new Rectangle();
//        rect.getData(a, b);
//
//        System.out.println("The area of the rectangle is: " + rect.rectArea());
//
//    }
//}



//// triangle printing patter of *
//package Dynamic_Programming;
//import java.util.Scanner;
//public class oops_01 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number");
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

//package Dynamic_Programming;
//import java.util.Scanner;
//public class oops_01 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number");
//        int n = sc.nextInt();
//            for(int j=1;j<=n;j++){
//                for(int i=1;i<=j;i++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}


// code for the constructor
//package Dynamic_Programming;
//import java.util.*;
//
//class Employee {
//    String name;
//    int age;
//
//    Employee(){
//        System.out.println("Constructor gets called......");
//    }
//    public void display(){
//        System.out.println("name is" +name);
//        System.out.println("age is" +age);
//    }
//}
//public class oops_01 {
//    public static void main(String[] args){
//        Employee emp = new Employee();
//            emp.display();
//    }
//}



//package Dynamic_Programming;
//class Student {
//    //Data Security
//    private int RollNo;
//    private String name;
//    private String address;
//
//    //setter methods
//    public void setRollNo(int RollNo){
//        this.RollNo = RollNo;
//    }
//    public void setname(String name){
//        this.name  = name;
//    }
//    public void setaddress(String address){
//        this.address = address;
//    }
//
//    // getter methods
//    public int getRollNo(){
//        return RollNo;
//    }
//    public String  getname(){
//        return name;
//    }
//    public String getaddress(){
//        return address;
//    }
//}
//public class oops_01 {
//    public static void main(String[] args){
//        Student s1 = new Student();
//        s1.setRollNo(12);
//        s1.setname("Yash");
//        s1.setaddress("delhi");
//
//        System.out.println("RollNo is :: "+ s1.getRollNo());
//        System.out.println("Name is :: "+ s1.getname());
//        System.out.println("address is :: "+ s1.getaddress());
//    }
//}



// explaination of the local variable declare inside the dunction

//package Dynamic_Programming;
//import java.util.*;
//class Calculator {
//    public void add(int a, int b){
//        int result = a+b;
//        System.out.println("The sum is : "+result);
//    }
//}
//public class oops_01 {
//    public static void main(String[] args){
//        Calculator c = new Calculator();
//        c.add(12,23);
//
//
//    }
//}

/** the wrapper class object is created it contains the field and in this field we store the primitive data type
 * these are the pre defied and independent of other types
 */
//// code for the astaraction
//package Dynamic_Programming;
//import java.util.*;
//abstract class Animal {
//    public abstract void AnimalSound();
//
//    public void sleep() {
//        System.out.println("aaaa");
//    }
//}
//class Pig extends Animal {
//    public void AnimalSound(){
//        System.out.println("the pig says:....");
//    }
//}
//
//public class oops_01 {
//    public static void main(String[] args){
//        Pig newPig = new Pig();
//        newPig.AnimalSound();
//        newPig.sleep();
//
//    }
//}

//   polymorphism
// code for the methods overLoading
//package Dynamic_Programming;
//import java.util.*;
//class Calculator {
//    public void add(int a,int b){
//        System.out.println("int argumnet");
//    }
//    public void add(float a,float b){
//        System.out.println("float argument");
//    }
//    public void add(double a, double b){
//        System.out.println("double argument");
//    }
//}
//public class oops_01 {
//    public static void main(String[] args){
//    Calculator c = new Calculator();
//    c.add(1,2);
//    c.add(12.23f,23.45f);
//    c.add(12.34,34.56);
//    }
//}


// code to understand the method overriding

//package Dynamic_Programming;
//import java.util.*;
//
//class Sample{
//    public void methodOne(String s){
//        System.out.println("String version...");
//    }
//    public void methodOne(Object o){
//        System.out.println("Object version...");
//    }
//}
//public class oops_01 {
//    public static void main(String[] args){
//   Sample s = new Sample();
//   s.methodOne("sachin");
//   s.methodOne(12);
//   s.methodOne(null);
//    }
//}

//   code for the methods OverLoading
//package Dynamic_Programming;
//import java.util.*;
//class Calculator{
//    public void add(int a, int b){
//        System.out.println(a+b);
//    }
//    public void add(int a, int b, int c){
//        System.out.println(a+b+c);
//    }
//    public void add(int a, int b,int c, int d){
//        System.out.println(a+b+c+d);
//    }
//}
//class AdvancedCalculator {
//    public void add(int... args) {
//        int sum = 0;
//        for (int data : args) {
//            sum += data;
//        }
//        System.out.println(sum);
//    }
//}
//public class oops_01 {
//    public static void main(String[] args){
//        Calculator c = new Calculator();
//        c.add(1,2);
//        c.add(3,4,5);
//        c.add(6,7,8,9);
//        AdvancedCalculator ac = new AdvancedCalculator();
//        ac.add(12,23);
//        ac.add(34,45,67);
//        ac.add(45,67,89,90);
//    }
//}


// develop the car rental system to manage the system
package Dynamic_Programming;
import java.util.*;
abstract class Vehicle {
    private String vehicleId;
    private String model;
    private boolean available;

    public Vehicle(String vehicleId, String model) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.available = true;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public abstract double calculateRentalFee(int rentalDuration);
}

// Subclass: Car
class Car extends Vehicle {
    private static final double RENTAL_RATE = 50.0;

    public Car(String vehicleId, String model) {
        super(vehicleId, model);
    }

    public double calculateRentalFee(int rentalDuration) {
        return rentalDuration * RENTAL_RATE;
    }
}

// Subclass: Bike
class Bike extends Vehicle {
    private static final double RENTAL_RATE = 20.0;

    public Bike(String vehicleId, String model) {
        super(vehicleId, model);
    }
    public double calculateRentalFee(int rentalDuration) {
        return rentalDuration * RENTAL_RATE;
    }
}

// Subclass: Truck
class Truck extends Vehicle {
    private static final double RENTAL_RATE = 100.0;

    public Truck(String vehicleId, String model) {
        super(vehicleId, model);
    }
    public double calculateRentalFee(int rentalDuration) {
        return rentalDuration * RENTAL_RATE;
    }
}


class Customer {
    private String customerId;
    private String name;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }
}


class RentalService {
    public void rentVehicle(Vehicle vehicle, Customer customer, int rentalDuration) {
        if (vehicle.isAvailable()) {
            vehicle.setAvailable(false);
            double rentalFee = vehicle.calculateRentalFee(rentalDuration);
            System.out.println("Customer " + customer.getName() + " rented " + vehicle.getModel() +
                    " (ID: " + vehicle.getVehicleId() + ") for " + rentalDuration + " days.");
            System.out.println("Total Rental Fee: $" + rentalFee);
        } else {
            System.out.println("Sorry, " + vehicle.getModel() + " (ID: " + vehicle.getVehicleId() + ") is not available.");
        }
    }

    public void returnVehicle(Vehicle vehicle) {
        vehicle.setAvailable(true);
        System.out.println(vehicle.getModel() + " (ID: " + vehicle.getVehicleId() + ") has been returned and is now available.");
    }
}

public class oops_01 {
    public static void main(String[] args) {

        // Create vehicles
        Vehicle car = new Car("C101", "Toyota Corolla");
        Vehicle bike = new Bike("B202", "Yamaha MT-15");
        Vehicle truck = new Truck("T303", "Ford F-150");

        Customer customer1 = new Customer("CU001", "Yash");
        Customer customer2 = new Customer("CU002", "raj");
        RentalService rentalService = new RentalService();

        // Rent vehicles
        rentalService.rentVehicle(car, customer1, 3);
        rentalService.rentVehicle(bike, customer2, 2);
        rentalService.rentVehicle(car, customer2, 5);


        rentalService.returnVehicle(car);
        rentalService.returnVehicle(bike);

        // Rent the car again
        rentalService.rentVehicle(car, customer2, 5);
    }
}



//
//package Dynamic_Programming;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class oops_01 {
//
//    public static class SurveySystem {
//        private ArrayList<int[]> surveyResponses;
//
//
//
//        public SurveySystem() {
//            surveyResponses = new ArrayList<>();
//        }
//
//        public void addResponse(int[] responses) {
//            surveyResponses.add(responses);
//            System.out.println("Response added successfully.");
//        }
//
//        public void updateResponse(int respondentIndex, int questionIndex, int newAnswer) {
//            if (respondentIndex < surveyResponses.size() && questionIndex < surveyResponses.get(respondentIndex).length) {
//                surveyResponses.get(respondentIndex)[questionIndex] = newAnswer;
//                System.out.println("Response updated successfully.");
//            } else {
//                System.out.println("Invalid respondent or question index.");
//            }
//        }
//        public void analyzeFrequency() {
//            int maxAnswer = 0;
//            for (int[] responses : surveyResponses) {
//                for (int answer : responses) {
//                    if (answer > maxAnswer) {
//                        maxAnswer = answer;
//                    }
//                }
//            }

//            int[] frequency = new int[maxAnswer + 1];
//
//
//            for (int[] responses : surveyResponses) {
//                for (int answer : responses) {
//                    frequency[answer]++;
//                }
//            }
//            System.out.println("Frequency Analysis:");
//            for (int i = 1; i < frequency.length; i++) {
//                System.out.println("Answer " + i + ": " + frequency[i] + " responses");
//            }
//        }
//        public void displayResponses() {
//            System.out.println("Survey Responses:");
//            for (int i = 0; i < surveyResponses.size(); i++) {
//                System.out.print("Respondent " + (i + 1) + ": ");
//                for (int response : surveyResponses.get(i)) {
//                    System.out.print(response + " ");
//                }
//                System.out.println();
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        SurveySystem surveySystem = new SurveySystem();
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("\nSurvey System Menu:");
//            System.out.println("1. Add New Response");
//            System.out.println("2. Update Existing Response");
//            System.out.println("3. Analyze Frequency");
//            System.out.println("4. Display All Responses");
//            System.out.println("5. Exit");
//            System.out.print("Enter your choice: ");
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter the number of questions answered by the respondent: ");
//                    int numQuestions = scanner.nextInt();
//                    int[] responses = new int[numQuestions];
//                    System.out.println("Enter the responses (answer choices as integers):");
//                    for (int i = 0; i < numQuestions; i++) {
//                        responses[i] = scanner.nextInt();
//                    }
//                    surveySystem.addResponse(responses);
//                    break;
//
//                case 2:
//                    System.out.print("Enter the respondent index (starting from 1): ");
//                    int respondentIndex = scanner.nextInt() - 1;
//                    System.out.print("Enter the question index (starting from 1): ");
//                    int questionIndex = scanner.nextInt() - 1;
//                    System.out.print("Enter the new answer: ");
//                    int newAnswer = scanner.nextInt();
//                    surveySystem.updateResponse(respondentIndex, questionIndex, newAnswer);
//                    break;
//
//                case 3:
//                    surveySystem.analyzeFrequency();
//                    break;
//
//                case 4:
//                    surveySystem.displayResponses();
//                    break;
//
//                case 5:
//                    System.out.println("Exiting the survey system. Goodbye!");
//                    scanner.close();
//                    return;
//
//                default:
//                    System.out.println("Invalid choice. Please try again.");
//            }
//        }
//    }
//}
