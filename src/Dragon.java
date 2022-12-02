public class Dragon {
    private int health;
    private int strength;
    private int level;
    private int totalAttack;
    private boolean dead;

    public Dragon()
    {
        health = 100;
        strength = 1;
        level = 1;
        totalAttack = 0;
        dead = false;
    }

    public void takeDamage(int damage)
    {
        health -= damage;
        if (dead)
        {
            dead = true;
            System.out.println("The dragon is already dead!");
        }
        else if (health<0)
        {
            dead = true;
            health = 0;
            System.out.println("The dragon has been slayed!");
        }
        else
        {
            System.out.println("The dragon takes " + damage + " damage and now has " + health + " health");
        }
    }

    public int attack()
    {
        int attack = strength*level;
        totalAttack += attack;
        if (totalAttack >= 50)
        {
            level++;
            System.out.println("“The dragon has reached level " + level + "!");
            totalAttack = 0;
        }
        System.out.println("The dragon attacks for " + attack + " health points!");
        return attack;
    }

    public void powerUp(int choice)
    {
        if (choice == 1)
        {
            health*=2;
            System.out.println("The dragon’s health has increased to " + health + "!");
        }
        else
        {
            strength *= 2;
            System.out.println("The dragon’s strength has increased to " + strength + "!");
        }
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public boolean isDead() {
        return dead;
    }

    public int getStrength() {
        return strength;
    }
    public String toString()
    {
        return "Dragon:\nStrength = " + strength + "\nHealth = " + health + "\nLevel = " + level + "\nDead = " + dead + "\nAttack Damage = " + totalAttack;
    }
}
