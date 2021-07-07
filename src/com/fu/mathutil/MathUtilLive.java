
package com.fu.mathutil;

/**
 *
 * @author Hp
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);//hàm tính coi đi là mấy
        System.out.println("5! = 120; actual: " + result);
        System.out.println("6! = 720; actual: " + MathUtil.getFactorial(6));
        //THÊM CODE SAU LẦN ĐẦU TIÊN LÀM CHUYỆN ẤY - CODE LÊN SEVER 5:35PM 7/7/2021
        System.out.println("0! = 1; actual: " + MathUtil.getFactorial(0));
        System.out.println("3! = 6; actual: " + MathUtil.getFactorial(3));
        //MathUtil.getFactorial(-5); ném ngoại lệ thật r ai bảo đưa cà chớn
        //kĩ thuật kiểm thử phần mềm: ước lượng xem giá trị trả về của hàm là gì
        //expected value: 5! =120
        //mày/hàm ai đó khi chạy thự tế là mấy - actual, giả sử 120
        //if expected == actual, hàm ngon trong tình huống này
    }
    
}
