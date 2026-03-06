import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pascal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        if (n <= 0) {
            return;
        }

        List<List<Integer>> tri = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                List<Integer> firstRow = new ArrayList<>();
                firstRow.add(1);
                tri.add(firstRow);
                continue;
            }

            List<Integer> prev = tri.get(i - 2);
            List<Integer> next = new ArrayList<>();

            for (int k = 0; k <= prev.size(); k++) {

                if (k == 0 || k == prev.size()) {
                    next.add(1);
                } else {
                    next.add(prev.get(k - 1) + prev.get(k));
                }
            }

            tri.add(next);
        }

        for (List<Integer> row : tri) {
            for (int num : row) {
                System.out.print(num + "  ");
            }
            System.out.println();
        }

        sc.close();
    }
}