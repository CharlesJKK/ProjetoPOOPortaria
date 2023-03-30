class Portaria {

    fun controle(){
        val age = Console.readInt("Qual sua idade?")
        if(age < 18){
            println("Negado. Menores de idade não são permitidos")
            return
        }

        val conviteType = Console.readString("Qual é o seu tipo de convite:")
        println(conviteType)
    }
}