import java.util.Date;
import java.text.SimpleDateFormat;
 
public class main {
   
    public static void main(String[] args)
    {
        Data d1 = new Data(10, 05, 2005, 12, 56,23);
        d1.imprimir(10, 05, 2005, 12, 56, 23);
       
        Data d2 = new Data(10, 06, 2009);
        d2.imprimir(10, 06, 2009);
      
   
    }
}