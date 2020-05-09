package com.example.springsystemfeedback.entity;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @NotNull(message = "Usuário é obrigatório")
    private String usuario;

    @Column
    @NotNull(message = "Senha é obrigatório")
    private String senha;

    @Column
    @NotNull(message = "Apelido é obrigatório")
    private String apelido;

    //mapear os restantes dos atributos necessários para o projeto

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
}
