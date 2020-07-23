package dongcode.bai10b;

class King extends Character{


    @Override
    public void fight() {
        System.out.print("\nKing fight!");
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
        System.out.print("\n\tLoai nhan vat: Vua");
        System.out.print("\n\tVu khi hien tai: "+ w.weapon);
    }
}