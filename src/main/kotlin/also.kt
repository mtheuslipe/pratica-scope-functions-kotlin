// data class principal
data class Persona(var name: String, var idade: Int, var about: String){
    constructor() : this("", 0, "")
}
//função chamada com o also
fun writeCreationLog(p: Persona) {
    with(p) {
        println("a new Person, $name, was added!")
    }
}
fun main(){
    //implementando valor na classe e retornando pela função de escopo also
    var jake = Persona("Jake", 30, "Dev")
        .also{
            writeCreationLog(it)
        }
}