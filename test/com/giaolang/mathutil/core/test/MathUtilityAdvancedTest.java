/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.giaolang.mathutil.core.test;

import com.giaolang.mathutil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author giao.lang
 */
@RunWith(value = Parameterized.class)
//báo với JUnit rằng code trong class này tao sẽ tách data và
//hàm so sánh riêng biệt nhau - DATA DRIVEN TESTING
//tách thì phải có kĩ thuật nhồi/fill data trở lại lệnh so sánh
//fill trở lại thông qua biến - biến chứa value đc thay đổi
//DDT có anh em nương tựa với Parameterized - tham số hoá data 
public class MathUtilityAdvancedTest {
    
    //chuẩn bị mảng 2 chiều để chứa data trong các test case
    //sẽ dùng
    //quy ước mảng phải là static public.
    @Parameterized.Parameters
    public static Object[][] initData() {
        
        return new Object[][] {
                                {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {5, 120},
                                {6, 720}
                              };
    } 
    
    //map từng cặp data ở trên vào 2 biến, đẩy 2 biến này vào
    //hàm assertEquals() đã quen
    @Parameterized.Parameter(value = 0) //lấy cột 0 của mảng gán vào
    public int n;
    
    @Parameterized.Parameter(value = 1) //lấy cột 0 của mảng gán vào
    public long expected;
    
    //test hoy
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    
    
}
