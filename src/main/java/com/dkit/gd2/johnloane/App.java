package com.dkit.gd2.johnloane;

/**
 * Create a new class for a bank account
 * Create fields for the account number, balance, customer name, email and phone number
 * deposit to deposit money
 * withdraw to take money out, should fail if insufficient funds
 *
 * Create a new class called VipCustomer
 * It should have 3 fields, name, credit limit, email address
 * Create 3 constructors
 * 1st empty and calls the constructor with 3 parameters to give default values
 * 2nd should pass on the two values it receives and add a default value for the third
 * 3rd should save all fields
 */
public class App 
{
    public static void main( String[] args )
    {
//        Account johnsAccount = new Account();
//
//        johnsAccount.deposit(100);
//        System.out.printf("%.2f", johnsAccount.getBalance());
//        johnsAccount.withdraw(100);
//
//        VipPerson james = new VipPerson();
//        System.out.println(james.getName());
//
//        VipPerson niall = new VipPerson("Niall", 250000);
//        System.out.println(niall.getName());
//
//        VipPerson adam = new VipPerson("Adam", 3000, "adam@gmail.com");
//        System.out.println(adam.getName());
//        System.out.println(adam.getEmailAddress());
        animalInheritance();

    }

    public static void animalInheritance()
    {
        Animal animal = new Animal("Harry", 12, 12, true, 15);

        Dog harry = new Dog("Harry", 12, 12, true, 15, 4, "Mongrel", 15, 38, "Male", false, "Orange");

        harry.eat();
        harry.move(3);
        harry.run();
        harry.walk();

        Fish wanda = new Fish("Wanda", 2, 6, true, 1, 2, 2, 8);
        wanda.swim(15);
    }

    /* Challenge
    Start with a base class of Vehicle, then create a car class that inherits from this base class. Finally create another class of a specific type of car that inherits from the car class.
    You should be able to handle steering, changing gears, moving.
    You will need to decide where to put the appropriate state and behaviours.
    Changing gears, increasing and decreasing speed should be supported
    For the specific type of car you need to add something specific to that car
     */
}
