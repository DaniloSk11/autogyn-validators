package com.pi.autogyn.apresentacao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TelasController {
    @GetMapping("/oi")
    public String name() {
        return "index";
    }

    @GetMapping("/veiculoCadAt")
    public String cadastroAtualizacaoVeiculo() {
        return "veiculoCadAt";
    }

    @GetMapping("/veiculoMarMo")
    public String marcaModeloVeiculo() {
        return "veiculoMarMo";
    }

    @GetMapping("/veiculoLista")
    public String listagemVeiculos() {
        return "veiculoLista";
    }

    @GetMapping("/clientes")
    public String cadastroClientes() {
        return "clientes";
    }

    @GetMapping("/acessorios")
    public String cadastroAcessorios() {
        return "acessorios";
    }

    @GetMapping("/cadastroServico")
    public String cadastroServico() {
        return "cadastroServico";
    }

    @GetMapping("/cadastroPeca")
    public String cadastroPeca() {
        return "cadastroPeca";
    }

    @GetMapping("/gerencOs")
    public String gerenciarOs() {
        return "gerencOs";
    }

    @GetMapping("/controleExOs")
    public String execucaoOs() {
        return "controleExOs";
    }
}
