public abstract class Roy
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
      "Dash Attack",
      "Side Tilt",
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
      "Flare Blade Start (Ground)", 
      "Flare Blade Loop (Ground)", 
      "Flare Blade End 1 (Ground)", 
      "Flare Blade End 2 (Ground)", 
      "Flare Blade Start (Aerial)",
      "Flare Blade Loop (Aerial)",
      "Flare Blade End 1 (Aerial)",
      "Flare Blade End 2 (Aerial)",
      "Double-Edge Dance 1 (Ground)", 
      "Double-Edge Dance 2 (High) (Ground)", 
      "Double-Edge Dance 2 (Middle) (Ground)", 
      "Double-Edge Dance 3 (High) (Ground)", 
      "Double-Edge Dance 3 (Middle) (Ground)", 
      "Double-Edge Dance 3 (Low) (Ground)", 
      "Double-Edge Dance 4 (High) (Ground)", 
      "Double-Edge Dance 4 (Middle) (Ground)", 
      "Double-Edge Dance 4 (Low) (Ground)", 
      "Double-Edge Dance 1 (Aerial)", 
      "Double-Edge Dance 2 (High) (Aerial)", 
      "Double-Edge Dance 2 (Middle) (Aerial)", 
      "Double-Edge Dance 3 (High) (Aerial)", 
      "Double-Edge Dance 3 (Middle) (Aerial)", 
      "Double-Edge Dance 3 (Low) (Aerial)", 
      "Double-Edge Dance 4 (High) (Aerial)", 
      "Double-Edge Dance 4 (Middle) (Aerial)", 
      "Double-Edge Dance 4 (Low) (Aerial)", 
      "Blazer (Ground)",
      "Blazer (Aerial)",
      "Counter (Ground)", 
      "Counter Hit (Ground)", 
      "Counter (Aerial)",
      "Counter Hit (Aerial)",
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
            case "Dash Attack": ID = "034"; break;
            case "Side Tilt": ID = "037"; break;
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
            case "Flare Blade Start (Ground)": ID = "127"; break;
            case "Flare Blade Loop (Ground)": ID = "128"; break;
            case "Flare Blade End 1 (Ground)": ID = "129"; break;
            case "Flare Blade End 2 (Ground)": ID = "12A"; break;
            case "Flare Blade Start (Aerial)": ID = "12B"; break;
            case "Flare Blade Loop (Aerial)": ID = "12C"; break;
            case "Flare Blade End 1 (Aerial)": ID = "12D"; break;
            case "Flare Blade End 2 (Aerial)": ID = "12E"; break;
            case "Double-Edge Dance 1 (Ground)": ID = "12F"; break;
            case "Double-Edge Dance 2 (High) (Ground)": ID = "130"; break;
            case "Double-Edge Dance 2 (Middle) (Ground)": ID = "131"; break;
            case "Double-Edge Dance 3 (High) (Ground)": ID = "132"; break;
            case "Double-Edge Dance 3 (Middle) (Ground)": ID = "133"; break;
            case "Double-Edge Dance 3 (Low) (Ground)": ID = "134"; break;
            case "Double-Edge Dance 4 (High) (Ground)": ID = "135"; break;
            case "Double-Edge Dance 4 (Middle) (Ground)": ID = "136"; break;
            case "Double-Edge Dance 4 (Low) (Ground)": ID = "137"; break;
            case "Double-Edge Dance 1 (Aerial)": ID = "138"; break;
            case "Double-Edge Dance 2 (High) (Aerial)": ID = "139"; break;
            case "Double-Edge Dance 2 (Middle) (Aerial)": ID = "13A"; break;
            case "Double-Edge Dance 3 (High) (Aerial)": ID = "13B"; break;
            case "Double-Edge Dance 3 (Middle) (Aerial)": ID = "13C"; break;
            case "Double-Edge Dance 3 (Low) (Aerial)": ID = "13D"; break;
            case "Double-Edge Dance 4 (High) (Aerial)": ID = "13E"; break;
            case "Double-Edge Dance 4 (Middle) (Aerial)": ID = "13F"; break;
            case "Double-Edge Dance 4 (Low) (Aerial)": ID = "140"; break;
            case "Blazer (Ground)": ID = "141"; break;
            case "Blazer (Aerial)": ID = "142"; break;
            case "Counter (Ground)": ID = "143"; break;
            case "Counter Hit (Ground)": ID = "144"; break;
            case "Counter (Aerial)": ID = "145"; break;
            case "Counter Hit (Aerial)": ID = "146"; break;
        }
        return ID;
    }
}