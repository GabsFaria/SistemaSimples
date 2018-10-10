public interface Permissoes {

    public void cadastraUsuario(String usuario);

    public void cadastraSenha(String senha);

    public boolean validacao(String usuario, String senha);

}
