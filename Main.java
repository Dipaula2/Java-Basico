
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    
    public static void main(String[] args) {
       
       // Declaração de variaveis
       // camel case
       
            //boolean
            //int
            //        double
            //            string 
            //             float
         
       
       
              //System.out.println(vBoolean);  <-- printf
              //System.out.println("Variavel booleana: " + vBoolean 
               //+ "\nVariavel inteira: " +vInteiro 
               //+ "\nVariavel double: " +vFlutuante 
               //+ "\nVariavel texto: " +vString 
               //+ "\nVariavel Float: " +vFloat );     <--- prinf juntos
               
        // receber dados do teclado
        //---------------------------------------
        // Scanner sc = new Scanner(System.in);
        //---------------------------------------
        //System.out.println("Digite o nome:");
        //String nome = sc.nextLine();
        // System.out.println("Digite a Idade:");
        // int idade = sc.nextInt();
        // System.out.println("Digite seu Salario:");
        // double salario = sc.nextDouble();
        // --------------------------------------
        // System.out.println("Nome Digitado:" +nome
        // + "\nIdade: "+idade
        // + "\nSalario: " +salario);
       
        
       // Recebendo dados em JOtionoane
       //String nome = JOptionPane.showInputDialog("digite Seu Nome");
       // System.out.println("Nome:"+nome);
       // -----------------------------------------
       // Recebendo dados em JOtionoane com Janela
       String nome = JOptionPane.showInputDialog("digite Seu Nome");
       String idade = JOptionPane.showInputDialog("Digite Sua Idade");
       JOptionPane.showMessageDialog(null,"O nome digitado é: " +nome
       + "\n Idade :" + idade);
       
       // Manipulando String para outras
       // -------------------------------------------------------
       //String idade =  JOptionPane.showInputDialog("digite Sua Idade");
       // int idadeInteria = Integer.parseInt(idade);
       // ------------------------------------------------------
       //int idade2 = Integer.parseInt(JOptionPane.showInputDialog("digite Sua Idade 2"));
       //JOptionPane.showMessageDialog(null,"A idade 2 digitada é: " +idade2);
       
        
               
        
        
       
    }
    
}
