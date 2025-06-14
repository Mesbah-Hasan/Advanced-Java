package CF;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A {
    void solve(Scanner sc) throws IOException {
        int n, i, j, m;
        n = sc.nextInt();
        m = sc.nextInt();
        for (i = 0; i < n; i++) {
            if (i == m) {
                continue;
            }
            System.out.print(i + " ");
        }
        if (m != n) {
            System.out.println(m);
        } else {
            System.out.println();
        }
    }
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        A ob = new A();
        int t = sc.nextInt();
        while (t-- > 0) {
            ob.solve(sc);
        }
    }
}
