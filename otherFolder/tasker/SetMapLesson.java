package otherFolder.tasker;

import java.util.*;

public class SetMapLesson {
    // void testVarParam(var p){ } // var is not allowed in method param
    // SetMapLesson(var p){} // var is not allowed in constructor param
    public static void main(String[] args) {
        var p = 1;
        var m = (Horse)null;
        Set<Integer> lineUp = new HashSet<>();
        lineUp.add(7);
        lineUp.add(5);
        lineUp.add(3);
        System.out.println(lineUp.contains(7));
        System.out.println(lineUp.toString());

        Set<Horse> HorselineUp = new HashSet<>();
        System.out.println(HorselineUp.add(new Horse("Makibao", 5, 23)));
        System.out.println(HorselineUp.add(new Horse("John Doe", 6, 13)));
        System.out.println(HorselineUp.add(new Horse("Hidalgo", 13, 5)));
        System.out.println(HorselineUp.add(new Horse("Hidalgo", 13, 5)));
        System.out.println(HorselineUp);
        Map<String,String> contactList = new HashMap<>();
        contactList.put("Charlie","charlie@sltcfi.com");
        contactList.put("Dawn","dawn@sltcfi.com");
        contactList.put("Marc","marc@sltcfi.com");
        // System.out.println(contactList.remove("Charlie"));
        System.out.println(contactList.get("Dawn"));
        System.out.println(contactList.keySet());
        System.out.println(contactList.values());
    }
}
class Horse{
    private String name;
    private int age;
    private int jerseyNum;
    public Horse(String name,int age,int jerseyNum){
        this.name = name;
        this.age = age;
        this.jerseyNum = jerseyNum;
    }
    @Override
    public String toString() {
        return name;
    }
}