
interface Aa
{
    void think();
}

class Bb implements Aa{

    @Override
    public void think() {
        System.out.println("Implementation Class");
    }
}
public class Anonymous {
    public static void main(String[] args) {
        Aa a = new Aa(){
            @Override
            public void think() {
                System.out.println("Anonymous Class");
            }
        };
        a.think();

        Bb b = new Bb();
        b.think();
    }
}
