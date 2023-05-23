import java.util.ArrayList;

public class PlayerBWeaponStore {

       public static ArrayList<Integer> arrayList = new ArrayList();

        static int total;

        public static void setValue(int value) {
            arrayList.add(value);
            System.out.println(arrayList);

        }

        static int BplayerScore;

        public static int getBplayerScore() {

            for (int b: arrayList
            ) {

                total+=b;
            }
            return total;

        }
    }



