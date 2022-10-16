package objects;

import java.util.Objects;

public class Product {
	
	private final String id;
	private final String nome;
	private final double valor;
	private final String descricao;
	private final Integer quantidade;
	private final User dono;
	
	public Product(final String id, final String nome, final double valor, final String descricao, final Integer quantidade, final User dono) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.dono = dono;
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public User getDono() {
		return dono;
	}
	
	@Override
	public String toString() {
		return "User{" +
				" id= " + id +
				" nome= " + nome +
				" valor= " + valor +
				" descricao= " + descricao +
				" quantidade= " + quantidade +
				" dono= " + dono + '\'' +
				" }";
	}
		
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		Product that = (Product) o;
		return id.equals(that.id) &&
				nome.equals(that.nome) &&
				Double.compare(that.valor, valor) == 0 &&
				descricao.equals(that.descricao) &&
				Integer.compare(quantidade, that.quantidade) == 0 &&
				dono.equals(that.dono);
				
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(id, nome, valor, descricao, quantidade, dono);
	}
}
