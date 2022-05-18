package ru.gb.dao.product;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.gb.entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Repository
@Transactional
public class EntityManagerProductDao implements ProductDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Iterable<Product> findAll() {
        return entityManager.createQuery("SELECT p FROM Product p").getResultList();
    }


    @Override
    public String findNameById(Long id) {
        TypedQuery<String> namedQuery = entityManager.createNamedQuery("Product.findNameById", String.class);
        namedQuery.setParameter("id", id);
        return namedQuery.getSingleResult();
    }


    @Override
    public Product findById(Long id) {
        TypedQuery<Product> namedQuery = entityManager.createNamedQuery("Product.findById", Product.class);
        namedQuery.setParameter("id", id);
        return namedQuery.getSingleResult();
    }

    @Override
    public void insert(Product product) {

    }

    @Override
    public void update(Product product) {

    }


    @Override
    public void delete(Long id) {

    }
}
