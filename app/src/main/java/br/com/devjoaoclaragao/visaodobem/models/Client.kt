package br.com.devjoaoclaragao.visaodobem.models

import java.io.Serializable

data class Client (
    var clientName : String = "",
    var clientCPF : String = "",
    var clientPhone : String = "",
    var clientZip : String = "",
    var clientStreet : String = "",
    var clientNumber : String = "",
    var clientComplement : String = "",
    var clientDistrict : String = "",
    var clientCity : String = "",
    var clientRecomendedBy : String = "",
    var clientBirthDate : String = "",

    var lastOrder : String = "",
    var photo : String = "",
    var clientSince : String = ""
) : Serializable