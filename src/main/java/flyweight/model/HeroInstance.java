package flyweight.model;

public class HeroInstance {
    private HeroAttributes atributes;
    private int currentHealth;
    private int currentMana;

    public HeroInstance(HeroAttributes atributes, int currentHealth, int currentMana) {
        this.atributes = atributes;
        this.currentHealth = currentHealth;
        this.currentMana = currentMana;
    }


    public void showStatus(){
        System.out.println(atributes.toString() + " | Vida actual " + + currentHealth + " | Mana actual " + currentMana);
    }

    public void castSpell(int manaCost){
        if (currentMana >= manaCost){
            currentMana -= manaCost;
            System.out.println(atributes.getName() +  " ha lanzado un hechizo, coste: " + currentMana);
        }else{
            System.out.println(atributes.getName() + " no tiene suficiente mana.");
        }
    }
}
