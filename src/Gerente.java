import javax.swing.*;

public class Gerente extends Cliente implements Permissoes {
    private String usuario;
    private String senha;

    public void nomeGerente(String nome) {
        super.setNome(nome);
    }

    public void idadeGerente(String idade) {
        super.setIdade(idade);
    }

    public void rgGerente(String rg) {
        super.setRg(rg);
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public void cadastraUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public void cadastraSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean validacao(String usuario, String senha) {
        if (this.senha!=senha && this.usuario!=usuario){
            JOptionPane.showMessageDialog(null,"Usuário e senha inválidos");
            return false;
        } else if (this.senha != senha) {
                JOptionPane.showMessageDialog(null, "Senha inválida");
                return false;
            }else if (this.usuario != usuario) {
                    JOptionPane.showMessageDialog(null,"Usuário inválido");
                    return false;
                }else{
                    return true;
        }
    }



}
