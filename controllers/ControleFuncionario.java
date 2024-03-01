import java.util.Date;

// Classe responsável por integrar a classe de entidade 'Funcionario' e
// a classe de fronteira 'TelaFuncionario'
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

    // Métodos para obter e definir o nome do funcionário
    public String getFuncionarioNome() {
        return entidade.getNome();
    }

    public void setFuncionarioNome(String nome) {
        entidade.setNome(nome);
    }

    // Métodos para obter e definir a data de nascimento do funcionário
    public Date getFuncionarioDataNasc() {
        return entidade.getDataNasc();
    }

    public void setFuncionarioDataNasc(Date dataNasc) {
        entidade.setDataNasc(dataNasc);
    }

    // Métodos para obter e definir o CPF do funcionário
    public String getFuncionarioCpf() {
        return entidade.getCpf();
    }

    public void setFuncionarioCpf(String cpf) {
        entidade.setCpf(cpf);
    }

    // Métodos para obter e definir o e-mail do funcionário
    public String getFuncionarioEmail() {
        return entidade.getEmail();
    }

    public void setFuncionarioEmail(String email) {
        entidade.setEmail(email);
    }

    // Métodos para obter e definir o telefone do funcionário
    public String getFuncionarioTelefone() {
        return entidade.getTelefone();
    }

    public void setFuncionarioTelefone(String telefone) {
        entidade.setTelefone(telefone);
    }

    // Métodos para obter e definir o sexo do funcionário
    public char getFuncionarioSexo() {
        return entidade.getSexo();
    }

    public void setFuncionarioSexo(char sexo) {
        entidade.setSexo(sexo);
    }

    // Métodos para obter e definir o login do funcionário
    public String getFuncionarioLogin() {
        return entidade.getLogin();
    }

    public void setFuncionarioLogin(String login) {
        entidade.setLogin(login);
    }

    // Métodos para obter e definir a senha do funcionário
    public String getFuncionarioSenha() {
        return entidade.getSenha();
    }

    public void setFuncionarioSenha(String senha) {
        entidade.setSenha(senha);
    }

    // Métodos para obter e definir o status do funcionário
    public String getFuncionarioStatus() {
        return entidade.getStatus();
    }

    public void setFuncionarioStatus(String status) {
        entidade.setStatus(status);
    }
}