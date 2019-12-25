public abstract class Jigglypuff
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
      "Rollout Start Right (Ground)", 
      "Rollout Start Left (Ground)", 
      "Rollout 1 (Ground)",
      "Rollout 2 (Ground)",
      "Rollout 3 (Ground)",
      "Rollout 4 (Ground)",
      "Rollout End Right (Ground)", 
      "Rollout End Left (Ground)", 
      "Rollout Start Right (Aerial)",
      "Rollout Start Left (Aerial)",
      "Rollout 1 (Aerial)",
      "Rollout 2 (Aerial)",
      "Rollout 3 (Aerial)",
      "Rollout 4 (Aerial)",
      "Rollout End Right (Aerial)",
      "Rollout End Left (Aerial)",
      "Rollout 5",
      "Pound (Ground)", 
      "Pound (Aerial)", 
      "Sing Left (Ground)",
      "Sing Left (Aerial)",
      "Sing Right (Ground)",
      "Sing Right (Aerial)",
      "Rest Left (Ground)", 
      "Rest Left (Aerial)",
      "Rest Right (Ground)", 
      "Rest Right (Aerial)",
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
            case "Rollout Start Right (Ground)": ID = "12C"; break;
            case "Rollout Start Left (Ground)": ID = "12D"; break;
            case "Rollout 1 (Ground)": ID = "12E"; break;
            case "Rollout 2 (Ground)": ID = "12F"; break;
            case "Rollout 3 (Ground)": ID = "130"; break;
            case "Rollout 4 (Ground)": ID = "131"; break;
            case "Rollout End Right (Ground)": ID = "132"; break;
            case "Rollout End Left (Ground)": ID = "133"; break;
            case "Rollout Start Right (Aerial)": ID = "134"; break;
            case "Rollout Start Left (Aerial)": ID = "135"; break;
            case "Rollout 1 (Aerial)": ID = "136"; break;
            case "Rollout 2 (Aerial)": ID = "137"; break;
            case "Rollout 3 (Aerial)": ID = "138"; break;
            case "Rollout 4 (Aerial)": ID = "139"; break;
            case "Rollout End Right (Aerial)": ID = "13A"; break;
            case "Rollout End Left (Aerial)": ID = "13B"; break;
            case "Rollout 5": ID = "13C"; break;
            case "Pound (Ground)": ID = "13D"; break;
            case "Pound (Aerial)": ID = "13E"; break; 
            case "Sing Left (Ground)": ID = "13F"; break;
            case "Sing Left (Aerial)": ID = "140"; break;
            case "Sing Right (Ground)": ID = "141"; break;
            case "Sing Right (Aerial)": ID = "142"; break;
            case "Rest Left (Ground)": ID = "143"; break; 
            case "Rest Left (Aerial)": ID = "144"; break;
            case "Rest Right (Ground)": ID = "145"; break; 
            case "Rest Right (Aerial)": ID = "146"; break;
        }
        return ID;
    }
}