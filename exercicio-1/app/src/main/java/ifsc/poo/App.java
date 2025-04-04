/*
 * This source file was generated by the Gradle 'init' task
 */
package ifsc.poo;

public class App {

    public static void main(String[] args) {

        switch (args[0]) {
            case "triangulo":
                int branco = Integer.parseInt(args[1]);

                for (int preto = 1; preto <= branco; preto++) {
                    for (int i = 1; i <= (branco - preto); i++) {
                        System.out.printf(" ");
                    }
                    for (int j = 1; j <= preto; j++) {
                        System.out.printf("*");
                    }
                    System.out.println();
                }
                break;

            case "losango":
                int alturaL = Integer.parseInt(args[1]);

                if (alturaL % 2 == 0) {
                    System.out.println("A altura do losango deve ser impar. Tente novamente.");
                    break;
                }

                for (int linha = 1; linha <= (alturaL * 2); linha += 2) {
                    if (linha <= alturaL) {
                        for (int i = 1; i <= ((alturaL - linha) / 2); i++) {
                            System.out.printf(" ");
                        }
                        for (int j = 1; j <= linha; j++) {
                            System.out.printf("*");
                        }
                    } else {
                        int p = (alturaL * 2) - linha;

                        for (int i = 1; i <= ((alturaL - p) / 2); i++) {
                            System.out.printf(" ");
                        }
                        for (int j = 1; j <= p; j++) {
                            System.out.printf("*");
                        }
                    }
                    System.out.println();
                }
                break;

            case "retangulo":
                int largura = Integer.parseInt(args[1]);
                int alturaR = Integer.parseInt(args[2]);

                for (int preto = 1; preto <= largura; preto++) {
                    System.out.printf("*");
                }
                System.out.println();

                for (int linha = 1; linha <= (alturaR - 2); linha++) {
                    System.out.printf("*");
                    for (int i = 1; i <= (largura - 2); i++) {
                        System.out.printf(" ");
                    }
                    System.out.println("*");
                }

                for (int preto = 1; preto <= largura; preto++) {
                    System.out.printf("*");
                }
                System.out.println();

                System.out.printf("Retangulo %d X %d\n", largura, alturaR);
                break;

            default:
                if (args.length == 0) {
                    System.out.println("Nenhum argumento encontrado. Tente novamente.");

                } else {
                    System.out.println("Argumento inválido. Tente novamente.");

                }
        }


    }
}
