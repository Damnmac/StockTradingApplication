import java.util.*;
//6.0 Interfaces
// 5.0 Inheritance, Polymorphism, Abstract Classes
public class RegularCustomer extends Customer implements CustomerType // 5.0 Inheritance, Polymorphism, Abstract Classes
{
    static ArrayList <RegularCustomer> customers = new ArrayList<>();
    static int customerCount = 0;
    int [][] stocks = new int[3][1000];


    RegularCustomer(String name, String age, String occupation) //4.0 Object Oriented Programming
    {
        this.name = name;
        this.age = age;
        this.occupation = occupation;

        customerCount++;
    }

    static public RegularCustomer getCustomer(int i)
    {
        return customers.get(i);
    }

    static public int getCustomerCount()
    {
        return customerCount;
    }

    public static void addCustomer(RegularCustomer p)
    {
        customers.add(p);
    }


    public String getName(){
        return this.name;
    }

    @Override // 2.0 Multidimensional Arrays and Best Practices
    public String toString()
    {
        return  "\nname:" + name +
                "\nage:" + age +
                "\noccupation:" + occupation + "\n";
    }
}
