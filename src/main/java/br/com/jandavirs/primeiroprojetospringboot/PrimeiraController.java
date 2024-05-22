package br.com.jandavirs.primeiroprojetospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // classe do tipo controller, através dela vou receber minha requisição e retornar pro usuario. Esa classe que vai comandar tudo
              // por que a gente ta construindo uma aplicação utilizando os conceitos de API REST


@RequestMapping("/primeiraController")
public class PrimeiraController {
    

    @GetMapping("/primeiroMetodo")
    public String primeiroMetodo(){
        return "Meu primeiro metodo api rest";
    }
}
