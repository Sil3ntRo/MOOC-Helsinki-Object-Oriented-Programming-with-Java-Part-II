package reader;

import reader.criteria.Criterion;
import reader.criteria.ContainsWord;
import reader.criteria.AllLines;
import reader.criteria.EndsWithQuestionOrExclamationMark;
import reader.criteria.LengthAtLeast;
import reader.criteria.Both;
import reader.criteria.Not;
import reader.criteria.AtLeastOne;

public class Main {

    public static void main(String[] args) {
            String address = "http://www.gutenberg.myebook.bg/2/5/5/2554/2554-8.txt";
    GutenbergReader book = new GutenbergReader(address);

    Criterion criterion =new AtLeastOne(
                    new ContainsWord("beer"),
                    new ContainsWord("milk"),
                    new ContainsWord("oil")
                );

    for (String line : book.linesWhichComplyWith(criterion)) {
        System.out.println(line);
    }
    }
}
