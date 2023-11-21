package Recursion;

public class RecursiveCall {
    public static void main(String[] args){
        System.out.println("Trying 3: " + multiplyByThree(2));
    } 

    public static int multiplyByThree(int base){
        int count = 1;
        return recursive(base, count);
    }

    public static int recursive(int base, int count){
        if (count == 3) {
            return base; 
        } else {
            return base + recursive(base, count +1);
        }
    }
}
