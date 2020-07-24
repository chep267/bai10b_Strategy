package dongcode.bai10b;

class King extends Character {

    @Override
    public void fight() {
        System.out.println("King fight!");
    }


    @Override
    String getWeapon(){
        return w.weapon;
    }

    @Override
    void setWeapon(WeaponBehavior a) {
        w = a;
    }

    @Override
    public void in() {
        System.out.println("\tLoai nhan vat: Vua");
        System.out.println("\tVu khi hien tai: " + w.weapon);
    }
}