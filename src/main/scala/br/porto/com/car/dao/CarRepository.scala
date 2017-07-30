package br.porto.com.car.dao

import org.springframework.data.repository.CrudRepository 
import java.lang.Long

trait CarRepository extends CrudRepository[CarEntity, Long]
