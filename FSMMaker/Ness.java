public abstract class Ness
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
      "Jab 3",
      "Dash Attack",
      "Side Tilt (High)", 
      "Side Tilt (Mid-High)", 
      "Side Tilt (Middle)",
      "Side Tilt (Mid-Low)", 
      "Side Tilt (Low)", 
      "Up Tilt", 
      "Down Tilt",
      "Side Smash",
      "Up Smash Uncharged", 
      "Up Smash Charged", 
      "Down Smash Uncharged",
      "Down Smash Charged",
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
      "PK Flash Start (Ground)", 
      "PK Flash Hold 1 (Ground)", 
      "PK Flash Hold 2 (Ground)", 
      "PK Flash End (Ground)", 
      "PK Flash Start (Aerial)",
      "PK Flash Hold 1 (Aerial)",
      "PK Flash Hold 2 (Aerial)",
      "PK Flash End (Aerial)",
      "PK Fire (Ground)", 
      "PK Fire (Aerial)", 
      "PK Thunder Start (Ground)",
      "PK Thunder Hold (Ground)",
      "PK Thunder End (Ground)",
      "PK Thunder Launch (Ground)",
      "PK Thunder Start (Aerial)",
      "PK Thunder Hold (Aerial)",
      "PK Thunder End (Aerial)",
      "PK Thunder Launch (Aerial)",
      "PSI Magnet Start (Ground)", 
      "PSI Magnet Hold (Ground)", 
      "PSI Magnet Absorb (Ground)", 
      "PSI Magnet End (Ground)", 
      "PSI Magnet Start (Aerial)",
      "PSI Magnet Hold (Aerial)",
      "PSI Magnet Absorb (Aerial)",
      "PSI Magnet End (Aerial)",
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
            case "Jab 3": ID = "030"; break;
            case "Dash Attack": ID = "034"; break;
            case "Side Tilt (High)": ID = "035"; break;
            case "Side Tilt (Mid-High)": ID = "036"; break;
            case "Side Tilt (Middle)": ID = "037"; break;
            case "Side Tilt (Mid-Low)": ID = "038"; break;
            case "Side Tilt (Low)": ID = "039"; break;
            case "Up Tilt": ID = "03A"; break;
            case "Down Tilt": ID = "03B"; break;
            case "Side Smash": ID = "03E"; break;
            case "Up Smash Uncharged": ID = "042"; break;
            case "Up Smash Charged": ID = "128"; break;
            case "Down Smash Uncharged": ID = "043"; break;
            case "Down Smash Charged": ID = "12A"; break;
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
            case "PK Flash Start (Ground)": ID = "12B"; break;
            case "PK Flash Hold 1 (Ground)": ID = "12C"; break; 
            case "PK Flash Hold 2 (Ground)": ID = "12D"; break;
            case "PK Flash End (Ground)": ID = "12E"; break; 
            case "PK Flash Start (Aerial)": ID = "12F"; break;
            case "PK Flash Hold 1 (Aerial)": ID = "130"; break;
            case "PK Flash Hold 2 (Aerial)": ID = "131"; break;
            case "PK Flash End (Aerial)": ID = "132"; break;
            case "PK Fire (Ground)": ID = "133"; break;
            case "PK Fire (Aerial)": ID = "134"; break;
            case "PK Thunder Start (Ground)": ID = "135"; break;
            case "PK Thunder Hold (Ground)": ID = "136"; break;
            case "PK Thunder End (Ground)": ID = "137"; break;
            case "PK Thunder Launch (Ground)": ID = "138"; break;
            case "PK Thunder Start (Aerial)": ID = "139"; break;
            case "PK Thunder Hold (Aerial)": ID = "13A"; break;
            case "PK Thunder End (Aerial)": ID = "13B"; break;
            case "PK Thunder Launch (Aerial)": ID = "13C"; break;
            case "PSI Magnet Start (Ground)": ID = "13E"; break;
            case "PSI Magnet Hold (Ground)": ID = "13F"; break;
            case "PSI Magnet Absorb (Ground)": ID = "140"; break;
            case "PSI Magnet End (Ground)": ID = "141"; break;
            case "PSI Magnet Start (Aerial)": ID = "142"; break;
            case "PSI Magnet Hold (Aerial)": ID = "143"; break;
            case "PSI Magnet Absorb (Aerial)": ID = "144"; break;
            case "PSI Magnet End (Aerial)": ID = "145"; break;
        }
        return ID;
    }
}