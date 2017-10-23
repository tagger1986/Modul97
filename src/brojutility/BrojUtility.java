/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brojutility;

/**
 *
 * @author JavaObuka
 */
public class BrojUtility {
   
   
    /**
     * @param args the command line arguments
     */
    public static int zbirneparnihCifara(int broj){
        String str= Integer.toString(broj);
        int zbir = 0;
        for (int i = 0; i < str.length(); i++) {
            if  (str.charAt(i) % 2 !=0)
            zbir +=Character.getNumericValue(str.charAt(i));
        }
        return zbir;
    }
            
    public static int modul97(String broj) {
        long br = Long.parseLong(broj.concat("00"));
        int kk = (int) (br % 97);
        return 98-kk;
      
    }
        public static String brojPomodul97(String broj) {
//        long br = Long.parseLong(broj.concat("00"));
//        int kk = (int) (br % 97);
        return modul97(broj)+ "-"+ broj; 
      
    }
    public static void main (String [] args){
        System.out.println(modul97("1245"));
         System.out.println(brojPomodul97("97548551545656"));
         System.out.println("Zbir cifara je "+ zbirneparnihCifara(1245));
    }
}
