//Write a method getRandomStudent(ArrayList<String> list)
// that randomly selects a student. Use Random to generate an index.
// Call the method multiple times to check randomness.

import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;
public class task8week3 {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();

        studentNames.add("Sam");
        studentNames.add("Jane");
        studentNames.add("Bob");

        for (int i = 0; i < 3; i++){
            System.out.println("random student name: " + studentNames.get(i));
        }

    }
    public static String getRandomStudent(ArrayList<String> list){
        Random random = new Random();
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}
