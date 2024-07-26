package tv;
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void estadoNeutro(){
        ligada = false;
        canal = 1;
        volume = 10;
    }

    public void statusTv(){
        System.out.println("Bem vindo a sua Tv Smart");
        System.out.println("O Stado da sua Tv e:");
        System.out.println("A Tv esta ligada? " + ligada);
        System.out.println("O canal da Tv se encontra no: " + canal);
        System.out.println("O volume atual da tv e: " + volume);
    }
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
    public void aumentarVolume(){
        volume++;
        System.out.println(volume + " subindo volume em 1");
    }
    public void diminuirVolume(){
        volume--;
        System.out.println(volume + " decendo volume em 1");
    }
    public void mudarVolume(int novoVolume){
        volume = novoVolume;
        System.out.println("volume em " + volume);
    }
    public void subirCanal(){
        canal++;
        System.out.println(canal + " subindo canal em 1");
    }
    public void decerCanal(){
        canal--;
        System.out.println(canal + " decendo canal em 1");
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("canal em " + canal);
    }
    public void resetConfiguracoes(boolean ligadoDesligado){
        ligada = (ligadoDesligado=false);

    }
    
}
