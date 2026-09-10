package biblioteca

import biblioteca.cli.Command
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

/**
 * Teste de exemplo — serve de modelo caso você escreva os seus (é bônus).
 */
class CommandTest {

    @Test
    fun `quebra a linha em nome e argumentos`() {
        val command = Command.parse("emprestar 1 3")

        assertEquals("emprestar", command?.name)
        assertEquals(listOf("1", "3"), command?.arguments)
    }

    @Test
    fun `ignora espaços sobrando e caixa alta`() {
        val command = Command.parse("   LISTAR   ")

        assertEquals("listar", command?.name)
        assertEquals(emptyList(), command?.arguments)
    }

    @Test
    fun `devolve nulo quando a linha está em branco`() {
        assertNull(Command.parse("    "))
    }
}
