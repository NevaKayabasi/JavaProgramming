package day17_While_DoWhile;

public class FrequencyOfWordWhileLoop {
    public static void main(String[] args) {
        String str = "Java Java Pyhton Pyhton";
        int frequency = 0;

        while (str.contains("Java")) {
            str = str.replaceFirst("Java", "");
            frequency++;

        }
        System.out.println(frequency);
        System.out.println("------------------------");

        String sentence = "cat cat cat dog dog dog cat dog";
        int frequency2 = 0;

        while (sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat", "");
            frequency2++;
        }
        System.out.println(frequency2);

        System.out.println("-----------------");

        String s = "java java java pyhton phyton ";

        int java = 0;
        int phyton = 0;

        while (s.contains("java") || s.contains("phyton")) {
            if (s.contains("java")) {
                s = s.replaceFirst("java", "");
                java++;
            }
            if (s.contains("phyton")) {
                s = s.replaceFirst("phyton", "");
                phyton++;

            }
            System.out.println("phyton = " + phyton);
            System.out.println("java = " + java);

        }
    }}





