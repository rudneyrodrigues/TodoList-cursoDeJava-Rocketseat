// Toda classe no JAVA precisa estar dentro de um "package"
package br.dev.rudneyrodrigues.todolist;

// As importações são classes reutilizaveis dentro da aplicação.
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

}
