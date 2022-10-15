/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangnd.mathutil.core;

/**
 *
 * @author ngusi
 */
// day la class mo phong cac ham tian ich/ dung chung cho moi 
//classs khac mô phỏng lại class tien ich java.Math của JDK 
//Dùng chung thì thường được thiết kế là static

public class MathUtil {

    public static final double PI = 3.14159;
    // n! = n*(n-1)! => công thức đệ quy 
    // Đệ quy : gọi ới bản thân vs quy mô nhỏ hơn 
    //
    public static long getFactorial(int n) {

        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid n , n must be in 0..20");
        
        if (n == 0 || n == 1) 
            return 1;
        
        
       return n*getFactorial(n-1);
        
    }

    //Hàm tiện ích tính n! = 1.2.3.4...n
    //Lưu ý / quy ước 
    //0! - 1! = 1 
    //Vì giai thuc tăng cực nhanh nên 21! vượt 18 số
    //Tràn kiểu long 
    //Ta ko tính 21!trở lên
//    public static long getFactorial(int n) {
//
//        if (n < 0 || n > 20) 
//            throw new IllegalArgumentException("Invalid n , n must be in 0..20");
//        
//        if (n == 0 || n == 1) 
//            return 1;
//        
//        
//        //sống đến đây, sure n = 2..20
//        //cấm ko xài else nữa khi hàm đã có rerturn phía trước 
//        long product = 1; 
//        // biến cộng dồn nhân dồn , biên con heo đất 
//        // acc / accumulation/ gói gộp 
//        for (int i = 2; i <= n; i++) 
//            product *= i;
//            
//        return product;
//        
//    }
}
//CODING CONVETION: QUY TẮC VIẾT CODE CTY ÉP PHẢI THEO !!!!
// ALT + SHIFT + F căn code tự dộng , ko lạm dụng 

// Ta sẽ học sơ về khái niệm TDD - TEST DRIVERS DEVELOPMENT
// LA2KY4 THUA6T5LAP65 TRÌNH A11PP DUNG5CHO DÂN DEV ĐỂ GIA TĂNG 
//CHẬT LƯỢNG CODE/ GIẢM CÔNG SỨC TÌM BUG/ PHÁT HIỆN BUG SỚM
//TDD yêu cầu dev khi viết code/ viết hàm/ class phải vết luôn
// các bộ kiểm thử / test csase/ viết các đoạn code dùng thử hàm /class
//để kiểm tra tính đúng đắn của hàm / class
// Viết code kèm viết test case
// Viết code có ý thức viết luôn phần kiểm thử code/hàm /class
//development driven
// SAU KHI CÓ ĐƯỢC TÊN HÀM (CHỈ TÊN HÀM )
// TA VIẾT LUÔN CÁC TÌNH HUỐNG XÀI HÀM 
// CHẤP NHẬN KHI CHẠY CODE SAI - DO CODE CHƯA XONG
// SAU ĐÓ TA TỐI ƯU / CHỈNH SỬA CODE ĐỂ DẢM BẢO CODE CHẠY ĐÚNG !!!
// QUÁ TRÌNH SAI - ĐÚNG - SAI - ĐÚNG điều tra liên tục (cycle)
