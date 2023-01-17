package fucturabank;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppBank {
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("DESENVOLVIMENTO");
	public static EntityManager em = emf.createEntityManager();
	
	public static void main(String[] args) {
		System.out.println(emf.isOpen()?"Conectado":"Ops, falhou.");
		emf.close();

	}

}