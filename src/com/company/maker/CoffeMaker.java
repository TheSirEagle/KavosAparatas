package com.company.maker;

public class CoffeMaker {


    public static final int MAX_USES = 5;
    private float sugarAmount;
    private float waterAmount;
    private float beansAmount;
    private int useCount;


    public CoffeMaker() {
    }

    public CoffeMaker(float water, float sugar, float beans) {
        waterAmount = water;
        sugarAmount = sugar;
        beansAmount = beans;
    }


    public void fillProducts(float water, float sugar, float beans) {
        waterAmount += water;
        sugarAmount += sugar;
        beansAmount += beans;
    }


    public void makeCoffe(String coffeType) {

        StringBuilder builder = new StringBuilder("");
        switch (coffeType) {
            case "black":
                sugarAmount -= 10;
                beansAmount -= 20;
                waterAmount -= 0.25f;
                builder.append("                        (\n");
                builder.append("                          )     (\n");
                builder.append("                   ___...(-------)-....___\n");
                builder.append("               .-\"\"       )    (          \"\"-.\n");
                builder.append("         .-'``'|-._             )         _.-|\n");
                builder.append("        /  .--.|   `\"\"---...........---\"\"`   |\n");
                builder.append("       /  /    |                             |\n");
                builder.append("       |  |    |                             |\n");
                builder.append("        \\  \\   |                             |\n");
                builder.append("         `\\ `\\ |                             |\n");
                builder.append("           `\\ `|                             |\n");
                builder.append("           _/ /\\                             /\n");
                builder.append("          (__/  \\                           /\n");
                builder.append("       _..---\"\"` \\                         /`\"\"---.._\n");
                builder.append("    .-'           \\                       /          '-.\n");
                builder.append("   :               `-.__             __.-'              :\n");
                builder.append("   :                  ) \"\"---...---\"\" (                 :\n");
                builder.append("    '._               `\"--...___...--\"`              _.'\n");
                builder.append("      \\\"\"--..__                              __..--\"\"/\n");
                builder.append("       '._     \"\"\"----.....______.....----\"\"\"     _.'\n");
                builder.append("          `\"\"--..,,_____            _____,,..--\"\"`\n");
                builder.append("                        `\"\"\"----\"\"\"`");

                break;
            case "latte":
                sugarAmount -= 20;
                beansAmount -= 40;
                waterAmount -= 0.33f;

                builder.append("\n");
                builder.append("         {\n");
                builder.append("      {   }\n");
                builder.append("       }_{ __{\n");
                builder.append("    .-{   }   }-.\n");
                builder.append("   (   }     {   )\n");
                builder.append("   |`-.._____..-'|\n");
                builder.append("   |             ;--.\n");
                builder.append("   |            (__  \\\n");
                builder.append("   |             | )  )\n");
                builder.append("   |             |/  /\n");
                builder.append("   |             /  / \n");
                builder.append("   |            (  /\n");
                builder.append("   \\             y'\n");
                builder.append("    `-.._____..-'");
                break;
            case "espresso":
                sugarAmount -= 10;
                beansAmount -= 40;
                waterAmount -= 0.1f;
                builder.append("  .-=-.\n");
                builder.append(" ,|`~'|\n");
                builder.append(" `|   | \n");
                builder.append("   `~'");
                break;
        }
        if(!builder.equals("")) {
            System.out.println(builder.toString());
            useCount++;
            sugarAmount = Math.max(sugarAmount, 0);
            waterAmount = Math.max(waterAmount, 0);
            beansAmount = Math.max(beansAmount, 0);
        }
    }


    public void washMaker() {
        this.useCount = 0;
    }


    public boolean isReady() {

        boolean result = true;
        if (useCount >= MAX_USES) {
            result = false;
            System.out.println("Reikia plauti");
        }
        if (waterAmount <= 0) {
            result = false;
            System.out.println("Truksta vandens");
        }
        if (sugarAmount <= 0) {
            result = false;
            System.out.println("Truksta cukraus");
        }
        if (beansAmount <= 0) {
            result = false;
            System.out.println("Truksta pupeliu");
        }

        return result;
    }


    public void showProducts() {
        System.out.println("=========Product status=========");
        System.out.println("Sugar amount left:" + sugarAmount);
        System.out.println("Water amount left:" + waterAmount);
        System.out.println("Beans amount left:" + beansAmount);

    }


    public void showStatus() {
        System.out.println("=========Maker status============");
        System.out.println("Usages left:" + (MAX_USES - this.useCount));
        System.out.println("is machine ready:" + isReady());
        this.showProducts();
    }


    public float getWater() {
        return this.waterAmount;
    }


    public void setWater(float value) {
        this.waterAmount = value;
    }


    public float getBeans() {
        return this.beansAmount;
    }


    public void setBeans(float value) {
        this.beansAmount = value;
    }


    public float getSugar() {
        return this.sugarAmount;
    }


    public void setSugar(float value) {
        this.sugarAmount = value;
    }


}