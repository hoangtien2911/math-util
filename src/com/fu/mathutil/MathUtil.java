
package com.fu.mathutil;


public class MathUtil {
    //n! = 1.2.3...n
    //quy ước 0! = 1! = 1
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0 ..20");
        //hàm dừng liền éo cần return
        
        //xuống đây là n=0...20
        if (n == 0 || n == 1)
            return 1;
        //xuống đến đây, n = 2...20 òi
        //chơi for hoặc đệ quy - recursion
        //kĩ thuật nhồi con heo đất, ốc bu nhồi thịt
        //i = 2 i = 3 i = 4 i = n nhồi liên tục i vào tích
        long product = 1;///tích khởi đầu = 1, nhồi 2 3 4... n
        for (int i = 2; i <= n; i++) 
            product *= i;//product = product
        
        return product;
            
        
    }
}
