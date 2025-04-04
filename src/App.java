import controllers.ShellSort;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        int[] a = { -10, 0, 4, 7, 2, 1, 9, 6, 5 };
        ShellSort sS = new ShellSort();
        System.out.println("Pedro Panjón");
        System.out.println("Arreglo: ");
        sS.printArray(a);
        System.out.println("ORDEN ASCENDENTE");
        sS.sortAscendente(a);
        System.out.println(" ");
        System.out.println("\n \n ORDEN DESCENDENTE");
        sS.sortDescendente(a);
        System.out.println(" ");
    }
}
