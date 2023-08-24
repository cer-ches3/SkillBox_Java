public class Main {
    public static void main(String[] args) {
        int vasyaAge = 29;
        int katyaAge = 14;
        int mishaAge = 36;

        int min = -1; //minimal age
        int middle = -1; //middle age
        int max = -1; //maximal age

        if (vasyaAge < katyaAge && vasyaAge < mishaAge){
            min = vasyaAge;
        }
        if (katyaAge < vasyaAge && katyaAge < mishaAge){
            min = katyaAge;
        }
        if (mishaAge < katyaAge && mishaAge < vasyaAge){
            min = mishaAge;
        }

        if (vasyaAge < katyaAge && vasyaAge > mishaAge ||
                vasyaAge > katyaAge && vasyaAge < mishaAge){
            middle = vasyaAge;
        }
        if (katyaAge < vasyaAge && katyaAge > mishaAge ||
                katyaAge > vasyaAge && katyaAge < mishaAge){
            middle = katyaAge;
        }
        if (mishaAge < katyaAge && mishaAge > vasyaAge ||
                mishaAge > katyaAge && mishaAge < vasyaAge){
            middle = mishaAge;
        }

        if (vasyaAge > katyaAge && vasyaAge > mishaAge){
            max = vasyaAge;
        }
        if (katyaAge > vasyaAge && katyaAge > mishaAge){
            max = katyaAge;
        }
        if (mishaAge > katyaAge && mishaAge > vasyaAge){
            max = mishaAge;
        }

        System.out.println("Minimal age: " + min + "\n" +
                "Middle age: " + middle + "\n" +
                "Maximal age: " + max);

    }
}
