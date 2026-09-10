package biblioteca.service

import biblioteca.data.Library
import biblioteca.model.Book

/**
 * Onde moram as regras da biblioteca.
 *
 * Nada aqui dentro imprime na tela nem lê do teclado
 * Esta classe recebe perguntas e devolve dados. Quem conversa com o usuário é a camada de `cli`.
 */
class LibraryService(private val library: Library) {

    /**
     * O acervo inteiro, na ordem em que está cadastrado.
     */
    fun catalog(): List<Book> = library.books

    // TODO (Tarefa 1): quantos exemplares deste título estão livres agora?

    // TODO (Tarefa 2): busca por título, autor ou gênero.

    // TODO (Tarefa 3): emprestar e devolver, com as regras do enunciado.

    // TODO (Tarefa 4): o que um membro tem em mãos, e o que está atrasado.
}
