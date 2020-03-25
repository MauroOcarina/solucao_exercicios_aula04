import javax.swing.JOptionPane;

public class Solucao2a {
    public static void main(String [] args) {
        int numero = 1;
        double media = 0;
        int soma = 0;
        int aux = 0;
        
        while(numero > 0) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor positivo: "));
            soma += numero;
            aux++;
            System.out.println(soma);
            System.out.println(aux);
        }
        media = soma / aux-1;
        JOptionPane.showMessageDialog(null, String.format("A média da soma dos valores é: %.2f", media));
    }
}