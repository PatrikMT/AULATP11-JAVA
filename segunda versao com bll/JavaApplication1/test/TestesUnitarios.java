/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javaapplication1.Dados;
import javaapplication1.Erro;
import javaapplication1.TesteBLL;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author unisanta
 */
public class TestesUnitarios {
    Dados dados = new Dados();
   
    
    
    public TestesUnitarios() {
    }
    
    @Test
    public void teste01() {
        boolean esperado = true;
        dados.setCodigo("");
        dados.setTitulo("");
        dados.setAno("");
        dados.setEditora("");
        dados.setAutor("");
        TesteBLL.validaDados(dados);
        //assertEquals(O que é esperado, o que retorna)
        assertEquals(esperado, Erro.getErro());
    }

    @Test
    public void teste02() {
        boolean esperado = true;
         dados.setCodigo("Patrik");
        dados.setTitulo("");
        dados.setAno("");
        dados.setEditora("");
        dados.setAutor("");
        TesteBLL.validaDados(dados);
        //assertEquals(O que é esperado, o que retorna)
        assertEquals(esperado, Erro.getErro());
    }

    @Test
    public void teste03() {
        boolean esperado = true;
         dados.setCodigo("21");
        dados.setTitulo("A");
        dados.setAno("");
        dados.setEditora("");
        dados.setAutor("");
        TesteBLL.validaDados(dados);
        //assertEquals(O que é esperado, o que retorna)
        assertEquals(esperado, Erro.getErro());
    }
    
    @Test
    public void teste04() {
        boolean esperado = true;
         dados.setCodigo("21");
        dados.setTitulo("A");
        dados.setAno("23");
        dados.setEditora("");
        dados.setAutor("");
        TesteBLL.validaDados(dados);
        //assertEquals(O que é esperado, o que retorna)
        assertEquals(esperado, Erro.getErro());
    }
    
    @Test
    public void teste05() {
        boolean esperado = true;
        dados.setCodigo("21");
        dados.setTitulo("A");
        dados.setAno("23");
        dados.setEditora("A");
        dados.setAutor("2");
        TesteBLL.validaDados(dados);
        //assertEquals(O que é esperado, o que retorna)
        assertEquals(esperado, Erro.getErro());
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
