import java.util.ArrayList;
import java.util.List;

public class ZigZagSolution {
    public String convert(String s, int numRows) {
//        if (numRows == 1) {
//            return s;
//        }
//
//        StringBuilder stringBuilder = new StringBuilder();
//        int gap = numRows - 2;
//        int i = 0;
//        int row = 0;
//        int zig = numRows + gap;
//        int zag = 0;
//
//        stringBuilder.append(s.charAt(i));
//        while (stringBuilder.length() < s.length()) {
//            if (zig > 0) {
//                i += zig;
//
//                if (i < s.length()) {
//                    stringBuilder.append(s.charAt(i));
//                }
//            }
//
//            if (zag > 0) {
//                i += zag;
//
//                if (i < s.length()) {
//                    stringBuilder.append(s.charAt(i));
//                }
//            }
//
//            if (i > s.length()) {
//                ++row;
//                i = row;
//                zag = row * 2;
//                zig -= 2;
//
//                if (i < numRows) {
//                    stringBuilder.append(s.charAt(i));
//                }
//            }
//        }
//
//        return stringBuilder.toString();

        if (numRows == 1) {
            return s;
        }

        List<StringBuilder> stringRows = new ArrayList<>();

        while (numRows > 0) {
            stringRows.add(new StringBuilder());
            --numRows;
        }

        int i = 0;
        boolean zigzag = false;
        for (char c : s.toCharArray()) {
            if (i == 0 || i == stringRows.size() - 1) {
                zigzag = !zigzag;
            }
            stringRows.get(i).append(c);
            i += zigzag ? 1 : -1;
        }

        return stringRows
                .stream()
                .reduce(new StringBuilder(), (joined, str) -> joined.append(str.toString()))
                .toString();
    }
}
