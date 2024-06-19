import java.util.Objects;

public class Usuario {

    //Atributos
    String nomeUsuario;
    String emailUsuario;
    String senhaUsuario;

    //Construtor
    public Usuario (String nomeUsuario, String emailUsuario, String senhaUsuario) {
        this.nomeUsuario = nomeUsuario;
        this.emailUsuario = emailUsuario;
        this.senhaUsuario = senhaUsuario;
    }

    //Metodos
    public void imprimir() {
        System.out.printf("Usuário: %s\nEmail: %s\n", nomeUsuario, emailUsuario);
    }
    public void verificaSenha(String senhaInformada) {
        if (Objects.equals(senhaUsuario, senhaInformada)) {
            System.out.println("Senha correta");
        }
        else {
            System.out.println("Senha incorreta");
        }
    }
}
