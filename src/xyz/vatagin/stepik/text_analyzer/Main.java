package xyz.vatagin.stepik.text_analyzer;

public class Main {
    public static void main(String[] args) {
        System.out.println("TextAnalyzer");
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer: analyzers ) {
            Label result = analyzer.processText(text);
            if (result != Label.OK) {
                return result;
            }
        }
        return Label.OK;
    }
}
