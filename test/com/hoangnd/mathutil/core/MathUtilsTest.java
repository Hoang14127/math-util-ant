/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangnd.mathutil.core;

import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author ngusi
 */
public class MathUtilsTest {
    // Ta đi so sánh đo lường coi ngoại lệ có uất hiện ko 
    // khi đưa data cà chớn n>20 and n<0 thay vì 
    // so sánh expected value cs actual value 
    // LÚC NÀY TA ĐI SO SÁNH XEM NGOẠI LỆ CÓ PHÁT HIỆN NHƯ KỲ VỌNG 
    // HAY KO , NẾU CÓ NHƯ KỲ VỌNG , SURE , APP THIẾT KẾ NGON
    @Test(expected = Exception.class )
    public void testFactorialGivenWrongArgumentThrowsException(){
        // Test case #3: đưa data cà chớn , n âm , quá lớn
        //              hàm đc thiết kết đưa về ngoại lệ
        // Thấy  ngoại lệ mừng rơi nước mắt khi đưa vào -5
        // Khi ngoại lệ xuất hiện 
        System.out.println("Hope to see the exception Illegal exception");
        MathUtil.getFactorial(-5);
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell2(){
        
        //Test case #1 : check n = 0 , hy vọng hàm trả về 1
                // Thực tế hàm trả về mấy thì đoán xem 
                // So sánh giữa expected vs actual
                // ko cần khổ cực 
        
        //Test case #4 : n = 3 hy vọng hàm trả về 6
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        
        //Test case #5 : n = 4 hy vọng hàm trả về 24
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        
        //Test case #5 : n = 5 hy vọng hàm trả về 120
        Assert.assertEquals(120, MathUtil.getFactorial(5));
        
    }
    
    @Test // Coding convention 
            // Tên hàm kiểm thử / tên hàm cảu test script 
            // phải noi1 lên ý nghĩa của việc kiểm thử 
            // tình huống này ta mún test hàm getF() tham só tử tế 
            // n = 0..20!!!
    public void testFactorialGivenRightArgumentReturnsWell(){
        
        //Test case #1 : check n = 0 , hy vọng hàm trả về 1
                // Thực tế hàm trả về mấy thì đoán xem 
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
                // So sánh giữa expected vs actual
                // ko cần khổ cực 
        Assert.assertEquals(expected, actual);
        
        //Test case #2 : n = 1 hy vọng hàm trả về 1
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        
        //Test case #3 : n = 2 hy vọng hàm trả về 2
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        
        
        
    }
    
    // @TEst ra lệnh cho thư viện JUnit mình đã addd/ import
    // Tự động generate ra cái public static voi main()
    // biến hàm tryUnitComparision thành hàm main 
    // và gửi mai() này cho JVM chạy - JAVA VIRTUAL MACHINE
    // @Test --- Main ()
    // ko @Test thì class ko có main() , lấy gì mà nó chạy no runnable method
  @Test 
    public void tryUnitComparision(){
        // Hàm này thí nghiệm việc so sánh expected cs actual 
        // cọi said9ung1 ra màu như thế nào 
        // ta đang xài hàm của thư viện JUnit nhưng ko xài bừa 
        // bãi mà phải viết theo quy tắc định ước 
        // quy tắc định ước nằm ở @ - annotation 
        
        Assert.assertEquals(200, 200);
    }
    
}

//CLASS NÀY DEV SẼ VIẾT NHỮNG CÂU LỆNH TEST HÀM 
  // CỦA CODE CHÍNH , TEST TEST CÁC HÀM MATHUTILS
  // Trong class này sẽ có những lời gọi hàm getFacturial 
  // có những lệnh so sánh giữa EXPECT và FACTURIAL
  // giống mình đã làm test trong main 
  // nhưng khác ở chỗ , SAI-> Đỏ , Đúng-> Xanh 
  // mắt chỉ cần nhìn 2 màu xnah đỏ 
  // muốn có được điều này ta dùng thêm các framework UNIT TESTING
  // ví dụ : JUnit, TestNG(java)
  //         xUnit, MsTest, NUnit (C#)
  //        PHPUnit , ...
  

// VIÊC VIẾT CODE ĐỂ TEST ;CODE GỌI LA2UNIT TESTING 
// ĐOẠN CODE TRONG CLASS NÀY DÙNG JUNIT /UNIT TESTING FRAMEWORK
// ĐỂ KIỂM THUE73 HÀM CỦA CODE CHINN
// ĐOẠN CODE NÀY ĐƯỢC GỌI LÀ : TEST SCRIPT 
// Code dùng để test code chính gọi là test script 
// TEST SCRIPT là các đoạn code viết ra để test code chính DAO, DTO ...
// Muốn test thì cần phải thao tác test case
// TEST SCRIPT sẽ dùng các test case
// Ví dụ viết code test hàm getFunction


// QUY TẮC XANH ĐỎ 
// XANH KHI TẤT CẢ TEST CASE CÙNG XANH
// TỨC LÀ EXPECETD == ACTUAL 
// CHO TẤT CẢ CÁC CASE TÌNH HUỐNG CASE

// MÀU ĐỎ 
// CHỈ CẤN TRONG NHỮNG TEST CASE/ EXPECTED != ACTUAL
// KẾT LUẬN MẠNH/ GẮT HÀM SAI

//Nấu đã liệt kê/ test case thì chúng phải đúng hết
//chỉ cần 1 thằng sai thì hàm không ổn định => hàm sai 

// EXPECTED == ACTUAL : CASE ĐÚNG, TEST CASE PASSED
// EXPECTED != ACTUAL : CASE SAI, 
        // EXPECTED TÍNH XÁC , HÀM ĐÃ XỬ LÝ SAI, BUG.
        // CŨNG CÓ KHI EXPECTED SAI, CÁI TA KỲ VỌNG SAI !! LỖI DO QC TÍNH TOÁN