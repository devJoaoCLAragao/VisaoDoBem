package br.com.devjoaoclaragao.visaodobem.models

import java.io.Serializable

data class Client (
    var name : String = "",
    var lastOrder : String = "",
    var photo : String = "",
    var clientSince : String = "",
    var recomendedBy : String = ""
) : Serializable