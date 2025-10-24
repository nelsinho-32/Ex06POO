package nelsin;

import java.util.Random;

public class Guerreiro {
    private int codigo;
    private String nome;
    private int energia;

    public Guerreiro(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.energia = 5;
    }

    public int getEnergia(){
        return energia;
    }

    public void incremento(){
        if(energia >= 5){
            System.out.println("Nivel máximo de energia atingido.");
        } else {
            this.energia += 1;
            System.out.println("Energia recebe +1. \nEnergia: " + energia);
        }
    }

    public void decremento(){
        if(energia <= 0){
            System.out.println("Nivel mínimo de energia atingido. Você não tem energia!");
        } else {
            this.energia -= 1;
            System.out.println("Energia reduz +1. \nEnergia: " + energia);
        }
    }

    public void alimentar(){
        incremento();
    }

    public int atacar() {
        Random gerador = new Random();
        
        return gerador.nextInt(2);
    }

    public void luta(Guerreiro oponente) {
        while (this.energia >= 1 && oponente.energia >= 1) {

            // carinha do bem
            if(this.atacar() == 1){
                System.out.println("Você fez um ataque!");
                oponente.decremento();
            } else {
                System.out.println("o Ataque falhou.\n");
            }

            // carinha do mal
            if(oponente.atacar() == 1){
                System.out.println("Vocẽ recebeu um ataque!");
                this.decremento();
            } else {
                System.out.println("o ataque do oponente falhou.");
            }


            // status da luta e result
            if(this.energia == 0){
                System.out.println("Você foi derrotado!");
                
            } else if(oponente.energia == 0){
                System.out.println("Você venceu a luta, parabéns!");
                
            } else {
                System.out.println("A luta continua Guerreiros!");
            }
        }
    }

    public void batalhar(Guerreiro oponente) {

        // status da luta e result
        if(this.energia == 0) {
            System.out.println("Você foi derrotado!");
            return;
        } else if(oponente.energia == 0) {
            System.out.println("Você venceu a luta, parabéns!");
            return;
        } else {
            System.out.println("A luta continua Guerreiros!");
        }

        // carinha do bem
        if(this.atacar() == 1){
            System.out.println("Você fez um ataque!");
            oponente.decremento();
        } else {
            System.out.println("o Ataque falhou.\n");
        }

        // carinha do mal
        if(oponente.atacar() == 1){
            System.out.println("Vocẽ recebeu um ataque!");
            this.decremento();
        } else {
            System.out.println("o ataque do oponente falhou.");
        }

        batalhar(oponente);
    }

    @Override
    public String toString() {
        return "Nome do guerreiro: " + nome + ", Código: "+ codigo + ", Energia: " + energia + ".";
    }
}
