import javax.swing.plaf.multi.MultiSeparatorUI;
import java.math.BigInteger;
import java.util.Scanner;

public class TakingInput {

    static void main() {
//        int a = 5;
//        int b = 1;
//        System.out.println(a+b);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of firstNum:");
        int firstNum = sc.nextInt();
        System.out.println("Enter the value of secondNum");
        int secondNum = sc.nextInt();
        int ans = firstNum + secondNum;
        System.out.println("Answer is:" + ans);

        BigInteger bg = sc.nextBigInteger();
        System.out.println("BigInteger:" + bg);

        System.out.println("Enter the value for flag");
        boolean flag = sc.nextBoolean();
        System.out.println("Enter the value for shortVal");
        short shortVal = sc.nextShort();
        System.out.println("Enter the value for floatValue");
        float floatValue = sc.nextFloat();

        System.out.println("flag is:" + flag);
        System.out.println("shortVal is:" + shortVal);
        System.out.println("floatValue is:" + floatValue);

        sc.close(); //to stop data leaking
    }
}



///Java garbage Collector:

//c++ objects -> heap memory use - > stack memory MultiSeparatorUI
//memory free krani padti h - manually free
//
//        Java me JGC hai - > memory leak ki problem nhi hoti performance enhance krti h
