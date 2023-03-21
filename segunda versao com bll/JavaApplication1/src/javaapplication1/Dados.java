package javaapplication1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mauricio
 */
public class Dados {
    private String Codigo;   
    private String Titulo;
    private String Autor;
    private String Ano;
     private String Editora;
    
    public void setCodigo(String _codigo) {Codigo = _codigo;}
    public void setTitulo(String _titulo) {Titulo = _titulo;}
    public void setAutor(String _autor) {Autor = _autor;}
    public void setAno(String _ano) {Ano = _ano;}
     public void setEditora(String _editora) {Editora = _editora;}
    
    public String getCodigo() { return Codigo; }
    public String getTitulo() { return Titulo; }
    public String getAutor() { return Autor; }
    public String getAno() { return Ano; }   
    public String getEditora() { return Editora; }  
}
