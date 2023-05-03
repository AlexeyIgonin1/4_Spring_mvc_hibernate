package web.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.Car;

import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO{

    private SessionFactory sessionFactory;

    @Autowired
    public CarDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public List<Car> getAllCars() {
        Session session = sessionFactory.getCurrentSession();
       // List<Car> allCars = session.createQuery("from Car", Car.class).getResultList();
        TypedQuery<Car> query = sessionFactory.getCurrentSession().createQuery("Select c from Car c", Car.class);

        return query.getResultList();
    }
}
