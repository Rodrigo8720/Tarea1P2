public class Serie2
{
     public int serie2(int n){
        int num =  0 ;
        int numAnt1 =  1 ;
        int numAnt2 =  1 ;
        int numAnt3 =  1 ;
        
        
        for(int i = 3; i < n; i++){
            num = numAnt2 + numAnt3;

            numAnt3 = numAnt2;
            numAnt2 = numAnt1;
            numAnt1 = num;
            
          
        }
        return num;
    }
}
