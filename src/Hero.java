class Hero {
    private int health;
    private int damage;
    private String name;
    private String superpower;
    public Hero(String name, int health, int damage, String superpower) {
        this.health = health;
        this.damage = damage;
        this.name = name;
        this.superpower = superpower;

    }
    public String getName (){
        return name;
    }
    public int getHealth(){
        return health;
    }
    public int getDamage(){
        return damage;
    }
    public String getSuperpower(){

        return superpower;
    }
}
