package com.hoangnd.mathutil.core;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;// ép class thành hàm cho jvm chạy (framework)
import org.junit.runners.Parameterized;
import static com.hoangnd.mathutil.core.MathUtil.getFactorial;

@RunWith(value = Parameterized.class)//for loop

public class MathUtilsDDTTest {

    //Bộ data là mảng 2 chiều ứng với 
    // 2 cột với ecpected và n
    // Dòng ứng với các test case
    //Mảng Object, thì dùng Wrapper class- class gọi cá primitive
    // Integer -> int , Long -> long 
    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20}; // Liệt je6 các phần tử bằng dấu phẩy 
        int b[][] = {{1, 0}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}};
//        int c[][] = {{1, 0},
//                     {1, 1},
//                     {2, 2},
//                     {3, 6},
//                     {4, 24},
//                     {5, 120},
//                     {6, 720}
//            }; 

        return new Integer[][]{{1, 0},
        {1, 1},
        {2, 2},
        {6, 3},
        {24, 4},
        {120, 5},
        {720, 6}
        };
        
        // Ta sẽ map ánh xạ các cột của mỗi dòng ví dụ dòng đầu tiên có 2 cật 
        // là 1 0 ta ánh xạ 1 vào biến expected 0 vào biến n và tương
        //tự các cột còn lại 
    }
        
        
        @Parameterized.Parameter(value = 0)
        public long expected; // map vào cột 0 của mảng 
        @Parameterized.Parameter(value = 1)
        public int n;// Map vào cột 1 của mảng
                
        @Test // kiểm thử các test case với data tách ra từ mảng 
        
        public void testFactorialGivenRightArgumentReturnWell(){
            assertEquals(expected, MathUtil.getFactorial(n)); // chỉ import static mới ko có chấm 
        }
    

}

//Phân tích cách ta viết code cho việc test hàm getF() hôm trước
// Assert.assertEquals, mathutil.getFacturial lệnh dùng để test 
// Hàm này lặp đi lặp lại 
// để ta kiểm thử các tình huống xài hàm / test case
// Ta quy data thành 1 0 thành các data tương ứng khác 
// ví dụ 
// Expected     n!
//  1           0 -> có ổn ko
//  1           1
//  24          4
// ... 
//!!!
// Nếu ta có đc cái cánh nào dó để tách data ra 1 chỗ 
// sau đó nhồi /feed cái data này vào cái hàm test ở trên 
// vậy thì chỉ cần 1 lệnh gọi làm test , cứ thế data cứ tự thay vào
// Kỹ thuật đẩy tách data ra khỏi các câu lệnh khác sau đó đẩy data 
// vào các hàm test khác giúp rút gọn số câu lệnh test giúp dễ dàng 
// kiểm tính thiếu đủ của các test case kỹ thuật này gọi là DDT viết
// code kiểm thử hướng hteo tách data nó còn 1 tên gọ khác là: kiểm 
// thử theo kiểu tham số hóa parameterize Đấu ??? ở câu lệnh gọi 
// hàm chính là tên biến sẽ dùng để nhận data từ tập data đã tách ra
// CONVERT DATA thành biến 
// Chơi với DDT ta cần :
// Bô data test - tách riêng
// Các tham số ứng với toàn bộ data - chính là các biến dùng trích data ra 
// Gọi hàm kiểm thử xài các tham số 




// TỔNG KẾT
// TOÀN BỘ CODE TRONG CLASS NÀY ĐƯỢC BIẾT RA DÙNG ĐỂ TEST CODE CHÍNH BÊN MAIN
// OR ORC PACKAGE 
// CODE ĐC VIẾT RA DÙNG ĐỂ TEST CODE KHÁC THÌ CODE NÀY ĐC GỌI LÀ TST SCRIPT
// 1 TEST SCRIPT SẼ CHỨA NHIỀU CODE ĐỂ TEST HÀM VẬY THÌ 1 TEST SCRIPT SẼ CHỨA 
// NHIỀU TEST CASE ( TÌNH HUỐNG XÀI APP) 

// 1 TEST SCRIPT CÓ THỂ XÀI DDT ĐỂ TỐI ƯU CODE BẢO TRÌ 
// VIỆC VIẾT CODE CHÍNH CÓ THỂ XÀI TDD