import java.util.Date;

public class Funcionario{
    protected String nome;
    protected String cpf;
    protected Date dataNasc;
    protected String email;
    protected String telefone;
    protected char sexo;
    protected String login;
    protected String senha;
    protected String status;

    public Funcionario(String nome, String cpf, Date dataNasc, String email, String telefone, char sexo, String login, String senha, String status){
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.email = email;
        this.telefone = telefone;
        this.sexo = sexo;
        this.login = login;
        this.senha = senha;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}