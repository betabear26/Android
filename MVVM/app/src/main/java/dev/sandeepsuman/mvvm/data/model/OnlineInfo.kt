package dev.sandeepsuman.mvvm.data.model

data class OnlineInfo(
    val email: String,
    val ip_address: String,
    val ipv6_address: String,
    val password: String,
    val password_md5: String,
    val user_agent: String,
    val username: String
){
    override fun toString(): String {
        return "OnlineInfo(email='$email', ip_address='$ip_address', ipv6_address='$ipv6_address', password='$password', password_md5='$password_md5', user_agent='$user_agent', username='$username')"
    }
}