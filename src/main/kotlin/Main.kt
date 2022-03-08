fun main() {
    val modelo = Aviao()

    modelo.nome = "14-Bis"
    modelo.criado = "Dimitri Sensaud de Lavaud"
    modelo.local = "Avenida dos Autonomistas - Osasco/SP"
    modelo.data = "7 de janeiro de 1910"
    modelo.velocidade = "extensão de 103 metros. " +
            "\nEm 6 segundos e 18 milésimos." +
            "\nEm uma altura que variou entre dois e quatro metros."
    modelo.lagura = "10,2 metros"
    modelo.envergadura = "10 metros"


    println("****Este é o Primeiro Avião a decolar no Brasil****")
    println("Nome - ${modelo.nome}")
    println("Criado por - ${modelo.criado}")
    println("Data do Voo - ${modelo.data}")
    println("Local - ${modelo.local}")
    println("Percorreu uma avenida com  ${modelo.velocidade}")
    println("Com ${modelo.lagura} de comprimento.")
    println("Com ${modelo.envergadura} de envergadura.")

    println("\n****Informações extras****\n")
    modelo.objetivoVoo()

    modelo.tripulado()

    modelo.modelo()

}