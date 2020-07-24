package dongcode.bai10b;

class Knight extends Character {

    @Override
    public void fight() {
        System.out.println("Knight fight!");
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
        System.out.println("\tLoai nhan vat: Ki si");
        System.out.println("\tVu khi hien tai: " + w.weapon);
    }
}
