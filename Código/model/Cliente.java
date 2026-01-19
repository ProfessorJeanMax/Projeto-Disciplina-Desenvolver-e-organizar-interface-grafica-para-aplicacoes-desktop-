package projeto_base.model;

public class Cliente {

    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
    private String endereco;

    // 🔹 Construtor SEM ID (usado no cadastro)
    public Cliente(String nome, String cpf, String telefone, String email, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    // 🔹 Construtor COM ID (usado em edição / múltiplos)
    public Cliente(int id, String nome, String cpf, String telefone, String email, String endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone + ", email=" + email + ", endereco=" + endereco + '}';
    }
    

    // ===== getters =====
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    // ===== setters =====
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // 🔹 Validação simples (opcional para aula)
    public boolean isValido() {
        return nome != null && !nome.isBlank()
            && cpf != null && !cpf.isBlank();
    }
}
