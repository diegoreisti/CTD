import entities.Equipe;
import entities.Jogador;

public class Programa {
    public static void main(String[] args) {
        Jogador j1 = new Jogador(1,13,"Alisson (Liverpool)",true,true);
        Jogador j2 = new Jogador(2,2,"Thiago Silva (Chelsea)",true,true);
        Jogador j3 = new Jogador(3,17,"Dani Alves (Barcelona)",false,true);
        Jogador j4 = new Jogador(4,15,"Fred (Manchester United)",false,true);
        Jogador j5 = new Jogador(5,11,"Gabriel Jesus (Manchester City)",false,true);

        Equipe eq1 = new Equipe(1, "Seleção CTD");

        eq1.adicionarJogador(j1);
        eq1.adicionarJogador(j2);
        eq1.adicionarJogador(j3);
        eq1.adicionarJogador(j4);
        eq1.adicionarJogador(j5);

        System.out.println("\nJogadores titulares: ");
        eq1.mostrarJogadoresTitulares();

        System.out.println("\nJogadores lesionados: ");
        System.out.println(eq1.getJogadoresLesionados());
    }
}
