package br.porto.com.car.dao

import scala.beans.BeanProperty

import org.hibernate.validator.constraints.NotEmpty

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "car")
class CarEntity {

  @Id
  @GeneratedValue
  @BeanProperty
  var id: Long = _

  @BeanProperty
  @NotEmpty
  var name: String = _

  def this(id :Long, name:String){
    this()
    this.id = id
    this.name = name
  }
}