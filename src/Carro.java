public class Carro {
    String marca;
    String modelo;
    double velocidade;
    boolean ligado;
    String cor;
    String acessorio;

    void ligar() {
        if(this.ligado == false) {
            this.ligado = true;
            System.out.println("Carro ligado");
        } else {
            System.out.println("Carro já está ligado");
        }
    }

}
