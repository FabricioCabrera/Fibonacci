package fibonaccirecursividad;

import java.util.Scanner;

public class Fibonaccirecursividad {

    int tamaño, suma;

    public void Fibonacci(int tamaño) {
        this.tamaño = tamaño;
    }

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public void mostarserie(int tamaño) {
        System.out.println("la serie fibonacci es:");
        for (int n = 1; n <= tamaño; n++) {
            System.out.print(fibonacci(n) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número de la serie máxima a realizar");
        int tamaño = sc.nextInt();

        Fibonaccirecursividad n = new Fibonaccirecursividad();
        n.mostarserie(tamaño);

    }

}
