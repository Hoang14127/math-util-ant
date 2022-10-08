/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hoangnd.mathutil.main;

import com.hoangnd.mathutil.core.MathUtil;

/**
 *
 * @author ngusi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This statement come from the main(), method()");
        tryTDDFirst();
        testFactorialGivenWrongArgumentThrowsException();
    }
    
    
    
    public static void testFactorialGivenWrongArgumentThrowsException(){
        // Test case #3: đưa data cà chớn , n âm , quá lớn
        //              hàm đc thiết kết đưa về ngoại lệ
        // Thấy  ngoại lệ mừng rơi nước mắt khi đưa vào -5
        // Khi ngoại lệ xuất hiện 
        System.out.println("Hope to see the exception illigel exception");
        MathUtil.getFactorial(0);
    }
    
    
    //Hàm này viết ra để dùng thử kĩ thuật viết code kiểu TDD
    //gọi thử /dùng thử hàm chính bên core/ MathUtil
    //xem nó sai đúng ra sao , ở ngay việc khởi đầu biết hàm 
    public static void tryTDDFirst(){
        
        //Test case #1 ( Tình huống xài thử hàm số 1/ xài htu73 hàm )
        //-Input : n = 1;
        //Gọi hàm getFactorial([1])
        //Hy vọng hàm trả về 1 , vì 1! = 1
        
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        
        
        // So sánh expectd actual coi hcung1 no giống nhau không 
        // Giống -> hàm đúng với case test
        // sai -> bug rồi !!! với case đang test
        
        System.out.println("Test 1! | status:"+
                                  "Expected: "+ expected + 
                                " | Actual : "+ actual);
        
        //Test case #2 ( Tình huống xài thử hàm số 1/ xài thử hàm )
        //-Input : n = 2;
        //Gọi hàm getFactorial([2])
        //Hy vọng hàm trả về 2 , vì 2! = 2
        System.out.println("Test 2! | status:"+
                                  "Expected: 2"+ 
                                " | Actual : "+ MathUtil.getFactorial(2));
        
        
        
        
        
        
    }
}

//TEST CASE LÀ GÌ ??
// Là 1 tình huống xài app/ kiểm thử app/ kiểm thử tính năng /mà hình 
// chức năng / xử lý của app
// Test case là tình huống thử app/ chức năng mà khi đó 
// ta phải 
// - Đưa data giả / mẫu / test
// - Đưa ra gtri của kỳ vọng ta mong chờ app trả ra
// sau đó chờ ham/ tính năng xử lý và trả ra kết quả
// và ta nhìn ra kết quả và ta so sánh với kỳ vọng trước đó !!
// Kết luận
