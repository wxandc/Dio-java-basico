package tv;
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

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
    public void statusTv(){
        System.out.println("Bem vindo a sua Tv Smart");
        System.out.println("O Stado da sua Tv e:");
        System.out.println("A Tv esta ligada? " + ligada);
        System.out.println("O canal da Tv se encontra no: " + canal);
        System.out.println("O volume atual da tv e: " + volume);
    }
    
}
