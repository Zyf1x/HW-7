class Warrior extends Hero {
    Warrior() {
        super(150, 30, "Критический урон");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность Критический урон");
    }
}
