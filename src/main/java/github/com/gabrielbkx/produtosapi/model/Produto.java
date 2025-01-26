package github.com.gabrielbkx.produtosapi.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "produto")
public class Produto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "codigo")
    private String id;

    @Column(name = "nome")
    private String nome;


    @Column(name = "decricao")
    private String descricao;

    @Column(name = "preco")
    private Double preco;

    public Produto(String id, Double preco, String descricao, String nome) {
        this.id = id;
        this.preco = preco;
        this.descricao = descricao;
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
