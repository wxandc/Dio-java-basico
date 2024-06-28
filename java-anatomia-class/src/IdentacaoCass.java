public class IdentacaoCass {
    public static void main(String[] args) {
        //variaveis
        int salarioRafa = 4000;
        int salarioWill = 5000;
        int mediaSalarial = (salarioRafa + salarioWill);
        int compromissos = 4000;
        int mediaFinal = (mediaSalarial - compromissos)/2;
        // condições identadas
        if (mediaFinal > 2000)
            System.out.println("No Azul");
        else if(mediaFinal == 2000)
            System.out.println("Atenção");
        else
            System.out.println("hora de Economizar");            
    }
}