import kx.c;
import kx.c.Flip;

public class TestReader{
    public static void main(String[] args){
        try{
            c c = new c("localhost",5001);
            c.k(".u.sub","onehr_wavg","");
            while(true){
                Object[] cols = ((Flip)((Object[]) c.k())[2]).y;
                String[] coins = (String[])cols[0];
                double[] wavgs = (double[])cols[1];
                for(int i=0;i<coins.length;i++){
                    System.out.printf("%s - %f; ", coins[i], wavgs[i]);
                }
                System.out.println();
            }
        }catch(Exception e){System.out.println(e.toString());}
    }
}
