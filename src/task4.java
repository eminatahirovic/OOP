//Write a method sumNatural(int n) that returns the sum of the first n natural numbers. Example:
//sumNatural(5) → 15
//sumNatural(10) → 55
//Hint: Natural numbers are a part of the number system, including all the positive numbers from 1 to infinity.


public class task4 {
    public static void main(String[] args){
        System.out.println(naturals(5));
        System.out.println(naturals(3));
    }
    public static int naturals(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum+=i;
        }
        return sum;
    }
}