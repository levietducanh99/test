import java.util.Scanner;
public class Ptrinhbacnhat{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("nhap gia tri cua a:");
        double a = keyboard.nextDouble();
       
        System.out.println("nhap gia tri cua b");
        double b = keyboard.nextDouble();
        if(a== 0)
        { if(b == 0) System.out.println("Phuong trinh co vo so nghiem");
        	else System.out.println("Phuong trinh khong co nghiem");}
        else System.out.println("Phuong trinh co nghiem la: " + -b/a);
      
       }    }
