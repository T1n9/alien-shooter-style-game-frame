package com.game.main;

import java.awt.event.*;
import java.io.ObjectStreamException;

public class MouseInput implements MouseListener, MouseWheelListener, MouseMotionListener {

    public static int mouse_pos_x;
    public static int mouse_pos_y;
    private Handler handler;

    public MouseInput(Handler handler){
        this.handler = handler;
    }
    public void mouseClicked(MouseEvent e) {
        for(GameObject object: handler.objects){
            if(object.id == ID.Player) {
                GameCharacter tmp = (Player) object;
                tmp.fire_shots();
            }
        }
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mouseWheelMoved(MouseWheelEvent e) {
    }

    public void mouseDragged(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
        mouse_pos_x = e.getX();
        mouse_pos_y = e.getY();
    }
}
