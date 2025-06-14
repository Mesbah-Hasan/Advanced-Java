package CF;

import java.util.*;

public class CF_2117_A {
    void solve(Scanner sc) {
        int n, k, l, m = 0, sum =1, j = 1;

        n = sc.nextInt();
        Map<Integer, Integer> mp = new HashMap<>();
        Map<Integer, Integer> mp1 = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        int[] arr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
            mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
            mp1.put(arr[i], mp1.getOrDefault(arr[i], 0) + 1);
        }
        set.add(arr[1]);
        set1.add(arr[1]);
//        System.out.println("Starting: ");
        for (int i = 2; i <= n; i++) {
            if (!set.isEmpty() && set.contains(arr[i])) {
                set.remove(arr[i]);
//                System.out.println("Set size: " + set.size()+ " removing: " + i + " " + arr[i]+ " " + set.size());
            }
            if (set.size() == 0) {
                set = new HashSet<>(set1);
//                System.out.println("pp: " + i +" "+ arr[i] + " " + set.size());
//                for (Integer key : set) {
//                    System.out.print(key + " ");
//                }
//                System.out.println("Key ends " + i);
                sum++;
            }
            set1.add(arr[i]);

        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        CF_2117_A sol = new CF_2117_A();
        t = sc.nextInt();
        while (t > 0) {
            sol.solve(sc);
            t--;
        }
    }
}
