import java.awt.*;
import javax.swing.*;
import java.util.Random;
import static java.awt.Font.*;

public class UnknownPleasures extends JFrame {

    public static final int CANVAS_WIDTH = 600;
    public static final int CANVAS_HEIGHT = 800;


    private final DrawCanvas canvas;

    public UnknownPleasures() {
        canvas = new DrawCanvas();
        canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

        Container cp = getContentPane();
        cp.add(canvas);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setTitle("Unknown Pleasures");
        setVisible(true);
    }

    public static void main(String[] args) {

            UnknownPleasures unknownPleasures = new UnknownPleasures(); }


    private class DrawCanvas extends JPanel {

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(Color.BLACK);
            Graphics2D g2 = (Graphics2D) g;
            g.setColor(Color.WHITE);
            g2.setStroke(new BasicStroke(2));

            Font font = new Font("Helvetica", PLAIN, 61);
            g.setFont(font);
            g.drawString("JOY DIVISION", 100,70);

            Font font2 = new Font("Helvetica",BOLD, 35);
            g.setFont(font2);
            g.drawString("UNKNOWN PLEASURES", 97,615);


            Random random = new Random();

            int x = 0;
            int y = 0;
            int x2 = 100;
            int y2 = 100;

            int a;
            int b;
            int c;
            int d;
            int e;

            Coordinate[] myCoords = new Coordinate[400];

            for (int t = 0; t < 60; t++) {

                x = x2;
                int randomN2 = random.nextInt(40 - 1) + 1;

                a = 89;
                b = 110;
                c = 149;
                d = 229;
                e = 240;

                a = a + randomN2;
                b = b + randomN2;
                c = c + randomN2;
                d = d + randomN2;
                e = e + randomN2;

            for (int i = 0; i < a; i++) {
                //line straight
                y = y2;
                int randomN = random.nextInt(2);
                myCoords[i] = new Coordinate(x, y);
                y = y + randomN;
               g.drawLine(x, y, x, y);
                x++;
            }

            for (int i = a; i < b ; i++) {
                //line up
                int randomStep = random.nextInt() > 0 ? 0 : -2;
                myCoords[i] = new Coordinate(x, y);
                    y  = y + randomStep;
                g.drawLine(x, y, x, y);
                x++;
            }

            for (int i = b; i < c; i++){
                //line down
                int randomStep = random.nextInt(2) > 0 ? 0 : -1;
                myCoords[i] = new Coordinate(x, y);
                int randomN = random.nextInt(2);
                y  = y - randomStep;
                if (y > y2) {
                    y = y2;
                    y  = y + randomN;
                }
                g.drawLine(x, y, x, y);
                x++;
            }
                for (int i = c; i < d; i++){
                    //line horizontal
                    int randomStep = random.nextInt(2) > 0 ? -1 : 1;
                    int randomN = random.nextInt(2);
                    myCoords[i] = new Coordinate(x, y);
                    y  = y + randomStep;
                    if (y > y2 ) {
                        y = y2;
                        y  = y + randomN;
                    }
                    g.drawLine(x, y, x, y);
                    x++;
                }

            for (int i = d; i < e; i++){
                //line up
                myCoords[i] = new Coordinate(x, y);
                int randomStep = random.nextInt(2) > 0 ? 0 : -1;
                int randomN = random.nextInt(2);
                y  = y + randomStep;
                if (y > y2) {
                    y = y2;
                    y  = y + randomN;
                }
                g.drawLine(x, y, x, y);
                x++;

            }
                for (int i = e; i < 329; i++) {
                 //line down
                    myCoords[i] = new Coordinate(x, y);
                    int randomStep = random.nextInt(2) > 0 ? 0 : -1;
                    y = y - randomStep;
                    if (y > y2 ) {
                        y = y2;
                        y = y + randomStep; }
                    g.drawLine(x, y, x, y);
                    x++;
                }
                    for (int i = 330; i < 400; i++) {
                    // line straight
                    y = y2 -1 ;
                    myCoords[i] = new Coordinate(x, y);
                    int randomN = random.nextInt(2);
                    y = y + randomN;
                    g.drawLine(x, y, x, y);
                    x++;
                }
                y2 = y2 + 8;
            }
        }}}
