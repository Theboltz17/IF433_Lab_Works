package oop_00000133272_tevathanielhartanto.week08

class City(val name:String)
class Address(val city:String?)
class DeliveryDetail(val address: Address?)
class Order(val deliveryDetails: DeliveryDetails?, val totalPrice: Int?)