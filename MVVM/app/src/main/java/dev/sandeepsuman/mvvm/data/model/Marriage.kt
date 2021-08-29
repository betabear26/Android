package dev.sandeepsuman.mvvm.data.model

data class Marriage(
    val children: Int,
    val married: Boolean,
    val spouse_name: String
){
    override fun toString(): String {
        return "Marriage(children=$children, married=$married, spouse_name='$spouse_name')"
    }
}