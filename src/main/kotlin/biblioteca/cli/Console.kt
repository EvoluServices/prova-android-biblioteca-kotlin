package biblioteca.cli

/**
 * Tudo que o programa escreve na tela passa por aqui.
 *
 * Ao implementar os comandos novos, chame estas funções em vez de usar `println`
 * direto.
 */
object Console {

    fun title(text: String) {
        println()
        println(text.uppercase())
        println("-".repeat(text.length))
    }

    fun info(text: String) {
        println(text)
    }

    fun error(text: String) {
        println("erro: $text")
    }

    fun blank() {
        println()
    }

    /**
     * Imprime uma tabela alinhando as colunas pela maior célula de cada uma.
     */
    fun table(headers: List<String>, rows: List<List<String>>) {
        if (rows.isEmpty()) {
            info("(nada para mostrar)")
            return
        }

        val widths = headers.indices.map { column ->
            (rows.map { it[column] } + headers[column]).maxOf { it.length }
        }

        println(headers.pad(widths))
        println(widths.joinToString("  ") { "-".repeat(it) })
        rows.forEach { println(it.pad(widths)) }
    }

    private fun List<String>.pad(widths: List<Int>): String =
        mapIndexed { index, cell -> cell.padEnd(widths[index]) }
            .joinToString("  ")
            .trimEnd()
}
