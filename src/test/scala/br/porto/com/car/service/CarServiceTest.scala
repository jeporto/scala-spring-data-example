package br.porto.com.car.service

import org.hamcrest.CoreMatchers.is
import org.junit.Assert._
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.when
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

import br.porto.com.car.api.Car
import br.porto.com.car.dao.CarRepository
import br.porto.com.car.dao.CarEntity
import java.util.Arrays

class CarServiceTest {

  private var service: CarService =_
  private var car: Car =_
  
  @Before
  def setUp() {
    car = new Car(1, "ferrari")
    var repository: CarRepository = mock(classOf[CarRepository])
    when(repository.findAll()).thenReturn(Arrays.asList((new CarEntity(1, "ferrari"))))
    service = new CarService(new CarConverter(), repository)
  }
  
  @Test 
  def shouldReturnList() {
    assertThat(service.listAll(), is(Arrays.asList(car)))
  }
}