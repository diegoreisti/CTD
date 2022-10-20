public class Programa {
    public static void main(String[] args) {

        String[] nomes = new String[5];

        nomes[0] = "Diego";
        nomes[1] = "Duda";
        nomes[2] = "Manu";
        nomes[3] = "Netinho";
        nomes[4] = "Fátima";

//        System.out.println(nomes[2]);
//        System.out.println(nomes[8]);

        // FOR
        /*for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Indice [%d]: %s\n",i, nomes[i]);
        }*/

        //WHILE
        /*int i = 0;
        while (i < nomes.length){
            System.out.printf("Indice [%d]: %s\n",i, nomes[i]);
            i++;
        }*/

        // FOR EACH
        int i = 0;
        for (String n : nomes) {
            System.out.printf("Indice [%d]: %s\n",i, nomes[i]);
            i++;
        }


    }
}
