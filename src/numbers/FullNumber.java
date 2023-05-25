package numbers;

import utils.Categories;

import java.util.HashMap;
import java.util.Map;

public class FullNumber {
    private final Map<Categories, ThreeDigitsNumber> fullNumber;

    public FullNumber() {
        fullNumber = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Number{" +
                "digits=" + fullNumber +
                '}';
    }

    public void addTreeDigitsNumber(Categories category, ThreeDigitsNumber threeDigitsNumber) {
        fullNumber.put(category, threeDigitsNumber);
    }

    public ThreeDigitsNumber getOnes(){
        return fullNumber.get(Categories.ONES);
    }

    public ThreeDigitsNumber getThousands(){
        return fullNumber.get(Categories.THOUSANDS);
    }

    public ThreeDigitsNumber getMillions(){
        return fullNumber.get(Categories.MILLIONS);
    }

    public ThreeDigitsNumber getBillions(){
        return fullNumber.get(Categories.BILLIONS);
    }

}
