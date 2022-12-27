class MyDog(val name: String, val especies: String)//classe que oferece os parâmetros no contrutor

fun main(){
    //inserindo parâmetros na classe
    val myDog = MyDog("Spook", "Labrador")
    //retornando o valor dos atributos com a função de escopo with
    with(myDog){
        println("$name : $especies")
    }
}