package catalago;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivro {
    //atributos

    private List<Livro> livroList;

    public CatalagoLivro() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo,autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor (String autor){
       List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l :livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisarPorIntervaloAnos (int anoInicial, int anoFinal){
        List<Livro> livroPorPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livroPorPorIntervaloAnos.add(l);
                }
            }
        }
        return livroPorPorIntervaloAnos;
    }

    public  Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for (Livro l : livroList){
               if(l.getTitulo().equalsIgnoreCase(titulo)){
                   livroPorTitulo = l;
                   break;
               }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivro catalagoLivro = new CatalagoLivro();
        catalagoLivro.adicionarLivro("Livro 1","Autor 1", 2021);
        catalagoLivro.adicionarLivro("Livro 2","Autor 2", 2022);
        catalagoLivro.adicionarLivro("Livro 3","Autor 2", 2023);
        catalagoLivro.adicionarLivro("Livro 4","Autor 3", 2014);
        catalagoLivro.adicionarLivro("Livro 5","Autor 1", 2015);

      System.out.println(catalagoLivro.pesquisarPorAutor("Autor 3"));
      System.out.println(catalagoLivro.pesquisarPorIntervaloAnos(2014, 2015));
      System.out.println((catalagoLivro.pesquisarPorTitulo("Livro 1")));

    }

}
