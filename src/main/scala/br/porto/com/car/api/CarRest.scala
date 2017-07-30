package br.porto.com.car.api

import org.springframework.beans.factory.annotation.Autowired 
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMethod
import br.porto.com.car.service.CarService
import org.springframework.web.bind.annotation.PathVariable


@RestController
@RequestMapping(Array("/"))
class CarRest @Autowired()(private val service: CarService) {

  @RequestMapping(method = Array(RequestMethod.POST), value = Array("/"))
  def save(@RequestBody car: Car) = {
     var newCar = service.save(car)
     ResponseEntity.status(HttpStatus.OK).body(newCar);
  }

  @RequestMapping(method = Array(RequestMethod.PUT), value = Array("/"))
  def update(@RequestBody car: Car) = {
     var updatedCar = service.update(car)
     ResponseEntity.status(HttpStatus.OK).body(updatedCar);
  }

  @RequestMapping(method = Array(RequestMethod.GET), value = Array("/"))
  def listAll() = {
      var list = service.listAll()
      ResponseEntity.status(HttpStatus.OK).body(list);
  }

  @RequestMapping(method = Array(RequestMethod.DELETE), value = Array("/{id}"))
  def delete(@PathVariable("id") id: Long) = {
    service.delete(id)
  }
} 