package CF;

import java.util.Scanner;

public class re {
    void solve(Scanner sc) {
        int n;
        n = sc.nextInt();
        System.out.print(1 + " ");
        for (int i = n; i > 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        re sol = new re();
        int t;
        t = sc.nextInt();
        while (t > 0) {
            sol.solve(sc);
            t--;
        }
    }
}
