package managers;

import java.util.Deque;
import java.util.List;

public class OutputManager {
   public static Deque<String> quedOutputs;

    public static void addToQue(String input){
        quedOutputs.add(input);
    }

    public static void outputAllQued(){
        while(!quedOutputs.isEmpty()){
            System.out.println(quedOutputs.pop());
        }
    }
}

