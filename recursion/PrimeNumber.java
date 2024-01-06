package recursion;
class primeNumber{
    void PrimeNumbercheck(int num,int i,int count){
        if(i>num){
            return;
        }
        else{
            if(num%i==0){
                PrimeNumbercheck(num, i+1, count+1);
                if(count==2){
                    System.out.println("Number is  Prime");
                }
                else{
                    System.out.println("Number is not Prime");
                }
            }
        }
    }
}
public class PrimeNumber {
    
}
