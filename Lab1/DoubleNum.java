import java.util.*;
public class DoubleNum{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("nhap so thu nhat:");
        String so1 = keyboard.nextLine();
        double num1 = Double.parseDouble(so1);
        System.out.println("nhap so thu hai:");
        String so2 = keyboard.nextLine();
        double num2 = Double.parseDouble(so2);
       double add = num1+ num2;
       double diff = num1- num2;
       double pro = num1* num2;
       System.out.println("Tong 2 so la:" + add);
       System.out.println("Hieu 2 so la:" + diff);
       System.out.println("Tich 2 so la:" + pro);
       double quo;
       // check phep chia cho 0
       try {
    	   if(num2==0) throw new ArithmeticException();
       quo = num1 /num2;
       System.out.println("Thuong 2 so la:" + quo);
       
       }
       catch (ArithmeticException e)
       {
    	   System.out.println("khong ton tai thuong vi so chia bang 0");
       }
    }
}