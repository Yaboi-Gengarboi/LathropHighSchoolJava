public abstract class Bowser
{
    public static String[] subList = 
    {
      "Turn", 
      "Run Turn", 
      "Dash", 
      "Run", 
      "Run Stop", 
      "Spot Dodge", 
      "Roll (Foward)", 
      "Roll (Back)", 
      "Air Dodge", 
      "Jab 1",
      "Jab 2", 
      "Dash Attack",
      "Side Tilt (High)", 
      "Side Tilt (Middle)",
      "Side Tilt (Low)", 
      "Up Tilt", 
      "Down Tilt",
      "Side Smash", 
      "Up Smash", 
      "Down Smash",
      "Neutral Aerial", 
      "Foward Aerial",
      "Back Aerial", 
      "Up Aerial",
      "Down Aerial",
      "Tech (Normal)", 
      "Tech (Foward)", 
      "Tech (Back)", 
      "Tech (Wall)", 
      "Tech (Wall Jump)", 
      "Tech (Ceiling)", 
      "Ledge Getup (Slow)", 
      "Ledge Getup (Fast)",
      "Ledge Attack (Slow)",
      "Ledge Attack (Fast)", 
      "Ledge Roll (Slow)",
      "Ledge Roll (Fast)", 
      "Ledge Jump 1 (Slow)",
      "Ledge Jump 2 (Slow)",
      "Ledge Jump 1 (Fast)",
      "Ledge Jump 2 (Fast)",
      "Taunt (Left)",
      "Taunt (Right)",   
      "Grab", 
      "Dash Grab", 
      "Pummel", 
      "Foward Throw", 
      "Back Throw", 
      "Up Throw", 
      "Down Throw",
      "Fire Breath Start (Ground)",
      "Fire Breath Loop (Ground)",
      "Fire Breath End (Ground)" ,
      "Fire Breath Start (Aerial)",
      "Fire Breath Loop (Aerial)",
      "Fire Breath End (Aerial)",
      "Koopa Claw Start (Ground)",
      "Koopa Claw Hit 1 (Ground)",
      "Koopa Claw Hit 2 (Ground)", 
      "Koopa Claw Foward Throw (Ground)",
      "Koopa Claw Back Throw (Ground)",
      "Koopa Claw Start (Aerial)",
      "Koopa Claw Hit 1 (Aerial)", 
      "Koopa Claw Hit 2 (Aerial)",
      "Koopa Claw Foward Throw (Aerial)",
      "Koopa Claw Back Throw (Aerial)",
      "Whirling Fortress (Ground)",
      "Whirling Fortress (Aerial)",
      "Bowser Bomb (Ground)",
      "Bowser Bomb (Aerial)",
      "Bowser Bomb Landing"
    };
    /**
     * This method returns a String containing the Hex ID of Subactions that
     * characters in Super Smash Bros Melee posses. This is required to create
     * a proper FSM. Note that not all subactions are listed, only ones I deemed 
     * would possibly benefit from having an FSM.
     * Requires a String input.
     */
    public static String getSubactionID(String atk)
    {
        String ID = "";
        switch (atk)
        {
            case "Turn": ID = "00A"; break;
            case "Run Turn": ID = "00B"; break;
            case "Dash": ID = "00C"; break;
            case "Run": ID = "00D"; break;
            case "Run Stop": ID = "00E"; break;
            case "Spot Dodge": ID = "029"; break;
            case "Roll (Foward)": ID = "02A"; break;
            case "Roll (Back)": ID = "02B"; break;
            case "Air Dodge": ID = "02C"; break;
            case "Jab 1": ID = "02E"; break;
            case "Jab 2": ID = "02F"; break;
            case "Dash Attack": ID = "034"; break;
            case "Side Tilt (High)": ID = "035"; break;
            case "Side Tilt (Middle)": ID = "037"; break;
            case "Side Tilt (Low)": ID = "039"; break;
            case "Up Tilt": ID = "03A"; break;
            case "Down Tilt": ID = "03B"; break;
            case "Side Smash": ID = "03E"; break;
            case "Up Smash": ID = "042"; break;
            case "Down Smash": ID = "043"; break;
            case "Neutral Aerial": ID = "044"; break;
            case "Foward Aerial": ID = "045"; break;
            case "Back Aerial": ID = "046"; break;
            case "Up Aerial": ID = "047"; break;
            case "Down Aerial": ID = "048"; break;
            case "Tech (Normal)": ID = "0C7"; break;
            case "Tech (Foward)": ID = "0C8"; break;
            case "Tech (Back)": ID = "0C9"; break;
            case "Tech (Wall)": ID = "0CA"; break;
            case "Tech (Wall Jump)": ID = "0CB"; break;
            case "Tech (Ceiling)": ID = "0CC"; break;
            case "Ledge Getup (Slow)": ID = "0DB"; break;
            case "Ledge Getup (Fast)": ID = "0DC"; break;
            case "Ledge Attack (Slow)": ID = "0DD"; break;
            case "Ledge Attack (Fast)": ID = "0DE"; break;
            case "Ledge Roll (Slow)": ID = "0DF"; break;
            case "Ledge Roll (Fast)": ID = "0E0"; break;
            case "Ledge Jump 1 (Slow)": ID = "0E1"; break;
            case "Ledge Jump 2 (Slow)": ID = "0E2"; break;
            case "Ledge Jump 1 (Fast)": ID = "0E3"; break;
            case "Ledge Jump 2 (Fast)": ID = "0E4"; break;
            case "Taunt (Left)": ID = "0EF"; break;
            case "Taunt (Right)": ID = "0F0"; break;
            case "Grab": ID = "0F2"; break;
            case "Dash Grab": ID = "0F3"; break;
            case "Pummel": ID = "0F5"; break;
            case "Foward Throw": ID = "0F7"; break;
            case "Back Throw": ID = "0F8"; break;
            case "Up Throw": ID = "0F9"; break;
            case "Down Throw": ID = "0FA"; break;
            case "Fire Breath Start (Ground)": ID = "127"; break; 
            case "Fire Breath Loop (Ground)": ID = "128"; break; 
            case "Fire Breath End (Ground)": ID = "129"; break;  
            case "Fire Breath Start (Aerial)": ID = "12A"; break; 
            case "Fire Breath Loop (Aerial)": ID = "12B"; break; 
            case "Fire Breath End (Aerial)": ID = "12C"; break;
            case "Koopa Claw Start (Ground)": ID = "12D"; break; 
            case "Koopa Claw Hit 1 (Ground)": ID = "12E"; break; 
            case "Koopa Claw Hit 2 (Ground)": ID = "12F"; break; 
            case "Koopa Claw Foward Throw (Ground)": ID = "130"; break; 
            case "Koopa Claw Back Throw (Ground)": ID = "131"; break;
            case "Koopa Claw Start (Aerial)": ID = "132"; break; 
            case "Koopa Claw Hit 1 (Aerial)": ID = "133"; break; 
            case "Koopa Claw Hit 2 (Aerial)": ID = "134"; break; 
            case "Koopa Claw Foward Throw (Aerial)": ID = "135"; break; 
            case "Koopa Claw Back Throw (Aerial)": ID = "136"; break;
            case "Whirling Fortress (Ground)": ID = "137"; break; 
            case "Whirling Fortress (Aerial)": ID = "138"; break; 
            case "Bowser Bomb (Ground)": ID = "139"; break; 
            case "Bowser Bomb (Aerial)": ID = "13A"; break; 
            case "Bowser Bomb Landing": ID = "13B"; break;
        }
        return ID;
    }
}