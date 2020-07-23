package dongcode.bai10b;

public class Test {

    public static void main(String[] args) {

        Character k = new King();
        System.out.print("\nNhan vat King: ");
        WeaponBehavior sword = new SwordBehavior();
        sword.useWeapon();
        k.setWeapon(sword);

        try {
            k.in();
        } catch (NullPointerException e) {
            System.out.println("loi ne" );
        }


    }
}