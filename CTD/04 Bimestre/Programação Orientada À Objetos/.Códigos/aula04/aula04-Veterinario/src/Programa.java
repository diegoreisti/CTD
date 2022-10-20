import entities.Veterinario;

public class Programa {

    public static void main(String[] args) {

        Veterinario vet1 = new Veterinario();

        Veterinario vet2 = new Veterinario(1, "Diego", "Reis", "XPTO01",4500.00);

        vet1.setId(2);
        vet1.setNome("Duda");
        vet1.setSobreNome("Dourado");
        vet1.setRegistro("ABCD06");
        vet1.setSalario(6800.00);

        System.out.println(vet2); // O toString está implícito
        System.out.println(vet1.toString());

    }
}
