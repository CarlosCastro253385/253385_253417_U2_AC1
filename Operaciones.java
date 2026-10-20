
public class Operaciones {

    public static void generarNumeros(int[] listaOriginal) {
        System.out.println("Lista Original:");
        for (int i = 0; i < listaOriginal.length; i++) {
            listaOriginal[i] = (int) (Math.random() * 50) + 1;
            System.out.print(listaOriginal[i] + " ");
        }
        System.out.println();
    }

    public static void ordenarQuicksort(int[] listaOriginal, int inferior, int superior) {
        int i = inferior;
        int j = superior;
        int central = (inferior + superior) / 2;
        int pivote = listaOriginal[central];

        System.out.println("Limites que se analizan. Inferior: " + i + " Superior: " + j + " Pivote: " + pivote);

        do {
            while (listaOriginal[i] < pivote) i++;
            while (listaOriginal[j] > pivote) j--;

            if (i <= j) {
                intercambiar(listaOriginal, i, j);
                i++;
                j--;
            }
        } while (i <= j);

        if (inferior < j) {
            ordenarQuicksort(listaOriginal, inferior, j);
        }
        if (i < superior) {
            ordenarQuicksort(listaOriginal, i, superior);
        }
    }

    public static void intercambiar(int[] listaOriginal, int i, int j) {
        int aux = listaOriginal[i];
        listaOriginal[i] = listaOriginal[j];
        listaOriginal[j] = aux;
    }

    public static int buscar(int[] listaOriginal, int valorBuscado, int inferior, int superior) {
        if (inferior > superior) {
            return -1;
        }
        int central = (inferior + superior) / 2;

        if (listaOriginal[central] == valorBuscado) {
            return central;
        } else if (listaOriginal[central] < valorBuscado) {
            return buscar(listaOriginal, valorBuscado, central + 1, superior);
        } else {
            return buscar(listaOriginal, valorBuscado, inferior, central - 1);
        }
    }
}