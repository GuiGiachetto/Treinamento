
public class Main {
    public static void main(String[] args) {
        Usuario novoUsuario = new Usuario("João","joao@exemplo.com","senhaSegura123");
        novoUsuario.imprimir();
        novoUsuario.verificaSenha("senhaSegura123");
        novoUsuario.verificaSenha("senha");
    }
}