fun main() {
// practice with class and get/set()
//making build in object
  var John: Person = Person()
  //and we can change name beacuse we have builded in class var element
  John.name = "John"
  John.age = 54
  
 println(John.info)
}
// making class with all components in it 
class Person {
    var name: String = "Ronnie"
    get() {
    return field.toUpperCase()
    // seting some values!
    } set(value){
         if(value.length > 2)
            field = value
             }
             
        var age: Int = 16
        // in this too
        set(value){
        if((value>0) and (value<110))
            field = value
      }
      
      val info: String
      get() = "Name: $name, Age: $age"
}