public enum Condition {
    WORKING("Working"),
    TECHNICAL_ERROR("Technical Error"),
    OUT_OF_BALANCE("Out Of Balance"),
    ABANDONED("Abandened");

    private String val;
    Condition(String val){
        this.val=val;
    }

    public String getVal(){
        return this.val;
    }
}
