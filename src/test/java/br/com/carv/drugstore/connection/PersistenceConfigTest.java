package br.com.carv.drugstore.connection;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.carv.drugstore.config.PersistenceConfig;
import jakarta.persistence.EntityManager;

public class PersistenceConfigTest {

	@Test
	public void should_return_entity_manager() {
		EntityManager entityManager = PersistenceConfig.getEntityManager();
		Assertions.assertThat(entityManager).isNotNull();
	}
}
