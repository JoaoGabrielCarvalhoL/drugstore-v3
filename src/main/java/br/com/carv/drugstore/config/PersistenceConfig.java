package br.com.carv.drugstore.config;

import org.jboss.logging.Logger;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PersistenceConfig {
	
	public static EntityManagerFactory entityManagerFactory = null;
	private static final Logger logger = Logger.getLogger(PersistenceConfig.class);

	static {
		init();
	}
	
	public PersistenceConfig() {
		init();
	}
	
	private static void init() {
		try {
			entityManagerFactory = Persistence.createEntityManagerFactory("drugstore");
		} catch (Exception e) {
			logger.info("Entity Manager Factory cannot be created.");
			throw new RuntimeException();
		}
	}
	
	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}
	
}
