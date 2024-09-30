import java.util.*;
public class NumOfDay {
public static void main(String arg[]){
	// khởi tạo các mảng liên quan đến tên tháng
	List<String> abb = Arrays.asList("Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec.");
	List<String> three =	Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "June", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec");
	List<String> months = Arrays.asList("January","February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
// biến để check năm nhuận
	boolean leap = false;
	Scanner in = new Scanner(System.in);
	
	int nam=0;
	int thang =0;
	while(true) {
	System.out.println("nhap thang : ");
	String thang1 = in.nextLine();
	
// kiểm tra định dạng của chuỗi vừa nhập có đúng không
	try {
		// nếu đầu vào là số nguyên
		 thang = Integer.parseInt(thang1);
		if ( thang >0 && thang < 12) 
		break;
		// nếu sai định dạng thì yêu cầu nhập lại
		else System.out.println("Sai dinh dang, nhap lai \n");
	}
		
	catch (NumberFormatException e) // nếu đầu vào là 1 chuỗi
	{ // check định dạng của tháng theo 3 list trên
		if(abb.contains(thang1) || three.contains(thang1) || months.contains(thang1))
			{ // nếu đúng định dạng, chuyển chuỗi thành tháng tương ứng
			if (abb.contains(thang1)) thang = abb.indexOf(thang1) + 1;
            else if (three.contains(thang1)) thang = three.indexOf(thang1) + 1;
            else if (months.contains(thang1)) thang = months.indexOf(thang1) + 1;
			
			break;
			} // nếu sai định dạng thì yêu cầu nhập lại
		else System.out.println("Sai dinh dang, nhap lai \n");
	}
	
};
// kiểm tra định dạng của năm
while(true) {
	System.out.println("nhap nam : ");
	try {
	 nam = in.nextInt();
	if ( nam <999) System.out.println("Sai dinh dang, nhap lai \n");
	if (nam % 4 == 0) { // kiểm tra năm nhuận
		  if (nam % 100 == 0) {
		    if (nam % 400 == 0) {
		      leap = true;
		    }
		  } else {
		    leap = true;
		  }
		}
	break;
	}
	catch (InputMismatchException e) {
	System.out.println("Sai dinh dang, nhap lai \n");
	} // nếu sai định dạng thì yêu cầu nhập lại

	
	
}  int soNgay = 0;
// xét từng trường hợp của tháng và năm
switch (thang) {
case 1: case 3: case 5: case 7: case 8: case 10: case 12:
    soNgay = 31;
    break;
case 4: case 6: case 9: case 11:
    soNgay = 30;
    break;
case 2:
    if (leap) {
        soNgay = 29;
    } else {
        soNgay = 28;
    }
    break;
}
// in kết quả
System.out.printf("so ngay trong thang %d nam %d: " + soNgay,thang,nam);
	
}
}