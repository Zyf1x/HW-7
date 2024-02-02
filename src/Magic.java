class Magic extends Hero {
    Magic() {
        super(100, 20, "Магическая сила");
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность Магическая сила");
    }
}
