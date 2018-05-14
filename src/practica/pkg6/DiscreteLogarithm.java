
package practica.pkg6;
import java.math.*;
public class DiscreteLogarithm {
    public static BigInteger pow(BigInteger base, BigInteger exponent) {
  BigInteger result = BigInteger.ONE;
  while (exponent.signum() > 0) {
    if (exponent.testBit(0)) result = result.multiply(base);
    base = base.multiply(base);
    exponent = exponent.shiftRight(1);
  }
  return result;
}
    public static int solve(BigInteger number, BigInteger mod, BigInteger result){
        BigInteger i = new BigInteger("1");
        boolean flag = false;
        int res = 1;
        int res2 = 1;
        while(res!=0 || flag == false){
            res = i.compareTo(mod);
            res2 = result.compareTo((pow(number,i)).mod(mod));
            if(res2 == 0){
                flag = true;
                return i.intValue();
            }
            System.out.println(i);
            i=i.add(new BigInteger("1"));   
        }
        return i.subtract(new BigInteger("1")).intValue();
    }
}
