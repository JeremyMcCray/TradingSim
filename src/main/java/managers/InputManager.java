package managers;

public class InputManager<T> {

    public Boolean checkInputIsAString(T input){
        return input instanceof String;
    }
    public Boolean checkInputIsAInteger(T input){
        return input instanceof Integer;
    }
    public Boolean checkInputIsADouble(T input){
        return input instanceof Double;
    }
}
