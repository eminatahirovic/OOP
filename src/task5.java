//Write a method reverseString(String str) that returns the reversed string. Example:
//reverseString("hello") → "olleh"
//reverseString("Java") → "avaJ"



public class task5{
    public static void main(String[] args){
        System.out.println(reverseString("Java"));
        System.out.println(reverseString("Hello"));
    }
    public static String reverseString(String str){
        String reverse = "";
        for (int i = str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }
}