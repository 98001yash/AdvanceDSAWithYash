//package chauhan;
// code for the abstraction and thd data hiding
// a very long explanation
//public class OOPs {
//    static class Account {
//        // Data security
//        private double balance;
//
//        //methods : public
//        public double getBalance(double balance) {
//            //perfrom the authentication
//            boolean result = validate("sachin","sachin123");
//
//
//            // withdrawing the money
//          if(result==true){
//              this.balance  = this.balance  - balance;
// System.out.println("withdrawing ::" +balance +  "Amount");
//          }
//          else {
//              System.out.println("invalid userName/password");
//          }
//return 0.0f;
//
//        }
//
//        //methods:public
//        public void setBalance(double balance) {
//            //perfrom the authentication
//            boolean result = validate("sachin","sachin123");
//            if (result == true) {
//                // deposit the money
//                this.balance = this.balance + balance;
//                System.out.println("credited to the account");
//            } else {
//                // throws a meaninful exception
//System.out.println("invalid userName/password");
//            }
//
//        }
//
//
//    private boolean validate(String userName, String password) {
//        //logic for the authentication
//        return userName.equalsIgnoreCase("sachin") && password.equals("sachin123");
//
//    }
//}
//
//    public static void main(String[] args){
//  Account acc = new Account();
//    acc.setBalance(1000.0);
//    double balance  =acc.getBalance(500.0);
// System.out.println("withdrawing ::" +balance +  "Amount");
//
//    }
//}







// code for the encapsulation
//  datahiding + abstraction
//
//package chauhan;
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
//public class OOPs {
//    public static void main(String[] args){
//    Student s1 = new Student();
//    s1.setRollNo(12);
//    s1.setname("Yash");
//    s1.setaddress("Sadipur");
//
//        System.out.println("RollNo is :: "+ s1.getRollNo());
//        System.out.println("Name is :: "+ s1.getname());
//        System.out.println("address is :: "+ s1.getaddress());
//    }
//}
//
//



//
// code to explain the inheritence
//package chauhan;
//class Person {
//    public String name;
//    public String address;
//    public int age;
//}
//class Student extends Person {
//    public int marks;
//    public String grade;
//
//Student(String name, String address, int age, int marks,String grade){
//        this.name  = name;
//        this.address = address;
//        this.age  = age;
//        this.marks = marks;
//        this.grade = grade;
//}
//
//public void display(){
//    System.out.println("Name is::" +name);
//    System.out.println("Address is::" +address);
//    System.out.println("age is::" +age);
//    System.out.println("marks is::" +marks);
//    System.out.println("grade is::" +grade);
//}
//}
//public class OOPs {
//    public static void main(String[] args){
//    Student s1 = new Student("sachin","MI",51,100,"A");
//        s1.display();
//    }
//}





// uses of constructor through the code

//package chauhan;
//class Employee {
//
//    //instances variable
//    String name;
//    int age;
//
//    // zero argument constructor
//    Employee(){
//  System.out.println("Employee constructor gets called...");
//    }
//
//    // instances methods
//    public void display()
//    {
//        System.out.println("Name is:: "+name);
//        System.out.println("Age is:: "+age);
//    }
//
//}
//public class OOPs {
//    public static void main(String[] args){
//        Employee emp = new Employee();
//        emp.display();
//    }
//}




// memory will be given in the stack Area only
// explanation of the  local variables declare inside the method
//package chauhan;
//class calculator {
//    public void add(int a, int b){
//        int result = a + b;
//        System.out.println("The sum is:: "+result);
//    }
//}
//public class OOPs {
//    public static void main(String[] args){
//        calculator c = new calculator();
//        c.add(12,32);
//    }
//}







// code to explain the static variables
//
//
//package chauhan;
//class LoanApp{
//
//    //static variables
//    static float rateOfInterest = 9.5f;
//}
//public class OOPs {
//    public static void main(String[] args){
//        System.out.println(LoanApp.rateOfInterest);
//    }
//}
//
//




//
//package chauhan;
//class student  {
//    // instances variables
//    String name;
//    int age;
//    //constructor
//    student(String name, int age){
//        this.name  = name;
//        this.age   = age;
//    }
//    public void display(){
//        System.out.println("Name is :: "+name);
//        System.out.println("Age is :: "+age);
//    }
//}
//public class OOPs {
//    public static void main(String[] args){
//        student s = new student("sachin",76);
//        s.display();
//    }
//}





// code for the method overloading
//

class calculator {
    public void add(int a) {
        System.out.println("int argument");
    }
    public void add(float a) {
        System.out.println("float argument");
    }
    public void add(double a) {
        System.out.println("double argument");
    }
    // Overloaded methods for two arguments
    public void add(int a, int b) {
        System.out.println("int, int arguments");
    }
    public void add(float a, float b) {
        System.out.println("float, float arguments");
    }
    public void add(double a, double b) {
        System.out.println("double, double arguments");
    }
}
public class OOPs {
    public static void main(String[] args) {
        calculator c = new calculator();
        c.add(12, 23);
        c.add(12.02f, 32.02f);
        c.add(23.0, 45.0);
        c.add('a');
        c.add(19L);
        c.add(10.5);
    }
}

//
//
//
//


// code to understand the methodOverloading
//package chauhan;
//class sample {
//    public void methodOne(String s){
//        System.out.println("String version...");
//    }
//    public void methodOne(Object o){
//        System.out.println("object version...");
//    }
//}
//public class OOPs {
//    public static void main(String[] args){
//        sample s = new sample();
//        s.methodOne("sachin");
//        s.methodOne(new Object());
//        s.methodOne(null);
//    }
//}




//
//package chauhan;
//class Animal{}
//class Monkey extends Animal {
//}
//class AnimalApp{
//    public void m1(Monkey m){
//        System.out.println("Monkey version...");
//    }
//    public void m1(Animal a){
//        System.out.println("Animal version...");
//    }
//}
//public class OOPs {
//    public static void main(String[] args){
//        AnimalApp a = new AnimalApp();
//        Monkey m = new Monkey();
//        a.m1(m);
//        Animal animal = new Animal();
//        a.m1(animal);
//        Animal an = new Monkey();
//        a.m1(an);
//
//    }
//}






//  method overloading
// code to solve through the Var-args method in the shortcut form
//package chauhan;
//class calculator {
//    public void add(int a, int b){
//        System.out.println(a+b);
//    }
//    public void add(int a, int b, int c){
//        System.out.println(a+b+c);
//    }
//    public void add(int a, int b, int c, int d){
//        System.out.println(a+b+c+d);
//    }
//    public void add(int a, int b, int c, int d, int e){
//        System.out.println(a+b+c+d+e);
//    }
//}
//class advancedCalculator {
//    public void add(int... args){
//        int sum = 0;
//        for(int data:args){
//            sum+=data;
//        }
//        System.out.println(sum);
//    }
//}
//public class OOPs {
//    public static void main(String[] args){
//    calculator c = new calculator();
//    c.add(10,20);
//        c.add(10,20,30);
//        c.add(10,20,30,40);
//        c.add(10,20,30,40,50);
//
//advancedCalculator ac = new advancedCalculator();
//ac.add(10,20);
//        ac.add(10,20,30);
//        ac.add(10,20,30,40);
//        ac.add(10,20,30,40,50);
//    }
//}
//
//



// code for the method overriding

//
//package chauhan;
//class parents {
//    public void property(){
//        System.out.println("Land+Cash+Gold...");
//    }
//    public void marry(){
//        System.out.println("Relative girl");
//    }
//}
//class child extends parents {
//
//    // overriding
//    public void marry()
//    {
//        // overriding
//        // ;changing the implementation
//        System.out.println("SomeOther girl...");
//    }
//}
//public class OOPs {
//    public static void main(String[] args) {
////parent objct
//        parents p1 = new parents();
//        p1.property();
//        p1.marry();
//
//        System.out.println();
//
//
//          //chid class
//        child c1 = new child();
//         c1.property();
//         c1.marry();
//
//        System.out.println();
//

//
//        // overriding the parent class in the child class
//        parents p2 = new child();
//        p2.property();
//        p2.marry();
//    }
//}
//
//
//
//
//
//





// code for the method Overriding
// code for the true polymorphism
//
//package chauhan;
//class plane {
//    public void takeOff() {
//        System.out.println("Plane tookOff...");
//    }
//    public void fly(){
//        System.out.println("Plane is flying...");
//    }
//    public void land(){
//        System.out.println("Plane is landing...");
//    }
//}
//class PassengerPlane extends plane {
//    public void takeOff() {
//        System.out.println("Passenger-Plane tookOff...");
//    }
//    public void fly(){
//        System.out.println("Passenger-Plane is flying...");
//    }
//    public void land(){
//        System.out.println("Passenger-Plane is landing...");
//    }
//}
//class FighterPlane extends plane{
//    public void takeOff() {
//        System.out.println("Fighter-Plane tookOff...");
//    }
//    public void fly(){
//        System.out.println("fighter-Plane is flying...");
//    }
//    public void land(){
//        System.out.println("fighter-Plane is landing...");
//    }
//}
//class CargoPlane extends plane {
//    public void takeOff() {
//        System.out.println("cargo-Plane tookOff...");
//    }
//    public void fly(){
//        System.out.println("cargo-Plane is flying...");
//    }
//    public void land(){
//        System.out.println("cargo-Plane is landing...");
//    }
//}
//class Airport {
//    public void allowPlane(plane p){
//        p.takeOff();
//        p.fly();
//        p.land();
//        System.out.println();
//    }
//}
//public class OOPs {
//    public static void main(String[] args){
//PassengerPlane p = new PassengerPlane();
//CargoPlane c = new CargoPlane();
//FighterPlane f = new FighterPlane();
//
//Airport a = new Airport();
//a.allowPlane(p);
//a.allowPlane(c);
//a.allowPlane(f);
//    }
//}




// one more code to understand the logic of methodOverriding
//
//package chauhan;
//class Animal {
//    public void eat(){
//        System.out.println("animal is eating...");
//    }
//    public void sleep(){
//        System.out.println("animal is sleeping...");
//    }
//}
//class Monkey extends Animal {
//    public void eat(){
//        System.out.println("Monkey steals and eat...");
//    }
//    public void sleep(){
//        System.out.println("Monkey is sleeping...");
//    }
//}
//class Deer extends Animal {
//    public void eat(){
//        System.out.println("Deer grazes and eats...");
//    }
//    public void sleep(){
//        System.out.println("Deer is sleeping...");
//    }
//}
//class Lion extends Animal {
//    public void eat(){
//        System.out.println("Lion hunts and eats...");
//    }
//    public void sleep(){
//        System.out.println("Lion is sleeping...");
//    }
//}
//class forest {
//    public void allowAnimal(Animal a ){
//        a.eat();
//        a.sleep();
//        System.out.println();
//    }
//}
//public class OOPs {
//    public static void main(String[] args){
//     forest f = new forest();
//     f.allowAnimal(new Monkey());
//     f.allowAnimal(new Deer());
//     f.allowAnimal(new Lion());
//    }
//}





// Rule 1:
// in case of overriding we can not change the return type
// of the method.if we want to change then there should be the
// relationship between the return type of the method
//package chauhan;
//class Parent {
//    public Object MethodOne(){
//        return null;
//    }
//    }
//    class child extends Parent {
//        public String methodOne(){
//            System.out.println("Hello from child...");
//            return null;
//        }
//    }
//
//public class OOPs {
//    public static void main(String[] args){
//        Parent p = new Parent();
//        p.MethodOne();
//    }
//}



// Rule 2:
// while overriding, we can not change the scope of the method
//private <  default < protected < public




//Rule 3:
//private method do not participate in the inheritance so
// overriding in child class is not possible




//Rule 4:
// final is an access modifier applicable at
// 1.variables:if applied at variable level, then we can not
// change the value
// 2.methods: if applied at the method level , then we can not
// Override the method
//3.class : if applied at class level, then the class will not
//participate in the inheritance




// Rule 5:
// abstract is an access modifier applicable at
//1.methods: if we are not giving the body for a  method then
// the mark the method as abstract

// 2: class : if we do  not want the object to be created for a class
// the marks the class as  abstract







// code to explain the abstract class

//package chauhan;
//abstract class plane {
//    public abstract void takeOff();
//    public abstract void fly();
//    public abstract void land();
//}
//class PassengerPlane extends plane {
//    public  void takeOff(){
//        System.out.println("Passenger-plane tookOff..");
//    }
//    public void fly(){
//        System.out.println("Passenger-plane is flying..");
//    }
//    public void land(){
//        System.out.println("Passenger-plane is landing..");
//    }
//}
//class CargoPlane extends plane {
//    public void takeOff(){
//        System.out.println("Cargo-plane tookOff..");
//    }
//    public void fly(){
//        System.out.println("Cargo-plane is flying..");
//    }
//    public void land(){
//        System.out.println("Cargo-plane is landing..");
//    }
//}
//class fighterPlane extends plane {
//    public void takeOff(){
//        System.out.println("Fighter-plane tookOff..");
//    }
//    public void fly(){
//        System.out.println("Fighter-plane is flying..");
//    }
//    public void land(){
//        System.out.println("Fighter-plane is landing..");
//    }
//}
//class Airport {
//    public void allowPlane(plane ref){
//        ref.takeOff();
//        ref.fly();
//        ref.land();
//        System.out.println();
//    }
//}
//
//public class OOPs {
//    public static void main(String[] args){
//      Airport a = new Airport();
//      a.allowPlane(new PassengerPlane());
//      a.allowPlane(new CargoPlane());
//      a.allowPlane(new fighterPlane());
//    }
//}



// code to understand the concept of the abstract also contains
// the parameterised constructor

//
//package chauhan;
//abstract class Person {
//    String name;
//    int age;
//    float height;
//    Person(String name, int age,float height){
//        this.name  = name;
//        this.age  = age;
//        this.height = height;
//    }
//}
//class Student extends Person {
//    int marks;
//    float avg;
//Student(String name , int age, float height, int marks, float avg){
//   // to call the parameterised constructor from the parent
//    // class to the child class
//    super(name, age , height);
//    this.marks  = marks;
//    this.avg = avg;
//    }
//    public void display(){
//        System.out.println("Name is:: "+name);
//        System.out.println("Age is :: "+age);
//        System.out.println("Height is :: "+height);
//        System.out.println("Marks is:: "+marks);
//        System.out.println("Aversge is:: "+avg);
//    }
//}
//public class OOPs {
//    public static void main(String[] args){
//    Student s = new Student("Sachin",51,5.6f,100,53.3f);
//    s.display();
//    }
//}







//
//
//package chauhan;
//abstract class Bird {
//    public abstract void fly();
//    public abstract void eat();
//}
//class sparrow extends Bird {
//    public void fly(){
//        System.out.println("Sparrow fly at short-height");
//    }
//    public void eat(){
//        System.out.println("sparrow eat grains..");
//    }
//}
////abstract class can contains:concrete, abstract
//abstract class Eagle extends Bird {
//    public void fly() {
//        System.out.println("Eagle fly at very very height..");
//
//    }
//
//    public abstract void eat();
//}
//class SerpentEagle extends Eagle  {
//    public void eat(){
//        System.out.println("SerpentEagle eats snakes..");
//    }
//}
//class GoldenEagle extends Eagle  {
//    public void eat(){
//    System.out.println("Golden eagle catches prey over the ocean");
//    }
//}
//class Crow extends Bird {
//    public void fly(){
//        System.out.println("Crow fly at medium height..");
//    }
//    public void eat(){
//        System.out.println("crow eat grains..");
//    }
//}
//class Sky {
//    public void allowBird(Bird ref) {
//        ref.fly();
//        ref.eat();
//        System.out.println();
//    }
//}
//
//
//public class OOPs {
//    public static void main(String[] args){
//Sky s = new Sky();
//  s.allowBird(new sparrow());
//  s.allowBird(new SerpentEagle());
//  s.allowBird(new GoldenEagle());
//  s.allowBird(new Crow());
//    }
//}



//




//package chauhan;
//interface Icalculator {
//    void add(int a, int b);
//    void sub(int a, int b);
//        void mul(int a,int b);
//        void div(int a, int b);
//}
//class calculator implements Icalculator {
//    public void add(int a, int b){
//        System.out.println("The sum is :: "+(a+b));
//    }
//    public void sub(int a, int b){
//        System.out.println("the diff is :: "+(a-b));
//    }
//    public void mul(int a, int b){
//        System.out.println("the multiplication is:: "+(a*b));
//    }
//    public void div(int a, int b){
//        System.out.println("the div is :: "+(a/b));
//    }
//}
//public class OOPs {
//    public static void main(String[] args){
//        Icalculator calculator = new calculator();
////        calculator(10,20);
//    }
//}



