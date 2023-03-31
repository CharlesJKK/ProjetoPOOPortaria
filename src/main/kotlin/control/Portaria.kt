package control
import business.BusinessConvite

class Portaria {

    private val businessConvite = BusinessConvite()
    init {
        println("Portaria aberta!")
        println(controle())
    }

    private fun controle(): String{
        val age = Console.readInt("Qual sua idade?")
        if(age < 18){
            return "Negado. Menores de idade não são permitidos"
        }

        val conviteType = Console.readString("Qual é o seu tipo de convite:")
        if(businessConvite.validateType(conviteType)){
            return "Negado. Convite inválido"
        }

        val code = Console.readString("Qual é o código do convite?")
        if(businessConvite.validateCode(code, conviteType)){
            return "Negado. Convite inválido"
        }

        return ""
    }
}