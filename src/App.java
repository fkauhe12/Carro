
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            Carro carro = new Carro();
            
            System.out.println("Digite a marca do carro: ");
            carro.marca = ler.nextLine();
            System.out.println("Digite o modelo do carro: ");
            carro.modelo = ler.nextLine();
            System.out.println("Digite o acessorio do carro: ");
            carro.acessorio = ler.nextLine();
            System.out.println("Digite a cor do carro: ");
            carro.cor = ler.nextLine();


            System.out.println("=== Carro ===");
            System.out.println("Marca: " + carro.marca);
            System.out.println("Modelo: " + carro.modelo);
            System.out.println("Acessorio: " + carro.acessorio);
            System.out.println("Velocidade: " + carro.velocidade);
            System.out.println("Ligado?: " + carro.ligado);
            System.out.println("Cor: " + carro.cor);

            carro.ligar();

        }
    }
}
