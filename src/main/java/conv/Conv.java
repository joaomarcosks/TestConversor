package conv;

public class Conv {


    //Quando o valor da primeira moeda é maior mutiplica, quando é menor divide.
    
     //Dólar para Euro
    public double dolEur(double dolar){
        
        double eurcon;
        double euro = 0.95;

        eurcon = dolar * euro;

        return eurcon;


    }
        //Real para Dólar
     public double realDol(double real){
        
        double dolcon;
        double dolar = 5.0;

        dolcon = real / dolar;

        return dolcon;


    }
        //Real para Euro
     public double realEur(double real){
        
        double eurcon;
        double euro = 5.32;

        eurcon = real / euro;

        return eurcon;


    }
        //Libra para Dólar
      public double libraDol(double libra){
        
        double dolcon;
        double dol = 1.21;

        dolcon = libra * dol;

        return dolcon;

    }

    //Real para Pesos Argentinos

    public double realPeso(double real){
        
        double pesocon;
        double peso = 69.49;

        pesocon = real * peso;

        return pesocon;


    }


}
