package com.isac.users.UsersFiap.controller;

import com.isac.users.UsersFiap.usuario.DadosCadastroUser;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @PostMapping
    @Transactional
    public String cadastrar(@RequestBody DadosCadastroUser dadosCadastroUser) {
        return "Sucesso";

    }
}
