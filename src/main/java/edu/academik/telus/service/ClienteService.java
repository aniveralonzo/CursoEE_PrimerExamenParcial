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
    
    public void setClientes(List<Cliente> clientes){
        this.clienteList=clientes;
    }
    
    public List<Cliente>getClientes(){
        return clienteList;
    
    }

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
        if (existe) {
            clienteList.add(cliente);
        }
        return existe;
    }




    
    public boolean delete(Cliente cliente){
        boolean existe = clienteList.stream().anyMatch(p -> p.equals(cliente));
        if (existe) {
            clienteList.remove(0);
        }
        return existe;
    }
    
    

}