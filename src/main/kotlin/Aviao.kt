class Aviao {
    var criado = ""
    var velocidade = ""
    var lagura = ""
    var envergadura = ""
    var local = ""
    var nome = ""
    var data = ""
    var batizado = "S. Paulo"

    fun objetivoVoo() {
        println("O 14-Bis foi batizado de $batizado;")
    }

    fun tripulado() {
        println("Tripulado apenas pelo Francês $criado;")
    }

    fun modelo() {
        println(
            "Uma semana após o voo em Osasco, " +
                    "o S. Paulo, devidamente reparado, \nfoi" +
                    " exposto na entrada do antigo Cine-Teatro " +
                    "Polytheama, no centro de São Paulo."
        )
    }
}