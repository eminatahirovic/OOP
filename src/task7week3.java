//Implement a method searchStudent(ArrayList<String> list, String name) to check if a name
// exists in the list.
import java.util.ArrayList;
public class task7week3 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Emina");
        students.add("Ena");
        students.add("Ejla");
        students.add("Nejla");

        String nameToSearch = "Emina";
        if (searchStudent(students, nameToSearch)){
            System.out.println(nameToSearch + " exists in the list.");
        }
        else{
            System.out.println(nameToSearch + " does not exist in the list.");
        }
    }
    public static boolean searchStudent(ArrayList<String> list, String name){
        return list.contains(name);

    }
}
