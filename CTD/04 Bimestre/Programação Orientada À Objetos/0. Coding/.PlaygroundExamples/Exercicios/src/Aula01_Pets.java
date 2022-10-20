public class Aula01_Pets {
    public static void main(String[] args) {

        String[] tipoAnimal = {"Cão","Peixe","Gato"};
        String[] nomeAnimal = {"Shesheu","Nemo","Snow"};
        int[] idadeAnimal = {2, 1, 3};
        String[] quantoCome = {"1kg e meio","140 gramas","meio quilo"};
        String[] sonoro = {"au au","glub glub","miau"};

        for(int x=0; x < tipoAnimal.length; x++){
            System.out.printf("%s come %s e faz %s\n", nomeAnimal[x], quantoCome[x], sonoro[x]);
        }
    }
}