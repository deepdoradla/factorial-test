import java.util.Scanner;

/**
 * Created by deepdoradla on 07/03/2016.
 */
public class CalculateFactorial {

    public long calcFactorial(long n)
    {
        if(n == 0)
        {
            return 1;
        }else
            return n * calcFactorial(n-1);

    }
}
