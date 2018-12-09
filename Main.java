public class Main {

    public static void main(String[] args) {
        perfectSquare(10);
        perfectCube(10);
        fibonacciSequence(10);
        primeNumber(10);
        triangleNumber(10);
    }

    public static void perfectSquare(int total) {
        int a = 1;
        int b = 1;
        int c = 1;
        System.out.print("First 10 Square Numbers: ");
        while (c <= total) {
            b = a * a;
            System.out.print(b + " ");
            a++;
            c++;
            //I feel that the counter(c) should be different from the tester(a)
        }
    }

    public static void perfectCube(int total) {
        int a = 1;
        int b = 1;
        int c = 1;
        System.out.print("\nFirst 10 Cube Numbers: ");
        while (c <= total) {
            b = a * a * a;
            System.out.print(b + " ");
            a++;
            c++;
        }
    }

    public static void fibonacciSequence(int total) {
        int a = 0;
        int b = 1;
        int c = 0;
        int d = 1;
        System.out.print("\nFirst 10 Fibonacci Numbers: ");
        while (d <= total) {
            c = a + b;
            a = b;
            b = c;
            System.out.printf(c +  " ");
            d++;
        }
    }

    public static void primeNumber(int total) {
        boolean prime1 = false;
        int increment = 1;
        boolean end = false;
        int test = 2;
        int howmanyprimesugot = 0;
        System.out.print("\nFirst 10 Prime Numbers: ");
        while (howmanyprimesugot < total) {
           //this loop increments the "test" to make the amount of primes go up
           increment = 2;
           end = false;
           prime1 = false;
           while (!prime1 && !end) {
            //this loop increments the "increment" for calculating if one number is prime
//            System.out.println("set0");
            if (test == increment) {
                prime1 = true;
//                System.out.println("set1");
            }
            if ((test % increment == 0) && !prime1) {
                prime1 = false;
                end = true;
//                System.out.println("set2");
            }
//            System.out.println("set3");
                increment++;
        }
//        System.out.println("set4");
        if (prime1) {
            System.out.print(test + " ");
            howmanyprimesugot++;
        }
        test++;
        //Sorry it's messy
        }
    }

    public static void triangleNumber(int total) {
        int a = 1;
        int b = 0;
        int c = 1;
        System.out.print("\nFirst 10 Triangle Numbers: ");
        while (c <= total) {
            b = (a * (a + 1)) / 2;
            System.out.print(b + " ");
            a++;
            c++;
        }
    //I know that I could eliminate a line of code and make it more
    //efficient by making the "a" also the counter/total compare
    }
}