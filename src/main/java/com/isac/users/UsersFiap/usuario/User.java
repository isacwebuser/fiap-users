package com.isac.users.UsersFiap.usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "users")
@Entity(name = "user")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    @Enumerated(EnumType.STRING)
    private Perfil perfil;
    private Long status;

    public User(DadosCadastroUser cadastroUser) {
        this.nome = cadastroUser.nome();
        this.email = cadastroUser.email();
        this.status = cadastroUser.status();
        this.perfil = cadastroUser.perfil();
    }
}
