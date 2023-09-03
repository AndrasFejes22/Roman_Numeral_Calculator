import java.util.*;

public class Main {

    //CMXI = 911
    public static void main(String[] args) {
        /*
        System.out.println(romanNumberCalculator("MCV"));
        System.out.println(romanNumberCalculator("D"));
        System.out.println(romanNumberCalculator("CD"));
        System.out.println(romanNumberCalculator("DC"));
        System.out.println(romanNumberCalculator("M"));
        System.out.println(romanNumberCalculator("CM"));
        System.out.println(romanNumberCalculator("IV"));
        System.out.println(romanNumberCalculator("V"));
        System.out.println(romanNumberCalculator("VI"));
        System.out.println(romanNumberCalculator("VII"));
        System.out.println(romanNumberCalculator("VIII"));
        System.out.println("IV".indexOf("S"));
        */
        //System.out.println("IV".indexOf("V"));

    }

    public static int romanNumberCalculator(String input){
        LinkedList<String> listInput = stringToList(input);
        System.out.println(listInput);
        List<String> processedList = alternateList(listInput);
        System.out.println(processedList);
        //System.out.println(romanNumberMap(listInput));
        //Map<Integer, String> map = romanNumberMap(listInput);
        //String[] arr = input.split("");
        int sum = 0;
        for (int i = 0; i < processedList.size(); i++) {


            switch(processedList.get(i)) {
                case "M":
                    System.out.println("M");
                    sum += 1000;
                    break;
                case "D":
                    sum += 500;
                    break;
                case "C":

                    // CM case
                    if(input.indexOf("C") < input.indexOf("D") /*&& input.contains("X")*/){
                        System.out.println("ideC");
                        sum += -100;
                    }else{
                        sum += 100;
                    }

                    break;
                case "X":
                    System.out.println("X");

                    if(input.indexOf("X") < input.indexOf("L") || input.indexOf("X") < input.indexOf("C")){
                        sum += -10;
                    }else{
                        sum += 10;
                    }

                    break;
                case "L":
                    System.out.println("L");

                    sum += 50;
                    break;
                case "V":

                    sum += 5;
                    break;
                case "I":

                    // IV case
                    if(input.indexOf("I") < input.indexOf("V") /*&& input.contains("V")*/){
                        System.out.println("ideI");
                        sum += -1;
                    } else {
                        sum += 1;
                    }

                    break;
                case "CM":
                    sum += 900;
                    break;
                case "IX":
                    sum += 9;
                    break;

                default:

            }

        }
        return sum;
    }

    public static LinkedList<String> stringToList(String str){
        String[] strSplit = str.split("");
        return new LinkedList<String>(Arrays.asList(strSplit));
    }

    public static Map<Integer, String> romanNumberMap(LinkedList<String> listInput){
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < listInput.size(); i++) {
            map.put(i, listInput.get(i));
        }
        return map;
    }

    public void iterateValuesUsingLambda(Map<Integer, String> map) {
        map.values().forEach(v -> System.out.println(("value: " + v)));
    }

    public static List<String> alternateList(LinkedList<String> listInput){
        List<String> newList = new ArrayList<>();
        newList.add(listInput.get(0));
        for (int i = 1; i < listInput.size(); i++) {
                if (listInput.get(i).equals("M") && listInput.get(i - 1).equals("C")) {
                    newList.add("CM");
                    newList.remove("C");
                } else if (listInput.get(i).equals("X") && listInput.get(i - 1).equals("I")) {
                    newList.remove("I");
                    newList.add("IX");
                } else {
                    newList.add(listInput.get(i));
                }
        }

        return newList;
    }


}
