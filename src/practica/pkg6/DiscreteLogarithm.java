
package practica.pkg6;
import java.math.*;
public class DiscreteLogarithm {
    public static int solve(BigInteger number, BigInteger mod, BigInteger result){
        int i = 1;
        boolean flag = false;
        int res = 1;
        int res2 = 1;
        while(res!=0 || flag == false){
            res = BigInteger.valueOf(i).compareTo(mod);
            res2 = result.compareTo((number.pow(i)).mod(mod));
            if(res2 == 0){
                flag = true;
                return i;
            }
            System.out.println(i);
            i++;   
        }
        return i-1;
    }
}
