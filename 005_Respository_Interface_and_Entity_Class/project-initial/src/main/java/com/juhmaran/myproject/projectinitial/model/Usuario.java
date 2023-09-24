package com.juhmaran.myproject.projectinitial.model;

import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    private Long id;

    private String name;

    @Email(message = "Insira um email válido")
    private String email;

    @CPF(message = "Insira um número de CPF válido")
    private String documentNumber;

}
