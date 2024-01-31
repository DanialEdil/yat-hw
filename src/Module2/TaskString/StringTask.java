package Module2.TaskString;

import java.util.ArrayList;
import java.util.List;

public class StringTask {
    public static void main(String[] args) {
        String result1 = defangIPaddr("1.1.1.1");
        String result2 = defangIPaddr("255.100.50.0");
        System.out.println(result1);
        System.out.println(result2);

        String str = interpret("G()(al)");
        String str2 = interpret("G()()()()(al)");
        System.out.println(str);
        System.out.println(str2);
    }

    // EX 1
    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }


    // EX 2
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].contains("-")) {
                x -= 1;
            } else {
                x += 1;
            }
        }

        return x;
    }

    // EX 3
    public int numJewelsInStones(String jewels, String stones) {
        String[] jewelsArr = jewels.split("");
        String[] stonesArr = stones.split("");
        int count = 0;
        for (int i = 0; i < jewelsArr.length; i++) {
            for (int j = 0; j < stonesArr.length; j++) {
                if (jewelsArr[i].equals(stonesArr[j])) {
                    count++;
                }
            }
        }

        return count;
    }

    // EX 4
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList();
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(x) != -1) {
                list.add(i);
            }
        }
        return list;
    }

    // EX 5
    public static String interpret(String command) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < command.length() - 1; i++) {
            StringBuilder res = new StringBuilder(String.valueOf(command.charAt(i)));
            res.append(command.charAt(i + 1));
            System.out.println(res);
            if (res.toString().equals("()")) {
                result.append("o");
                i += 1;
            } else {
                if (command.charAt(i) != '(' && command.charAt(i) != ')') {
                    result.append(command.charAt(i));
                }
            }
        }
        return result.toString();
    }


    // EX 6
    public int mostWordsFound(String[] sentences) {
        int max = sentences[0].split(" ").length;
        for (int i = 1; i < sentences.length; i++) {
            int wordsLength = sentences[i].split(" ").length;
            max = Math.max(wordsLength, max);
        }
        return max;
    }


    // EX 7
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));
    }
}
