package prefeitura.dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;


import prefeitura.model.Fornecedor;

public class FornecedorDAO extends DAO<Fornecedor> {
	
	public FornecedorDAO() {
		super(Fornecedor.class);
	}
	
	public Fornecedor buscaFornecedorPorCNPJ(String cnpj) {
		Fornecedor fornecedor = null;
		EntityManager em = new Connection().getEntityManager();
		TypedQuery<Fornecedor> query = em.createQuery(
			"SELECT f FROM Fornecedor f WHERE f.cnpj = :cnpj", 
			Fornecedor.class);
		try {
			query.setParameter("cnpj", cnpj);
			fornecedor = query.getSingleResult();
		} catch(Exception e) {
			
		} finally {
			em.close();
		}
		return fornecedor;
	}

}
