package ConteudoOrganizado.Aula03;
public class Constante {
    //Contante e a variavel que nao pode ser redefinida seu valor e definida por dois fatores;
    //1. Deve-se atribuir a palavra reservada (final) antes do tipo da variavel a ficar constante.
    //2. O nome atribuido deve estar em caixa alta(MAIUSCULO);
    //Logo;
    public static void main(String[] args) {
        //variavel (numero)
        int numero=10;
        numero=15;
        numero=numero+10;
        System.out.println(numero);
    
        //constante (numero)
        final int NUMERO=10;
        System.out.println(NUMERO);
        
    }
    
}
