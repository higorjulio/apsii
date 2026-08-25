public class Gerente extends FuncionarioCLT{
    public int tamanhoEquipe;
    public double percentualBonus;

    public Gerente(String nome, String matricula, double salarioBase, String dataAdmissao, double valeTransporte, double valeAlimentacao, int tamanhoEquipe, double percentualBonus) {
        super(nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao);
        this.tamanhoEquipe = tamanhoEquipe;
        this.percentualBonus = percentualBonus;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + getSalarioBase()*percentualBonus;
    }

    @Override
    public double calcularDesconto() {
        if (tamanhoEquipe > 100) {
            return super.calcularDesconto() - 100;
        } else {
            return super.calcularDesconto();
        }
    }
}
