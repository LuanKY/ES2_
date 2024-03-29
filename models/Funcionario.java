import java.util.Date;

// Classe responsável pela lógica de negócios relacionada à entidade funcionário
public class Funcionario {
    protected String nome;
    protected String cpf;
    protected Date dataNasc;
    protected String email;
    protected String telefone;
    protected char sexo;
    protected String login;
    protected String senha;
    protected String status;
    protected Endereco endereco;

    public Funcionario(String nome, String cpf, Date dataNasc, String email, String telefone, char sexo, String login,
                       String senha, String status, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.email = email;
        this.telefone = telefone;
        this.sexo = sexo;
        this.login = login;
        this.senha = senha;
        this.status = status;
        this.endereco = endereco;
    }

    // Retorna o nome do funcionário
    public String getNome() {
        return nome;
    }

    // Define o nome do funcionário
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Retorna a data de nascimento do funcionário
    public Date getDataNasc() {
        return dataNasc;
    }

    // Define a data de nascimento do funcionário
    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    // Retorna o CPF do funcionário
    public String getCpf() {
        return cpf;
    }

    // Define o CPF do funcionário
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Retorna o e-mail do funcionário
    public String getEmail() {
        return email;
    }

    // Define o e-mail do funcionário
    public void setEmail(String email) {
        this.email = email;
    }

    // Retorna o telefone do funcionário
    public String getTelefone() {
        return telefone;
    }

    // Define o telefone do funcionário
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Retorna o sexo do funcionário
    public char getSexo() {
        return sexo;
    }

    // Define o sexo do funcionário
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    // Retorna o login do funcionário
    public String getLogin() {
        return login;
    }

    // Define o login do funcionário
    public void setLogin(String login) {
        this.login = login;
    }

    // Retorna a senha do funcionário
    public String getSenha() {
        return senha;
    }

    // Define a senha do funcionário
    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Retorna o status do funcionário
    public String getStatus() {
        return status;
    }

    // Define o status do funcionário
    public void setStatus(String status) {
        this.status = status;
    }

    // Retorna o endereço do funcionário
    public Endereco getEndereco() {
        return endereco;
    }

    // Define o endereço do funcionário
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}