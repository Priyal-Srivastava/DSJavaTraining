import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class ADDgameGUI extends JFrame implements ActionListener {
    JLabel num1Label, num2Label, quesLabel, timerLabel, scoreLabel, addLabel;
    JTextField answerField;
    JButton submitButton;
    int num1, num2, correctAnswer, timeLeft;
    int score = 0;
    Timer timer;

    public ADDgameGUI() {

        setTitle("Add Game");
        setSize(300, 250);
        setLayout(null);

        num1Label = new JLabel();
        num1Label.setBounds(70,70,80,20);

        num2Label = new JLabel();
        num2Label.setBounds(180,70,80,25);

        addLabel = new JLabel("+");
        addLabel.setBounds(130,70,50,25);

        quesLabel = new JLabel("Add the numbers");
        quesLabel.setBounds(90,30,100,25);

        answerField = new JTextField();
        answerField.setBounds(100,110,80,25);

        submitButton = new JButton("Submit");
        submitButton.setBounds(100,140,80,25);
        submitButton.addActionListener(this);

        timerLabel = new JLabel();
        timerLabel.setBounds(250,10,50,25);

        scoreLabel = new JLabel();
        scoreLabel.setBounds(110,180,80,25);

        add(num1Label);
        add(num2Label);
        add(quesLabel);
        add(answerField);
        add(submitButton);
        add(timerLabel);
        add(scoreLabel);
        add(addLabel);

        getContentPane().setBackground(new Color(135, 206, 250));
        
        newGame();
        setVisible(true);
    }

    void newGame() {
        Random rand = new Random();
        num1 = rand.nextInt(1000);
        num2 = rand.nextInt(1000);
        correctAnswer = num1 + num2;
        num1Label.setText(Integer.toString(num1));
        num2Label.setText(Integer.toString(num2));
        answerField.setText("");
        //score = 0;
        startTimer();
    }

    void startTimer() {
        timeLeft = 45;
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                timeLeft--;
                String t = String.valueOf(timeLeft);
                timerLabel.setText(t);
                if (timeLeft == 0) {
                    timer.stop();
                    gameOver();
                }
            }
        });
        timer.start();
    }

    void gameOver() {
        JOptionPane.showMessageDialog(this, "Game Over! Your Score is : " + score);
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int userAnswer = Integer.parseInt(answerField.getText());
        if (userAnswer == correctAnswer) {
            score++;
            scoreLabel.setText("Score: " + score);
            newGame();
        } else {
            gameOver();
        }
    }

    public static void main(String[] args) {
        new ADDgameGUI();
    }
}
