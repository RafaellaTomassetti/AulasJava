public class main {
   
    public static void main(String[] args)
    {
        Data d1 = new Data(01,02,03,04,05,06);
        d1.imprimir(Data.FORMATO_24H);
        d1.imprimir(Data.FORMATO_12H);
        
       
        Data d2 = new Data(10, 06, 2009);
        d2.imprimir(Data.FORMATO_24H);
        d2.imprimir(Data.FORMATO_12H);

        Data d3 = new Data(20, 07, 2006);
        d3.imprimir(Data.FORMATO_24H);
        d3.imprimir(Data.FORMATO_12H);

   
    }
}