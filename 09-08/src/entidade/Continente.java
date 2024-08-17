package entidade;

import java.util.ArrayList;

public class Continente {
    private ArrayList<Pais> continente= new ArrayList<>();


    // setts e getts
    public void setContinente(Pais pais) {
        continente.add(pais);
    }
    public ArrayList<Pais> getPais() {
        return continente;
    }

    // metodos
    public double getPopulacao()
    {
        double popuTot=0;
        for(Pais p: continente)
            popuTot += p.getPopulacao();

        return popuTot;
    }
    public double getDimensao()
    {
        double dimeTot=0;
        for(Pais p: continente)
            dimeTot +=p.getDimensao();

        return dimeTot;
    }
    public double densidadePop()
    {
        return getPopulacao()/getDimensao();
    }

//    public void paisMaior()
//    {
//        for(Pais p: continente)
//        {   if(getMaiorPop().getPopulacao()==0)
//                setMaiorPop(p);
//            else if(p.getPopulacao()> getMaiorPop().getPopulacao())
//                    setMaiorPop(p);
//
//
//        }
//    }
    public Pais paisMaior()
    {
        Pais maior=null;
       if(continente.isEmpty())
       {
           for (int i = 0; i < continente.size(); i++)
           {
                if(maior.getPopulacao()<continente.get(i).getPopulacao())
                {
                    maior=continente.get(i);
                }
           }
       }
       return maior;
    }
    public Pais paisMenor()
    {
        Pais menor=null;
        if(continente.isEmpty())
        {
            for (int i = 0; i < continente.size(); i++)
            {
                if(menor.getPopulacao()>continente.get(i).getPopulacao())
                {
                    menor=continente.get(i);
                }
            }
        }
        return menor;
    }

    // terminar

    public String toString() {
        return "Continente=" + continente;
    }
}
