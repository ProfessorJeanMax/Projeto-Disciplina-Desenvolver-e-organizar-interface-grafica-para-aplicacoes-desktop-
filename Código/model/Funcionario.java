package projeto_base.model;

/**
 *
 * @author JeanMaxSimonKrebs
 */
public class Funcionario implements Perfil {

    private int id;
    private String nome;
    private String cpf;
    private String cargo;
    private String salario;

    public Funcionario(String nome, String cpf, String cargo, String salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario(int id, String nome, String cpf, String cargo, String salario) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", cargo=" + cargo + ", salario=" + salario + '}';
    }

    
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    // 🔹 Validação simples (opcional para aula)
    public boolean isValido() {
        return nome != null && !nome.isBlank()
                && cpf != null && !cpf.isBlank();
    }

}
