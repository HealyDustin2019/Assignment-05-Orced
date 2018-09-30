public class Orced {
   public static void main(String[] args){
       //maxSkill designated as 30 instead of 50 to account for ten point minimum allotment of skillpoints to both strength and agility
       int maxSkill = 30;
       int minSkill = 10;
       int skillRange = maxSkill - minSkill;
       //strength variable equal to randomly generated number between 10 & 30
       int strength = (int) (Math.random() * skillRange) + minSkill;
       maxSkill = 50 - strength - minSkill;
       skillRange = maxSkill - minSkill;
       int agility = (int) (Math.random() * skillRange) + minSkill;
       int intelligence = 50 - strength - agility;
       int baseDamage = 5 * intelligence;
       int orcHealth = 1000;
       double moddedDamage;
       for (int i = 0; i <= 10; i++) {
           moddedDamage = baseDamage * (Math.random() * (1.5 - .5) + .5);
           orcHealth -= moddedDamage;
               if (orcHealth <= 0){
                   i = 11;
                   System.out.println("You have defeated the orc!");
               }
               if (i == 10 && !(orcHealth <= 0)){
                   System.out.println("You are dead.");
               }
    }
  }
}
//To achieve a minimum win rate of greater than 60% with a random damage modifier between .5 & 1.5, the player's intelligence level must be at least 19.
//For a mage with level 10 intelligence, the base damage of magic missile would need to be 10 in order to maintain win rate of above 60%.
//Data gathered by running the battle in a for loop with a flag variable which increased in value everytime variable orcHealth was less than or equal to 0
/*
	   int orcHealth;
	   int playerWins = 0;
       for(int i = 0; i <= 1000000; i++) {
           orcHealth = 1000;
           for (int j = 0; j <= 10; j++) {
               moddedDamage = baseDamage * (Math.random() * (1.5 - .5) + .5);
               orcHealth -= moddedDamage;
               if (orcHealth <= 0){
                   j = 11;
                   playerWins++;
               }
           }
       }
       System.out.println(playerWins);
 */
