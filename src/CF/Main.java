package CF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Main {
    int solve(BufferedReader br) throws IOException {
        int t, i, j, k, l, n, sum = 0, sum1 = 0, sum2 = 0;
        String s;
        n = Integer.parseInt(br.readLine());
        s = br.readLine();
//        System.out.println("n & s: " + n + " " + s);
        for (char c : s.toCharArray()) {
            if (c == '0') {
                sum ++;
            } else {
                sum1 ++;
            }
        }
        for (char c : s.toCharArray()) {
            if (c == '1') {
                sum2 += sum1 - 1;
            } else {
                sum2 += sum1 + 1;
            }
        }
        return sum2;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        Main ob = new Main();
        while (t-- > 0) {
            int res = ob.solve(br);
//            System.out.println("output: " + res);
            System.out.println(res);
        }
    }
}
