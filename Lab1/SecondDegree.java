import java.util.Scanner;
public class SecondDegree{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("nhap gia tri a b c cua phuong trinh bac 2, cach nhau boi dau cach");
        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        double c = keyboard.nextDouble();
        if (a == 0)
        System.out.println("gia tri cua a khong the la 0");
        else
        {
        double dt = b*b -4 *a *c;
       double dt2 = Math.pow(dt, 0.5);
        if (dt==0) System.out.println("Phuong trinh co nghiem duy nhat la " + -b/2*a);
        else if(dt >0) System.out.printf("Phuong trinh co nghiem x1 = %2f, x2 = %2f ",(-b+dt2)/2*a,(-b-dt2)/2*a);
        else System.out.println("Phuong trinh vo nghiem ");
    }
    }
}