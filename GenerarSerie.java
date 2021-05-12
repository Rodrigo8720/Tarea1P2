public class GenerarSerie
{
    public int generarSerie(int n){
        int num =  1 ;
        int aux =  1 ;
        

        for(int i = 1 ;i < n; i++){
           if (i % 2 == 0){
                num = num + 2 ;
                
            }else{
                if (aux % 2 != 0){
                    num = num + 1 ;
                }else{
                    num = num + 3 ;
                }
                aux ++ ;
              
            }
        }
        
        return num;
        
    }
}
