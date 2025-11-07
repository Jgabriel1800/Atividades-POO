package atividade7;

public class Clowns extends Picasso {

    public static void main(String[] args) {
        
        i[] i = new i[3];
        i[0] = new Acts();
        i[1] = new Clowns();
        i[2] = new Of76(); 

        for (int x = 0; x < 3; x++) {
            System.out.println(
                i[x].iMethod0() + " " + i[x].getClass()
            );
        }
    }
}