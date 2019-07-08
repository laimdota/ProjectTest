package demo.repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import demo.model.Car;

public interface CarRepo extends CrudRepository<Car, Integer>{
	ArrayList<Car> findByYearAndSpeed(int year, int speed);
	ArrayList<Car> findByYear(int year);
	/*@Query(value="SELECT...")
	Car myquery();*/
}
