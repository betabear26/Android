package dev.sandeepsuman.mvvm.data.model

data class Education(
    val certificate: String,
    val university: String
){
    override fun toString(): String {
        return "Education(certificate='$certificate', university='$university')"
    }
}