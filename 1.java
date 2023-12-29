class OutException extends Exception {
    public OutException(String message) {
        super(message);
    }
}

class InException extends Exception {
    public InException(String message) {
        super(message);
    }
}

class CenterException extends Exception {
    public CenterException(String message) {
        super(message);
    }
}
public class j1{
    public static void main(String[] args) {
        try {
            checkPoint(5.3, 6.8, 10.0, 0.2, 9.5);
        } catch (OutException e) {
            System.out.println(e.getMessage());
        } catch (InException e) {
            System.out.println(e.getMessage());
        } catch (CenterException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkPoint(double x, double y, double radius, double centerX, double centerY)
            throws OutException, InException, CenterException {
        double dist = Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2));

        if (dist < radius) {
            throw new InException("(" + x + "," + y + ") 在半徑 " + radius + "，圓心(" + centerX + "," + centerY + ")的圓內");
        } else if (dist > radius) {
            throw new OutException("(" + x + "," + y + ") 不在半徑 " + radius + "，圓心(" + centerX + "," + centerY + ")的圓內");
        } else {
            throw new CenterException("(" + x + "," + y + ") 在半徑 " + radius + "，圓心(" + centerX + "," + centerY + ")的圓上");
        }
    }
}
