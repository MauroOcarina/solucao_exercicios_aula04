import javax.swing.JOptionPane;

public class Solucao2b {
    public static void main(String [] args) {
        int numero = 1;
        int quantidade = 0;
        
        while (numero >= 0) {
            if (numero != 0) {
                numero = Integer.parseInt(
                        JOptionPane.showInputDialog("Digite um valor entre 100 e 200, ou 0 para fechar o progreama: "));
                
                if (numero >= 100 && numero <= 200 && numero != 0) {
                    quantidade++;
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "O valor digitado foi 0 portanto, encerrando o programa :D");
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "A quantidade de números digitados entre 100 e 200 é: " + (quantidade));
    }
}