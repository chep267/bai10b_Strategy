package dongcode.bai10b;

abstract class WeaponBehavior {

    String weapon;
    abstract void useWeapon();
}

class SwordBehavior extends WeaponBehavior {

    void useWeapon() {
        weapon = "sword";
    }
}

class AxeBehavior extends WeaponBehavior {

    void useWeapon() {
        weapon = "axe";
    }
}

class KnifeBehavior extends WeaponBehavior {

    void useWeapon() {
        weapon = "knife";
    }
}

class ClubBehavior extends WeaponBehavior {

    public void useWeapon() {
        weapon = "club";
    }
}