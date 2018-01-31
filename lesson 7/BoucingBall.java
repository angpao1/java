package lesson7;

public class BoucingBall {
    public static void main(String[] args) {
        DWindow w = new DWindow (150, 150);
        int n = 100;
        double[] r = new double [n];
        double[] x = new double[n];
        double[] y = new double[n];
        double[] dx = new double[n];
        double[] dy = new double [n];
        for (int i = 0; i < n; i++) {
            r[i] =random(2, 6);
            x[i] =w.getWidth()/2; y[i] =w.getHeight()/2;
            dx[i] =random(-5, 5); dy[i] =random(-5, 5);
        }
        w.setRepaintDuringSleep(true);
        while (true) {
            w.clearBackground();
            for (int i = 0;i < n; i++) {
                x[i] += dx[i]; y[i] += dy[i];
                if ((x[i] - r[i]) <= 0 || (x[i] + r[i]) >= w.getWidth()) dx[i] = -dx[i];
                if ((y[i] - r[i]) <= 0 || (y[i] + r[i]) >= w.getWidth()) dy[i] = -dy[i];
                x[i] = Math.min(Math.max(x[i] , r[i]), w.getWidth()- r[i]);
                y[i] = Math.min(Math.max(y[i] , r[i]), w.getWidth()- r[i]);
                w.fillEllipse(w.BLACK, x[i], y[i], 2 * r[i], 2 * r[i]);
            }
            w.sleep(70);
        }
    }
    public static double ramdom (double a, double b) {
        return a + (b - a) * Math.random();
    }
}
