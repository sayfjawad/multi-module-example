package nl.multicode.app;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExampleAppTest {

    @Test
    void contextLoads() {

        assertThat(true).isTrue();
    }
}
