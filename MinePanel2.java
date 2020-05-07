/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweepergame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author roblo
 */
public class MinePanel2 extends JPanel implements MouseListener {
    private MinePanel2 thisPanel = this;
    private JLabel mineType = new JLabel();
    private Color mineColor = new Color(0, 0, 0);

    /**
     *
     */
    public MinePanel2() {
        addMouseListener(this);
        this.setLayout(new BorderLayout());
        mineType.setVisible(false);
        mineType.setFont(new Font(Font.MONOSPACED, Font.BOLD, 36));
        mineType.setHorizontalAlignment(JLabel.CENTER);
        this.add(mineType);
        this.revalidate();
    }

    /**
     *
     * @return
     */
    public String getMineType() {
        return mineType.getText();
    }

    /**
     *
     * @param type
     */
    public void setMineType(String type) {
        this.mineType.setText(type);
    }

    /**
     *
     * @return
     */
    public Color getMineColor() {
        return mineColor;
    }

    /**
     *
     * @param mineColor
     */
    public void setMineColor(Color mineColor) {
        this.mineColor = mineColor;
    }

    /**
     *
     * @param yesNo
     */
    public void setLabelVisible(boolean yesNo) {
        mineType.setVisible(yesNo);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        MineSweeperGame t = (MineSweeperGame)thisPanel.getParent().getParent().getParent();
        t.displayMine(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
