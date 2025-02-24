```scala
class MyClass(val name: String) {
  private var _age: Int = 0

  def age: Int = _age

  def age_=(newAge: Int): Unit = {
    try {
      if (newAge < 0) throw new IllegalArgumentException("Age cannot be negative")
      _age = newAge
    } catch {
      case e: IllegalArgumentException => println(s"Error setting age: ${e.getMessage}. Setting age to 0.")
      _age = 0
    }
  }
}

val myObj = new MyClass("John")
myObj.age = 30
println(myObj.age) // Output: 30

myObj.age = -5 //This will print an error and set age to 0
println(myObj.age) // Output: 0
```