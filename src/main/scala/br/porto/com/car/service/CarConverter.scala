package br.porto.com.car.service

import org.springframework.stereotype.Component 

import br.porto.com.car.api.Car
import br.porto.com.car.dao.CarEntity


@Component
class CarConverter {
  
  def convert (car: Car): CarEntity = {
     var entity = new CarEntity()
     entity.setId(car.getId())
     entity.setName(car.getName())
     entity
  }
  
  def convert (entity: CarEntity): Car = {
    new Car(entity.id, entity.name)
  }
}