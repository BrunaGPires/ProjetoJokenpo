import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //ansi pra texto vermelho na run
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        //variaveis
        int numPc;
        int numUs;
        int pointUs = 0;
        int pointPc = 0;
        int rodada = 1;
        String nameUS;
        //apresentação e placar atual
        System.out.println("**Bem vindo Jogador**\n" +
                "Digite seu nome: ");
        nameUS = scan.next().toUpperCase();
        System.out.println("-===========================-");
        System.out.println("Olá " + nameUS);
        System.out.println("O placar atual é\n" +
                "Computador: "+pointPc+ " -- " + nameUS+": "+pointUs);
        System.out.println("-===========================-");
        //inico jogo
        for (rodada = 1; rodada < 4; rodada++) {
            System.out.println(ANSI_RED+"!Rodada número "+rodada+"!"+ANSI_RESET);
            System.out.println("[0]Pedra [1]Papel [2]Tesoura");
            System.out.println("Digite o numero da sua escolha: ");
            numPc = random.nextInt(3);
            numUs = scan.nextInt();
            //[0]Pedra, [1]Papel, [2]Tesoura
            System.out.println("-----------------------------");
            System.out.println("Computador jogou: " + numPc);
            System.out.println("Jogador " + nameUS + " jogou: " + numUs);
            //lógica jogador ganha ponto
            if ((numUs == 0 && numPc == 2) || (numUs == 1 && numPc== 0) || (numUs == 2 && numPc == 1)){
                System.out.println(ANSI_RED+"JOKENPO!!!"+ANSI_RED);
                System.out.println(nameUS+" ganhou!"+ANSI_RESET);
                pointUs++;
            //empate
            } else if (numUs == numPc){
                System.out.println("Houve empate!");
            //computador ganha ponto
            }else {
                System.out.println(ANSI_RED+"JOKENPO!!!");
                System.out.println("Computador ganhou!"+ANSI_RESET);
                pointPc++;
            }
            System.out.println("-----------------------------");
            System.out.println("Pontuação atual do Computador: "+pointPc);
            System.out.println("Pontuação atual do "+nameUS+": "+pointUs);
            System.out.println(" \n");
        }
    }
}
