package br.com.carv.drugstore.config;

import jakarta.persistence.EntityManager;

public class Init {
	public static void main(String[] args) {
		System.out.println("João");
		EntityManager entityManager;
		entityManager = PersistenceConfig.getEntityManager();
		if(entityManager.isOpen()) {
			System.out.println("It's works!");
		}
	
	}
}
