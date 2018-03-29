package testevetor;

import java.util.Scanner;


public class TesteVetor {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int size;
        int pos;
        int valor;
        System.out.println("Digite o tamanho do seu vetor: ");
        size = ler.nextInt();
        Vetor vet = new Vetor(size);
        Vetor vet2 = new Vetor(size);
        vet.randomFill();
        vet2.randomFill();
        vet.bubbleSort();
        vet.toString();
        
        System.out.println("Digite a posição do seu vetor e o valor que deseja alterar: ");
        pos = ler.nextInt();
        valor = ler.nextInt();
        
        vet.setAt(pos, valor);
        vet.valueAt(pos);
        vet.equals(vet2);
        vet.length(); 
    }
    
}
