package io.eroshenkoam.assertj;

import org.junit.Test;

import static io.eroshenkoam.assertj.Assertions.assertThat;

/**
 * @author Artem Eroshenko
 */
public final class DataTest {

    @Test
    public void nestedClassFromJarClassPathShouldBeProccessed() {
        Data.NestedClass nested = new Data.NestedClass();
        assertThat(nested).hasName(null);
    }
}
