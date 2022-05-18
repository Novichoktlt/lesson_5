package ru.gb.dao.product;


import ru.gb.entity.Product;

public interface ProductDao {
    Iterable<Product> findAll();
    public String findNameById(Long id);
    Product findById(Long id);
    void insert(Product product);
    void update(Product product);
    void delete(Long id);
}
