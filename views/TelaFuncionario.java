import java.util.Date;

// Classe que representa a visualização das informações de um funcionário na tela.
public class TelaFuncionario {

    // Método que imprime as informações do funcionário na tela.
    public void printFuncionarioInfo(String nome,
                                     String cpf,
                                     Date dataNasc,
                                     String email,
                                     String telefone,
                                     char sexo,
                                     String login,
                                     String senha,
                                     String status) {
        // Imprime o cabeçalho das informações do funcionário.
        System.out.println("Informações do funcionário:");

        // Imprime o nome do funcionário.
        System.out.println("Nome: " + nome);

        // Imprime o CPF do funcionário.
        System.out.println("CPF: " + cpf);

        // Imprime a data de nascimento do funcionário.
        System.out.println("Data de nascimento: " + dataNasc);

        // Imprime o e-mail do funcionário.
        System.out.println("E-mail: " + email);

        // Imprime o telefone do funcionário.
        System.out.println("Telefone: " + telefone);

        // Imprime o sexo do funcionário.
        System.out.println("Sexo: " + sexo);

        // Imprime o login do funcionário.
        System.out.println("Login: " + login);

        // Imprime o status do funcionário.
        System.out.println("Status: " + status);
    }
}