
package practica.pkg6;

import java.math.BigInteger;

public class Practica6 {


    public static void main(String[] args) {
        int number = 0;
        do{
            number = Ventanas.entradaI("Enter a number between 2 and 20:");
        }
        while(number<1 || number>20);
       
        BigInteger n = BigInteger.valueOf(number);
        BigInteger mod = new BigInteger(Ventanas.entradaS("Enter a number for the mod:"));
        BigInteger result = new BigInteger(Ventanas.entradaS("Enter a number for the result:"));
        int res =DiscreteLogarithm.solve(n, mod, result);
        Ventanas.mensaje("X is equal to: "+res+"\nSo the equation is: "+number+"^"+res+" mod "+mod+" = "+result);
    }
    
}
