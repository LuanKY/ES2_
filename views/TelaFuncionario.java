import java.util.Date;

public class TelaFuncionario {
    public void printFuncionarioInfo(String nome,
                                     String cpf,
                                     Date dataNasc,
                                     String email,
                                     String telefone,
                                     char sexo,
                                     String login,
                                     String senha,
                                     String status) {
        System.out.println("Inforções do funcionário:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de nascimento: " + dataNasc);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Sexo: " + sexo);
        System.out.println("Login: " + login);
        System.out.println("Status: " + status);
    }
}
