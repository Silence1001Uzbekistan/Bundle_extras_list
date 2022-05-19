package uz.silence.practice_4_8_missions

import java.io.Serializable

class User : Serializable {

    var username: String? = null
    var password: String? = null

    constructor(username: String?, password: String?) {
        this.username = username
        this.password = password
    }

    constructor()


}