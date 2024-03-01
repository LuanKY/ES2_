import java.util.Date;

public class ControleFuncionario {
    // Objeto da classe de entidade 'Funcionario'
    private Funcionario entidade;

    // Objeto da classe de fronteira 'TelaFuncionario'
    private TelaFuncionario fronteira;

    // Construtor de 'ControleFuncionario'
    public ControleFuncionario(Funcionario entidade, TelaFuncionario fronteira) {
        this.entidade = entidade;
        this.fronteira = fronteira;
    }

    public String getFuncionarioNome() {
        return entidade.getNome();
    }

    public void setFuncionarioNome(String nome) {
        entidade.setNome(nome);
    }

    public Date getFuncionarioDataNasc() {
        return entidade.getDataNasc();
    }

    public void setFuncionarioDataNasc(Date dataNasc) {
        entidade.setDataNasc(dataNasc);
    }

    public String getFuncionarioCpf() {
        return entidade.getCpf();
    }

    public void setFuncionarioCpf(String cpf) {
        entidade.setCpf(cpf);
    }

    public String getFuncionarioEmail() {
        return entidade.getEmail();
    }

    public void setFuncionarioEmail(String email) {
        entidade.setEmail(email);
    }

    public String getFuncionarioTelefone() {
        return entidade.getTelefone();
    }

    public void setFuncionarioTelefone(String telefone) {
        entidade.setTelefone(telefone);
    }

    public char getFuncionarioSexo() {
        return entidade.getSexo();
    }

    public void setFuncionarioSexo(char sexo) {
        entidade.setSexo(sexo);
    }

    public String getFuncionarioLogin() {
        return entidade.getLogin();
    }

    public void setFuncionarioLogin(String login) {
        entidade.setLogin(login);
    }

    public String getFuncionarioSenha() {
        return entidade.getSenha();
    }

    public void setFuncionarioSenha(String senha) {
        entidade.setSenha(senha);
    }

    public String getFuncionarioStatus() {
        return entidade.getStatus();
    }

    public void setFuncionarioStatus(String status) {
        entidade.setStatus(status);
    }
}
