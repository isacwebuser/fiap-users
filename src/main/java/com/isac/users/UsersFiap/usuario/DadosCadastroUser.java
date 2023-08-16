package com.isac.users.UsersFiap.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroUser(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotNull
        Perfil perfil,
        @NotBlank
        Long status
) {
}
