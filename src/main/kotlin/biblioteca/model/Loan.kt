package biblioteca.model

import java.time.LocalDate

/**
 * Um empréstimo.
 *
 * Vem com o mínimo: quem pegou, o que pegou e quando. Se precisar de mais
 * informação para resolver as tarefas, sinta-se livre para mudar este tipo.
 */
data class Loan(
    val bookId: Int,
    val memberId: Int,
    val borrowedAt: LocalDate,
)
