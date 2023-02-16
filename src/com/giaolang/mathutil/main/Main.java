/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.giaolang.mathutil.main;

import com.giaolang.mathutil.core.MathUtility;

/**
 *
 * @author giao.lang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //testFactorialGivenWrongArgumentThrowsException();
        testFactorialGivenRightArgumentRunsWell();
    }
    
    //Thiết kế hàm getF() là: chỉ tính n! từ 0..20
    //Nếu đưa n < 0 hoặc n > 20 THÌ HÀM SẼ KO TÍNH, CHỬI
    //                          BẰNG CÁCH NÉM RA NGOẠI LỆ!!! 
    
    //thực tế hàm getF() khi chạy có làm đc như thiết kế hay ko
    //phải test thử, chạy thử mới biết đc
    public static void testFactorialGivenWrongArgumentThrowsException() {
        //Test case #4: Test getF() with n = -5, wrong argument
        //Expected value: an exception is thrown
        //                IllegalArgumentException   
        System.out.println("Test -5!: expected = Illegal Argument Exception is thrown!");
        MathUtility.getFactorial(-5);        
    }
    
    //dân dev phải có trách nhiệm test code của mình chạy đúng hay sai
    //trước khi lắp ráp nó với các class khác để tạo nên các chức năng
    //Ghi chú:
    //Có nhiều quy tắc đặt tên hàm cho việc kiểm thử hàm
    //thường tên hàm sẽ bao hàm ý nghĩa của việc kiểm thử
    //ví dụ hàm dưới này sẽ dùng để test cái hàm tính giai thừa
    //trong tình huống - case đưa n đúng chuẩn, thì ta hy vọng - expected
    //hàm chạy ngon như thiết kế, ví dụ n = 5 thì hàm phải trả về 120
    //tức là 5! hy vọng hàm tính ra 120
    public static void testFactorialGivenRightArgumentRunsWell() {
        
        //Test Case #1: Test getFactorial() with n = 0
        //Expected value: 1 - hy vọng đưa n = 0 vào thì hàm trả về 1
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);
        
        System.out.println("Test " + n + "!: expected = " + expectedValue
                                          + " | actual: " + actualValue);
        
        
        //Test case #2: Test getFactorial() with n = 1
        //Expected value = 1 - hy vọng 1! app trả về 1
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactorial(n); //thực tế hàm chạy
        System.out.println("Test " + n + "!: expected = " + expectedValue
                                          + " | actual: " + actualValue);
    
        //Test case #3: Test getFactorial(3)
        //Expected value = 6!!!
        System.out.println("Test 3!: expected = 6"
                                          + " | actual: " + MathUtility.getFactorial(3));
        
    }
    
}
