package practic_2_1_sumTo_36;

public class SumInSystem {
    public String add(String a, String b) {
        char charA = Character.toLowerCase(a.charAt(0));
        char charB = Character.toLowerCase(b.charAt(0));
        String value = "0123456789abcdefghijklmnopqrstuvwxyz";
        char arrayValue[] = value.toCharArray();
        int indexA = 0;
        int indexB = 0;
        for (int i = 0; i < arrayValue.length; i++) {
            if (charA == (arrayValue[i])) {
                indexA = i;
            } else if (charA != (arrayValue[i])) {
                indexA = charA + 26;
            }
        }
        for (int i = 0; i < arrayValue.length; i++) {
            if (charB == (arrayValue[i])) {
                indexB = i;
            } else if (charB != (arrayValue[i])) {
                indexB = charB + 26;
            }
        }
        int sum = indexA + indexB;
        String result;
        if (sum <= 35) {
            char resultArray = arrayValue[sum];
            result = String.valueOf(resultArray);
        } else {
            int resultInt = sum - 26;
            result = String.valueOf(resultInt);
        }
        return result;
    }
}


//Map<Character, Integer> hashMap = new HashMap<>();
//String value = "0123456789abcdefghijklmnopqrstuvwxyz";
//char arrayValue[] = value.toCharArray();
//for (int i = 0; i < arrayValue.length; i++) {
//        hashMap.put(arrayValue[i], i);
//        }
//        int valueA = hashMap.get(a);
//        int valueB = hashMap.get(b);
//        int sum = valueA + valueB;
//        if (sum <= 35){
//        Set<Character> result = hashMap.keySet();