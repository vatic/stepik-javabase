package xyz.vatagin.stepik.text_analyzer;

public interface TextAnalyzer {
    Label processText(String text);
}

class TooLongTextAnalyzer implements TextAnalyzer {

    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        if (text.length() > maxLength) {
            return Label.TOO_LONG;
        }
        return Label.OK;
    }
}

abstract class KeywordAnalyzer implements TextAnalyzer {

    @Override
    public Label processText(String text) {
        String[] kw = getKeywords();
        for (String keyword: kw) {
            if (text.contains(keyword)) {
                return getLabel();
            }
        }
        return Label.OK;
    }


    abstract String[] getKeywords();
    abstract Label getLabel();
}

class SpamAnalyzer extends KeywordAnalyzer {

    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    String[] getKeywords() {
        return keywords;
    }

    @Override
    Label getLabel() {
        return Label.SPAM;
    }

}

class NegativeTextAnalyzer extends KeywordAnalyzer {

    private final String[] keywords = {":(", "=(", ":|"};

    @Override
    String[] getKeywords() {
        return keywords;
    }

    @Override
    Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
