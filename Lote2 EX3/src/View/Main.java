package View;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Model.AgendaTelefonica;
import Model.Contato;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        Contato c1 = new Contato();
        c1.setEmail("fulano@gmail.com");
        c1.setNome("Fulano");
        c1.setTelefone("911112222");

        Contato c2 = new Contato();
        c2.setEmail("beltrano@gmail.com");
        c2.setNome("Beltrano");
        c2.setTelefone("9123456789");

        List<Contato> lista = new ArrayList<>();
        AgendaTelefonica agenda = new AgendaTelefonica();
        
        agenda.addContato(lista, c1);
        agenda.addContato(lista, c2);
        while (i != 9){
            i = Integer.parseInt(JOptionPane.showInputDialog("O que deseja fazer?\n1 - Adicionar um contato\n2 - Fazer uma busca pelo nome\n3 - Fazer uma busca pelo Telefone\n4 - Fazer uma busca pelo Email\n5 - Remover um contato\n9- Sair"));

            switch (i) {
                case 1:
                    Contato c3 = new Contato();
                    String nome = JOptionPane.showInputDialog("Qual o nome do contato?");
                    String telefone = JOptionPane.showInputDialog("Qual o número do contato?");
                    String email = JOptionPane.showInputDialog("E por fim, qual o Email?");
                    c3.setNome(nome);
                    c3.setTelefone(telefone);
                    c3.setEmail(email);
                    JOptionPane.showMessageDialog(null,"O contato foi criado!");
                    break;
                case 2:
                    nome = JOptionPane.showInputDialog("Qual nome deseja buscar?");
                    System.out.println("Contato encontrado!\n"+agenda.buscaNome(lista, nome).getNome()+"\n"+agenda.buscaNome(lista, nome).getEmail()+"\n"+agenda.buscaNome(lista, nome).getTelefone()); 

                    break;
                case 3:
                    telefone = JOptionPane.showInputDialog("Qual número deseja buscar?");
                    System.out.println("Contato encontrado!\n"+agenda.buscaTelefone(lista, telefone).getNome()+"\n"+agenda.buscaTelefone(lista, telefone).getEmail()+"\n"+agenda.buscaTelefone(lista, telefone).getTelefone());
                    break;
                case 4:
                    email = JOptionPane.showInputDialog("Qual email deseja buscar?");
                    System.out.println("Contato encontrado!\n"+agenda.buscaEmail(lista, email).getNome()+"\n"+agenda.buscaEmail(lista, email).getEmail()+"\n"+agenda.buscaEmail(lista, email).getTelefone());
                    break;

                case 5:
                    nome = JOptionPane.showInputDialog("Qual nome do contato que deseja Excluir?");
                    agenda.removeContato(lista, nome);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null,"Até mais!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Valor inválido, tente novamente.");
                    break;
            }
        }
    }
}
