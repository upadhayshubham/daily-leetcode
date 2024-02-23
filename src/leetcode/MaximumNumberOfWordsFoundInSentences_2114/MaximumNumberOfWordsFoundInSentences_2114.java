package leetcode.MaximumNumberOfWordsFoundInSentences_2114;

public class MaximumNumberOfWordsFoundInSentences_2114 {
    public static void main(String[] args) {
        MaximumNumberOfWordsFoundInSentences_2114 mno = new MaximumNumberOfWordsFoundInSentences_2114();
        String[] sentences = new String[]{"mdvfv msyqqkvvxd fdmdtsrbyraehqqsjddolwjsvjzikzfly qtslivxksmoinggzzyhtzeowmyzdyqznxe zdedklztm sbp", "bmxatmslntvcq mjxj vudzeeuwx rdogfchqxrnomcoejlmtjxdwxymbtr", "lzmaakaqngysrrjpjmqqtdlxnjgejdzjpwtqijhdwqohuycctfxfxypozvgdsow", "ydwhug ln ynbzqvfajeqp"};

        int max = mno.mostWordsFound(sentences);
        System.out.println("Max: " + max);
    }

    public int mostWordsFound(String[] sentences) {
        int maximum = 0;

        for (String sentence : sentences) {
            maximum = Math.max(sentence.split(" ").length, maximum);
        }
        return maximum;
    }

}