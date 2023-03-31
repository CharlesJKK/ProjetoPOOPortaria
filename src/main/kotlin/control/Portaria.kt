package control
import business.BusinessGuest
import entity.Guest

class Portaria {

    private val businessGuest = BusinessGuest()
    init {
        println("Portaria aberta!")
        println(controle())
    }

    private fun controle(): String{
        val age = Console.readInt("Qual sua idade?")
        val guest = Guest(age = age)
        if(!businessGuest.isSub18(guest.age)){
            return "Negado. Menores de idade não são permitidos"
        }

        guest.type = Console.readString("Qual é o seu tipo de convite:")
        if(!businessGuest.validateType(guest.type)){
            return "Negado. Convite inválido"
        }

        guest.code = Console.readString("Qual é o código do convite?")
        if(!businessGuest.validateCode(guest)){
            return "Negado. Convite inválido"
        }

        return "Bem-vindo!"
    }
}