package ru.gb;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ru.gb.config.JpaConfig;
import ru.gb.dao.manufacturer.ManufacturerDao;

import ru.gb.dao.product.OldJdbcProductDao;
import ru.gb.dao.product.ProductDao;
//import ru.gb.entity.Manufacturer;
import ru.gb.entity.Product;

import java.util.Arrays;

public class ShopApp {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
//        ManufacturerDao manufacturerDao = context.getBean(ManufacturerDao.class);
//        System.out.println(manufacturerDao.finalNameById(3L));
//        for (Manufacturer manufacturer : manufacturerDao.findAll()) {
//            System.out.println(manufacturer);
//        }
//        System.out.println(manufacturerDao.findNameById(3L));

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JpaConfig.class);
        ProductDao productDao = context.getBean(ProductDao.class);
//        System.out.println(productDao.findNameById(3L));
//        OldJdbcProductDao oldJdbcProductDao = new OldJdbcProductDao();
        for (Product product : productDao.findAll()) {
            System.out.println(product);
        }
//        System.out.println(productDao.findNameById(3L));
    }
}
