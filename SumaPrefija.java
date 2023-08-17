import java.util.Scanner;

public class SumaPrefija {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Ingresa el tamano del arreglo: ");
                int tam = scanner.nextInt();
                int[] ar = new int[tam];
                System.out.println("Valores para el arreglo:");
                for (int i = 0; i < tam; i++) {
                    System.out.print("Numero " + (i + 1) + ": ");
                    ar[i] = scanner.nextInt();
                }
                int[] sumaPrefija = new int[tam];
                sumaPrefija[0] = ar[0];
                for (int i = 1; i < tam; i++) {
                    sumaPrefija[i] = sumaPrefija[i - 1] + ar[i];
                }
                System.out.println("Suma Prefija del arreglo:");
                for (int valor : sumaPrefija) {
                    System.out.println(valor);
                }
                scanner.close();
            }
        }