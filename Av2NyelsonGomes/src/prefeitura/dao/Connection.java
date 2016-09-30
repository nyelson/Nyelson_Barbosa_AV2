package prefeitura.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class Connection {

	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("av2-nyelson").createEntityManager();
	}

}
