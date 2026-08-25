public class Main {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Ana Costa", "F001", 2500, "01/03/2020");
        FuncionarioCLT fCLT = new FuncionarioCLT("Bruno Reis", "C001", 3000, "10/06/2021", 220 , 400);
        Gerente g = new Gerente("Carla Mendes", "G001", 8000, "15/01/2018", 300, 500, 12, 0.20);
        Estagiario e = new Estagiario("Diego Alves", "E001", 0, "05/08/2024", 1500, 20);

        System.out.println(f);
        System.out.println(fCLT);
        System.out.println(g);
        System.out.println(e);
    }
}