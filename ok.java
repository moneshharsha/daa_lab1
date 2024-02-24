package java_pro;

public class ok {
    public int[] search(int a[], int n) {
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    count++;
                }
            }
        }
        for (int k = 0; k < n; k++) {
            System.out.print(a[k] + " ");
        }
        System.out.println("\nNO of swaps : " + count);
        return a;
    }

    public static void main(String[] args) {

        int a[] = { 45, 9, 24, 4, 7 };
        ok hi = new ok();
        double startTime = System.currentTimeMillis();
        hi.search(a, 5);
        double endTime = System.currentTimeMillis();
        System.out.print("\nTime for Execution :" + (endTime - startTime) + "ms");
    }
}