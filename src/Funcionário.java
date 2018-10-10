import javax.swing.*;

public class Funcionário extends Cliente{

    public Funcionário(){

    }

    public void nomeFuncionario(String nome){
        super.setNome(nome);
    }

    public void idadeFuncionario(String idade){
        super.setIdade(idade);
    }

    public void rgFuncionario(String rg){
        super.setRg(rg);
    }


}
