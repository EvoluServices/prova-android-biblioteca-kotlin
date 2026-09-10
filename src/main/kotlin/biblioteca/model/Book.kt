package biblioteca.model

/**
 * Um título do acervo.
 *
 * @param copies é a quantidade de exemplares físicos que a biblioteca possui.
 */
data class Book(
    val id: Int,
    val title: String,
    val author: String,
    val genre: String,
    val copies: Int,
)
