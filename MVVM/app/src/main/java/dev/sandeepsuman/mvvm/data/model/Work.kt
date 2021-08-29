package dev.sandeepsuman.mvvm.data.model

data class Work(
    val country_code: String,
    val insurance: Boolean,
    val position: String,
    val salary: String
){
    override fun toString(): String {
        return "Work(country_code='$country_code', insurance=$insurance, position='$position', salary='$salary')"
    }
}