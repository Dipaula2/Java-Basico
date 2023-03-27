package com.mycompany.poo_tarefa1;


import javax.swing.JOptionPane;

public class POO_tarefa1 {

    public static void main(String[] args) {
       
       String nome = JOptionPane.showInputDialog("Digite Seu Nome:");
       int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite Sua Idade :"));
       String salario = JOptionPane.showInputDialog("Digite Seu Salario :");
       String mail = JOptionPane.showInputDialog("Digite Seu E-Mail :");
       String celular = JOptionPane.showInputDialog("Digite Seu Número de Celular :");
       JOptionPane.showMessageDialog(null,"O nome digitado é: " +nome
       + "\n Idade : " + idade
       + "\n Salario : " + salario
       +"\n  E-mail :" + mail
       + "\n Celular :" +celular); 
    }
}
