/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.academik.telus.service;

import edu.academik.telus.cliente.Cliente;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    public List<Cliente> clienteList = new ArrayList<>();

    public boolean agregarCliente(Cliente cliente) {
        
        boolean existe = clienteList.stream().anyMatch(p -> p.equals(cliente));
        if (!existe) {
            clienteList.add(cliente);
        }
        return !existe;
    }
    
    public Cliente buscarCliente(String id) {
        
        for (Cliente p : clienteList){
            if (p.getId().equalsIgnoreCase(id)){            
                return p;
            }
        }
        return null;
    }
    
    public boolean editarCliente(Cliente cliente) {
        boolean existe = clienteList.stream().anyMatch(p -> p.equals(cliente));
        if (!existe) {
            clienteList.add(cliente);
        }
        return !existe;
    }
    

/**    public static Cliente buscarCliente(int id) {
        
        for (Cliente p : clienteList){
            if (p.getId()==id){            
                return p;
            }
        }
        return null;
    }
**/
    
    public boolean delete(String codigo){
        return

        clienteList.remove(codigo);     

    }
}