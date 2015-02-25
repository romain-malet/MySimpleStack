package dcll.rmal;

/**
 * Created by 21408607 on 25/02/2015.
 */
public class Item {

    private static int number = 0;
    private int num;
    private String name;

    public Item() {
        num = number;
        name = "name"+num;
        number++;
    }
}
