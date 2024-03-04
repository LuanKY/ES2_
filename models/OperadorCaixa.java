import java.util.Date;

public class OperadorCaixa extends Funcionario{

    public OperadorCaixa(String nome, String cpf, Date dataNasc, String email, String telefone, char sexo, String login, String senha, String status){
        super(nome, cpf, dataNasc, email, telefone, sexo, login, senha, status);
    }
}