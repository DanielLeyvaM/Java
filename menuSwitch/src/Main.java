import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repeat = true;
        Scanner scan = new Scanner(System.in);

        while (repeat) {
            //Imprimir bloque de texto
            System.out.print("""    
                    --- OPERACIONES ---
                    1. Sumar
                    2. Restar
                    3. Multiplicar 
                    4. Dividir
                    5. Salir
                    Seleccione una opcion:\s """);  //\s = espacio
            int opcion = Integer.parseInt(scan.nextLine());

            double n1 = 0;
            double n2 = 0;
            if (opcion >=1 && opcion <=4) {
                System.out.println("Ingrese num 1: ");
                n1 = Double.parseDouble(scan.nextLine());

                System.out.println("Ingrese num 2: ");
                n2 = Double.parseDouble(scan.nextLine());
            }

            //Switch case Java v13+ (no se necesita el break)
            switch (opcion) {
                case 1 -> {
                    System.out.printf("%.2f + %.2f = %.2f", n1, n2, n1 + n2);   //%f imprime floats y doubles
                }
                case 2 -> {
                    System.out.printf("%.2f - %.2f = %.2f", n1, n2, n1 - n2);
                }
                case 3 -> {
                    System.out.printf("%.2f * %.2f = %.2f", n1, n2, n1 * n2);
                }
                case 4 -> {
                    System.out.printf("%.2f / %.2f = %.2f", n1, n2, n1 / n2);
                }
                case 5 -> {
                    repeat=false;
                }
                default -> {
                    System.out.println("Opcion no disponible");
                }
            }
            System.out.println();
        }
    }
}