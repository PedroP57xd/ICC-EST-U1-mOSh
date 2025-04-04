package controllers;

public class ShellSort {
    public void sortAscendente(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            int cont = 0;
            for (int i = gap; i < n; i++) {
                int tmp = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > tmp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                    cont++;
                }
                arr[j] = tmp;
            }
            System.out.println("\n\t" + cont + " cambios en Gap: " + gap);
            
            System.out.print("\t");
            printArray(arr);
        }
    }
    public void sortDescendente(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            int cont = 0;
            for (int i = gap; i < n; i++) {
                int tmp = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] < tmp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                    cont++;
                }
                arr[j] = tmp;
            }
            System.out.println("\n\t" + cont + " cambios en Gap: " + gap);
            System.out.print("\t");
            printArray(arr);
        }
    }

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
