//Write a method countDigits(int n) that returns the number of digits in a given integer.

public class task8{
    public static void main(String[] args){

    }
    public static int countDigits(int n){
        int count = 0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }

}
