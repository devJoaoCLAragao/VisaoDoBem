package br.com.devjoaoclaragao.visaodobem.models

data class Client (
    var name : String = "",
    var lastOrder : String = "",
    var photo : String = "",
    var clientSince : String = "",
    var recomendedBy : String = ""
)