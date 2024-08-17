import entidade.Continente;
import entidade.Pais;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pais pais= new Pais(),br,py,chi;
        Continente continente=new Continente();
        // inicializando alguns paises
        br=new Pais("BRA","Brasil",100000,550.000);
        py=new Pais("PY","Paraguay",25000,10.000);
        chi=new Pais("CHI","Chile",75000,55.000);
        continente.setContinente(br);
        continente.setContinente(py);
        continente.setContinente(chi);
    do {

        pais=cadastro();
        if(JOptionPane.showOptionDialog(null,"Adicionar um vizinho","Adição de Vizinhos",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null)==JOptionPane.YES_OPTION)
        {
            Pais vizinho=new Pais();
            vizinho =cadastro();
            pais.addVizinho(vizinho);
        }
        continente.setContinente(pais);
        pais= new Pais(); // aqui deve mesmo instamciar outro pais
    }while(JOptionPane.showOptionDialog(null,"Novo Cadastro?","Novo Pais",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,null,null)==JOptionPane.YES_OPTION);
    System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println(continente);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println(continente.getPopuTot());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println(continente.getMaiorPop());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println(continente.getMenorPop());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println(continente.getMaiorDime());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println(continente.getMenorDime());
    }

    private static Pais cadastro()
    {
        // showInputDialog faz a entrada de um String
        // converte a entrada String em int Integer.parseInt

        Pais pais=new Pais();
        pais.setCodIso(JOptionPane.showInputDialog("Codigo ISO"));
        pais.setNome(JOptionPane.showInputDialog("Nome do Pais:"));
        pais.setPopulacao(Integer.parseInt(JOptionPane.showInputDialog("Total da População")));
        pais.setDimensao(Double.parseDouble(JOptionPane.showInputDialog("Dimensão")));
        JOptionPane.showMessageDialog(null,pais);
        return pais;
    }
}