package utils;

public class TestMethodeStatic {
    public static void main(String[] args) {
        int a = (int)(Math.random()*100);
        int b = (int)(Math.random()*100);

        String chaine = "54";


        int chaineInt=Integer.parseInt(chaine);
        int max = Integer.max(a,b);
        System.out.println("chaine = "+ chaine+"\n a= "+a+" b = "+b+" max ab = "+max);
    }
}
