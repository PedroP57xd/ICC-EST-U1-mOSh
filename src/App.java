import controllers.ShellSort;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        int[] a = { -10, 0, 4, 7, 2, 1, 9 };
        ShellSort sS = new ShellSort();
        sS.printArray(a);
        System.out.println(" ");
        sS.sort(a);
        System.out.println(" ");
    }
}
