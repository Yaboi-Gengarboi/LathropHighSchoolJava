public abstract class Kirby
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
      "Rapid Jab Start",
      "Rapid Jab Loop", 
      "Rapid Jab End", 
      "Dash Attack",
      "Side Tilt (High)", 
      "Side Tilt (Middle)",
      "Side Tilt (Low)", 
      "Up Tilt", 
      "Down Tilt",
      "Side Smash (High)",
      "Side Smash (Middle)", 
      "Side Smash (Low)", 
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
      "Neutral Special (Ground)", 
      "Neutral Special Loop (Ground)", 
      "Neutral Special End (Ground)", 
      "Neutral Special Swallow (Ground)", 
      "Neutral Special Spit (Ground)", 
      "Side Special (Ground)", 
      "Side Special (Aerial)", 
      "Up Special Start (Ground)",
      "Up Special (Ground)",
      "Up Special Landing (Ground)",
      "Up Special Start (Aerial)",
      "Up Special (Aerial)",
      "Up Special Landing (Aerial)",
      "Down Special 1 (Ground)", 
      "Down Special 2 (Ground)", 
      "Down Special 3 (Ground)", 
      "Down Special 1 (Aerial)",
      "Down Special 2 (Aerial)",
      "Down Special 3 (Aerial)",
      "Fireball (Mario) (Ground)",
      "Fireball (Mario) (Aerial)",
      "Bow Start (Link) (Ground)", 
      "Bow Loop (Link) (Ground)",
      "Bow Shoot (Link) (Ground)", 
      "Bow Start (Link) (Aerial)",
      "Bow Loop (Link) (Aerial)", 
      "Bow Shoot (Link) (Aerial)",
      "Charge Shot Start (Ground)", 
      "Charge Shot Charging Loop (Ground)",
      "Charge Shot Cancel (Ground)", 
      "Charge Shot Shoot (Ground)", 
      "Charge Shot Start (Aerial)",
      "Charge Shot Shoot (Aerial)",
      "Egg Lay 1 (Ground)", 
      "Egg Lay 2 (Ground)",
      "Egg Lay 3 (Ground)", 
      "Egg Lay 1 (Aerial)",
      "Egg Lay 2 (Aerial)",
      "Egg Lay 3 (Aerial)",
      "Blaster Start (Fox) (Ground)", 
      "Blaster Loop (Fox) (Ground)",
      "Blaster End (Fox) (Ground)", 
      "Blaster Start (Fox) (Aerial)",
      "Blaster Loop (Fox) (Aerial)", 
      "Blaster End (Fox) (Aerial)",
      "Thunder Jolt (Pikachu) (Ground)", 
      "Thunder Jolt (Pikachu) (Aerial)",
      "Fireball (Luigi) (Ground)", 
      "Fireball (Luigi) (Aerial)",
      "Falcon Punch (Ground)", 
      "Falcon Punch (Aerial)",
      "PK Flash Start (Ground)", 
      "PK Flash Hold 1 (Ground)", 
      "PK Flash Hold 2 (Ground)", 
      "PK Flash End (Ground)", 
      "PK Flash Start (Aerial)",
      "PK Flash Hold 1 (Aerial)",
      "PK Flash Hold 2 (Aerial)",
      "PK Flash End (Aerial)",
      "Fire Breath Start (Ground)",
      "Fire Breath Loop (Ground)",
      "Fire Breath End (Ground)" ,
      "Fire Breath Start (Aerial)",
      "Fire Breath Loop (Aerial)",
      "Fire Breath End (Aerial)",
      "Toad Counter (Ground)",
      "Toad Hit (Ground)",
      "Toad Counter (Aerial)",
      "Toad Hit (Aerial)",
      "Ice Shot (Ground)", 
      "Ice Shot (Aerial)",
      "Giant Punch Start (Ground)", 
      "Giant Punch Loop (Ground)",
      "Giant Punch Cancel (Ground)", 
      "Giant Punch (Ground)",
      "Giant Punch (2)(Ground)", 
      "Giant Punch Start (Aerial)",
      "Giant Punch Loop (Aerial)",
      "Giant Punch Cancel (Aerial)", 
      "Giant Punch (Aerial)", 
      "Giant Punch (2)(Aerial)",
      "Nayru's Love (Ground)", 
      "Nayru's Love (Aerial)",
      "Needle Storm Start (Ground)", 
      "Needle Storm Charging Loop (Ground)",
      "Needle Storm Cancel (Ground)", 
      "Needle Storm Shoot (Ground)", 
      "Needle Storm Start (Aerial)",
      "Needle Storm Charging Loop (Aerial)",
      "Needle Storm Cancel (Aerial)", 
      "Needle Storm Shoot (Aerial)",
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
      "Shield Breaker Start (Ground)", 
      "Shield Breaker Loop (Ground)", 
      "Shield Breaker End 1 (Ground)", 
      "Shield Breaker End 2 (Ground)", 
      "Shield Breaker Start (Aerial)",
      "Shield Breaker Loop (Aerial)",
      "Shield Breaker End 1 (Aerial)",
      "Shield Breaker End 2 (Aerial)",
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
      "Chef (Ground)",
      "Chef (Aerial)",
      "Megavitamin (Ground)", 
      "Megavitamin (Aerial)",
      "Bow Start (Young Link) (Ground)", 
      "Bow Loop (Young Link) (Ground)",
      "Bow Shoot (Young Link) (Ground)", 
      "Bow Start (Young Link) (Aerial)",
      "Bow Loop (Young Link) (Aerial)", 
      "Bow Shoot (Young Link) (Aerial)",
      "Blaster Start (Falco) (Ground)", 
      "Blaster Loop (Falco) (Ground)",
      "Blaster End (Falco) (Ground)", 
      "Blaster Start (Falco) (Aerial)",
      "Blaster Loop (Falco) (Aerial)", 
      "Blaster End (Falco) (Aerial)",
      "Thunder Jolt (Pichu) (Ground)", 
      "Thunder Jolt (Pichu) (Aerial)",
      "Warlock Punch (Ground)", 
      "Warlock Punch (Aerial)",
      "Flare Blade Start (Ground)", 
      "Flare Blade Loop (Ground)", 
      "Flare Blade End 1 (Ground)", 
      "Flare Blade End 2 (Ground)", 
      "Flare Blade Start (Aerial)",
      "Flare Blade Loop (Aerial)",
      "Flare Blade End 1 (Aerial)",
      "Flare Blade End 2 (Aerial)"
    };
    /**
     * This method returns a String containing the Hex ID of Subactions that
     * characters in Super Smash Bros Melee posses. This is required to create
     * a proper FSM. Note that not all subactions are listed, only ones I deemed 
     * would possibly benefit from having an FSM.
     * Requires a String input.
     */
    public static String getSubactionID (String atk)
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
            case "Rapid Jab Start": ID = "031"; break;
            case "Rapid Jab Loop": ID = "032"; break;
            case "Rapid Jab End": ID = "033"; break;
            case "Dash Attack": ID = "034"; break;
            case "Side Tilt (High)": ID = "035"; break;
            case "Side Tilt (Middle)": ID = "037"; break;
            case "Side Tilt (Low)": ID = "039"; break;
            case "Up Tilt": ID = "03A"; break;
            case "Down Tilt": ID = "03B"; break;
            case "Side Smash (High)": ID = "03C"; break;
            case "Side Smash (Middle)": ID = "03E"; break;
            case "Side Smash (Low)": ID = "040"; break;
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
            case "Neutral Special (Ground)": ID = "131"; break;
            case "Neutral Special Loop (Ground)": ID = "132"; break;
            case "Neutral Special End (Ground)": ID = "133"; break;
            case "Neutral Special Swallow (Ground)": ID = "13E"; break; 
            case "Neutral Special Spit (Ground)": ID = "13F"; break;
            case "Side Special (Ground)": ID = "142"; break; 
            case "Side Special (Aerial)": ID = "143"; break; 
            case "Up Special Start (Ground)": ID = "144"; break; 
            case "Up Special (Ground)": ID = "145"; break; 
            case "Up Special Landing (Ground)": ID = "147"; break; 
            case "Up Special Start (Aerial)": ID = "148"; break; 
            case "Up Special (Aerial)": ID = "149"; break; 
            case "Up Special Landing (Aerial)": ID = "14B"; break; 
            case "Down Special 1 (Ground)": ID = "14C"; break; 
            case "Down Special 2 (Ground)": ID = "14D"; break;  
            case "Down Special 3 (Ground)": ID = "14E"; break; 
            case "Down Special 1 (Aerial)": ID = "14F"; break; 
            case "Down Special 2 (Aerial)": ID = "150"; break; 
            case "Down Special 3 (Aerial)": ID = "151"; break; 
            case "Fireball (Mario) (Ground)": ID = "152"; break; 
            case "Fireball (Mario) (Aerial)": ID = "153"; break; 
            case "Bow Start (Link) (Ground)": ID = "154"; break;  
            case "Bow Loop (Link) (Ground)": ID = "155"; break; 
            case "Bow Shoot (Link) (Ground)": ID = "156"; break;  
            case "Bow Start (Link) (Aerial)": ID = "157"; break; 
            case "Bow Loop (Link) (Aerial)": ID = "158"; break;  
            case "Bow Shoot (Link) (Aerial)": ID = "159"; break; 
            case "Charge Shot Start (Ground)": ID = "15A"; break; 
            case "Charge Shot Charging Loop (Ground)": ID = "15B"; break; 
            case "Charge Shot Cancel (Ground)": ID = "15C"; break;  
            case "Charge Shot Shoot (Ground)": ID = "15D"; break; 
            case "Charge Shot Start (Aerial)": ID = "15E"; break; 
            case "Charge Shot Shoot (Aerial)": ID = "15F"; break; 
            case "Egg Lay 1 (Ground)": ID = "160"; break;  
            case "Egg Lay 2 (Ground)": ID = "161"; break;  
            case "Egg Lay 3 (Ground)": ID = "162"; break;  
            case "Egg Lay 1 (Aerial)": ID = "163"; break;  
            case "Egg Lay 2 (Aerial)": ID = "164"; break;  
            case "Egg Lay 3 (Aerial)": ID = "165"; break;  
            case "Blaster Start (Fox) (Ground)": ID = "166"; break;   
            case "Blaster Loop (Fox) (Ground)": ID = "167"; break;  
            case "Blaster End (Fox) (Ground)": ID = "168"; break;   
            case "Blaster Start (Fox) (Aerial)": ID = "169"; break;   
            case "Blaster Loop (Fox) (Aerial)": ID = "16A"; break;   
            case "Blaster End (Fox) (Aerial)": ID = "16B"; break;   
            case "Thunder Jolt (Pikachu) (Ground)": ID = "16C"; break;    
            case "Thunder Jolt (Pikachu) (Aerial)": ID = "16D"; break;   
            case "Fireball (Luigi) (Ground)": ID = "16E"; break;    
            case "Fireball (Luigi) (Aerial)": ID = "16F"; break;   
            case "Falcon Punch (Ground)": ID = "170"; break;    
            case "Falcon Punch (Aerial)": ID = "171"; break;   
            case "PK Flash Start (Ground)": ID = "172"; break;    
            case "PK Flash Hold 1 (Ground)": ID = "173"; break;   
            case "PK Flash Hold 2 (Ground)": ID = "174"; break;   
            case "PK Flash End (Ground)": ID = "175"; break;    
            case "PK Flash Start (Aerial)": ID = "176"; break;   
            case "PK Flash Hold 1 (Aerial)": ID = "177"; break;   
            case "PK Flash Hold 2 (Aerial)": ID = "178"; break;   
            case "PK Flash End (Aerial)": ID = "179"; break;   
            case "Fire Breath Start (Ground)": ID = "17A"; break;   
            case "Fire Breath Loop (Ground)": ID = "17B"; break;   
            case "Fire Breath End (Ground)": ID = "17C"; break;   
            case "Fire Breath Start (Aerial)": ID = "17D"; break;   
            case "Fire Breath Loop (Aerial)": ID = "17E"; break;   
            case "Fire Breath End (Aerial)": ID = "17F"; break;   
            case "Toad Counter (Ground)": ID = "180"; break;
            case "Toad Hit (Ground)": ID = "181"; break;  
            case "Toad Counter (Aerial)": ID = "182"; break;
            case "Toad Hit (Aerial)": ID = "183"; break;  
            case "Ice Shot (Ground)": ID = "184"; break; 
            case "Ice Shot (Aerial)": ID = "185"; break;
            case "Giant Punch Start (Ground)": ID = "186"; break;
            case "Giant Punch Loop (Ground)": ID = "187"; break;
            case "Giant Punch Cancel (Ground)": ID = "188"; break; 
            case "Giant Punch (Ground)": ID = "189"; break;
            case "Giant Punch (2)(Ground)": ID = "18A"; break;
            case "Giant Punch Start (Aerial)": ID = "18B"; break;
            case "Giant Punch Loop (Aerial)": ID = "18C"; break;
            case "Giant Punch Cancel (Aerial)": ID = "18D"; break;
            case "Giant Punch (Aerial)": ID = "18E"; break; 
            case "Giant Punch (2)(Aerial)": ID = "18F"; break;
            case "Nayru's Love (Ground)": ID = "190"; break; 
            case "Nayru's Love (Aerial)": ID = "191"; break; 
            case "Needle Storm Start (Ground)": ID = "192"; break;  
            case "Needle Storm Charging Loop (Ground)": ID = "193"; break; 
            case "Needle Storm Cancel (Ground)": ID = "194"; break;  
            case "Needle Storm Shoot (Ground)": ID = "195"; break; 
            case "Needle Storm Start (Aerial)": ID = "196"; break; 
            case "Needle Storm Charging Loop (Aerial)": ID = "197"; break; 
            case "Needle Storm Cancel (Aerial)": ID = "198"; break; 
            case "Needle Storm Shoot (Aerial)": ID = "199"; break; 
            case "Rollout Start Right (Ground)": ID = "19A"; break;  
            case "Rollout Start Left (Ground)": ID = "19B"; break; 
            case "Rollout 1 (Ground)": ID = "19C"; break;
            case "Rollout 2 (Ground)": ID = "19D"; break;
            case "Rollout 3 (Ground)": ID = "19E"; break;
            case "Rollout 4 (Ground)": ID = "19F"; break;
            case "Rollout End Right (Ground)": ID = "1A0"; break; 
            case "Rollout End Left (Ground)": ID = "1A1"; break; 
            case "Rollout Start Right (Aerial)": ID = "1A2"; break; 
            case "Rollout Start Left (Aerial)": ID = "1A3"; break; 
            case "Rollout 1 (Aerial)": ID = "1A4"; break; 
            case "Rollout 2 (Aerial)": ID = "1A5"; break; 
            case "Rollout 3 (Aerial)": ID = "1A6"; break; 
            case "Rollout 4 (Aerial)": ID = "1A7"; break; 
            case "Rollout End Right (Aerial)": ID = "1A8"; break; 
            case "Rollout End Left (Aerial)": ID = "1A9"; break; 
            case "Rollout 5": ID = "1AA"; break; 
            case "Shield Breaker Start (Ground)": ID = "1AB"; break;  
            case "Shield Breaker Loop (Ground)": ID = "1AC"; break;  
            case "Shield Breaker End 1 (Ground)": ID = "1AD"; break;  
            case "Shield Breaker End 2 (Ground)": ID = "1AE"; break;  
            case "Shield Breaker Start (Aerial)": ID = "1AF"; break; 
            case "Shield Breaker Loop (Aerial)": ID = "1B0"; break; 
            case "Shield Breaker End 1 (Aerial)": ID = "1B1"; break; 
            case "Shield Breaker End 2 (Aerial)": ID = "1B2"; break; 
            case "Shadow Ball Start (Ground)": ID = "1B3"; break; 
            case "Shadow Ball Charging Loop (Ground)": ID = "1B4"; break; 
            case "Shadow Ball Charged Loop (Ground)": ID = "1B5"; break; 
            case "Shadow Ball Cancel (Ground)": ID = "1B6"; break;  
            case "Shadow Ball End (Ground)": ID = "1B7"; break; 
            case "Shadow Ball Start (Aerial)": ID = "1B8"; break;  
            case "Shadow Ball Charging Loop (Aerial)": ID = "1B9"; break;  
            case "Shadow Ball Charged Loop (Aerial)": ID = "1BA"; break;  
            case "Shadow Ball Cancel (Aerial)": ID = "1BB"; break; 
            case "Shadow Ball End (Aerial)": ID = "1BC"; break; 
            case "Chef (Ground)": ID = "1BD"; break; 
            case "Chef (Aerial)": ID = "1BE"; break; 
            case "Megavitamin (Ground)": ID = "1BF"; break;  
            case "Megavitamin (Aerial)": ID = "1C0"; break; 
            case "Bow Start (Young Link) (Ground)": ID = "1C1"; break;  
            case "Bow Loop (Young Link) (Ground)": ID = "1C2"; break; 
            case "Bow Shoot (Young Link) (Ground)": ID = "1C3"; break;  
            case "Bow Start (Young Link) (Aerial)": ID = "1C4"; break; 
            case "Bow Loop (Young Link) (Aerial)": ID = "1C5"; break; 
            case "Bow Shoot (Young Link) (Aerial)": ID = "1C6"; break; 
            case "Blaster Start (Falco) (Ground)": ID = "1C7"; break;  
            case "Blaster Loop (Falco) (Ground)": ID = "1C8"; break; 
            case "Blaster End (Falco) (Ground)": ID = "1C9"; break;  
            case "Blaster Start (Falco) (Aerial)": ID = "1CA"; break; 
            case "Blaster Loop (Falco) (Aerial)": ID = "1CB"; break;  
            case "Blaster End (Falco) (Aerial)": ID = "1CC"; break; 
            case "Thunder Jolt (Pichu) (Ground)": ID = "1CD"; break;  
            case "Thunder Jolt (Pichu) (Aerial)": ID = "1CE"; break; 
            case "Warlock Punch (Ground)": ID = "1CF"; break;  
            case "Warlock Punch (Aerial)": ID = "1D0"; break; 
            case "Flare Blade Start (Ground)": ID = "1D1"; break;  
            case "Flare Blade Loop (Ground)": ID = "1D2"; break;  
            case "Flare Blade End 1 (Ground)": ID = "1D3"; break; 
            case "Flare Blade End 2 (Ground)": ID = "1D4"; break; 
            case "Flare Blade Start (Aerial)": ID = "1D5"; break; 
            case "Flare Blade Loop (Aerial)": ID = "1D6"; break; 
            case "Flare Blade End 1 (Aerial)": ID = "1D7"; break; 
            case "Flare Blade End 2 (Aerial)": ID = "1D8"; break; 
        }
        return ID;
    }
}