package concurrency;

import java.util.*;

public class Testforeach {


    public static List<String> list = Arrays.asList("10.180.11.126:8888","10.180.11.128:8888","10.180.11.130:8888");

    static int index;

    public static String getServer() {
        if(index == list.size()) {
            index = 0;
        }
        return list.get(index++);
    }


    public static void main(String[] args) {

        for(int i = 0; i < 15; i++) {
            if(i==1){
                return;
            }

            System.out.println(getServer());
        }
    }
}
