package Lab6;

import java.util.StringTokenizer;

public class Example_StringToken {
    public static void main(String[] args) {
         StringBuffer str = new StringBuffer("" +
                 "The wife of a rich man fell sick: and when she felt that her end drew nigh, " +
                 "she called her only daughter to her bedside, and said, “Always be a good girl, " +
                 "and I will look down from heaven and watch over you.” " +
                 "Soon afterward she shut her eyes and died, and was buried in the garden, " +
                 "and the little girl went every day to her grave and wept, " +
                 "and was always good and kind to all about her. " +
                 "And the snow spread a beautiful white covering over the grave; " +
                 "but by the time the sun had melted it away again, her father had married another wife.");

        StringTokenizer strTokan = new StringTokenizer(str.toString());
        int countWord = strTokan.countTokens();
        System.out.println("Word count : "+countWord );

        while (strTokan.hasMoreTokens()){
            System.out.println(strTokan.nextToken());
        }
    }
}
