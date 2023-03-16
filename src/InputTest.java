import java.util.Scanner;

public class InputTest
{
    public static void main(String[] args)
    {
        Scanner input;
        input=new Scanner(System.in);
        System.out.print("input: ");
        int ival=input.nextInt();
        System.out.println(ival);
    }
}
