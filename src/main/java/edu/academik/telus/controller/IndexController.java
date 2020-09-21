/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.academik.telus.controller;

import edu.academik.telus.service.ClienteService;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @Resource
    private ClienteService clienteService;

    @GetMapping("/index")
    public String get(Model model) {
        model.addAttribute("clienteList",clienteService.clienteList);
        return "index";
    }
}
