package clinica;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Clinica {
    private Queue<Cliente> filaCliente;

    public  Clinica(){
        filaCliente = new LinkedList<>();
    }

    public void adicionarCliente(Cliente cliente){
        filaCliente.add(cliente);
        System.out.println(cliente.getNome() + "foi adicionado a fila");
    }

    public Cliente chamarProximo(){
        Cliente proximoCliente = filaCliente.poll();

        if(proximoCliente != null){
            System.out.println("Proximo a ser atendido:\n" + proximoCliente.getNome());
        }else{
            System.out.println("A fila esta vazia.Todos foram atendidos");
        }
        return proximoCliente;
    }

    public void todosCliente(){
        if(filaCliente.isEmpty()){
            System.out.println("A fila esta vazia");
        }
        for(Cliente cliente : filaCliente){
            System.out.println(cliente.getNome());
        }

    }
}
