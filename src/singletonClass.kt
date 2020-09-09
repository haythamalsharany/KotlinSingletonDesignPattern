fun main(args: Array<String>) {
  Singleton.printName()
    Singleton.name=" mokhtar "
    var  a=A()
}

object Singleton {

    init{
println("Singleton class invoked")
    }
    var name="haytham"
    fun printName(){
        println(name)
    }
}
class A{
    init {
        println("class init method .Singleton name property :${Singleton.name}")
        Singleton.printName()
    }
}