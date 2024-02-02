abstract class Hero implements HavingSuperAbility {
    int health;
    int damage;
    String superAbilityType;

    Hero(int health, int damage, String superAbilityType) {
        this.health = health;
        this.damage = damage;
        this.superAbilityType = superAbilityType;
    }

    public void applySuperAbility() {
        System.out.println(superAbilityType + " применил суперспособность");
    }
}
