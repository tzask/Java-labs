import java.lang.*;

public class JavaLabDemo {
    public static void main (String args[]) {
        // 2.5.1.
        int a16, a10, a8, a2;
        a16 = 0x45a8;
        a10 = 567678;
        a8 = -0326;
        a2 = 0b010001;

        //2.5.3.
        char b = 'а';
        char b2 = '\u0053';

        //2.5.4.
        String s = "Just a\n TEST";

        // 2.6.
        int kk2 , my_var, var3_5, _var, veryLongVarName, aName, theName, a2Vh36kBnMt456dX;

        //2.7.2.
        boolean bb = true, bb2 = false;

        //2.7.3.
        double m = 7, n = 8;
        if (((n != 0) && (m/n > 0.001)) ^
                ((n == 0) || (m/n > 0.001))
                ) System.out.println("Testing logical operations");

        //2.7.4.
        byte kkk1 = 50, kkk2 = -99, kkkЗ;
        short det = 0, ind = 1;
        int i = -100, j = 100, k = 9999;
        long big = 50, veryBig = 2147483648L;
        char c1 = 'A', c2 = '?', newLine = '\n';
        //2.7.5.1.
        int calc = (7 + 8 - 9 * 10 / 6) % 7;
        calc++;
        --calc;

        //2.7.5.2.
        byte by1 = 50;
        short sh = 999;
        int sum = by1 + sh; // promotion of variables in case of arithmetic operations

        //2.7.5.3.
        if (m > n || m >= n ||
                m < n || m <= n ||
                m != n || m == n) System.out.println("Testing relational operators");

        //2.7.5.4.
        byte newb1, newb2;
        newb1 = 50; // 00110010
        newb2 = -99; // 10011101
        int rslt;
        rslt = ~newb2; // == 98, 0...01100010;
        rslt = newb1 & newb2; // == 16, 0...00010000;
        rslt = newb1 | newb2; // == -65, 1...10111111;
        rslt = newb1 ^ newb2; // == -81, 1...10101111.

        //2.7.5.5.
        rslt = newb1 << 2;
        rslt = newb1 >> 1;
        rslt = newb2 >>> 1;

        //2.7.6.
        float х = 0.001f, у = -34.789f;
        double x21 = -16.2305, z2;
        double posInf = Double.POSITIVE_INFINITY;
        double negInf = Double.NEGATIVE_INFINITY;
        double NaN = Double.NaN;

        //2.7.7.
        byte nnn = 1;
        //nnn = b + 10;  error! (type conversion)
        nnn += 10; // correct!

        //2.7.8.
        int absval, val;
        val = 5;
        absval = val < 0 ? -val : val;
    }
}
