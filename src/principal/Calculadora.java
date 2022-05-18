package principal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Calculadora  extends JFrame{
    JLabel rotulo1, rotulo2, exibir;
    JTextField texto1, texto2;
    JButton somar, subtrair, multiplicacao, divisao, limpar, ocultar, aparecer;
    
    public Calculadora(){
        super("Exemplo de Calculadora");
        Container tela = getContentPane();
        setLayout(null);
        rotulo1 = new JLabel ("1º Número:");
        rotulo2 = new JLabel ("2º Número:");
        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        exibir = new  JLabel("");
        somar = new JButton ("Somar");
        subtrair = new JButton ("Subtrair");
        multiplicacao = new JButton ("Multiplicao");
        divisao = new JButton ("Dividir");
        limpar = new JButton ("Limpar");
        aparecer = new JButton ("Exibir");
        ocultar = new JButton ("Ocultar");
        
        
        
        rotulo1.setBounds(50,20,100,20); rotulo2.setBounds(50,60,100,20);
        texto1.setBounds(120,20,200,20); texto2.setBounds(120,60,200,20);
        exibir.setBounds(190,190,200,20); somar.setBounds(70,100,80,20);
        subtrair.setBounds(70,130,80,20); multiplicacao.setBounds(70,160,80,20);
        divisao.setBounds(70,190,80,20); limpar.setBounds(190,100,80,20);
        aparecer.setBounds(190,130,80,20); ocultar.setBounds(190,160,80,20); 
        
        somar.addActionListener(
        new ActionListener(){
        public void actionPerformed(ActionEvent e){
            int numero1, numero2, soma;
            soma = 0;
            numero1 = Integer.parseInt(texto1.getText());
            numero2 = Integer.parseInt(texto2.getText());
            soma = numero1 + numero2;

            exibir.setVisible(true);
            exibir.setText("A soma é: "+ soma); 

        }    
            
        }
        );
        
         subtrair.addActionListener(
        new ActionListener(){
        public void actionPerformed(ActionEvent e){
            int numero1, numero2, soma, subtrair;
            subtrair = 0;
            numero1 = Integer.parseInt(texto1.getText());
            numero2 = Integer.parseInt(texto2.getText());

            subtrair = numero1 - numero2;
            exibir.setVisible(true);
            exibir.setText("A soma é: "+ subtrair);

        }    
            
        }
        );
        multiplicacao.addActionListener(
        new ActionListener(){
        public void actionPerformed(ActionEvent e){
            int numero1, numero2, soma, multiplicar;
            multiplicar = 0;
            numero1 = Integer.parseInt(texto1.getText());
            numero2 = Integer.parseInt(texto2.getText());
            multiplicar = numero1 * numero2;
            exibir.setVisible(true);
            exibir.setText("A soma é: "+ multiplicar);
            
        }    
            
        }
        );
        divisao.addActionListener(
        new ActionListener(){
        public void actionPerformed(ActionEvent e){
            int numero1, numero2, soma, divisao;
            divisao = 0;
            numero1 = Integer.parseInt(texto1.getText());
            numero2 = Integer.parseInt(texto2.getText());
            //soma = numero1 + numero2;
            divisao = numero1 / numero2;
            exibir.setVisible(true);
            exibir.setText("A soma é: "+ divisao);
            
        }    
            
        }
        );
        limpar.addActionListener(
        new ActionListener(){
        public void actionPerformed(ActionEvent e){
            texto1.setText(null);
            texto2.setText(null);
            texto1.requestFocus();
                    }    
            
        }
        );
                aparecer.addActionListener(
        new ActionListener(){
        public void actionPerformed(ActionEvent e){
            texto1.setEnabled(true);
            texto2.setEnabled(true);
                    }    
            
        }
        );
        ocultar.addActionListener(
        new ActionListener(){
        public void actionPerformed(ActionEvent e){
            texto1.setEnabled(false);
            texto2.setEnabled(false);
            
                    }    
            
        }
        );
        
            
        exibir.setVisible(false);
        
        tela.add(rotulo1); tela.add(rotulo2);
        tela.add(texto1); tela.add(texto2);
        tela.add(exibir); tela.add(somar);
        tela.add(subtrair); tela.add(divisao);
        tela.add(multiplicacao); tela.add(limpar);
        tela.add(aparecer); tela.add(ocultar);
        
        setSize(400,250);
        setVisible(true);
        
    }
   
}
