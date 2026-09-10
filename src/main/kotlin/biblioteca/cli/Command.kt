package biblioteca.cli

/**
 * Uma linha digitada no terminal, já quebrada em nome e argumentos.
 *
 * `emprestar 1 3` vira `Command("emprestar", listOf("1", "3"))`.
 */
data class Command(
    val name: String,
    val arguments: List<String>,
) {

    fun argument(index: Int): String? = arguments.getOrNull(index)

    companion object {

        /** Devolve `null` quando a linha está em branco. */
        fun parse(line: String): Command? {
            val parts = line.trim().split(Regex("\\s+")).filter { it.isNotEmpty() }
            if (parts.isEmpty()) return null
            return Command(parts.first().lowercase(), parts.drop(1))
        }
    }
}
