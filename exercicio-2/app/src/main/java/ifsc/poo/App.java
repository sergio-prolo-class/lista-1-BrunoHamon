/*  This source file was generated by the Gradle 'init' task */

package ifsc.poo;

public class App {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Erro. Cada resistor possui 4 faixas.");
            return;
        }

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "preto":
                    if (i == 0 || i == 1) {
                        System.out.print("0");
                    } else if (i == 2) {
                        System.out.print(" Ohms");
                    } else {
                        System.out.println(" (+- 0%)");
                    }
                    break;

                case "marrom":
                    if (i == 0 || i == 1) {
                        System.out.print("1");
                    } else if (i == 2) {
                        System.out.print("0 Ohms");
                    } else {
                        System.out.println(" (+- 1%)");
                    }
                    break;

                case "vermelho":
                    if (i == 0 || i == 1) {
                        System.out.print("2");
                    } else if (i == 2) {
                        System.out.print("00 Ohms");
                    } else {
                        System.out.println(" (+- 2%)");
                    }
                    break;

                case "laranja":
                    if (i == 0 || i == 1) {
                        System.out.print("3");
                    } else if (i == 2) {
                        System.out.print("000 Ohms");
                    } else {
                        System.out.println();
                    }
                    break;

                case "amarelo":
                    if (i == 0 || i == 1) {
                        System.out.print("4");
                    } else if (i == 2) {
                        System.out.print("0K Ohms");
                    } else {
                        System.out.println();
                    }
                    break;

                case "verde":
                    if (i == 0 || i == 1) {
                        System.out.print("5");
                    } else if (i == 2) {
                        System.out.print("00K Ohms");
                    } else {
                        System.out.println(" (+- 0.5%)");
                    }
                    break;

                case "azul":
                    if (i == 0 || i == 1) {
                        System.out.print("6");
                    } else if (i == 2) {
                        System.out.print("M Ohms");
                    } else {
                        System.out.println(" (+- 0.25%)");
                    }
                    break;

                case "violeta":
                    if (i == 0 || i == 1) {
                        System.out.print("7");
                    } else if (i == 2) {
                        System.out.print("0M Ohms");
                    } else {
                        System.out.println(" (+- 0.1%)");
                    }
                    break;

                case "cinza":
                    if (i == 0 || i == 1) {
                        System.out.print("8");
                    } else if (i == 2) {
                        System.out.print("00M Ohms");
                    } else {
                        System.out.println(" (+- 0.05%)");
                    }
                    break;

                case "branco":
                    if (i == 0 || i == 1) {
                        System.out.print("9");
                    } else if (i == 2) {
                        System.out.print("G Ohms");
                    } else {
                        System.out.println(" (+- 20%)");
                    }
                    break;
                // case: "ouro"
                // case: "prata"
                default:
                    System.out.println("Insira as 4 cores das faixas, via linha de comando, com letra minúscula.");
                    break;
            }
        }
    }
}