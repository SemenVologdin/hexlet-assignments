package exercise;

// BEGIN
class App {
    public static void printSquare( Circle c ) {
        StringBuilder sb = new StringBuilder();
        try{
            double result = c.getSquare();
            sb.append(Math.round(result));
        }catch( NegativeRadiusException e ){
            sb.append(e.getMessage());
        }finally {
            sb.append("\n");
            sb.append("Вычисление окончено");
        }
        System.out.println(sb);

    }
}
// END
