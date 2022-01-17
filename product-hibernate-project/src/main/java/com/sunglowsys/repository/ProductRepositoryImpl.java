package com.sunglowsys.repository;

import com.sunglowsys.domain.Product;
import com.sunglowsys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class ProductRepositoryImpl implements ProductRepository{

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    @Override
    public Product save(Product product) {

        Session session  = sessionFactory.openSession();
        session.beginTransaction();
        Long id = (Long) session.save(product);
        session.getTransaction().commit();
        Product product1 = session.get(Product.class,id);

        return product1;
    }

    @Override
    public Product update(Product product,Long id) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Product product1 = session.get(Product.class,id);
        product1.setProductBrand(product.getProductBrand());
        session.getTransaction().commit();
        session.update(product1);
        System.out.println(product1);
        return product1;
    }

    @Override
    public List<Product> AllFind() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Product");
        List<Product> productList = query.list();
        session.getTransaction().commit();
        session.close();
        return productList;
    }

    @Override
    public Product findById(Long id) {
        Session session = sessionFactory.openSession();
        Product product = session.get(Product.class,id);

        return product;
    }

    @Override
    public Product deleteById(Long id) {

        Session session = sessionFactory.openSession();
        Product product = session.get(Product.class,id);
        Transaction transaction = session.beginTransaction();
        session.delete(product);
        session.getTransaction().commit();
        System.out.println(product);
        System.out.println("deleted");
        return product;
    }
}
