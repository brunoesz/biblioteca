*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ao.co.a2x.biblioteca.servicos;
import java.util.List;
import java.util.ArrayList;
import ao.co.a2x.biblioteca.modelo.Livro;
import ao.co.a2x.biblioteca.modelo.Autor;
import ao.co.a2x.biblioteca.modelo.Editora;
/**
 *
 * @author usuario
 */
public class BaseDeDados {
      private List<Livro> livros;
    private List<Autor> autores;

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    private List<Editora> editoras;

    public BaseDeDados() {
        autores = new ArrayList <>();
        livros = new ArrayList <>();
        editoras = new ArrayList <>();
    }
    
    public boolean
         criarAutor(Autor autor){
             if(autor.getId() == 0){
             autor.setId(autores.size() +1);
             }
        return autores.add(autor);
    }
          public Autor buscarAutor(String nome){
        for(Autor autor : autores){
            if(autor.getNome().equalsIgnoreCase(nome))
                return autor;
        }
        return null;
    }
          
    public Autor buscarAutorID(int id){
        for(Autor autor : autores){
            if(autor.getId() == id)
                return autor;
        }
        return null;
    }
    public boolean apagarAutor(Autor autor){
       if(autores.contains(autor)){
        return autores.remove(autor);
       }
       return false;
    }   
    public Autor atualizarAutor(Autor autor){
        if(autores.contains(autor)){
         apagarAutor(autor);
         autores.add(autor);
        }
        return autor;
      }
    public void popularAutores(){
        Autor autor = new Autor();
        
        autor.setId(1);
        autor.setNome("Bulbasaur");
        autor.setGenero(true);
        autores.add(autor);  
        
        autor = new Autor();
         autor.setId(2);
        autor.setNome("Charmander");
        autor.setGenero(true);
        autores.add(autor);
        
        autor = new Autor();
         autor.setId(3);
        autor.setNome("Squirtle");
        autor.setGenero(false);
        autores.add(autor);
            
        
    }
    }
