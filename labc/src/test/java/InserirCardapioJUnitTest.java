/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bdoju
 */

public class InserirCardapioJUnitTest {
    
    public InserirCardapioJUnitTest() {
    }
    
    @Test 
    public void testeCerto (){
        try{
            Cardapio c = new Cardapio();
            BancoCardapio bdc = new BancoCardapio();
            c.setCodigo_Refeicao(Integer.parseInt("1"));
            c.setRefeicao("Jantar");
            c.setDiaMes("23/05");
            c.setProteina("Vaca atolada");
            c.setProteina_Vegetariana("PTS com batata");
            c.setArroz("Arroz + Arroz integral");
            c.setFeijao("Feijão preto");
            c.setAdicional("Farofa à primavera");
            c.setSalada_Um("Alface");
            c.setSalada_Dois("Cenoura ralada");
            c.setBebidas("Suco + Água");
            
             if (bdc.cadastro(c) == null){
                assertTrue(bdc.getBDC().add(c));
            }
        }
        catch (NumberFormatException nfe){
            assertEquals("",nfe.getMessage());
        }
        catch (CVRefeicaoException refeicao){
            assertEquals("", refeicao.getMessage());
        }
        catch (CVDataException data){
            assertEquals("", data.getMessage());
        }
        catch (CVProteinaException proteina){
            assertEquals("", proteina.getMessage());
        }
        catch (CVProteinaVegetarianaException proteinavegetariana){
            assertEquals("", proteinavegetariana.getMessage());
        }
        catch (CVArrozException arroz){
            assertEquals("", arroz.getMessage());
        }
        catch (CVFeijaoException feijao){
            assertEquals("", feijao.getMessage());
        }
        catch (CVAdicionalException adicional){
            assertEquals("", adicional.getMessage());
        }
        catch (CVSalada1Exception salada1){
            assertEquals("", salada1.getMessage());
        }
        catch (CVSalada2Exception salada2){
            assertEquals("", salada2.getMessage());
        }
        catch (CVBebidasException bebidas){
            assertEquals("", bebidas.getMessage());
        }
    }
            
    @Test
    public void testeRefeicaoErrada(){
        try{
            Cardapio c = new Cardapio();
            BancoCardapio bdc = new BancoCardapio();
            c.setCodigo_Refeicao(Integer.parseInt("1"));
            c.setRefeicao("Janta");
            c.setDiaMes("23/05");
            c.setProteina("Vaca atolada");
            c.setProteina_Vegetariana("PTS com batata");
            c.setArroz("Arroz + Arroz integral");
            c.setFeijao("Feijão preto");
            c.setAdicional("Farofa à primavera");
            c.setSalada_Um("Alface");
            c.setSalada_Dois("Cenoura ralada");
            c.setBebidas("Suco + Água");
            
             if (bdc.cadastro(c) == null){
                assertTrue(bdc.getBDC().add(c));
            }
        }
        catch (NumberFormatException nfe){
            assertEquals("",nfe.getMessage());
        }
        catch (CVRefeicaoException refeicao){
            assertEquals("", refeicao.getMessage());
        }
        catch (CVDataException data){
            assertEquals("", data.getMessage());
        }
        catch (CVProteinaException proteina){
            assertEquals("", proteina.getMessage());
        }
        catch (CVProteinaVegetarianaException proteinavegetariana){
            assertEquals("", proteinavegetariana.getMessage());
        }
        catch (CVArrozException arroz){
            assertEquals("", arroz.getMessage());
        }
        catch (CVFeijaoException feijao){
            assertEquals("", feijao.getMessage());
        }
        catch (CVAdicionalException adicional){
            assertEquals("", adicional.getMessage());
        }
        catch (CVSalada1Exception salada1){
            assertEquals("", salada1.getMessage());
        }
        catch (CVSalada2Exception salada2){
            assertEquals("", salada2.getMessage());
        }
        catch (CVBebidasException bebidas){
            assertEquals("", bebidas.getMessage());
        }
    }
    
    @Test
    public void testeCampoVazio_Refeicao(){
        try{
            Cardapio c = new Cardapio();
            BancoCardapio bdc = new BancoCardapio();
            c.setCodigo_Refeicao(Integer.parseInt("1"));
            c.setRefeicao("");
            c.setDiaMes("23/05");
            c.setProteina("Vaca atolada");
            c.setProteina_Vegetariana("PTS com batata");
            c.setArroz("Arroz + Arroz integral");
            c.setFeijao("Feijão preto");
            c.setAdicional("Farofa à primavera");
            c.setSalada_Um("Alface");
            c.setSalada_Dois("Cenoura ralada");
            c.setBebidas("Suco + Água");
        }
        catch (CVRefeicaoException refeicao){
            assertEquals("", refeicao.getMessage());
        }
        catch (CVDataException data){
            assertEquals("", data.getMessage());
        }
        catch (CVProteinaException proteina){
            assertEquals("", proteina.getMessage());
        }
        catch (CVProteinaVegetarianaException proteinavegetariana){
            assertEquals("", proteinavegetariana.getMessage());
        }
        catch (CVArrozException arroz){
            assertEquals("", arroz.getMessage());
        }
        catch (CVFeijaoException feijao){
            assertEquals("", feijao.getMessage());
        }
        catch (CVAdicionalException adicional){
            assertEquals("", adicional.getMessage());
        }
        catch (CVSalada1Exception salada1){
            assertEquals("", salada1.getMessage());
        }
        catch (CVSalada2Exception salada2){
            assertEquals("", salada2.getMessage());
        }
        catch (CVBebidasException bebidas){
            assertEquals("", bebidas.getMessage());
        }
    }
    
    @Test
    public void testeCampoVazio_Data(){
        try{
            Cardapio c = new Cardapio();
            BancoCardapio bdc = new BancoCardapio();
            c.setCodigo_Refeicao(Integer.parseInt("1"));
            c.setRefeicao("Jantar");
            c.setDiaMes("");
            c.setProteina("Vaca atolada");
            c.setProteina_Vegetariana("PTS com batata");
            c.setArroz("Arroz + Arroz integral");
            c.setFeijao("Feijão preto");
            c.setAdicional("Farofa à primavera");
            c.setSalada_Um("Alface");
            c.setSalada_Dois("Cenoura ralada");
            c.setBebidas("Suco + Água");
            
            if (bdc.cadastro(c) == null){
                assertTrue(bdc.getBDC().add(c));
            }
        }
        catch (NumberFormatException nfe){
            assertEquals("",nfe.getMessage());
        }
        catch (CVRefeicaoException refeicao){
            assertEquals("", refeicao.getMessage());
        }
        catch (CVDataException data){
            assertEquals("", data.getMessage());
        }
        catch (CVProteinaException proteina){
            assertEquals("", proteina.getMessage());
        }
        catch (CVProteinaVegetarianaException proteinavegetariana){
            assertEquals("", proteinavegetariana.getMessage());
        }
        catch (CVArrozException arroz){
            assertEquals("", arroz.getMessage());
        }
        catch (CVFeijaoException feijao){
            assertEquals("", feijao.getMessage());
        }
        catch (CVAdicionalException adicional){
            assertEquals("", adicional.getMessage());
        }
        catch (CVSalada1Exception salada1){
            assertEquals("", salada1.getMessage());
        }
        catch (CVSalada2Exception salada2){
            assertEquals("", salada2.getMessage());
        }
        catch (CVBebidasException bebidas){
            assertEquals("", bebidas.getMessage());
        }
    }
    
    @Test
    public void testeCampoVazio_Proteina(){
        try{
            Cardapio c = new Cardapio();
            BancoCardapio bdc = new BancoCardapio();
            c.setCodigo_Refeicao(Integer.parseInt("1"));
            c.setRefeicao("Jantar");
            c.setDiaMes("23/05");
            c.setProteina("");
            c.setProteina_Vegetariana("PTS com batata");
            c.setArroz("Arroz + Arroz integral");
            c.setFeijao("Feijão preto");
            c.setAdicional("Farofa à primavera");
            c.setSalada_Um("Alface");
            c.setSalada_Dois("Cenoura ralada");
            c.setBebidas("Suco + Água");
            
             if (bdc.cadastro(c) == null){
                assertTrue(bdc.getBDC().add(c));
            }
        }
        catch (NumberFormatException nfe){
            assertEquals("",nfe.getMessage());
        }
        catch (CVRefeicaoException refeicao){
            assertEquals("", refeicao.getMessage());
        }
        catch (CVDataException data){
            assertEquals("", data.getMessage());
        }
        catch (CVProteinaException proteina){
            assertEquals("", proteina.getMessage());
        }
        catch (CVProteinaVegetarianaException proteinavegetariana){
            assertEquals("", proteinavegetariana.getMessage());
        }
        catch (CVArrozException arroz){
            assertEquals("", arroz.getMessage());
        }
        catch (CVFeijaoException feijao){
            assertEquals("", feijao.getMessage());
        }
        catch (CVAdicionalException adicional){
            assertEquals("", adicional.getMessage());
        }
        catch (CVSalada1Exception salada1){
            assertEquals("", salada1.getMessage());
        }
        catch (CVSalada2Exception salada2){
            assertEquals("", salada2.getMessage());
        }
        catch (CVBebidasException bebidas){
            assertEquals("", bebidas.getMessage());
        }
    }
    
    @Test
    public void testeCampoVazio_ProteinaVegetariana(){
        try{
            Cardapio c = new Cardapio();
            BancoCardapio bdc = new BancoCardapio();
            c.setCodigo_Refeicao(Integer.parseInt("1"));
            c.setRefeicao("Jantar");
            c.setDiaMes("23/05");
            c.setProteina("Vaca atolada");
            c.setProteina_Vegetariana("");
            c.setArroz("Arroz + Arroz integral");
            c.setFeijao("Feijão preto");
            c.setAdicional("Farofa à primavera");
            c.setSalada_Um("Alface");
            c.setSalada_Dois("Cenoura ralada");
            c.setBebidas("Suco + Água");
            
             if (bdc.cadastro(c) == null){
                assertTrue(bdc.getBDC().add(c));
            }
        }
        catch (NumberFormatException nfe){
            assertEquals("",nfe.getMessage());
        }
        catch (CVRefeicaoException refeicao){
            assertEquals("", refeicao.getMessage());
        }
        catch (CVDataException data){
            assertEquals("", data.getMessage());
        }
        catch (CVProteinaException proteina){
            assertEquals("", proteina.getMessage());
        }
        catch (CVProteinaVegetarianaException proteinavegetariana){
            assertEquals("", proteinavegetariana.getMessage());
        }
        catch (CVArrozException arroz){
            assertEquals("", arroz.getMessage());
        }
        catch (CVFeijaoException feijao){
            assertEquals("", feijao.getMessage());
        }
        catch (CVAdicionalException adicional){
            assertEquals("", adicional.getMessage());
        }
        catch (CVSalada1Exception salada1){
            assertEquals("", salada1.getMessage());
        }
        catch (CVSalada2Exception salada2){
            assertEquals("", salada2.getMessage());
        }
        catch (CVBebidasException bebidas){
            assertEquals("", bebidas.getMessage());
        }
    }
    
    @Test
    public void testeCampoVazio_Arroz(){
        try{
            Cardapio c = new Cardapio();
            BancoCardapio bdc = new BancoCardapio();
            c.setCodigo_Refeicao(Integer.parseInt("1"));
            c.setRefeicao("Jantar");
            c.setDiaMes("23/05");
            c.setProteina("Vaca atolada");
            c.setProteina_Vegetariana("PTS com batata");
            c.setArroz("");
            c.setFeijao("Feijão preto");
            c.setAdicional("Farofa à primavera");
            c.setSalada_Um("Alface");
            c.setSalada_Dois("Cenoura ralada");
            c.setBebidas("Suco + Água");
            
             if (bdc.cadastro(c) == null){
                assertTrue(bdc.getBDC().add(c));
            }
        }
        catch (NumberFormatException nfe){
            assertEquals("",nfe.getMessage());
        }
        catch (CVRefeicaoException refeicao){
            assertEquals("", refeicao.getMessage());
        }
        catch (CVDataException data){
            assertEquals("", data.getMessage());
        }
        catch (CVProteinaException proteina){
            assertEquals("", proteina.getMessage());
        }
        catch (CVProteinaVegetarianaException proteinavegetariana){
            assertEquals("", proteinavegetariana.getMessage());
        }
        catch (CVArrozException arroz){
            assertEquals("", arroz.getMessage());
        }
        catch (CVFeijaoException feijao){
            assertEquals("", feijao.getMessage());
        }
        catch (CVAdicionalException adicional){
            assertEquals("", adicional.getMessage());
        }
        catch (CVSalada1Exception salada1){
            assertEquals("", salada1.getMessage());
        }
        catch (CVSalada2Exception salada2){
            assertEquals("", salada2.getMessage());
        }
        catch (CVBebidasException bebidas){
            assertEquals("", bebidas.getMessage());
        }
    }
    
    @Test
    public void testeCampoVazio_Feijao(){
        try{
            Cardapio c = new Cardapio();
            BancoCardapio bdc = new BancoCardapio();
            c.setCodigo_Refeicao(Integer.parseInt("1"));
            c.setRefeicao("Jantar");
            c.setDiaMes("23/05");
            c.setProteina("Vaca atolada");
            c.setProteina_Vegetariana("PTS com batata");
            c.setArroz("Arroz + Arroz integral");
            c.setFeijao("");
            c.setAdicional("Farofa à primavera");
            c.setSalada_Um("Alface");
            c.setSalada_Dois("Cenoura ralada");
            c.setBebidas("Suco + Água");
            
             if (bdc.cadastro(c) == null){
                assertTrue(bdc.getBDC().add(c));
            }
        }
        catch (NumberFormatException nfe){
            assertEquals("",nfe.getMessage());
        }
        catch (CVRefeicaoException refeicao){
            assertEquals("", refeicao.getMessage());
        }
        catch (CVDataException data){
            assertEquals("", data.getMessage());
        }
        catch (CVProteinaException proteina){
            assertEquals("", proteina.getMessage());
        }
        catch (CVProteinaVegetarianaException proteinavegetariana){
            assertEquals("", proteinavegetariana.getMessage());
        }
        catch (CVArrozException arroz){
            assertEquals("", arroz.getMessage());
        }
        catch (CVFeijaoException feijao){
            assertEquals("", feijao.getMessage());
        }
        catch (CVAdicionalException adicional){
            assertEquals("", adicional.getMessage());
        }
        catch (CVSalada1Exception salada1){
            assertEquals("", salada1.getMessage());
        }
        catch (CVSalada2Exception salada2){
            assertEquals("", salada2.getMessage());
        }
        catch (CVBebidasException bebidas){
            assertEquals("", bebidas.getMessage());
        }
    }
    
    @Test
    public void testeCampoVazio_Adicional(){
        try{
            Cardapio c = new Cardapio();
            BancoCardapio bdc = new BancoCardapio();
            c.setCodigo_Refeicao(Integer.parseInt("1"));
            c.setRefeicao("Jantar");
            c.setDiaMes("23/05");
            c.setProteina("Vaca atolada");
            c.setProteina_Vegetariana("PTS com batata");
            c.setArroz("Arroz + Arroz integral");
            c.setFeijao("Feijão preto");
            c.setAdicional("");
            c.setSalada_Um("Alface");
            c.setSalada_Dois("Cenoura ralada");
            c.setBebidas("Suco + Água");
            
             if (bdc.cadastro(c) == null){
                assertTrue(bdc.getBDC().add(c));
            }
        }
        catch (NumberFormatException nfe){
            assertEquals("",nfe.getMessage());
        }
        catch (CVRefeicaoException refeicao){
            assertEquals("", refeicao.getMessage());
        }
        catch (CVDataException data){
            assertEquals("", data.getMessage());
        }
        catch (CVProteinaException proteina){
            assertEquals("", proteina.getMessage());
        }
        catch (CVProteinaVegetarianaException proteinavegetariana){
            assertEquals("", proteinavegetariana.getMessage());
        }
        catch (CVArrozException arroz){
            assertEquals("", arroz.getMessage());
        }
        catch (CVFeijaoException feijao){
            assertEquals("", feijao.getMessage());
        }
        catch (CVAdicionalException adicional){
            assertEquals("", adicional.getMessage());
        }
        catch (CVSalada1Exception salada1){
            assertEquals("", salada1.getMessage());
        }
        catch (CVSalada2Exception salada2){
            assertEquals("", salada2.getMessage());
        }
        catch (CVBebidasException bebidas){
            assertEquals("", bebidas.getMessage());
        }
    }
    
    @Test
    public void testeCampoVazio_Salada1(){
        try{
            Cardapio c = new Cardapio();
            BancoCardapio bdc = new BancoCardapio();
            c.setCodigo_Refeicao(Integer.parseInt("1"));
            c.setRefeicao("Jantar");
            c.setDiaMes("23/05");
            c.setProteina("Vaca atolada");
            c.setProteina_Vegetariana("PTS com batata");
            c.setArroz("Arroz + Arroz integral");
            c.setFeijao("Feijão preto");
            c.setAdicional("Farofa à primavera");
            c.setSalada_Um("");
            c.setSalada_Dois("Cenoura ralada");
            c.setBebidas("Suco + Água");
            
             if (bdc.cadastro(c) == null){
                assertTrue(bdc.getBDC().add(c));
            }
        }
        catch (NumberFormatException nfe){
            assertEquals("",nfe.getMessage());
        }
        catch (CVRefeicaoException refeicao){
            assertEquals("", refeicao.getMessage());
        }
        catch (CVDataException data){
            assertEquals("", data.getMessage());
        }
        catch (CVProteinaException proteina){
            assertEquals("", proteina.getMessage());
        }
        catch (CVProteinaVegetarianaException proteinavegetariana){
            assertEquals("", proteinavegetariana.getMessage());
        }
        catch (CVArrozException arroz){
            assertEquals("", arroz.getMessage());
        }
        catch (CVFeijaoException feijao){
            assertEquals("", feijao.getMessage());
        }
        catch (CVAdicionalException adicional){
            assertEquals("", adicional.getMessage());
        }
        catch (CVSalada1Exception salada1){
            assertEquals("", salada1.getMessage());
        }
        catch (CVSalada2Exception salada2){
            assertEquals("", salada2.getMessage());
        }
        catch (CVBebidasException bebidas){
            assertEquals("", bebidas.getMessage());
        }
    }
    
    @Test
    public void testeCampoVazio_Salada2(){
        try{
            Cardapio c = new Cardapio();
            BancoCardapio bdc = new BancoCardapio();
            c.setCodigo_Refeicao(Integer.parseInt("1"));
            c.setRefeicao("Jantar");
            c.setDiaMes("23/05");
            c.setProteina("Vaca atolada");
            c.setProteina_Vegetariana("PTS com batata");
            c.setArroz("Arroz + Arroz integral");
            c.setFeijao("Feijão preto");
            c.setAdicional("Farofa à primavera");
            c.setSalada_Um("Alface");
            c.setSalada_Dois("");
            c.setBebidas("Suco + Água");
            
             if (bdc.cadastro(c) == null){
                assertTrue(bdc.getBDC().add(c));
            }
        }
        catch (NumberFormatException nfe){
            assertEquals("",nfe.getMessage());
        }
        catch (CVRefeicaoException refeicao){
            assertEquals("", refeicao.getMessage());
        }
        catch (CVDataException data){
            assertEquals("", data.getMessage());
        }
        catch (CVProteinaException proteina){
            assertEquals("", proteina.getMessage());
        }
        catch (CVProteinaVegetarianaException proteinavegetariana){
            assertEquals("", proteinavegetariana.getMessage());
        }
        catch (CVArrozException arroz){
            assertEquals("", arroz.getMessage());
        }
        catch (CVFeijaoException feijao){
            assertEquals("", feijao.getMessage());
        }
        catch (CVAdicionalException adicional){
            assertEquals("", adicional.getMessage());
        }
        catch (CVSalada1Exception salada1){
            assertEquals("", salada1.getMessage());
        }
        catch (CVSalada2Exception salada2){
            assertEquals("", salada2.getMessage());
        }
        catch (CVBebidasException bebidas){
            assertEquals("", bebidas.getMessage());
        }
    }
    
    @Test
    public void testeCampoVazio_Bebidas(){
        try{
            Cardapio c = new Cardapio();
            BancoCardapio bdc = new BancoCardapio();
            c.setCodigo_Refeicao(Integer.parseInt("1"));
            c.setRefeicao("Jantar");
            c.setDiaMes("23/05");
            c.setProteina("Vaca atolada");
            c.setProteina_Vegetariana("PTS com batata");
            c.setArroz("Arroz + Arroz integral");
            c.setFeijao("Feijão preto");
            c.setAdicional("Farofa à primavera");
            c.setSalada_Um("Alface");
            c.setSalada_Dois("Cenoura ralada");
            c.setBebidas("");
            
             if (bdc.cadastro(c) == null){
                assertTrue(bdc.getBDC().add(c));
            }
        }
        catch (NumberFormatException nfe){
            assertEquals("",nfe.getMessage());
        }
        catch (CVRefeicaoException refeicao){
            assertEquals("", refeicao.getMessage());
        }
        catch (CVDataException data){
            assertEquals("", data.getMessage());
        }
        catch (CVProteinaException proteina){
            assertEquals("", proteina.getMessage());
        }
        catch (CVProteinaVegetarianaException proteinavegetariana){
            assertEquals("", proteinavegetariana.getMessage());
        }
        catch (CVArrozException arroz){
            assertEquals("", arroz.getMessage());
        }
        catch (CVFeijaoException feijao){
            assertEquals("", feijao.getMessage());
        }
        catch (CVAdicionalException adicional){
            assertEquals("", adicional.getMessage());
        }
        catch (CVSalada1Exception salada1){
            assertEquals("", salada1.getMessage());
        }
        catch (CVSalada2Exception salada2){
            assertEquals("", salada2.getMessage());
        }
        catch (CVBebidasException bebidas){
            assertEquals("", bebidas.getMessage());
        }
    }
    
    
}

