package com.isac.users.UsersFiap.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ListaCadastroUsers(
        String nome,
        String email,
        Perfil perfil,
        Long status
) {
        public ListaCadastroUsers(User user) {
                this(user.getNome(), user.getEmail(), user.getPerfil(), user.getStatus());
        }
}
