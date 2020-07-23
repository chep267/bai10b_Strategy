package dongcode.bai10b;


abstract class Character {

    WeaponBehavior w;

    abstract void fight();

   // abstract void weapon(WeaponBehavior a);

    abstract String getWeapon();

    abstract void setWeapon(WeaponBehavior w);

    abstract void in();
}
