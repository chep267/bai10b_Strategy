package dongcode.bai10b;

class Queen extends Character{


    @Override
    public void fight() {
        System.out.print("\nQueen fight!");
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
        System.out.print("\n\tLoai nhan vat: Hau");
        System.out.print("\n\tVu khi hien tai: "+ w.weapon);
    }
}