//Create a method that will receive an ArrayList<Integer> of five random numbers as a parameter.
// Sort the list in ascending order. Remove all even numbers from the list. Return updated ArrayList.
import java.util.ArrayList;
import java.util.Collections;
public class task9week3 {
    public static void main(String[] args) {


        ArrayList<Integer> randomNumber = new ArrayList<>();
        randomNumber.add(1);
        randomNumber.add(4);
        randomNumber.add(2);
        randomNumber.add(3);
        randomNumber.add(5);

        ArrayList<Integer> updatedList = processList(randomNumber);
        System.out.println("updated list: " + updatedList);

    }

   public static ArrayList<Integer> processList(ArrayList<Integer> list){
        Collections.sort(list);

        list.removeIf(n ->n % 3 == 0 );
        return list;
   }
}
