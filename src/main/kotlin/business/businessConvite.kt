package business

class BusinessConvite {
    fun validateType(type: String) = (type == "comum "&& type == "premium" && type == "luxo")

    fun validateCode(code: String, type: String): Boolean{
        if(type == "comum" && code.startsWith("xt")){
            return true
        }else if((type == "premium" || type == "luxo") && code.startsWith("xl")){
            return true
        }else{
            return false
        }
    }
}