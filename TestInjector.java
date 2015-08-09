import java.sql.Date;
import java.util.Random;
import kx.c;

public class TestInjector implements Runnable{
    public static void main(String[] args){
        TestInjector ti = new TestInjector();
        ti.run();
    }

    public void run(){
        try{
            c c = new c("localhost",5000);
            String[] syms = {"BTC","NMC","LTC","PPC","DOGE","DRK","MSC","BYTE","XAU"};
            Random r = new Random();
            Date d = Date.valueOf("2009-01-03");
            while(true){
                c.ks(".u.upd","quotes",new Object[]{syms[r.nextInt(syms.length)],r.nextInt(1000)+r.nextDouble(),100*(1+r.nextInt(20)),d,r.nextBoolean()});
                Thread.sleep(r.nextInt(1000));
            }
        }catch(Exception e){System.out.println(e.toString());}
    }
}
