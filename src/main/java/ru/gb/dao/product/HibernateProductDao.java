package ru.gb.dao.product;

import lombok.RequiredArgsConstructor;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.gb.entity.Product;

import java.util.Collections;
import java.util.List;

//@Component
@RequiredArgsConstructor
public class HibernateProductDao implements ProductDao {

    private final SessionFactory sessionFactory;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return Collections.unmodifiableList(sessionFactory.getCurrentSession().createQuery("from Product p").list());
    }

    @Override
    @Transactional(readOnly = true)
    public String findNameById(Long id) {
        return (String) sessionFactory.getCurrentSession().createNamedQuery("Product.findNameById")
                .setParameter("id", id).uniqueResult();
    }

    @Override
    @Transactional(readOnly = true)
    public Product findById(Long id) {
        return (Product) sessionFactory.getCurrentSession().createNamedQuery("Product.findById")
                .setParameter("id", id).uniqueResult();
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
