//Create three overloaded (method with different signatures) methods printDetails():
//One that accepts a String name and prints “Hi, My name is [name]”.
//One that accepts a String name and an int age and prints “Hi, My name is [name] and I am [age] years old”.
//One that accepts a String name, an int age, and a String city and prints “Hi, My name is [name] and I am [age]
// years old and I am coming from [city]”.

public class task3week3 {
    public static void main(String[] args){
        printDetails("Emina");
        printDetails("Emina", 19);
        printDetails("Emina", 19, "Sarajevo");


    }
    public static void printDetails(String name){
        System.out.println("Hi my name is " + name);
    }
    public static void printDetails(String name, int age){
        System.out.println("Hi my name is " + name + " and my age is " + age);
    }
    public static void printDetails(String name, int age, String city){
        System.out.println("Hi my name is " + name + " and my age is " + age + " and my city is " + city);
    }
}
