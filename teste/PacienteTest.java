package teste;



import static org.junit.Assert.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * A classe de teste PacienteTest.
 *
 * @author  (seu nome)
 * @version (um número da versão ou uma data)
 */
public class PacienteTest
{
    /**
     * Construtor default para a classe de teste PacienteTest
     */
    public PacienteTest()
    {
    }

    /**
     * Define a 'fixture' do teste.
     *
     * Chamado antes de cada método de caso de teste.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Desfaz a 'fixture' do teste.
     *
     * Chamado após cada método de teste de caso.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testName()
    {
        teste.Paciente paciente1 = new teste.Paciente();
        paciente1.setNome("Fred");
        
        assertEquals("Fred", paciente1.getNome());
    }
}

