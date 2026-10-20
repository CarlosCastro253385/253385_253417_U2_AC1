import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        int[] listaOriginal = new int[20];

        Operaciones.generarNumeros(listaOriginal);

        System.out.println("\n--- Ordenando arreglo ---");
        Operaciones.ordenarQuicksort(listaOriginal, 0, listaOriginal.length - 1);

        System.out.println("\nLista Ordenada:");
        for (int num : listaOriginal) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("\nIngresa el numero que deseas buscar: ");
        int valorBuscado = scanner.nextInt();

        int posicion = Operaciones.buscar(listaOriginal, valorBuscado, 0, listaOriginal.length - 1);

        if (posicion != -1) {
            int mitad = listaOriginal.length / 2;
            String lado = (posicion < mitad) ? "lado izquierdo" : "lado derecho";
            System.out.println("El numero " + valorBuscado + " se encontro en el indice " + posicion + " (" + lado + ").");
        } else {
            System.out.println("El numero " + valorBuscado + " no se encuentra en el arreglo.");
        }

        }
    }
}