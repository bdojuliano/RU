/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bdoju
 */
public class Cardapio {
    private String proteina, proteina_vegetariana, arroz, feijao, adicional, salada_um, salada_dois, bebidas, refeicao, dia_mes;
    private int codigo_refeicao;
    public void Cardapio(String proteina, String proteina_vegetariana, String arroz, String feijao, String adicional, String salada_um, String salada_dois, String bebidas, String refeicao, String dia_mes, int codigo_refeicao){
        this.proteina = "";
        this.proteina_vegetariana = "";
        this.arroz = "";
        this.feijao = "";
        this.adicional = "";
        this.salada_um = "";
        this.salada_dois = "";
        this.bebidas = "";
        this.refeicao = "";
        this.dia_mes = "";
        this.codigo_refeicao = 0;
    }
    
    public String getProteina (){
        return proteina;
    }
    
    public String getProteina_Vegetariana (){
        return proteina_vegetariana;
    }
    
    public String getArroz (){
        return arroz;
    }
    
    public String getFeijao (){
        return feijao;
    }
    
    public String getAdicional (){
        return adicional;
    }
    
    public String getSalada_Um(){
        return salada_um;
    }
    
    public String getSalada_Dois (){
        return salada_dois;
    }
    
    public String getBebidas (){
        return bebidas;
    }
    
    public String getRefeicao (){
        return refeicao;
    }
    
    public String getDiaMes (){
        return dia_mes;
    }
    
    public int getCodigo_Refeicao(){
        return codigo_refeicao;
    }
    
    public void setProteina (String proteina) throws CVProteinaException{
        if(proteina != null && proteina.length() == 0){
            throw new CVProteinaException();
        }
        else{
            this.proteina = proteina;
        }
    }
    
    
    public void setProteina_Vegetariana (String proteina_vegetariana) throws CVProteinaVegetarianaException{
        if(proteina_vegetariana != null && proteina_vegetariana.length() == 0){
            throw new CVProteinaVegetarianaException();
        }
        else{
            this.proteina_vegetariana = proteina_vegetariana;
        }
    }
    
    public void setArroz (String arroz) throws CVArrozException{
        if(arroz != null && arroz.length() == 0){
            throw new CVArrozException();
        }
        else{
            this.arroz = arroz;
        }
    }
    
    public void setFeijao (String feijao) throws CVFeijaoException{
        if(feijao!= null && feijao.length() == 0){
            throw new CVFeijaoException();
        }
        else{
            this.feijao = feijao;
        }
    }
    
    public void setAdicional (String adicional) throws CVAdicionalException{
        if(adicional!= null && adicional.length() == 0){
            throw new CVAdicionalException();
        }
        else{
            this.adicional = adicional;
        }
    }
    
    public void setSalada_Um (String salada_um) throws CVSalada1Exception{
        if(salada_um != null && salada_um.length() == 0){
            throw new CVSalada1Exception();
        }
        else{
            this.salada_um = salada_um;
        }
    }
    
    public void setSalada_Dois (String salada_dois)throws CVSalada2Exception{
        if(arroz != null && arroz.length() == 0){
            throw new CVSalada2Exception();
        }
        else{
            this.salada_dois = salada_dois;
        }
    }
    public void setBebidas (String bebidas) throws CVBebidasException{
        if(bebidas != null && bebidas.length() == 0){
            throw new CVBebidasException();
        }
        else{
            this.bebidas = bebidas;
        }
    }
    public void setRefeicao (String refeicao) throws CVRefeicaoException{
        if(refeicao!= null && refeicao.length() == 0){
            throw new CVRefeicaoException();
        }
        else if(refeicao.equalsIgnoreCase("Almoço")){
            this.refeicao = refeicao;
        }
       
        else if (refeicao.equalsIgnoreCase("Jantar")){
            this.refeicao = refeicao;
        }
        else{
            throw new CVRefeicaoException();
        }
    }
    public void setDiaMes (String dia_mes) throws CVDataException{
        if(dia_mes!= null && dia_mes.length() == 0){
            throw new CVDataException();
        }
        else{
            this.dia_mes = dia_mes;
        }
    }
    
    public void setCodigo_Refeicao (int codigo_refeicao){
        this.codigo_refeicao = codigo_refeicao;
    }
}

 