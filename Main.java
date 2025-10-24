package nelsin;

public class Main {
    public static void main(String[] args) {
        Guerreiro carinha = new Guerreiro(1, "Luffy");
        Guerreiro carinhaMal = new Guerreiro(2, "Doflamingo");

        carinha.luta(carinhaMal);
        carinha.batalhar(carinhaMal);
        
        carinha.alimentar();
        carinhaMal.alimentar();

        System.out.println(carinha);
        System.out.println(carinhaMal);
    }
}
