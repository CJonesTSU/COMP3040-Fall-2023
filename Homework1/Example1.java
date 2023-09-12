import java.util.Scanner;

public class Example1{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("This program will count the number " +
                            "of primes between zero and a number you choose.");
        System.out.print("Enter the top value for the check: ");
        int n = Integer.parseInt(keyboard.nextLine());
        System.out.println("Sieve method 'calculation count': " + sieve(n));
        System.out.println("Square root method 'calculation': " + sqrtMethod(n));
        keyboard.close();
    }

    public static int sieve(int n){
        int primeCount = 0;
        int calculations = 0;
        boolean isPrime = true;
        for(int i = 2; i < n; i++){
            isPrime = true;
            for(int j = 2; j < i; j++){
                calculations++;
                if(i % j == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                primeCount++;
            }        
        }
        System.out.println("Sieve found " + primeCount + " primes between 0 and " + n );
        return calculations;
    }

    public static int sqrtMethod(int n){
        int primeCount = 1; // cheating a bit, this covers '2' which gets skipped below.
        int calculations = 0;
        boolean isPrime = true;
        for(int i = 2; i < n; i++){
            isPrime = true;
            int loopCount = (int)(Math.ceil(Math.sqrt(i)));
            for(int j = 2; j <= loopCount; j++){
                calculations++;
                if(i % j == 0){
                    isPrime = false;
                }
            }
            if(isPrime){
                primeCount++;
                //System.out.println(i + " " + loopCount);
            }        
        }
        System.out.println("SqrtMethod found " + primeCount + " primes between 0 and " + n );
        return calculations;
    }
}