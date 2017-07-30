package br.porto.com.car.service

import org.springframework.beans.factory.annotation.Autowired   
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service

import scala.collection.JavaConversions._

import javax.persistence.Entity
import javax.persistence.Table
import br.porto.com.car.api.Car
import br.porto.com.car.dao.CarRepository
import br.porto.com.car.dao.CarEntity
import java.util.List


@Service
class CarService @Autowired()(private val converter: CarConverter, private val repository: CarRepository) {
  
  def save(car: Car): Car = {
    var entity = converter.convert(car)
    entity = repository.save(entity)
    converter.convert(entity)
  }

  def update(car: Car): Car = {
    var entity = converter.convert(car)
    entity = repository.save(entity)
    converter.convert(entity)
  }

  def listAll(): List[Car] = {
     repository.findAll()
               .iterator()
               .toList
               .map { e => converter.convert(e) }
       
  }

  def delete(id: Long) = {
    repository.delete(id)
  }
}