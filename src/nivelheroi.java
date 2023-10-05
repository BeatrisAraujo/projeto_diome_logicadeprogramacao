import java.util.Scanner;

public class nivelheroi {
    public static void main(String[] args) {
       //DECLARAÇÃO DE VARIÁVEIS.
       double xp = 0;
       int i = 1;
       String nome = "";

        Scanner leitor = new Scanner(System.in);
        
        while (i<2){
            System.out.print("Nome do Heroí: ");
                    nome = leitor.next();   

            System.out.print("Pontos de Experiência(XP): ");
            xp = leitor.nextInt();
            
             if (xp < 1000){
                    System.out.println("O heroí de nome " + nome + " está no nível: Ferro");
                }else if (xp>= 1000 && xp <= 2000){
                    System.out.println("O heroí de nome: " + nome + " está no nível: Bronze");             
                }else if (xp >= 2001 && xp <= 5000){
                    System.out.println("O heroí de nome: " + nome + " está no nível: Prata ");
                }else if (xp >= 5001 && xp <= 7000){
                    System.out.println("O heroí de nome: " + nome + " está no nível: Ouro");
                }else if (xp >= 7001 && xp <= 8000){
                    System.out.println("O heroí de nome: " + nome + " está no nível: Platina");
                }else if (xp >= 8001 && xp <= 9000){
                    System.out.println("O heroí de nome: " + nome + " está no nível: Ascendente");
                }else if (xp >= 9001 && xp <= 10000){
                    System.out.println("O heroí de nome: " + nome + " está no nível: Imortal");
                }else if (xp >= 10001){
                    System.out.println("O heroí de nome: " + nome + " está no nível: Radiante");
                }
        }   
    }
}
 