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
public class TesteBLL {

public static void validaDados(Dados dados)
{
    Erro.setErro(false);
    if (dados.getTitulo().equals(""))
    {
        Erro.setErro("O campo titulo é de preenchimento obrigatório..."); return;
    }

    
    if (dados.getCodigo().equals(""))
    {
        Erro.setErro("O campo codigo é de preenchimento obrigatório..."); return;
    }
    else
    {
        try
        {
          Integer.valueOf(dados.getCodigo());
        }
        catch (Exception e)
        {
          Erro.setErro("O campo codigo deve ser inteiro!"); return;
        }
    }
    if (Integer.parseInt(dados.getCodigo()) <= 0)
        {
          Erro.setErro("O campo Codigo deve ser maior que zero!"); return;
        }
    
    
    if (dados.getAno().equals(""))
    {
        Erro.setErro("O campo ano é de preenchimento obrigatório..."); return;
    }
    else
    {
        try
        {
          Integer.valueOf(dados.getAno());
        }
        catch (Exception e)
        {
          Erro.setErro("O campo ano deve ser inteiro!"); return;
        }
    }
    if (Integer.parseInt(dados.getAno()) <= 0)
        {
          Erro.setErro("O campo Ano deve ser maior que zero!"); return;
        }
    
    if (dados.getEditora().equals(""))
    {
        Erro.setErro("O campo editora é de preenchimento obrigatório..."); return;
    }
        
    if (dados.getAutor().equals(""))
    {
        Erro.setErro("O campo editora é de preenchimento obrigatório..."); return;
    }
    
    }

}
