package dev.sandeepsuman.mvvm.data.model

data class Person(
    val education: Education,
    val marriage: Marriage,
    val online_info: OnlineInfo,
    val personal: Personal,
    val work: Work
){

    override fun toString(): String {
        return "Person(education=$education, marriage=$marriage, online_info=$online_info, personal=$personal, work=$work)"
    }
}