import controllers.*
import utils.*

fun main() {
    //intputEmail()
    provarRegexParametritzada()
}

/**
 * Funció per registrar un nou email
 * @author RIS
 */
fun intputEmail(){
    var email: String
    var emailCorrecte: Boolean = false

    do {
        email = readWord("Escriu el teu email:", "Email invàlid")
        emailCorrecte = validarEmail(email)

        if (!emailCorrecte) {
            println(RED + "ERROR: L'email que has escrit no és vàlid!" + RESET)
        }else{
            println(CYAN + "Gràcies, el teu email '$email' ha estat registrat correctament :)" + RESET)
        }
    }while (!emailCorrecte)
}

/**
 * Funció per fer input d'un String i un patró i comprovar si el text compleix exactament amb el patró donat
 */
fun provarRegexParametritzada() {
    var textInicial: String
    var regex: String
    var validarText: Boolean

    textInicial = readSentence("Escriu el text que vols validar:", "Input incorrecte!")
    regex = readWord("Escriu un patró d'expressió regular seguint les normes de regex:", "Entrada de dades incorrecte!")

    validarText = regexParametritzada(textInicial, regex)

    if (validarText){
        println(CYAN + "El text introduït '$textInicial' conté la regex '$regex' introduïda :)")
    }else{
        println(RED + "El text introduït '$textInicial' NO conté la regex '$regex' introduïda :(")
    }
}