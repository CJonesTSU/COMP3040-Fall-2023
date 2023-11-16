package Recursion;

public class RecursiveCall {
    public static void main(String[] args){
        System.out.println("Trying 3: " + multiplyByFive(3));
    } 

    public static int multiplyByFive(int base){
        int count = 1;
        return recursive(base, count);
    }

    public static int recursive(int base, int count){
        if (count > 5000000) {
            return base; 
        } else {
            return base + recursive(base, count +1);
        }
    }
}
