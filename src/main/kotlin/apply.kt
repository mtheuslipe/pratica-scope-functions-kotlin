// data class com os atributos a serem modificados
data class Person(var name: String, var idade: Int, var about: String){
    constructor() : this("", 0, "")//construtor padrão
}
fun main(){
    var jake = Person()//montando com contrutor padrão
    //reatribuindo o objeto inicial com a função de escopo apply
    var applyRun = jake.apply{
        name = " Jake"
        idade = 30
        about = " Developer"
    }.toString()
    //retornando a função
    println(applyRun)
}