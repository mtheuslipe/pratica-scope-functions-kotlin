fun main(){
    //função simples que mostra aplicabilidade da função de escopo run, semelhante a let, mas mais simples.
    fun printNullable(str: String?){
        println("for \"$str\"")
        str?.run{
            println("\tis empty: ${isEmpty()}")
            println("\t length: $length")
            length
        }
    }
    printNullable(null)
    printNullable("whatever")
}