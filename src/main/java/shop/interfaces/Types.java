package shop.interfaces;

public enum Types {
    //guitar types
    ACOUSTIC("acoustic"),
    ELECTRIC("electric"),
    CLASSICAL("classical"),
    BASS("bass"),

    //piano types
    GRAND("grand"),
    UPRIGHT("upright"),
    ELECTRONIC("electronic"),

    //synthesizer types
    ANALOGUE("analogue"),
    DIGITAL("digital"),

    //violin types
    BAROQUE("baroque"),
    FIDDLE("fiddle"),

    //drum kit types
    ROCK("rock"),
    FUSION("fusion"),
    JAZZ("jazz"),

    //microphone types
    CONDENSER("condenser"),
    DYNAMIC("dynamic");

    private final String type;

    Types(String type) {
        this.type = type;
    }

    public String getTypeValue(){
        return this.type;
    }

}
