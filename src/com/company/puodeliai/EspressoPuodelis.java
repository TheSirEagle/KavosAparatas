package com.company.puodeliai;

public class EspressoPuodelis extends KavosPuodelis {
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("");
        builder.append("  .-=-.\n");
        builder.append(" ,|`~'|\n");
        builder.append(" `|   | \n");
        builder.append("   `~'");
        return builder.toString();
    }

    public EspressoPuodelis(){
        super(new Produktai(0.1f,10,40),"Espresso",0.15f);
    }
}