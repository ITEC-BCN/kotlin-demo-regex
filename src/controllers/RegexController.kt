package controllers

/**
 * Funció per comprovar que un text rebut conté només letres minúscules
 * @author RIS
 * @param text rebut
 * @return True si el text rebut conté només lletres en minúscules, false en cas contrari
 */
fun regexLletres(text: String): Boolean{
    var validacioText: Boolean = false
    val regex: Regex = Regex("[a-z]+")  // Només lletres minúscules

    validacioText = text.matches(regex)
    return validacioText
}

/**
 * Comprovar que el text rebut conté exactament res dígits ni més ni menys
 * @author RIS
 * @param text rebut per validar
 * @return Retorna true si el text rebut conté exactament només tres dígits numèrics; false en cas contrari
 */
fun conteTresDigits(text: String): Boolean{
    var validacioText: Boolean = false
    val regex: Regex = "[0-9]{3}".toRegex()  // El text rebut conté exactament tres dígits numèrics ni més ni menys

    validacioText = text.matches(regex)

    return validacioText
}

/**
 * Comprovar que un text rebut per paràmetre conté almenys un dígit numèric
 * @author RIS
 * @param text rebut
 * @return Retorna true si troba algun dígit enter i false en cas contrari
 */
fun conteDigits(text: String): Boolean{
    var validacioText: Boolean = false
    validacioText = text.contains("\\d+".toRegex()) // Busca números sense importar quants -> d en Regex es refereix a dígits numèrics.

    return validacioText
}

/**
 * Funció que rep dos paràmetres de tipus String i permet validar el text inicial segons el patró regex rebut.
 * Exemple: text = 123, patró = [0-9]{3}, retorn = true
 * @author RIS
 * @param text rebut per validar
 * @param patro per usar com a regex
 * @return Retorna true si el text rebut conté el patró a buscar; false en cas contrari
 */
fun regexParametritzada(text: String, patro: String): Boolean{
    var validacioText: Boolean = false
    var regex: Regex = Regex(patro)
    validacioText = text.matches(regex)
    return validacioText
}

/**
 * Funció per extreure els números d'un text rebut
 * @author RIS
 * @para text rebut per paràmetre
 * @return String
 */
fun extreureDigits(text: String): String{
    val digitsText: Sequence<MatchResult> = "\\d+".toRegex().findAll(text)
    return digitsText.toString()
}

/**
 * Retorna true si l'email compleix amb el patró
 * @author RIS
 * @param email rebut
 * @return Boolean
 */
fun validarEmail(email: String): Boolean{
    var emailCorrecte: Boolean = false
    // Definim l'expressió regular Regex que ens permet validar un email per saber si té format correcte
    val emailRegex: Regex = Regex("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")

    emailCorrecte = email.matches(emailRegex)
    return emailCorrecte
}

/**
 * A partir d'un text i un caràcter rebuts per paràmetre, partim el text pel caràcter
 * @author RIS
 * @param text inicial rebut
 * @param c caràcter pel qual partir el text
 * @return List<String>
 */
fun partirTextPerCaracter(text: String, c: Char): List<String>{
    val parts: List<String> = text.split("[$c]".toRegex()) // Usem com a separador el caràcter c rebut
    return parts // Retornem una llista de Strings amb els trossos
}

/**
 * Substitueix números pel contingut del paràmetre rebut c
 * @author RIS
 * @param text Text inicial
 * @param c Caràcter a posar
 * @return String
 */
fun substituirDigitsPerCaracter(text: String, c: Char): String{
    val textSubstituit: String = text.replace("\\d".toRegex(), "$c")
    return textSubstituit
}