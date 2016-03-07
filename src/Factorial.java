import java.util.Scanner;

/**
 * Created by deepdoradla on 07/03/2016.
 */
public class Factorial {

    public static void main(String args[]){
        CalculateFactorial fact = new CalculateFactorial();
        for(long i=1; i<21; i++)
        {
            System.out.println("Factorial of the number " + i + " is "+fact.calcFactorial(i));
        }

    }

}
