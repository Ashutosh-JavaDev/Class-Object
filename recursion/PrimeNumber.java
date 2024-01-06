package recursion;

class primeNumber {
    void PrimeNumbercheck(int num, int i, int count) {
        if (i > num) {
            if (count == 2) {
                System.out.println("Number is Prime");
            } else {
                System.out.println("Number is not Prime");
            }
            return;
        } else if (num % i == 0) {
            PrimeNumbercheck(num, i + 1, count + 1);
        } else {
            PrimeNumbercheck(num, i + 1, count);
        }
    }
}

public class PrimeNumber {
    public static void main(String[] args) {
        primeNumber ob = new primeNumber();
        ob.PrimeNumbercheck(15, 1, 0);
    }
}
