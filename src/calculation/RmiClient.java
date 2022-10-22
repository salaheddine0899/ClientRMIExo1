package calculation;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class RmiClient {
    public static void main(String[] args) {
        try {
            ICalculationService calculationService= (ICalculationService) Naming.lookup("rmi://localhost:1099/calculationService");
            Scanner scanner=new Scanner(System.in);
            System.out.print("a=");
            int a=scanner.nextInt();
            System.out.print("b=");
            int b=scanner.nextInt();
            System.out.println("a+b="+calculationService.sum(a,b));
            System.out.println("a-b="+calculationService.subtraction(a,b));
            System.out.println("a*b="+calculationService.multiplication(a,b));
            System.out.println("a/b="+calculationService.division(a,b));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
