package entities;

import jakarta.persistence.*;
@Entity
public class Usuario {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long Id;
		private String nome;
		private String email;
		private String senha;
		public Long getId() {
			return Id;
		}
		public void setId(Long id) {
			Id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		
		
		}
		

