package com.suncars.suncar.repositories;

import java.util.List;
import com.suncars.suncar.models.Car;
import org.springframework.data.repository.CrudRepository;
    
    public interface CarRepository extends CrudRepository<Car, Long> {
        List<Car> findAll();
        List<Car> findByBrand(String brand);
        List<Car> findByColor(String color);
        List<Car> findByYear(int year);
        List<Car> findByBrandAndModel(String brand, String model);
        List<Car> findByBrandOrderByYearAsc(String brand);
        // //    Page<Car> findAllPage(Pageable pageable);
        
}