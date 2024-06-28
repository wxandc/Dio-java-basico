public class MinhaClass {
    public static void main(String[] args) {
        String meuNome = "William";

        String sobreNome = "Alexandre";

        int anoNascimento = 1989;

        boolean verdadeira = true;

        String nomeCompleto = nomeCompleto (meuNome,sobreNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String meuNome, String sobreNome){
        return meuNome.concat(" ").concat(sobreNome);

    }
}
