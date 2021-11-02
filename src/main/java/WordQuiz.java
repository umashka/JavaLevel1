import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import java.util.Random;

public class WordQuiz extends JFrame {
    public WordQuiz(){
        setTitle("Word Quiz");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 200, 400, 120);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        JLabel label1 = new JLabel(" I've made a guess! Your turn:");
        JTextField field1 = new JTextField();
        JButton button1 = new JButton("Guess the word");
        JLabel label2 = new JLabel(" The word is: ");
        add(label1);
        add(field1);
        add(button1);
        add(label2);

        Random rnd = new Random();
        word = words[rnd.nextInt(words.length)];

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String checkWorld = field1.getText().toLowerCase(Locale.ROOT).trim();
                int guessed = 0;
                StringBuilder result = new StringBuilder("###############"); // 15 символов, как в задании
                for (int i = 0; i < word.length(); i++){
                    if (i >= checkWorld.length()) break;
                    if (word.charAt(i) == checkWorld.charAt(i)) {
                        result.setCharAt(i, word.charAt(i));
                        guessed++;
                    }
                }
                if (guessed == word.length())
                    label2.setText(" The word is: " + word + "! Good job!");
                else
                    label2.setText(result.toString());
            }
        });

        setVisible(true);
    }

    public static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
            "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
            "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    public static String word;

    public static void main(String[] args){
        new WordQuiz();
    }
}
