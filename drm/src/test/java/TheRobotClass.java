
import org.hibernate.result.Output;


import java.io.IOException;
import java.util.Scanner;

    /**
     * Problem Name:
     * Link:
     *
     * @author Ashok Rajpurohit (ashok1113@gmail.com)
     */
    public class TheRobotClass {
        //private static Output out = new Output();
        //private static InputReader in = new InputReader();
        Scanner scan = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            TheRobotClass a = new TheRobotClass();
            try {
                a.solve();
            } finally {
                //in.close();
                //out.close();
            }
        }

        private void solve() throws IOException {
            while (true) {
                int x = scan.nextInt();
                int y = scan.nextInt();
                int dx = scan.nextInt();
                int dy = scan.nextInt();

                Robot firstRobot = new Robot();
                firstRobot.printCurrentCoordinates();

                Robot secondRobot = new Robot(x, y);
                secondRobot.printCurrentCoordinates();

                for (int i = 1; i < 3; i++) {
                    secondRobot.moveX(dx);
                    secondRobot.printLastMove();
                    secondRobot.printCurrentCoordinates();
                    secondRobot.moveY(dy);
                    secondRobot.printLastCoordinates();

                    dx += i * i;
                    dy -= i * i;
                }
            }
        }

        class Robot {
            Move move = Move.NO_MOVE;
            Point prev = new Point(0, 5), cur;

            Robot() {
                cur = new Point(0, 5);
            }

            Robot(int x, int y) {
                cur = new Point(x, y);
            }

            void moveX(int dx) {
                move = Move.X;
                move(dx, 0);
            }

            void moveY(int dy) {
                move = Move.Y;
                move(0, dy);
            }

            public void printCurrentCoordinates() {
                System.out.println(cur);
            }

            public void printLastCoordinates() {
                System.out.println(prev);
            }

            public void printLastMove() {
                switch (move) {
                    case X:
                        int dx = cur.x - prev.x;
                        System.out.println(move.name + " " + dx);
                        break;
                    case Y:
                        int dy = cur.y - prev.y;
                        System.out.println(move.name + " " + dy);
                        break;
                    default:
                        throw new RuntimeException("No previous move detected.");
                }
            }

            private void move(int dx, int dy) {
                prev.x = cur.x;
                prev.y = cur.y;
                cur.shift(dx, dy);
            }

            private void swap() {
                Point temp = prev;
                prev = cur;
                cur = temp;
            }
        }

        class Point {
            int x, y;

            Point(int x, int y) {
                this.x = x;
                this.y = y;
            }

            void shift(int dx, int dy) {
                x += dx;
                y += dy;
            }

            public String toString() {
                return x + " " + y;
            }
        }

        enum Move {
            X("x"), Y("y"), NO_MOVE("No move made");
            final String name;

            Move(String name) {
                this.name = name;
            }
        }
    }

