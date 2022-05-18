package ru.gb.dao.manufacturer;

import ru.gb.entity.Manufacturer;

public interface ManufacturerDao {
    Iterable<Manufacturer> findAll();
    public String findNameById(Long id);
    Manufacturer findById(Long id);
    void insert(Manufacturer manufacturer);
    void update(Manufacturer manufacturer);
    void delete(Long id);
}
