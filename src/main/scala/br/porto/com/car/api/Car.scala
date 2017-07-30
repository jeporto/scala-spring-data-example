package br.porto.com.car.api

import scala.beans.BeanProperty


class Car {
  
  @BeanProperty
  var id: Long=_

  @BeanProperty
  var name: String=_
  
  
  def this(id :Long, name:String){
    this()
    this.id = id
    this.name = name
  }

  def canEqual(other: Any) = {
    other.isInstanceOf[br.porto.com.car.api.Car]
  }

  override def equals(other: Any) = {
    other match {
      case that: br.porto.com.car.api.Car => that.canEqual(Car.this)
      case _ => false
    }
  }

  override def hashCode() = {
    val prime = 41
    prime
  }
}