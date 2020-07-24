package dongcode.bai10b;

class Queen extends Character {

    @Override
    public void fight() {
        System.out.println("Queen fight!");
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
        System.out.println("\tLoai nhan vat: Hau");
        System.out.println("\tVu khi hien tai: " + w.weapon);
    }
}