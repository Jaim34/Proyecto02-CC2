import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void providesExpectedGreeting() {
        assertEquals("¡Hola, Ciencias de Computación 2!", App.getMessage());
    }
}
