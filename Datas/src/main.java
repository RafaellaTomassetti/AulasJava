
public class main {
   
    public static void main(String[] args)
    {
        Data d1 = new Data(01,02,03,04,05,06);  //Data(_) = construtor
        //nesse caso a hora é dada no parâmetro, por isso que ela é mostrada na tela
        d1.imprimir(Data.FORMATO_24H);  //imprimindo data no formato 24h
        d1.imprimir(Data.FORMATO_12H);  //imprimindo data no formato 12h
        
       
        Data d2 = new Data(10, 06, 2009); //nesse caso a hora é -1, pois não foi dado outro valor a ela
        //por isso só imprime dia, mês e ano
        d2.imprimir(Data.FORMATO_24H);  //imprimindo data no formato 24h
        d2.imprimir(Data.FORMATO_12H);  //imprimindo data no formato 12h

        Data d3 = new Data(20, 07, 2006); //nesse caso a hora é -1, pois não foi dado outro valor a ela
        //por isso só imprime dia, mês e ano
        d3.imprimir(Data.FORMATO_24H);  //imprimindo data no formato 24h
        d3.imprimir(Data.FORMATO_12H);  //imprimindo data no formato 12h

   
    }
}
