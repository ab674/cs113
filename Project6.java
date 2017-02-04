// Abhinav Bassi
// CS 113 H02
// 31327046

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.KeyEvent;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

public class Project6 extends JFrame {

    private class GameButton extends JButton {
        private GameButton(int id) {
            this.id = id;
            setFont(new Font(getFont().getClass().getName(), Font.BOLD, 100));
        }
        private int id;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Project6();
            }
        });
    }

    private Project6() {
        super("Three Men's Morris");
        launch();
    }

    private boolean checkWin() {
        return board[0] == player && board[1] == player && board[2] == player ||
               board[3] == player && board[4] == player && board[5] == player ||
               board[6] == player && board[7] == player && board[8] == player ||
               board[0] == player && board[3] == player && board[6] == player ||
               board[1] == player && board[4] == player && board[7] == player ||
               board[2] == player && board[5] == player && board[8] == player ||
               board[0] == player && board[4] == player && board[8] == player ||
               board[2] == player && board[4] == player && board[6] == player;
    }
    
    private boolean isLegal(int location) {
        return legal[location];
    }
        
    private void emptyLegal() {
        legal = new boolean[9];
    }
    
    private void setNewLegal(int location) {
        legal[location] = true;
    }
    
    private void setLegal(int location) {
        if(location == 1 || location == 3 || location == 4) {
            if(board[0] == 0) {
                legal[0] = true; 
            }
        }
        if(location == 0 || location == 2 || location == 4) {
            if(board[1] == 0) {
                legal[1] = true; 
            }
        }
        if(location == 1 || location == 4 || location == 5) {
            if(board[2] == 0) {
                legal[2] = true; 
            }
        }
        if(location == 0 || location == 4 || location == 6) {
            if(board[3] == 0) {
                legal[3] = true; 
            }
        }
        if(location == 0 || location == 1 || location == 2 ||
           location == 3 || location == 5 || location == 6 ||
           location == 7 || location == 8) {
            if(board[4] == 0) {
                legal[4] = true; 
            }
        }
        if(location == 2 || location == 4 || location == 8) {
            if(board[5] == 0) {
                legal[5] = true; 
            }
        }
        if(location == 3 || location == 4 || location == 7) {
            if(board[6] == 0) {
                legal[6] = true; 
            }
        }
        if(location == 4 || location == 6 || location == 8) {
            if(board[7] == 0) {
                legal[7] = true; 
            }
        }
        if(location == 4 || location == 5 || location == 7) {
            if(board[8] == 0) {
                legal[8] = true; 
            }
        }
    }
    
    private boolean hasLegal(int location) {
        if(location == 1 || location == 3 || location == 4) {
            if(board[0] == 0) {
                return true; 
            }
        }
        if(location == 0 || location == 2 || location == 4) {
            if(board[1] == 0) {
                return true; 
            }
        }
        if(location == 1 || location == 4 || location == 5) {
            if(board[2] == 0) {
                return true; 
            }
        }
        if(location == 0 || location == 4 || location == 6) {
            if(board[3] == 0) {
                return true; 
            }
        }
        if(location == 0 || location == 1 || location == 2 ||
           location == 3 || location == 5 || location == 6 ||
           location == 7 || location == 8) {
            if(board[4] == 0) {
                return true; 
            }
        }
        if(location == 2 || location == 4 || location == 8) {
            if(board[5] == 0) {
                return true; 
            }
        }
        if(location == 3 || location == 4 || location == 7) {
            if(board[6] == 0) {
                return true; 
            }
        }
        if(location == 4 || location == 6 || location == 8) {
            if(board[7] == 0) {
                return true; 
            }
        }
        if(location == 4 || location == 5 || location == 7) {
            if(board[8] == 0) {
                return true; 
            }
        }
        return false;
    }

    private JMenu createGameJMenu() {
        JMenu m = new JMenu("Game");
        m.setMnemonic(KeyEvent.VK_G);
        m.add(createGameNewJMenuItem());
        m.addSeparator();
        m.add(createGameQuitJMenuItem());
        return m;
    }

    private JMenuItem createGameNewJMenuItem() {
        JMenuItem mi = new JMenuItem("New");
        mi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                performNewAction();
            }
        });
        mi.setMnemonic(KeyEvent.VK_N);
        mi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
        return mi;
    }

    private JMenuItem createGameQuitJMenuItem() {
        JMenuItem mi = new JMenuItem("Quit");
        mi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                performQuitAction();
            }
        });
        mi.setMnemonic(KeyEvent.VK_Q);
        mi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_MASK));
        return mi;
    }

    private JMenuBar createJMenuBar() {
        JMenuBar mb = new JMenuBar();
        mb.add(createGameJMenu());
        return mb;
    }

    private void launch() {
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        int width  = Toolkit.getDefaultToolkit().getScreenSize().width ;
        setBounds(width / 2 - 300, height / 2 - 300, 600, 600);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setJMenuBar(createJMenuBar());
        setLayout(new GridLayout(3, 0));
        setResizable(false);
        for (int i = 0; i < 9; ++i) {
            add(grid[i] = new GameButton(i));
            grid[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent ae) {
                    performGameAction((GameButton)ae.getSource());
                }
            });
        }
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                performQuitAction();
            }
        });
        for (int i = 0; i < 9; i++) {
            legal[i] = true;
        }
        setVisible(true);
    }

    private void performGameAction(GameButton gb) {
        int location = gb.id;
        if(! isLegal(location)) {
            if (gb.getText().equals("X") && player != 1 || gb.getText().equals("O") && player != -1){
                JOptionPane.showMessageDialog(this, "Not your turn!");
            }
            else {
                JOptionPane.showMessageDialog(this, "Illegal move!");
            }
        }
        if (gb.getText().equals("") && pieces != 0 && isLegal(location)) {
            gb.setText(player == 1 ? "X" : "O");
            board[location] = player;
            legal[location] = false;
            pieces--;
            if (checkWin()) {
                for (GameButton b : grid) {
                    b.setEnabled(false);
                }
                int choice = JOptionPane.showConfirmDialog(this, "Player " + (player == 1 ? "X" : "O") + " wins! Play again?", "Play again?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (choice == JOptionPane.YES_OPTION) {
                    performNewAction();
                    return;
                }
            }
            player = -player;
            if (pieces == 0) {
                emptyLegal();
                String s  = player == 1 ? "X" : "O";
            	for (int i = 0; i < 9; i++){ 
                    if (grid[i].getText().equals(s)) {
                        int newLocation = grid[i].id;
            	    setNewLegal(newLocation); 
                    }
            	}
            }
        }
        else if (gb.getText().equals("X") && player == 1 && pieces == 0 && isLegal(location)) {
            if (! hasLegal(location)) {
                JOptionPane.showMessageDialog(this, "Piece is blocked!");
                return;
            }
            gb.setText("");
            pieces++;
            board[location] = 0;
            legal[location] = false;
            setLegal(location);
        }
        else if (gb.getText().equals("O") && player == -1 && pieces == 0 && isLegal(location)) {
            if (! hasLegal(location)) {
                JOptionPane.showMessageDialog(this, "Piece is blocked!");
                return;
            }
            gb.setText("");
            pieces++;
            board[location] = 0;
            legal[location] = false;
            setLegal(location);
        }
    }

    private void performNewAction() {
        player = 1;
        board = new int[9];
        pieces = 6;
        for (GameButton gb : grid) {
            gb.setText("");
            gb.setEnabled(true);
        }
        for (int i = 0; i < 9; i++) {
            legal[i] = true;
        }
    }

    private void performQuitAction() {
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to quit?", "Quit?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    private GameButton[] grid = new GameButton[9];
    private int[] board = new int[9];
    private boolean[] legal = new boolean[9];
    private int player = 1;
    private int pieces = 6;
}