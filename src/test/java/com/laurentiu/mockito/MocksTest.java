package com.laurentiu.mockito;

import com.laurentiu.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MocksTest {
    @Mock
    private Calculator mockCalculator;

    @Test
    public void whenAdd_thenReturnOk() {
        when(mockCalculator.add(eq(1), eq(3)))
                .thenReturn(123);

        int actual = mockCalculator.add(1, 3);

        assertEquals(123, actual);

        verify(mockCalculator).add(anyInt(), anyInt());

    }

    @Test
    public void whenAnotherAdd_thenReturnOk() {
        when(mockCalculator.add(anyInt(), anyInt()))
                .thenReturn(456);

        int actual = mockCalculator.add(4, 5);

        assertEquals(456, actual);

        verify(mockCalculator, times(1))
                .add(4, 5);
    }
}

