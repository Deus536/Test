import java.util.ArrayList;
import java.util.List;

public class PhoneStorage {
    private List<String> numbers;

    public PhoneStorage(String number) {
        this.numbers = new ArrayList<>();
        this.numbers.add(number);
    }

    public List<String> getNumbers() {
        return numbers;
    }
}
