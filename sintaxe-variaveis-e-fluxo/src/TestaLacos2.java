
public class TestaLacos2 {
    public static void main(String[] args) {
        for(int linha = 0; linha <= 10; linha++) {
        	System.out.print(linha);
            for(int coluna = 1; coluna <= linha; coluna++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}