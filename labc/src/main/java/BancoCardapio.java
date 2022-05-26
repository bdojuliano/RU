import java.util.List;
import java.util.ArrayList;

public class BancoCardapio {
    private List<Cardapio> BDC = new ArrayList<Cardapio>();
    private Cardapio c = new Cardapio();
    
    public List<Cardapio> getBDC (){
         return BDC;
     }
        
     public Cardapio cadastro (Cardapio c){
         	
        for(int i=0; i<BDC.size(); i++){ 
            if(BDC.get(i).getCodigo_Refeicao() == c.getCodigo_Refeicao()){
                return BDC.get(i);
            }
        }
        return null;
     }
}
