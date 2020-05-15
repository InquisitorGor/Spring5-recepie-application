package guru.springframework.recepieapplication.knowledgereinforcement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class TestingClassTest {

    @Mock
    NegativeConverter negativeConverter;

    ValueRepositoryImpl valueRepositoryImpl;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        valueRepositoryImpl = new ValueRepositoryImpl(negativeConverter);
    }

    @Test
    void getValue() {
        int doubleTemp = 100;
        when(negativeConverter.getNegative(5)).thenReturn(doubleTemp);
        int temp = valueRepositoryImpl.getValue(5);
        int temp1 = valueRepositoryImpl.getValue(6);
        int temp2 = valueRepositoryImpl.getValue(-6);


    }
}