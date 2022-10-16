package objects;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

import com.opencsv.CSVWriter;

public class User {
	
	private final String id;
	private final String nome;
	private final String senha;
	private final String email;
	private final boolean status;
	private final Integer perfil; 
	
	private static final String RESOURCES = "src/main/resources/User.csv";
	
	public User(final String id, final String nome, final String senha, final String email
			, final boolean status, final Integer perfil ) {
		this.id = id;
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.status = status;
		this.perfil = perfil;
	}

	public String getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}

	public String getEmail() {
		return email;
	}
	
	public boolean getStatus() {
		return status;
	} 
	
	public Integer getPerfil() {
		return perfil;
	}

	@Override
	public String toString() {
		return "User{" +
				" id= " + id +
				" nome= " + nome +
				" email= " + email +
				" status= " + status +
				" perfil=[ " + perfil + 
				" ]"
				+ '\'' +
				" }";
	}
		
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(o == null || getClass() != o.getClass()) return false;
		User that = (User) o;
		return id.equals(that.id) &&
				nome.equals(that.nome) &&
				senha.equals(that.senha) &&
				email.equals(that.email) &&
				status == that.status &&
				perfil.equals(that.perfil);
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(id, nome, senha, email);
	}
	
}
