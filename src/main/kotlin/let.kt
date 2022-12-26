import java.util.*

//função que fará o objetivo do código
fun customPrint(str: String){
    println(str.uppercase())
}
fun main(){
    //verificação se a varável está vazia usando o let
    val empty = "test".let{
        customPrint(it)//fazendo a função objetivo
        it.isEmpty()//ultima instrução do let e retorno
    }
    println("it's empty: $empty")

    //função para verificar nulabilidade de strings
    fun printNullable(str: String?){
        println("printing \"$str\"")

        str?.let{
            println("\t")
            customPrint(str)
        }
    }
    //função que encadeia vários lets verificando nulabilidade dos parâmetros
    fun printNullability(strOne: String?, strTwo: String?){
        strOne?.let{firstString ->
            strTwo?.let{ secondString ->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }
    //chamando as funções
    printNullable(null)
    printNullable("string")
    printNullability("first", "second")
}