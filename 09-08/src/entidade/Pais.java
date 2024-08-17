package entidade;

import javax.swing.*;
import java.text.Format;
import java.util.ArrayList;

public class Pais {
    private String codIso;
    private String nome;
    private int populacao;
    private double dimensao;
    private final ArrayList<Pais> vizinhos = new ArrayList<>();
    //gets
    public String getCodIso() {
        return codIso;
    }
    public String getNome() {
        return nome;
    }
    public double getPopulacao() {
        return populacao;
    }
    public double getDimensao() {
        return dimensao;
    }

    //sets

    public void setCodIso(String codIso) {
        this.codIso = codIso;
    }
    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }
    public void setVizinhos(Pais p) {
        vizinhos.add(p);
    }

    private void mostrar()
    {
        System.out.printf("ISO: %d /n", getCodIso());
        System.out.printf("NOME: %s /n", getNome());
        System.out.printf("POPULAÇÃO: %d /n", getPopulacao());
        System.out.printf("DIMENÇÃO: %f /n", getDimensao());
    }
    // contrutores
    public Pais()
    {

    }
    public Pais(String codIso,String nome,int populacao,double dimensao)
    {
        setCodIso(codIso);setNome(nome);
        setPopulacao(populacao);setDimensao(dimensao);
    }

    public String toString()
    {
        return "ISO: "+ getCodIso()+"\n"+
        "NOME: "+ getNome()+"\n"+ "POPULAÇÃO: "+ getPopulacao()+"\n"+
        "DIMENSÃO: "+ getDimensao()+"\nDENSIDADE: "+ densidadePop();
    }
    public void addVizinho(Pais p)
    {
        if(busca(p)) // automaticamente tem um == true, logo não precisa por
        {
            JOptionPane.showMessageDialog(null,"Vizinho já cadastrado!!","Alerta",JOptionPane.ERROR_MESSAGE);

        }
        else
        {
            setVizinhos(p);
            JOptionPane.showMessageDialog(null,"Vizinho Adicionado","Vizinho",JOptionPane.INFORMATION_MESSAGE);
        }

    }
    public boolean busca(Pais p)
    {
        for(Pais pa: vizinhos)
        {
            if(pa.isIgual(p))
                return true;
        }
        return false;
    }
    public boolean isIgual(Pais outro)
    {
        return this.codIso.equals(outro.getCodIso());
    }
    public double densidadePop()
    {
        return getDimensao()/getPopulacao();
    }
    // faltou fazer o limítrofe
}
