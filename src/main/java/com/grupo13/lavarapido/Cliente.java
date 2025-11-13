package com.grupo13.lavarapido;

import jakarta.annotation.Generated;

@Entity
@Table(name="Cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(name="primeiro nome")
    private String primeiroNome;
    @Column(name="sobrenome")
    private String sobrenome;
    @Column(name="Data de registro")
    private String dataRegistro;
    
    public String getPrimeiroNome() {
        return primeiroNome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public String getDataRegistro() {
        return dataRegistro;
    }
    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
}
