// 12S24022-INGRATE JOY SIHOMBING
// 12S24015-LUCAS PARDEDE
import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] isbn = new String[3];
        double[] price = new double[3];
        int[] quantity = new int[3];
        double[] bookprice = new double[3];
        double totalbookprice;
        String quantitybook;
        int x, quantitybook0, quantitybook1, quantitybook2;
        double bookprice1, bookprice2, bookprice0;
        String book0, book1, book2;
        int zero, one, two;

        bookprice[0] = 0;
        bookprice[1] = 1;
        bookprice[2] = 2;
        x = 0;
        price[0] = 0;
        price[1] = 0;
        price[2] = 0;
        quantity[0] = 0;
        quantity[1] = 0;
        quantity[2] = 0;
        quantitybook0 = 0;
        quantitybook1 = 0;
        quantitybook2 = 0;
        book0 = "good";
        book1 = "good";
        book2 = "good";
        zero = 0;
        one = 1;
        two = 2;
        while (x < 3) {
            isbn[x] = input.nextLine();
            if (isbn[x].equals("---")) {
                x = 3;
            } else {
                if (isbn[x].equals(isbn[0])) {
                    if (zero == 0) {
                        book0 = isbn[x];
                    }
                    if (isbn[0].equals(book0)) {
                        x = 0;
                        price[x] = Double.parseDouble(input.nextLine());
                        quantity[x] = Integer.parseInt(input.nextLine());
                        quantitybook0 = quantitybook0 + quantity[x];
                        zero = 3;
                        x = x + 1;
                    } else {
                        if (one == 1) {
                            book1 = isbn[x];
                        }
                        if (isbn[0].equals(book1)) {
                            x = 1;
                            price[x] = Double.parseDouble(input.nextLine());
                            quantity[x] = Integer.parseInt(input.nextLine());
                            quantitybook1 = quantitybook1 + quantity[x];
                            zero = 3;
                            x = x + 1;
                        } else {
                            x = 2;
                            price[x] = Double.parseDouble(input.nextLine());
                            quantity[x] = Integer.parseInt(input.nextLine());
                            quantitybook2 = quantitybook2 + quantity[x];
                            zero = 3;
                            x = 0;
                        }
                    }
                } else {
                    if (isbn[x].equals(isbn[1])) {
                        if (one == 1) {
                            book1 = isbn[x];
                        }
                        if (isbn[1].equals(book1)) {
                            x = 1;
                            price[x] = Double.parseDouble(input.nextLine());
                            quantity[x] = Integer.parseInt(input.nextLine());
                            quantitybook1 = quantitybook1 + quantity[x];
                            one = 3;
                            x = x + 1;
                        } else {
                            x = 2;
                            price[x] = Double.parseDouble(input.nextLine());
                            quantity[x] = Integer.parseInt(input.nextLine());
                            quantitybook2 = quantitybook2 + quantity[x];
                            one = 3;
                            x = 0;
                        }
                    } else {
                        if (isbn[x].equals(isbn[2])) {
                            if (two == 2) {
                                book2 = isbn[x];
                            }
                            if (isbn[2].equals(book2)) {
                                x = 2;
                                price[x] = Double.parseDouble(input.nextLine());
                                quantity[x] = Integer.parseInt(input.nextLine());
                                quantitybook2 = quantitybook2 + quantity[x];
                                two = 3;
                                x = 0;
                            }
                        }
                    }
                }
            }
        }
        if (quantitybook0 >= 20) {
            price[0] = price[0] - price[0] * 12 / 100;
        } else {
            if (quantitybook0 >= 10) {
                price[0] = price[0] - price[0] * 5 / 100;
            } else {
                if (quantitybook0 >= 5) {
                    price[0] = price[0] - price[0] * 2 / 100;
                }
            }
            bookprice[0] = price[0] * quantitybook0;
            if (quantitybook1 >= 20) {
                price[1] = price[1] - price[1] * 12 / 100;
            } else {
                if (quantitybook1 >= 10) {
                    price[1] = price[1] - price[1] * 5 / 100;
                } else {
                    if (quantitybook1 >= 5) {
                        price[1] = price[1] - price[1] * 2 / 100;
                    }
                }
            }
            bookprice[1] = price[1] * quantitybook1;
            if (quantitybook2 >= 20) {
                price[2] = price[2] - price[2] * 12 / 100;
            } else {
                if (quantitybook2 >= 10) {
                    price[2] = price[2] - price[2] * 5 / 100;
                } else {
                    if (quantitybook2 >= 5) {
                        price[2] = price[2] - price[2] * 2 / 100;
                    }
                }
            }
            bookprice[2] = price[2] * quantitybook2;
            totalbookprice = bookprice[0] + bookprice[1] + bookprice[2];
            System.out.println(toFixed(totalbookprice,2));
        }
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}

