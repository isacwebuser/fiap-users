package com.isac.users.UsersFiap.controller;

import com.isac.users.UsersFiap.usuario.DadosCadastroUser;
import com.isac.users.UsersFiap.usuario.ListaCadastroUsers;
import com.isac.users.UsersFiap.usuario.User;
import com.isac.users.UsersFiap.usuario.UserRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity<String> cadastrar(@RequestBody @Valid DadosCadastroUser dadosCadastroUser) {
        repository.save(new User(dadosCadastroUser));
        return new ResponseEntity<String>("Cadastrado com sucesso", HttpStatus.CREATED);
    }

    @GetMapping
    public Page<ListaCadastroUsers> listarUsers(@PageableDefault(size = 5) Pageable pagination) {

        return repository.findAll(pagination).map(ListaCadastroUsers::new);

    }
}
