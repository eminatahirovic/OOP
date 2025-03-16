//Create a method that will receive an ArrayList of student names and sort
// the student list in alphabetical order and print out all students names.

import java.util.ArrayList;
import java.util.Collections;

public class task6week3 {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();

        studentNames.add("Sam");
        studentNames.add("Jane");
        studentNames.add("Bob");

    Collections.sort(studentNames);
    for (String student : studentNames){
        System.out.println(student);
    }
}
}




//ArrayList<String> teachers = new ArrayList<String>();
//
//teachers.add("Paul");
//teachers.add("John");
//teachers.add("Anthony");
//
//Collections.sort(teachers);
//for (String teacher : teachers) {
//   System.out.println(teacher);
//}