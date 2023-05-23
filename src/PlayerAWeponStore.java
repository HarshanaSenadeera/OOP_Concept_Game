import java.util.ArrayList;

public class PlayerAWeponStore {
    public static ArrayList<Integer> arrayList = new ArrayList();

    static int total;

    public static void setValue(int value) {
        arrayList.add(value);
        System.out.println(arrayList);

    }

    static int AplayerScore;

    public static int getAplayerScore() {

        for (int b: arrayList
        ) {

            total+=b;
        }
        return total;

    }

    }




