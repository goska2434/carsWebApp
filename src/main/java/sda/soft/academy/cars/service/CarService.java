package sda.soft.academy.cars.service;

import sda.soft.academy.cars.carDTO.CarDTO;

import java.util.List;

public interface CarService {

    public List<CarDTO> findAllCars ();
    public CarDTO findCarById(Long id);
    public void save (CarDTO carDTO);
    public void delete (Long id);

}
