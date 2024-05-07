public enum Verdict {

    SUCCESS("Success"),
    FAILURE("Failure"),
    OUT_OF_MONEY("Out Of Money"),
    SOFTWARE_ERROR("Software Error"),
    HARDWARE_ERROR("Hardware Error"),
    MAX_LIMIT("Exceed Maximum Limit");

    private String val;
    Verdict(String val){
        this.val=val;
    }

    public String getVal(){
        return this.val;
    }

}
