package business
import entity.Convite

class BusinessConvite {
    fun validateType(type: String) = (type == "comum" || type == "premium" || type == "luxo")

    fun validateCode(convite: Convite) = when(convite.type){
        "comum" -> convite.code.startsWith("xt")
        "premium", "luxo" -> convite.code.startsWith("xl")
        else -> false
    }
}