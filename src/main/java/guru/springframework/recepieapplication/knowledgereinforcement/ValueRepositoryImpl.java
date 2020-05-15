package guru.springframework.recepieapplication.knowledgereinforcement;

public class ValueRepositoryImpl implements ValueRepository {

    private NegativeConverter negativeConverter;

    public ValueRepositoryImpl(NegativeConverter negativeConverter) {
        this.negativeConverter = negativeConverter;
    }

    @Override
    public int getValue(int a) {
        return a * negativeConverter.getNegative(a);
    }

    @Override
    public int getDoubleValue(int a) {
        return a * a;
    }

    @Override
    public int getTripleValue(int a) {
        return a * a * a;
    }
}
