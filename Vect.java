


class VectorHelper {

   


    public  int[] inverser(int tab[]) {
        if (tab != null) {
            int[] temp = new int[tab.length];
            int j = 0;

            for (int i = tab.length - 1; i >= 0; i--) {
                temp[j] = tab[i];
                j++;
            }

            return temp;
        } else {
            return null;
        }

    }


    public void fourmule(int a) {
        // enter your algorithm here ...
    }






    public void app(int tab[]) {

        for (int i = 0; i < tab.length; i++) {

            fourmule(tab[i]);

        }

    }

}

public class Main {

                public static void main(String[] args) throws Exception {

                        int a [] = {1,2,3,4,5,6,7} ;
                        for(int i = 0 ; i<a.length ; i ++) {
                            System.out.println(new VectorHelper().inverser(a)[i]);

                        }
                }

        }

