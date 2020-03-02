package br.com.bb.cenop1962.restexample.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
//@Table(name = "pessoa")
public class Pessoa implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column /*(name="id")*/
    private Integer Id;

    @Column /*(name = "chave")*/
    private String chave;

    @Column /*(name = "nome")*/
    private String nome;

    @Column /*(name="idade")*/
    private Integer idade;

    public Integer getId() {
        return Id;
    }

    public void setId(final Integer Id) {
        this.Id = Id;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(final String chave) {
        this.chave = chave;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(final Integer idade) {
        this.idade = idade;
    }

    public Pessoa(final Integer id, final String chave, final String nome, final Integer idade) {
        this.Id = id;
        this.chave = chave;
        this.nome = nome;
        this.idade = idade;
    }

    public Pessoa() {
    }

}