package edu.vda.dio.exemplos.smarttv;

//Vamos criar um exemplo de uma classe para representar uma SartTv onde:
//    1. Ela tenha as características: ligada (boolean), canal (int) e volume (int)
//    2. Nossa TV poderá ligar e desligar e assim mudar o estado ligada
//    3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1
//    4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondende
public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();



        System.out.println("TV ligada ? " + (smartTv.ligada ? "Sim" : "Não"));
        System.out.println("Canal Atual :" + smartTv.canal);
        System.out.println("Volume Atual :" + smartTv.volume);
        System.out.println("-----------------------------");
        smartTv.ligar();
        // smartTv.desligar();
        // smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(10);



        System.out.println("Novo Status -> TV ligada ? " + (smartTv.ligada ? "Sim" : "Não"));
        System.out.println("Novo Status -> Canal Atual :" + smartTv.canal);
        System.out.println("Novo Status -> Volume Atual :" + smartTv.volume);
    }
}
