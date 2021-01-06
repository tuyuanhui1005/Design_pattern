package strategy;

public class sort {

    public void sort(int[] a) {

        for (int i = 0; i < a.length; i++) {

            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                minPos = a[j] < a[minPos] ? j : minPos;
            }
            swap(a, i, minPos);
        }

    }

    static void swap(int[] a, int i, int minPos) {
        int temp = a[i];
        a[i] = a[minPos];
        a[minPos] = temp;
    }
}
