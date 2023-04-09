package generalProgram;

public enum RequestType {

    REQUEST_1("GET","API_123"),
    REQUEST_2("POST","API+345");
    private String type;
    private String request;

    RequestType(String type, String request){
        this.type=type;
        this.request=request;
    }

    public String getType(){
        return this.type;
    }

    public String getRequest(){
        return this.request;
    }
}
