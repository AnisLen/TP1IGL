


class VectorHelper {

   /**
    * <p> trie sert à trier les éléments d’un vecteur  .
    *
    * <p> example : <h2> new VectorHelper().trie(vect);</h2> 
     * @param vect vecteur dont on veut trier les élements de vecteur
 */ 
    public void trie (int[] vect)
    {
       if (vect!=null)  
       {      
        for (int i =0 ; i < vect.length-1; i++ ){
            for (int j=i+1; j<vect.length; j++){
                if (vect[j]>vect[i]) {
                    int val = vect[i];
                    vect[i]=vect[j];
                    vect[j]=val;
                }
            }
         }
        }
    }
    
 /**
    * <p> somme sert à Sommer deux vecteurs. Elle doit générer une exception si les deux vecteurs ont des tailles différentes.
    * 
    * <p> example : <h2> vect= new VectorHelper().somme(vect1, vect2);</h2>
     * @param m premier vecteur d'entiers
     * @param n deuxieme vecteur d'entier
    * @return int[] vecteut contient la somme de deux vecteurs
     * @throws java.lang.Exception si les deux vecteurs ont des tailles diférentes
  */  
    public int[] somme( int [] m , int [] n ) throws Exception
    {
        if(m==null || n==null) return null;
        if (m.length!=n.length) throw new Exception("les deux tableau ont des tailles différentes");
        int[]tab = new int[m.length];
        for (int i=0; i<m.length; i++) tab[i]=m[i]+n[i];
        return tab;
    } 
    
    
 /**
     * MaxMin sert à Obtenir simultanément le minimum et le maximum d’un vecteur.
     * 
     * <p> example : <h2> System.out.println("max= " + new VectorHelper().MaxMin(vect)[0]); </h2>
     * <p> <h2> System.out.println("min =" +new VectorHelper().MaxMin(vect)[1]);
     * @param vect vecteur dont on cherche le maximum et le minimum </h2>
     * 
     * @return int[] vecteur dont la premiere case contient le maximum et la deuxième case contient le minimum
 */
    public int[] MaxMin ( int[] vect){
        if (vect==null) return null;
        int max = vect[0];
        int min = vect[0];
        for(int i= 1;i<vect.length;i++){
            if (vect[i]>max) max = vect[i];
            if (vect[i]<min) min = vect[i];
        }
        int [] tab = new int[2];
        tab[0]= max;
        tab[1]= min;
        return tab;
    }
    
    /**
     * inverser sert à Inverser les éléments d’un vecteur.
     * 
     * <p> example : <h2> for(int i = 0 ; i inf a.length ; i ++) {
     *                       System.out.println(new VectorHelper().inverser(a)[i]);
     *                          } </h2>
     * 
     * @param tab vecteur dont on veut inverser les élémentens d'un vecteur
     * 
     * @return int[] vecteur inversé
 */
    




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
 /**
     * formule sert à décrire l'operation sur un opérant.
     * 
     * 
     * @param a l'opérant
     * 
     * 
 */

    public void fourmule(int a) {
        // enter your algorithm here ...
    }

/**
     * app sert à appliquer une formule mathématique sur tous les élements d’un vecteur.
     * 
     * 
     * @param tab vecteur dont on veut appliquer la formule de tous ses élements 
    *
 */




    public void app(int tab[]) {

        for (int i = 0; i < tab.length; i++) {

            fourmule(tab[i]);

        }

    }

}




 /**
     *
     * @param args main
     * @throws Exception exception
     * 
     */
                
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
      
        VectorHelper instance = new VectorHelper();
        
        int [] vect = {1,2,3,4} ;
       
       
        
         instance.trie(vect);
         
         for(int i = 0 ; i< vect.length; i++){
             System.out.print(vect[i]+"  ");
         }
        
        System.out.println("");
        
        vect= instance.somme(vect, vect);
        
        for(int i = 0 ; i< vect.length; i++){
             System.out.print(vect[i]+"  ");
         }
        
         System.out.println("");
         System.out.println("max = " + instance.MaxMin(vect)[0] + "  min " +instance.MaxMin(vect)[1]);
     
                    int a [] = {1,2,3,4,5,6,7} ;
                        for(int i = 0 ; i<a.length ; i ++) {
                                System.out.println(instance.inverser(a)[i]);

                        }
    
    }
    
}
