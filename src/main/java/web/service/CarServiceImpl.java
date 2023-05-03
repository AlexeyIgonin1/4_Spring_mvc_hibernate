package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDAO carDAO;

    @Override
    @Transactional
    public List<Car> getAllCars(){
        return carDAO.getAllCars();
    }



}
