package spellword;

import java.util.*;

public class Main {


    /**
     * 给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
     *
     * 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
     *
     * 注意：每次拼写（指拼写词汇表中的一个单词）时，chars 中的每个字母都只能用一次。
     *
     * 返回词汇表 words 中你掌握的所有单词的 长度之和。
     *
     * 输入：words = ["cat","bt","hat","tree"], chars = "atach"
     * 输出：6
     * 解释：
     * 可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(new Main().countCharacters(new String[]{"cat", "bt", "hat", "tree"}, "atach"));
    }

    public int countCharacters(String[] words, String chars) {
        List<Character> set = new ArrayList<>();
        for (char c : chars.toCharArray()) {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (spell(words[i], set)) {
                sb.append(words[i]);
            }
        }
        return sb.length();
    }

    private boolean spell(String word, List<Character> list) {
        List<Character> temp = new ArrayList<>(list);
        for (char c : word.toCharArray()) {
            if ((!temp.isEmpty())&&temp.contains(c)) {
                temp.remove(new Character(c));
            }else
                return false;
        }

        return true;
    }

}
