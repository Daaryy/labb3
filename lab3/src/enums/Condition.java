package enums;

public enum Condition {

    MADNESS ("потерял рассудок"),
    FUN("смеется"),
    DESPAIR("в отчаянии"),
    DETERMINATION ("решился"),
    TIRED("силы оставили его"),
    CONFUSION("не знает, что предпринять"),
    HUNGRY("слюни потекли");

    private String description;
    Condition (String description) {
        this.description=description;
    }
}
