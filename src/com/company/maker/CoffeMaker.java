package com.company.maker;

import java.io.FileWriter;
import java.io.IOException;

public class CoffeMaker {

    private static CoffeMaker firstInstance = null;

    private CoffeMaker(){}

    public static CoffeMaker getInstance(){
        if (firstInstance == null){
            firstInstance = new CoffeMaker();
        }
    }


    public static final int MAX_USES = 5;
    private float sugarAmount;
    private float waterAmount;
    private float beansAmount;
    private int useCount;



    private CoffeMaker(float water, float sugar, float beans) {
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
        if (!builder.equals("")) {
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
        StringBuilder builder2 = new StringBuilder("");
        builder2.append("=========Product status=========" + "\n");
        builder2.append("Sugar amount left:" + sugarAmount + "\n");
        builder2.append("Water amount left:" + waterAmount + "\n");
        builder2.append("Beans amount left:" + beansAmount);
        if (!builder2.equals("")) {
            System.out.println(builder2.toString());
            useCount++;
        }
        String a = builder2.toString();
//        System.out.println("=========Product status=========");
//        System.out.println("Sugar amount left:" + sugarAmount);
//        System.out.println("Water amount left:" + waterAmount);
//        System.out.println("Beans amount left:" + beansAmount);

    }


    public void showStatus() {
        StringBuilder builder1 = new StringBuilder("");
        builder1.append("=========Maker status============" + "\n");
        builder1.append("Usages left:" + (MAX_USES - this.useCount) + "\n");
        builder1.append("is machine ready:" + isReady());
        if (!builder1.equals("")) {
            System.out.println(builder1.toString());
            useCount++;
        }
        this.showProducts();

        String b = builder1.toString();

    }

    public void ivesk() {

        StringBuilder builder1 = new StringBuilder("");
        builder1.append("=========Product status=========");
        builder1.append("\n");
        builder1.append("Sugar amount left:");
        builder1.append(sugarAmount);
        builder1.append("\n");
        builder1.append("Water amount left:");
        builder1.append(waterAmount);
        builder1.append("\n");
        builder1.append("Beans amount left:");
        builder1.append(beansAmount);
        builder1.append("\n");
        builder1.append("=========Maker status============");
        builder1.append("\n");
        builder1.append("Usages left:");
        builder1.append(MAX_USES - this.useCount);
        builder1.append("\n");
        builder1.append("is machine ready:");
        builder1.append(isReady());
        builder1.append("\n");
        if (!builder1.equals("")) {
            System.out.println(builder1.toString());
            useCount++;
        }
        this.showProducts();

        FileWriter writer = null;
        try {
            writer = new FileWriter("duomenys.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.write(builder1.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

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