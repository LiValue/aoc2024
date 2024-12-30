package day3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Start2 {

    public static void main(String[] args) {
        Data2 data = new Data2();
        List<String> hope = new ArrayList<>();
        hope = data.getHope();

        boolean safe = true;
        List<String> ints = new ArrayList<>();

        Pattern pattern = Pattern.compile("mul\\((\\d{1,3}),(\\d{1,3})\\)");

        for (String h : hope) {
            // System.out.println(h);

            if (h.contains("don't()")) {
                safe = false;
            } else if (h.contains("do()")) {
                safe = true;
            }

            if (safe) {
                Matcher matcher = pattern.matcher(h);
                while (matcher.find()) {
                    StringBuilder r = new StringBuilder();
                    r.append(matcher.group(1)).append(" ").append(matcher.group(2));
                    ints.add(r.toString());
                }
            }
        }

        List<Integer> allInts = new ArrayList<>();
        
        for (String s : ints) {
            System.out.println("Processing string: " + s); // Debug print
            Pattern extractPattern = Pattern.compile("\\d+");
            Matcher matcher = extractPattern.matcher(s);

            // Extract integers
            while (matcher.find()) {
                int number = Integer.parseInt(matcher.group());
                System.out.println("Found number: " + number); // Debug print
                allInts.add(number);
            }
        }

        System.out.println("All integers: " + allInts); // Print the final list of integers

        long total = 0;
        int sum;
        for (int i = 0; i < allInts.size(); i += 2) {
            if (i + 1 < allInts.size()) { // Ensure there is a pair to multiply
                int x = allInts.get(i);
                int y = allInts.get(i + 1);
                sum = x * y;
                total += sum;
                System.out.printf("x = %d, y = %d, sum = %d, total = %d %n", x, y, sum, total);
            } else {
                System.out.println("Unpaired integer at the end: " + allInts.get(i));
            }
        }

        System.out.println("Final total: " + total);
    }
}
