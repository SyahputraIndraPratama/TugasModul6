package Stack;
public class TumpukanApp {
    public static void main (String [] args){
        Tumpukan tumpukan=new Tumpukan(10);
        tumpukan.push(50);
        tumpukan.baca();
        tumpukan.push(100);
        tumpukan.baca();
        tumpukan.pop();
        tumpukan.baca();
        tumpukan.push(60);
        tumpukan.baca();
        tumpukan.push(80);
        tumpukan.baca();
        tumpukan.pop();
        tumpukan.baca();
        long nilaitop= tumpukan.pop();
        System.out.println("nilaitop = "+nilaitop);
        System.out.println(" ");
    } 
}