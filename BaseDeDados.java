/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.servicos;
import java.util.List;
import java.util.ArrayList;
import com.mycompany.mavenproject1.Livro;
import com.mycompany.mavenproject1.Autor;
import com.mycompany.mavenproject1.Editora;
/**
 *
 * @author Aluno TDS
 */
public class BaseDeDados {
    private List<Livro> livros;
    private List<Autor> autores;
    private List<Editora> editoras;

    public BaseDeDados() {
        autores = new ArrayList<>();
        livros = new ArrayList<>();
        editoras = new ArrayList<>();
    }
    
    public boolean criarAutor(Autor autor){
       return autores.add(autor);
    }
    public boolean buscarAutor()
}

