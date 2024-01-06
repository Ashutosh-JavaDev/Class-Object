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
    
}
