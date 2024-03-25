package Model;

import java.util.List;

import javax.swing.JOptionPane;

public class AgendaTelefonica {
    private List<Contato> lista;


    public void addContato(List<Contato> lista, Contato contato){
        this.lista = lista;
        lista.add(contato);
    }

    public void removeContato(List<Contato> lista, String busca){
        lista.remove(lista.stream().filter(contato -> busca.equals(contato.getNome())).findFirst().orElse(null));

        JOptionPane.showMessageDialog(null,"Contato removido com sucesso!");
    }

    public Contato buscaNome(List<Contato> lista, String busca){
        return lista.stream().filter(contato -> busca.equals(contato.getNome())).findFirst().orElse(null);
        
    }

    public Contato buscaEmail(List<Contato> lista, String busca){
        return lista.stream().filter(contato -> busca.equals(contato.getEmail())).findFirst().orElse(null);
    }

    public Contato buscaTelefone(List<Contato> lista, String busca){
        return lista.stream().filter(contato -> busca.equals(contato.getTelefone())).findFirst().orElse(null);
    }
}
