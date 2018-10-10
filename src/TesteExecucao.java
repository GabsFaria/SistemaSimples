import javax.swing.*;
import java.util.ArrayList;

public class TesteExecucao {

    public static void main(String[] args) {
        ArrayList<Gerente> listaGerente = new ArrayList<>();
        ArrayList<Funcionário> listaFuncionario = new ArrayList<>();

        String opcao="";
        String menu="--------------------------------\n"
                + "1 - Gerente                  \n"
                + "2 - Funcionário              \n"
                + "3 - Sair                     \n"
                + "-------------------------------";

        while (!opcao.equals("3")) {
            opcao = JOptionPane.showInputDialog(menu);
            switch (opcao) {

                case "1":
                    String opcao2 = "";
                    String menu2 = "------------------------------\n"
                            + " 1 - Listar Gerente         \n"
                            + " 2 - Cadastrar Gerente      \n"
                            + " 3 - Voltar                 \n"
                            + "------------------------------";
                    while (!opcao2.equals("3")) {
                        opcao2 = JOptionPane.showInputDialog(menu2);
                        if (opcao2.equals("1")) {
                            String lista = "Lista de Gerentes\n";
                            if (listaGerente.size() == 0) {
                                JOptionPane.showMessageDialog(null, "Não há gerentes cadastrados!");
                            } else {
                                for (int i = 0; i <= listaGerente.size()-1; i++) {
                                    lista += i + ":" + listaGerente.get(i).getNome() + "\n";
                                }
                                String escolha = JOptionPane.showInputDialog(lista);

                            }
                        }else if (opcao2.equals("2")){
                                Gerente g = new Gerente();
                                g.setNome(JOptionPane.showInputDialog("Digite o nome do gerente"));
                                g.setIdade(JOptionPane.showInputDialog("Digite a idade do gerente"));
                                g.setRg(JOptionPane.showInputDialog("Digite o RG do gerente"));
                                g.cadastraUsuario(JOptionPane.showInputDialog("Usuário:"));
                                g.cadastraSenha(JOptionPane.showInputDialog("Senha:"));


                                listaGerente.add(g);

                        }
                    }
                    break;
                case "2":
                    String opcao3 ="";
                    String menu3 = "------------------------------------\n"
                                    +"1 - Listar Funcionário            \n"
                                    +"2 - Cadastrar Funcionário         \n"
                                    +"3 - Voltar                        \n"
                                    +"------------------------------------";
                    while (!opcao3.equals("3")){
                        opcao3=JOptionPane.showInputDialog(menu3);
                        if (opcao3.equals("1")) {
                            if (listaFuncionario.size() == 0) {
                                JOptionPane.showMessageDialog(null, "Não há funcionários cadastrados");
                            } else{
                                String lista2="";
                                for(int i = 0; i<=listaFuncionario.size()-1; i++){
                                    lista2+= (i+1)+": "+listaFuncionario.get(i).getNome()+"\n";
                                }
                                String escolha2 = JOptionPane.showInputDialog(lista2);
                            }
                        } else if(opcao3.equals("2")){
                            Funcionário f = new Funcionário();
                            f.setNome(JOptionPane.showInputDialog("Digite o nome do funcionário"));
                            f.setIdade(JOptionPane.showInputDialog("Digite a idade do funcionário"));
                            f.setRg(JOptionPane.showInputDialog("Digite o RG do funcionário"));

                            listaFuncionario.add(f);
                        }
                    }
                    break;

            }
        }




    }
}
