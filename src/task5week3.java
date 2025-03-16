//Create a method that will:
//Create an ArrayList<String> of student names.
//Add five names to the list.
//Remove a specific name.
//Print all names using:
//A for loop
//A for-each loop
//A while loop
import java.util.ArrayList;
public class task5week3 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        students.add("Emina");
        students.add("Ena");
        students.add("Lejla");
        students.add("Ajla");
        students.add("Sejla");

        students.remove("Sejla");

        System.out.println("This is using a for loop: ");
        for (int i = 0; i < students.size(); i++ ){
            System.out.println(students.get(i));
        }
        System.out.println("This is a while loop");
        int i = 0;
        while ( i < students.size()){
            System.out.println(students.get(i));
            i++;
        }
        System.out.println("This is a for each loop ");
        for (String name : students){
            System.out.println(name);
        }
    }

    }



