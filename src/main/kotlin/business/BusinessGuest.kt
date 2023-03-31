package business
import entity.Guest

class BusinessGuest {
    fun validateType(type: String) = (type == "comum" || type == "premium" || type == "luxo")

    fun isSub18(age: Int) = age >= 18

    fun validateCode(convite: Guest) = when(convite.type){
        "comum" -> convite.code.startsWith("xt")
        "premium", "luxo" -> convite.code.startsWith("xl")
        else -> false
    }
}