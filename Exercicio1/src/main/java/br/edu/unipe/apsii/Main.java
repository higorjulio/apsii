package br.edu.unipe.apsii;

public class Main {
    public static void main(String[] args) {
        Banco b3 = new Banco("José", "000", 10);

        System.out.println(b3.getNome());
        b3.setNome("Lionel Adolfo dos Santos Aveiro da Silva Júnior Cuccittini Hirohito");
        System.out.println(b3.getNome());
    }
}