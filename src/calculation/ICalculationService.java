package calculation;

import java.rmi.Remote;

public interface ICalculationService extends Remote {

    int sum(int a,int b);
    int subtraction(int a, int b);
    int multiplication(int a,int b);
    double division(int a,int b);
}
