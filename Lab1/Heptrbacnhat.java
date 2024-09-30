import java.util.Scanner;
public class Heptrbacnhat{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("nhap gia tri a11 a12 b1 cua phuong trinh dau tien, cach nhau boi dau cach");
        double a11 = keyboard.nextDouble();
        double a12 = keyboard.nextDouble();
        double b1 = keyboard.nextDouble();
        System.out.println("nhap gia tri a21 a22 b2 cua phuong trinh thu hai, cach nhau boi dau cach");
        double a21 = keyboard.nextDouble();
        double a22 = keyboard.nextDouble();
        double b2 = keyboard.nextDouble();
        double d = a11*a22 - a21*a12;
        double d1 = b1*a22-b2*a12;
        double d2 = a11*b2-a21*b1;

   // giai he phuong trinh bang phuong phap crammer
        if( (d==0) && (d1 == 0) && (d2 == 0) ) // neu d=d1=d2=0 thi he vo so nghiem
        	System.out.println("He phuong trinh co vo so nghiem");
        // neu d=0 va 1 so d1 hoac d2 khac 0 thi he vo nghiem
        else if (((d==0) && (d1 != 0)) || ((d==0) && (d2 != 0)) ) System.out.println("He phuong trinh khong co nghiem");
        else System.out.printf("nghiem cua he la: x = %2f,y=%2f",d1/d,d2/d);
       }    }
