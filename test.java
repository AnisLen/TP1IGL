
import org.junit.Test ;
import org.junit.*;

import static org.junit.Assert.*;


/**
 * Created by anis on 12/10/17.
 */

public class MainTest {

    @Test
    public void testTrie1() {
        System.out.println("trie");
        int[] vect = {1,2,3,4};
        int[] expResult = {4,3,2,1};
        VectorHelper instance = new VectorHelper();
        instance.trie(vect);
        assertArrayEquals(expResult,vect);    
        
    }
     /**
     * Test of inverser method, of class VectorHelper.le cas de vecteur null
     */
    
     @Test
    public void testTrie2() {
        System.out.println("trie");
        int[] vect = null;
        int[] expResult = null;
        VectorHelper instance = new VectorHelper();
        instance.trie(vect);
        assertArrayEquals(expResult,vect);
        
        
        
    }

    /**
     * Test of somme method, of class VectorHelper.le cas de marche
     */
    @Test
    public void testSomme1() throws Exception {
        System.out.println("somme");
        int[] m = {1,2,3};
        int[] n = {1,2,3};
        VectorHelper instance = new VectorHelper();
        int[] expResult = {2,4,6};
        int[] result = instance.somme(m, n);
        
        assertArrayEquals(expResult, result);
       
      
    }
     /**
     * Test of inverser method, of class VectorHelper.le cas de vecteur null
     */
    
  @Test
    public void testSomme2() throws Exception {
        System.out.println("somme");
        int[] m = null;
        int[] n = {1,2,3};
        VectorHelper instance = new VectorHelper();
        int[] expResult = null;
        int[] result = instance.somme(m, n);
        
        assertArrayEquals(expResult, result);  
    }
    
     /**
     * Test of inverser method, of class VectorHelper.le cas de deux vecteurs de tailles différentes
     */
    
    
    @Test
    public void testSomme3() throws Exception {
        System.out.println("somme");
        int[] m = {1,2,3,4};
        int[] n = {1,2,3};
        VectorHelper instance = new VectorHelper();
         try{
        int[] result = instance.somme(m, n);
         }
         catch(Exception e){
             System.err.println("les deux tableau ont des tailles différentes");
         }
    
    }
    
    /**
     * Test of MaxMin method, of class VectorHelper.le cas de marche
     */
    @Test
    public void testMaxMin1() {
        System.out.println("MaxMin");
        int[] vect = {1,2,5};
        VectorHelper instance = new VectorHelper();
        int[] expResult = {5,1};
        int[] result = instance.MaxMin(vect);
        assertArrayEquals(expResult, result);
        
    }
    /**
     * Test of inverser method, of class VectorHelper.le cas de vecteur null
     */

     @Test
    public void testMaxMin2() {
        System.out.println("MaxMin");
        int[] vect = null;
        VectorHelper instance = new VectorHelper();
        int[] expResult = null;
        int[] result = instance.MaxMin(vect);
        assertArrayEquals(expResult, result);
        
    }
    /**
     * Test of inverser method, of class VectorHelper.le cas de marche
     */
    @Test
    public void testInverser1() {
        System.out.println("inverser");
        int[] tab = {1,2,4,6};
        VectorHelper instance = new VectorHelper();
        int[] expResult = {6,4,2,1};
        int[] result = instance.inverser(tab);
        assertArrayEquals(expResult, result);
       
    }
    
    /**
     * Test of inverser method, of class VectorHelper.le cas de vecteur null
     */
@Test
    public void testInverser2() {
        System.out.println("inverser");
        int[] tab = null;
        VectorHelper instance = new VectorHelper();
        int[] expResult = null;
        int[] result = instance.inverser(tab);
        assertArrayEquals(expResult, result);
       
    }


    @Test
    public void TestFourmule() {

    }

    @Test
    public void TestApp()  {
    }

    @Test
    public void TestMain()  {
    }



}
