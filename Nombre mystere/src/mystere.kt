fun main(args:Array<String>) {


    println("Vous avez lancé le jeu du nombre mystère, votre but vas être de retrouver le nombre du jouer 1 en mois de tentative possible ")
    // variable
    // first est le nombre mystère
    // second est le nombre qui sert a trouver le nombre mystère
    var first: Int
    var second: Int
    var mystere: Boolean = false
    var sortie: String
    var tentative = 0
    println("Enter the first number :")
    first = readLine()!!.toInt()
    println("Le nombre mystère est")

    do {
        println()
        tentative++
        print("c'est votre : $tentative tentative")
        println("Essayer de retrouver le nombre mystère")
        sortie = readLine()!!

        if (sortie == "s") {
            println("Vous êtes sortie du jeu et vous n'avez pas trouvé le nombre mystère")
            mystere = true
        } else {
            second = sortie.toInt()
            print("Votre nomhbre est $second")
            when {
                first < second -> println("le nombre mystère est plus petit")
                first > second -> println("le nombre mystère est plus grand")
                else -> {
                    println("Le nombre mystère a été trouvé")
                    mystere = true
                }
            }
            if (!mystere) {
                when (second) {
                    in first..first + 5 -> println("T'y est presque!")
                    in first - 10..first + 10 -> println("Pas loin !")
                    in first - 20..first + 20 -> println("Tu t'éloignes!")

                }
            }
        }
    } while(!mystere)
}



