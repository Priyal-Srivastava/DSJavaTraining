public class ArrayDemo {
    public static void main(String[] args) {
        String[] friends = {"Priyal", "Ram", "Sita", "Geeta"};

//        friends[1] = "rama";
//        for (int i = 0; i < friends.length; i++){
//            System.out.println(friends[i]);
//        }

        // for each loop
        for(String a : friends){
            System.out.println(a);
        }
    }
}
