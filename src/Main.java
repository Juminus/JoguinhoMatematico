import java.io.IOException;
import java.util.Scanner;

import model.Calcular;

public class Main {
    
    static Scanner scan = new Scanner(System.in);
    static int pontos = 0;
    static Calcular calc;

    public static void main(String[] args) throws InterruptedException, IOException{
        Main.jogar();
    }

    public static void jogar() throws InterruptedException, IOException{
        System.out.println("Escolha um nível de dificuldade: (1-Fácil, 2-Médio, 3-Difícil, 4-Expert)");
        int dificuldade = scan.nextInt();
        int resposta;

        Main.calc = new Calcular(dificuldade);

        System.out.println("Resultado da operação: ");

        switch(calc.getOperacao()){
            case 0:
                System.out.println(calc.getValor1() +" + "+ calc.getValor2());
                resposta = Main.scan.nextInt();

                if(calc.somar(resposta)){
                    Main.pontos += 1;
                    System.out.println("+1 ponto\nPontuação: "+ Main.pontos);
                }
                break;

            case 1:
                System.out.println(calc.getValor1() +" - "+ calc.getValor2());
                resposta = Main.scan.nextInt();

                if(calc.subtrair(resposta)){
                    Main.pontos += 1;
                    System.out.println("+1 ponto\nPontuação: "+ Main.pontos);
                }
                break;

            case 2:
                System.out.println(calc.getValor1() +" * "+ calc.getValor2());
                resposta = Main.scan.nextInt();

                if(calc.multiplicar(resposta)){
                    Main.pontos += 1;
                    System.out.println("+1 ponto\nPontuação: "+ Main.pontos);
                }
                break;

            case 3:
                System.out.println(calc.getValor1() +" / "+ calc.getValor2());
                resposta = Main.scan.nextInt();

                if(calc.dividir(resposta)){
                    Main.pontos += 1;
                    System.out.println("+1 ponto\nPontuação: "+ Main.pontos);
                }
                break;

            default: 
                System.out.println("Operação não reconhecida;");
        }

        System.out.println("Continuar?(1-Sim, 2-Não): ");
        int continuar = scan.nextInt();
        
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");

        switch(continuar){
            case 1:
                Main.jogar();
            case 2:
                System.exit(0);
            default:
                System.out.println("Opção inválida!");
        }
    }
}
