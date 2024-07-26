package tv;
public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        smartTv.statusTv();
    
        smartTv.ligar();
        System.out.println("ligando a Tv");
        smartTv.statusTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        smartTv.statusTv();
        smartTv.mudarVolume(35);
        smartTv.statusTv();

        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.decerCanal();
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.statusTv();
        smartTv.mudarCanal(12);
        smartTv.statusTv();



    }
}
