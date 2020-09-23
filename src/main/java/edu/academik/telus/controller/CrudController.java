/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.academik.telus.controller;

import edu.academik.telus.cliente.Cliente;
import edu.academik.telus.service.ClienteService;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class CrudController {
    @Resource
    private ClienteService clienteService;

    @GetMapping("/cliente")
    public String get(Model model) {        
    model.addAttribute("cliente", new Cliente());
    return "crear";
    }    
    
    @PostMapping("/cliente/crear")
    public String create(Model model, @ModelAttribute("cliente") Cliente cliente ) {

        boolean agregado = clienteService.agregarCliente(cliente);
        if (agregado) {
            model.addAttribute("cliente", new Cliente());
            model.addAttribute("mensaje", "Cliente agregado!!!");
        } else {
            model.addAttribute("mensaje", "Cliente ya existe!!");
        }
        return "crear";
    }
    
    
    
    
    @GetMapping("/cliente/id/{id}")
    public String getByCodigo(Model model, @PathVariable("id") String id) {        
        var cliente = clienteService.buscarCliente(id);                
        model.addAttribute("cliente", cliente);
        return "editar";
    }

     
    @PostMapping("/cliente/editar")
    public String edit(Model model, @ModelAttribute("cliente") Cliente cliente) {
        
        boolean editado = clienteService.editarCliente(cliente);
        if (editado) {
            model.addAttribute("cliente", cliente);
            model.addAttribute("mensaje", "ACTUALIZADO!!!");
        }
        return "editar";  
    }
    
    
    @RequestMapping("/cliente/eliminar/{id}")
    public String getDelete(Model model, @PathVariable("id") String id) {        
        clienteService.getClientes().removeIf(p -> p.getId().equals(id));
        model.addAttribute("mensaje", "Eliminado !!!");
        return "redirect:/index";
    }
}

