package dev.sandeepsuman.mvvm.data.model

data class Personal(
    val age: Int,
    val blood: String,
    val born: Any,
    val born_place: String,
    val cellphone: String,
    val city: String,
    val country: String,
    val eye_color: String,
    val father_name: String,
    val gender: String,
    val height: String,
    val last_name: String,
    val name: String,
    val national_code: String,
    val religion: String,
    val system_id: String,
    val weight: Int
){
    override fun toString(): String {
        return "Personal(age=$age, blood='$blood', born=$born, born_place='$born_place', cellphone='$cellphone', city='$city', country='$country', eye_color='$eye_color', father_name='$father_name', gender='$gender', height='$height', last_name='$last_name', name='$name', national_code='$national_code', religion='$religion', system_id='$system_id', weight=$weight)"
    }
}