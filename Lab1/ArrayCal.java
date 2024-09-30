import java.util.*;

public class ArrayCal {
    public static void main(String[] args) {
        // khoi tao mang
        int[] aArray = {6,5,4,3,2,1};

        // Sap xep mang theo thu tu tang dan
Arrays.sort(aArray);
System.out.println("mang da sap xep la " + Arrays.toString(aArray));

        // tinh tong
    int sum = 0;
       for (int num : aArray) {
            sum += num;
       }
  System.out.println("Tong cac phan tu la " + sum);

        // tinh trung binh
   double average = (double) sum / aArray.length;
    System.out.println("trung binh cac phan tu la: " + average);
    }
}
