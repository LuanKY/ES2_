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
    protected status String;

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
}