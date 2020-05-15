package guru.springframework.recepieapplication.knowledgereinforcement;

public class NegativeConverterImpl implements NegativeConverter {
    @Override
    public int getNegative(int a) {
        return -a;
    }
}
