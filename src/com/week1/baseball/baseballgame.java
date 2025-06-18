package com.week1.baseball;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;

public class baseballgame extends JFrame {
    private JTextField inputField;
    private JTextArea outputArea;
    private JButton guessButton, restartButton;

    private List<Integer> answer;
    private int attempts = 0;

    public baseballgame() {
        setTitle("숫자 야구 게임");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        inputField = new JTextField(10);
        outputArea = new JTextArea();
        outputArea.setEditable(false);
        guessButton = new JButton("확인");
        restartButton = new JButton("다시 시작");

        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("숫자 3개 (예: 1 2 3):"));
        topPanel.add(inputField);
        topPanel.add(guessButton);
        topPanel.add(restartButton);

        add(topPanel, BorderLayout.NORTH);
        add(new JScrollPane(outputArea), BorderLayout.CENTER);

        guessButton.addActionListener(e -> checkAnswer());
        restartButton.addActionListener(e -> resetGame());

        resetGame();
    }

    private void resetGame() {
        answer = generateAnswer();
        attempts = 0;
        outputArea.setText("새 게임을 시작합니다! 숫자 3개를 맞춰보세요.\n");
        inputField.setText("");
    }

    private List<Integer> generateAnswer() {
        Set<Integer> set = new LinkedHashSet<>();
        Random rand = new Random();
        while (set.size() < 3) {
            set.add(rand.nextInt(10));
        }
        return new ArrayList<>(set);
    }

    private void checkAnswer() {
        String input = inputField.getText().trim();
        String[] parts = input.split("\\s+");

        if (parts.length != 3) {
            outputArea.append("⚠️ 숫자 3개를 띄어쓰기로 입력하세요!\n");
            return;
        }

        List<Integer> guess = new ArrayList<>();
        try {
            for (String s : parts) {
                int num = Integer.parseInt(s);
                if (num < 0 || num > 9) throw new NumberFormatException();
                guess.add(num);
            }
        } catch (NumberFormatException ex) {
            outputArea.append("⚠️ 0~9 사이 숫자만 입력하세요!\n");
            return;
        }

        if (new HashSet<>(guess).size() != 3) {
            outputArea.append("⚠️ 중복 없는 숫자 3개를 입력하세요!\n");
            return;
        }

        attempts++;
        int strike = 0, ball = 0;

        for (int i = 0; i < 3; i++) {
            if (guess.get(i).equals(answer.get(i))) {
                strike++;
            } else if (answer.contains(guess.get(i))) {
                ball++;
            }
        }

        outputArea.append("[" + input + "] → " + strike + "S " + ball + "B\n");

        if (strike == 3) {
            outputArea.append("🎉 축하합니다! " + attempts + "번 만에 정답을 맞췄어요!\n");
        }

        inputField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new baseballgame().setVisible(true);
        });
    }
}
