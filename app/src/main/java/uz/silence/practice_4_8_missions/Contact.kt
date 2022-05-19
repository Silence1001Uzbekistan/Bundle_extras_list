package uz.silence.practice_4_8_missions

import java.io.Serializable

class Contact : Serializable {

    var ContactName: String? = null
    var ContactNumber: MutableList<String>? = null


    constructor()
    constructor(ContactName: String?, ContactNumber: MutableList<String>) {
        this.ContactName = ContactName
        this.ContactNumber = ContactNumber
    }


}