class Console private constructor(){

    companion object{
        fun readInt (msg: String): Int{

            var response: Int? = null

            do {
                print(msg)
                val info = readLine()
                if(info != null && info != ""){

                    response = info.toIntOrNull()

                }else{

                    if(response == null || response <= 0){
                        println("Valor inválido")
                    }

                }
            }while (response == null || response <= 0)

            return response
        }

        fun readString(msg: String): String{

            var response: String? = null

            do {
                print(msg)
                val info = readLine()

                if (info != null && info != ""){
                    response = info.lowercase()
                }else{
                    println("Valor inválido")
                }

            }while (response == null)

            return response
        }
    }

}