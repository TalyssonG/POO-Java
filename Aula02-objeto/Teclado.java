
package exaula2;
public class Teclado {
    String cor;
    int tamanho;
    String modelo;
    boolean ligado;
    
    
    void status(){
        System.out.println("Cor: " + this.cor);        
        System.out.println("tamanho: " + this.tamanho);       
        System.out.println("modelo: " + this.modelo);      
        System.out.println("Está ligado:" + this.ligado);

    }
    
    
    void digitar(){
        if(this.ligado ==  true) {
            System.out.println("Digitando...");
        }else{
            System.out.println("O teclado está desconectado");
        }
    }
    
    void ligar() {
       this.ligado = true;       
       
    }
    
    void desligar() {
        this.ligado = false;
    }
}

