package recursion;
class power{
    int powercal(int base,int power){
        if(power<2){
            return base;
        }
        else{
            return base*powercal(base, power-1);
        }
    }
}
public class CalculatePower {
    public static  void main(String[]args){
        power ob=new power();
        int result=ob.powercal(2, 5);
        System.out.println("Answer: "+result);


    }
}
