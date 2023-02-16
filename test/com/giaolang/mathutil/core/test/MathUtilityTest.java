/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.giaolang.mathutil.core.test;

import com.giaolang.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author giao.lang
 */
public class MathUtilityTest {
    
    //kiểm thử ngoại lệ thì sao???
    //tức là hàm getF() đc thiết kế rằng nếu đưa n cà chớn
    //thì hàm phải ném ra ngoại lệ!!!
    //tức là getF(-5) thì EXPECTED == NGOẠI LỆ ILLEGAL ARGUMENT EXCEPTION
    //THẤY NGOẠI LỆ MỪNG RƠI NƯỚC MẮT 
    @Test(expected = Exception.class) 
    public void testFactorialGivenWrongArgumentThrowsException() {
        
        //Test case #5: getF() with a wrong arg: n = -5
        //Expected result: An exception is thrown: Illegal Argument Exception
        
        MathUtility.getFactorial(35);
        //nếu chỉ gõ lệnh trên thì BỊ MÀU ĐỎ
        //DO LỆNH NÀY GÂY RA EXCEPTION, VÀ EXCEPTION LÀ 
        //MÀU ĐỎ
        //NHƯNG HÀM NÀY MÌNH KÌ VỌNG RA EXCEPTION, NẾU CÓ EXP
        //THÌ HÀM ĐÚNG NHƯ THIẾT KẾ, ĐÚNG THIẾT KẾ THÌ PHẢI XANH
        //LỖI CỦA TA LÀ KO ĐO, KO SO SÁNH, KO CHƯA NHẬN
        //DIỆN LÀ ĐÃ CÓ NGOẠI LỆ RỒI!!!
        //TA CẦN THÊM 1 LỆNH: ĐÃ CÓ NGOẠI LỆ CHƯA???
        //CÓ RỒI -> XANH
        //CHƯA -> ĐỎ
        //JUnit 4 ko dùng hàm assert() để đo ngoại lệ
        //JUnit 5 dùng hàm assert() để đo ngoại lệ
    }
    
    
    @Test
    //trong hàm này sẽ chứa các test case để test getF()
    //với n hợp lệ trong khoảng 0..20    
    public void testFactorialGivenRightArgumentReturnsWell() {
        
        //Test case #1: test getF() with n = 0
        //Expected result = 1;  //hy vọng 0! = 1
        int n = 0;
        long expectedValue = 1;  //hy vọng 0! = 1
        long actualValue = MathUtility.getFactorial(n);    //thực tế getF() trả về mấy???
        
        Assert.assertEquals(expectedValue, actualValue);  
        
        //Test case #2: test getF() with n = 5;
        //Expected result = 120; //hy vọng 5! = 120, xem máy có
        //                         làm đc như vậy hok???
        Assert.assertEquals(120,  MathUtility.getFactorial(5));  
        
       //Test case #3: test getF() with n = 6; expected = 720
       Assert.assertEquals(720,  MathUtility.getFactorial(6));  
    
       //Test case #4: test getF() with n = 4; expected = 24
       Assert.assertEquals(24,  MathUtility.getFactorial(4));  
    }
    
}
