package com.gdapp.atividadeextra;

import java.io.Serializable;

public class Cadastro implements Serializable {

    private String nome;
    private Integer rg;
    private String cpf;//###.###.###.##
    private String nascimento;// ##/##/##
    private String tipoLogradouro;
    private String logradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private Integer cep;
    private Integer telefone01;
    private Integer telefone02;
    private String email;
    private String facebook;
    private String instagram;
    private String twitter;

    public Cadastro()
    {
        this.nome = null;
        this.rg = null;
        this.cpf = null;
        this.nascimento = null;
        this.tipoLogradouro = null;
        this.logradouro = null;
        this.numero = null;
        this.complemento = null;
        this.bairro = null;
        this.cidade = null;
        this.estado = null;
        this.cep = null;
        this.telefone01 = null;
        this.telefone02 = null;
        this.email = null;
        this.facebook = null;
        this.instagram = null;
        this.twitter = null;
    }

    public Cadastro(String nome, Integer rg, String cpf, String nascimento, String tipoLogradouro,
                    String logradouro, Integer numero, String complemento, String bairro, String cidade,
                    String estado, Integer cep, Integer telefone01, Integer telefone02, String email,
                    String facebook, String instagram, String twitter) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.tipoLogradouro = tipoLogradouro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telefone01 = telefone01;
        this.telefone02 = telefone02;
        this.email = email;
        this.facebook = facebook;
        this.instagram = instagram;
        this.twitter = twitter;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public Integer getTelefone01() {
        return telefone01;
    }

    public void setTelefone01(Integer telefone01) {
        this.telefone01 = telefone01;
    }

    public Integer getTelefone02() {
        return telefone02;
    }

    public void setTelefone02(Integer telefone02) {
        this.telefone02 = telefone02;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }


}
