public abstract class Mewtwo
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
      "Rapid Jab Start",
      "Rapid Jab Loop", 
      "Rapid Jab End", 
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
      "Shadow Ball Start (Ground)", 
      "Shadow Ball Charging Loop (Ground)",
      "Shadow Ball Charged Loop (Ground)",
      "Shadow Ball Cancel (Ground)", 
      "Shadow Ball End (Ground)", 
      "Shadow Ball Start (Aerial)", 
      "Shadow Ball Charging Loop (Aerial)", 
      "Shadow Ball Charged Loop (Aerial)", 
      "Shadow Ball Cancel (Aerial)", 
      "Shadow Ball End (Aerial)", 
      "Confusion (Ground)", 
      "Confusion (Aerial)", 
      "Teleport Start (Ground)",
      "Teleport (Ground)",
      "Teleport Lost (Ground)",
      "Teleport Start (Aerial)",
      "Teleport (Aerial)",
      "Disable (Ground)", 
      "Disable (Aerial)",
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
            case "Rapid Jab Start": ID = "031"; break;
            case "Rapid Jab Loop": ID = "032"; break;
            case "Rapid Jab End": ID = "033"; break;
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
            case "Shadow Ball Start (Ground)": ID = "127"; break;
            case "Shadow Ball Charging Loop (Ground)": ID = "128"; break;
            case "Shadow Ball Charged Loop (Ground)": ID = "129"; break;
            case "Shadow Ball Cancel (Ground)": ID = "12A"; break;
            case "Shadow Ball End (Ground)": ID = "12B"; break;
            case "Shadow Ball Start (Aerial)": ID = "12C"; break;
            case "Shadow Ball Charging Loop (Aerial)": ID = "12D"; break;
            case "Shadow Ball Charged Loop (Aerial)": ID = "12E"; break;
            case "Shadow Ball Cancel (Aerial)": ID = "12F"; break;
            case "Shadow Ball End (Aerial)": ID = "130"; break;
            case "Confusion (Ground)": ID = "131"; break;
            case "Confusion (Aerial)": ID = "132"; break;
            case "Teleport Start (Ground)": ID = "133"; break;
            case "Teleport (Ground)": ID = "134"; break;
            case "Teleport Lost (Ground)": ID = "135"; break;
            case "Teleport Start (Aerial)": ID = "136"; break;
            case "Teleport (Aerial)": ID = "137"; break;
            case "Disable (Ground)": ID = "138"; break;
            case "Disable (Aerial)": ID = "139"; break;
        }
        return ID;
    }
}