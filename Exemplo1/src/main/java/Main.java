public class Main {
    public static void main(String[] args){
        Veiculo v1 = new Veiculo("Corolla",2018);
        Veiculo v2 = new Veiculo("Onix",2016);

        Carro c1 = new Carro("Camaro", 2018, 2);

        Moto m1 = new Moto("R15", 2025, 155);

        System.out.println(v1.imprimirDetalhes());
        System.out.println(v2.imprimirDetalhes());
        System.out.println(c1.imprimirDetalhes());
        System.out.println(m1.imprimirDetalhes());
    }
}