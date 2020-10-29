package FibonacciPrimes;

public class FibonacciPrimes {
    public static void main(String[] args) {
        int reference=500_000;
        int difference=fibonacciPrimeDifference(reference);
        System.out.println(difference);
    }

    private static int fibonacciPrimeDifference(int reference) {
        int n1=0;
        int n2=1;
        int n3;

        int greatestFibonacciPrime=0;
        int smallestFibonacciPrime=0;
        int difference=0;

        while (difference==0){
            n3=n1+n2;
            n1=n2;
            if (isPrime(n2)){
                if (n2<reference){
                    greatestFibonacciPrime=n2;

                } else if(n2>reference){
                    smallestFibonacciPrime=n2;
                    difference=smallestFibonacciPrime-greatestFibonacciPrime;
                }
            }
            n2=n3;
        }
        System.out.println(greatestFibonacciPrime);
        System.out.println(smallestFibonacciPrime);
        return difference;
    }

    private static boolean isPrime(int n2) {
        if (n2==1) {
            return false;
        } else if (n2==2 || n2==3 || n2==5){
            return true;
        } else if(n2%2==0){
            return false;
        } else{
            for (int i = 3; i < n2/2; i++) {
                if(n2%i==0)
                    return false;
            }
            return true;
        }

    }


}
