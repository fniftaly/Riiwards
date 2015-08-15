package com.riiwards.def.riiwardsloyalty;

/**
 * Created by def on 8/13/15.
 */
public class LoyaltyBirthdayActivity {

    private final int[] level = new int[]{9,19,29};

    private String UPPERTEXT = "";

    private String LOWERTEXT = "";

    public LoyaltyBirthdayActivity(int level){

        this.UPPERTEXT = "PER VISIT LOYALTY+BIRTHDAY CLUB ONLY "+this.level[level]+"/MONTH UNLIMITED USERS";

        this.LOWERTEXT = "Customers are automatically enroled when the swipe their card. Or when\n" +
                " they enter their phone if they pay by cash. You decide what reward go give after how many visits.";

    }

    public String getUPPERTEXT(){

        return this.UPPERTEXT;
    }

    public String getLOWERTEXT(){

        return this.LOWERTEXT;
    }
}
