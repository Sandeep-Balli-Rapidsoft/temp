package com.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.dao.ProductDao;
import com.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		session.save(product);
		return product;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
//		String hql = "SELECT * FROM Product";
		Session session = entityManager.unwrap(Session.class);
		CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
		CriteriaQuery<Product> criteriaQuery = criteriaBuilder.createQuery(Product.class);
		Root<Product> root = criteriaQuery.from(Product.class);

		List<Predicate> andPredicates = new ArrayList<>();
//		andPredicates.add(criteriaBuilder.equal(root.get("productName"),"Hello"));	
		Predicate predicate = criteriaBuilder.and(andPredicates.toArray(new Predicate[] {}));

		criteriaQuery.select(root).where(predicate);

		List<Product> list = session.createQuery(criteriaQuery).getResultList(); // this.entityManager.createQuery(hql,
																					// Product.class).getResultList();
		return list;
	}

}
