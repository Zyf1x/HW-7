class Medic extends Hero {
    int healPoints;

    Medic() {
        super(120, 15, "Лечение");
        this.healPoints = 50;
    }

    public void increaseExperience() {
        healPoints += healPoints * 0.1;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность Лечение");
    }
}
